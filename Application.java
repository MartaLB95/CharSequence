package m1_16_Marta_Laveda_Box;

public class Application {

	public static void main(String[] args) {
		
		//Creamos el string, le damos la vuelta y llamamos a sus métodos con sus excepciones
		
		BackwardsStringSequenceTokio bss=new BackwardsStringSequenceTokio("Estoy aprendiendo Java en Tokio School.");
		
		bss.reversedTokioString();
		
		bss.length();
		
		try {
		bss.charAt(2);
		}catch(IndexOutOfBoundsException e){
			System.out.print("Error: "+ e.getMessage());
		}
		
		try {
			CharSequenceTokio subsequence= bss.subSequence(7, 15);
			CharSequenceTokio subsequence2= bss.subSequence(2, 80);
		}catch(IndexOutOfBoundsException o) {
			System.out.print("Error: "+o.getMessage());
		}

	
	
	//Creamos el array y llamamos a sus métodos con sus excepciones
	
	char [] array= {'a', 'b','c','d'};
	
	ArrayCharSequenceTokio arrayTokio= new ArrayCharSequenceTokio (array);
	
		arrayTokio.length();
		
		try {
		arrayTokio.charAt(3);
		}catch(IndexOutOfBoundsException i){
			System.out.print("Error: "+ i.getMessage());
		}
		

		
		try {
			arrayTokio.subSequence(1, 2);
			arrayTokio.subSequence(0, 6);
		}catch(IndexOutOfBoundsException u) {
				System.out.print("Error: "+u.getMessage());
			}
		}
		}
	


