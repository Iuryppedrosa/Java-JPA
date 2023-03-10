package teste;

import java.util.List;

import infra.ProdutoDAO;
import modelo.Produto;

public class ObterProdutos 
{
	public static void main(String[] args) 
	{
		ProdutoDAO dao = new ProdutoDAO();
		
		List<Produto> produtos = dao.obterTodos();
		
		for(Produto produto: produtos)
		{
			System.out.println("ID: " + produto.getId() + "\nNome: " + produto.getNome());
		}
		
		double precoTotal = produtos
				.stream()
				.map(p -> p.getPreco())
				.reduce(0.0, (t, p) -> t + p)
				.doubleValue();
		
		System.out.println("O valor total dos produtos é R$: " + precoTotal);
	}
}
