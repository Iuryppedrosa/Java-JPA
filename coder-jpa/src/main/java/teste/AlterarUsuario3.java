package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Usuario;

public class AlterarUsuario3 
{

	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("teste1");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		
		Usuario usuario = em.find(Usuario.class, 3L);
		em.detach(usuario);//tira o objeto do estado gerenciado
		
		
		usuario.setNome("Jose Felix Junior");
		
		
		em.merge(usuario);

		
	
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}
