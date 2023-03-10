package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<E> 
{
	private static EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	private Class<E> classe;
	
	
	static
	{
		try
		{
			entityManagerFactory = Persistence.createEntityManagerFactory("teste1");
			
		}catch (Exception e)
		{
			
		}
	}
	
	public DAO()
	{
		this(null);
	}
	
	public DAO(Class<E> classe)
	{
		this.classe = classe;
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	public DAO<E> abrirTrasacao()
	{
		entityManager.getTransaction().begin();
		
		return this;
	}
	public DAO<E> fecharTransacao()
	{
		entityManager.getTransaction().commit();
		
		return this;
	}
	
	public DAO<E> incluir(E entidade)
	{
		entityManager.persist(entidade);
		
		return this;
	}
	
	public DAO<E> incluirAtomico(E entidade)
	{
		return this.abrirTrasacao().incluir(entidade).fecharTransacao();
	}	
	
	public E obterPorId(Object id)
	{
		return entityManager.find(classe, id);
		
	}
	public List <E> obterTodos()
	{
		return this.obterTodos(10, 0);
	}
	
	public List <E> obterTodos(int qtde, int deslocamento)
	{
		if(classe == null)
		{
			throw new UnsupportedOperationException("Classe nula");
		}
		
		String jpql = "select e from " + classe.getName() + " e";
		
		TypedQuery<E> query = entityManager.createQuery(jpql, classe);
		query.setMaxResults(qtde);
		query.setFirstResult(deslocamento);
		
		return query.getResultList();
	}
	
	public void fechar()
	{
		entityManager.close();
	}
	
}
