package umparaum;

import infra.DAO;
import modelo.UmParaUm.Assento;
import modelo.UmParaUm.Cliente;

public class NovoClienteAsesento1 
{
	public static void main(String[] args) 
	{
		Assento assento = new Assento("18A");
		//Assento assento = new Assento();
		//assento.setId(3L);
		Cliente cliente = new Cliente();
		cliente.setNome("Jose");
		cliente.setAssento(assento);
		
		DAO<Object> dao = new DAO<Object>();
		
		dao.abrirTrasacao()
		.incluir(assento)
		.incluir(cliente)
		.fecharTransacao()
		.fechar();
	}
}
