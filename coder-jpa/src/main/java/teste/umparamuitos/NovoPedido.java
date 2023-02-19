package teste.umparamuitos;

import infra.DAO;
import modelo.Produto;
import modelo.UmParaMuitos.ItemPedido;
import modelo.UmParaMuitos.Pedido;

public class NovoPedido 
{
	public static void main(String[] args) 
	{
		DAO<Object> dao = new DAO<Object>();
		
		Pedido pedido = new Pedido();
		Produto produto = new Produto("Geladeira", 2789.99);
		ItemPedido itemPedido = new ItemPedido (pedido, produto, 10);
		
		dao
			.abrirTrasacao()
			.incluir(produto)
			.incluir(pedido)
			.incluir(itemPedido)
			.fecharTransacao()
			.fechar();
	}
}
