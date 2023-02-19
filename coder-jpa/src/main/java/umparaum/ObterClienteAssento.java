package umparaum;

import infra.DAO;
import modelo.UmParaUm.Assento;
import modelo.UmParaUm.Cliente;

public class ObterClienteAssento 
{
	public static void main(String[] args) 
	{
		DAO<Cliente> daoCliente = new DAO<Cliente>(Cliente.class);
		
		Cliente cliente = daoCliente.obterPorId(1L);
	
		System.out.println(cliente.getAssento().getNome());
		daoCliente.fechar();
		
		
		DAO<Assento> daoAssento = new DAO<Assento>(Assento.class);

		Assento assento = daoAssento.obterPorId(2L);
		
		System.out.println(assento.getCliente().getNome());
		daoAssento.fechar();

	}

}
