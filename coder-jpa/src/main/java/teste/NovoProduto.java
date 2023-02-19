package teste;

import infra.DAO;
import modelo.Produto;

public class NovoProduto 
{
	public static void main(String[] args) 
	{

		DAO<Produto> dao = new DAO<Produto>(Produto.class);
		
		Produto produto = new Produto("Caneca", 10.00);
		dao.incluirAtomico(produto).fechar(); 
	}
}
