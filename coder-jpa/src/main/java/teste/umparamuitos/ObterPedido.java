package teste.umparamuitos;

import infra.DAO;
import modelo.UmParaMuitos.ItemPedido;
import modelo.UmParaMuitos.Pedido;

public class ObterPedido 
{
	public static void main(String[] args) 
	{
		
		DAO<Pedido> dao = new DAO<Pedido>(Pedido.class);
		
		Pedido pedido = dao.obterPorId(10L);
		dao.fechar();
		
		for(ItemPedido item : pedido.getItens())
		{
			System.out.println(item.getQuantidade());
			System.out.println(item.getProduto().getNome());
		}
	}
}
