package teste;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Produto;
import modelo.Usuario;

public class NovoUsuario 
{
	//private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("teste1");
	//private static EntityManager em = emf.createEntityManager();
	
	public static void main(String[] args)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("teste1");
		EntityManager em = emf.createEntityManager();
		
		Produto produto = new Produto();
		produto.setNome("Arroz");
		produto.setPreco(15.5);
		em.getTransaction().begin();
		em.persist(produto);
		em.getTransaction().commit();
		
		
		//Usuario novoUsuario = new Usuario("Iury", "iury@lanche.com");
		//em.getTransaction().begin();
		//em.persist(novoUsuario);
		//em.getTransaction().commit();
		em.close();
		emf.close();	
		}
}
