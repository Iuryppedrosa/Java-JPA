package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Usuario;

public class AlterarUsuario2 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("teste1");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Usuario usuario = em.find(Usuario.class, 3L);
		usuario.setNome("Jose Felix");
		//usuario no estado gerenciado
		
		
		//em.merge(usuario);

		
		
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		
	}

}
