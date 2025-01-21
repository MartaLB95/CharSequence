package m1_16_Marta_Laveda_Box;

public class BackwardsStringSequenceTokio implements CharSequenceTokio {
	
	//Indicamos la variable TokioString y la invertimos en ReversedTokioString
	
	private String TokioString;
	
	
	public BackwardsStringSequenceTokio  (String TokioString) {
		this.TokioString=TokioString;
	}
	
	//Método para invertir la cadena
	
	public void reversedTokioString(){
		System.out.println("La cadena invertida es "+ new StringBuilder(TokioString).reverse().toString());
		TokioString= new StringBuilder(TokioString).reverse().toString();
		
	}

	//Método par calcular cantidad de caracteres
	
	@Override
	public int length() {
		// TODO Auto-generated method stub
		System.out.println("La frase tiene "+TokioString.length()+" caracteres.");
		return TokioString.length();
	}
	
	//Método para devolver un caracter determinado con sus excepciones

	@Override
	public char charAt(int index) {
		if(index>TokioString.length()||index<0) {
			throw new IndexOutOfBoundsException(TokioString.charAt(0)+"\n");
		}else {
		System.out.println("En esta posición se encuentra el caracter "+TokioString.charAt(index));
		return TokioString.charAt(index);
		
		}
	}
	
	//Método para crear una subsecuencia con sus excepciones
	@Override
	public CharSequenceTokio subSequence(int start, int end) {
			if(start>end|| start<0||end<0||end>TokioString.length()) {
				throw new IndexOutOfBoundsException(null+"\n");
			}
			String subString = TokioString.substring(start, end);
		        System.out.println("La subcadena es " + subString);
		        return new BackwardsStringSequenceTokio(subString);
	}

	public String getTokioString() {
		return TokioString;
	}

	public void setTokioString(String tokioString) {
		TokioString = tokioString;
	}

	@Override
	public String toString() {
		return "BackwardsStringSequenceTokio [TokioString=" + TokioString + "]";
	}
	

	
}
