package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste
{
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("BancoPU");
	private static EntityManager em = emf.createEntityManager();
	
	public static void main(String[] args)
	{
		//FIND
		//Cliente cliente = em.find(Cliente.class, 1);
		//System.out.println("NOme do cliente: " + cliente.getNome());
		
		//INSERT
		//Cliente cliente = new Cliente();
		//cliente.setNome("Google");
		
		//em.getTransaction().begin();
		//em.persist(cliente);
		//em.getTransaction().commit();
		
		//DELETE
		//Cliente cliente = em.find(Cliente.class, 2);
		//em.getTransaction().begin();
		//em.remove(cliente);
		//em.getTransaction().commit();
		
		//MODIFY
		Cliente cliente = new Cliente();
		cliente.setId(1);
		cliente.setNome("Facebook INC");
		
		em.getTransaction().begin();
		em.merge(cliente);
		em.getTransaction().commit();
		
		
		em.close();
		emf.close();
	}
}
