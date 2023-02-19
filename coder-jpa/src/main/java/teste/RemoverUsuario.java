package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Usuario;

public class RemoverUsuario 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("teste1");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = em.find(Usuario.class, 6L);
		
		if(usuario != null)
		{
			em.getTransaction().begin();
			em.remove(usuario);
			em.getTransaction().commit();
		}
		
	
		em.close();
		emf.close();
	}

}
