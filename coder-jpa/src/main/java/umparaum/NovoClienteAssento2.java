package umparaum;

import infra.DAO;
import modelo.UmParaUm.Assento;
import modelo.UmParaUm.Cliente;

public class NovoClienteAssento2
{
	public static void main(String[] args) 
	{
		Assento assento = new Assento("19A");
		Cliente cliente = new Cliente("Rodrigo", assento);
		
		DAO<Cliente> dao = new DAO<Cliente>(Cliente.class);
		dao.incluirAtomico(cliente);
		
	}

}
