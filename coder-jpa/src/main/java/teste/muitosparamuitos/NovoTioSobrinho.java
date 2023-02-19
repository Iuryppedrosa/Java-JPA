package teste.muitosparamuitos;

import infra.DAO;
import modelo.muitosparamuitos.Sobrinho;
import modelo.muitosparamuitos.Tio;

public class NovoTioSobrinho
{
	 public static void main(String[] args)
	 {
		 
		 DAO<Sobrinho> dao = new DAO<Sobrinho>();
		 
		 Tio tia3 = new Tio("Vanessa");
		 Tio tio4 = new Tio("Mario");
		 Tio tio5 = new Tio("Romualdo");
		 
		 Sobrinho s3 = new Sobrinho("Marcelo");
		 Sobrinho s4 = new Sobrinho("Gabril");
		 

		 tia3.adicionarSobrinho(s3);
		 tio4.adicionarSobrinho(s4);
		 
		 tio5.adicionarSobrinho(s3);
		 
		 dao.incluirAtomico(s3);
		 	
	}
}
