package principal;

public class ChamaroArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String nome = "Kamylla";
			String [] teste = {"Kamylla", "Herculles"};
			
			for (int i = 0 ; i < teste.length ; i++) {
				if (nome.equals(teste [i])) {
					System.out.println("Est� no array");
					
				}
				else {
					System.out.println("N�o est� no array");
				
				}
			break;	
			}
			
	}

}
