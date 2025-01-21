package m1_16_Marta_Laveda_Box;

import java.util.Arrays;

public class ArrayCharSequenceTokio implements CharSequenceTokio {

	private char[] arrayCharSequenceTokio;
	
	public ArrayCharSequenceTokio (char[] arrayCharSequenceTokio) {
		this.arrayCharSequenceTokio=arrayCharSequenceTokio;
	}

	//Método par calcular cantidad de caracteres
	
	@Override
	public int length() {
		int length=arrayCharSequenceTokio.length;
		System.out.println("El array tiene "+arrayCharSequenceTokio.length+ " caracteres");
		return length;
		
	}
	
	//Método para devolver un caracter determinado con sus excepciones
	
	@Override
	public char charAt(int index) {

		if(index>arrayCharSequenceTokio.length||index<0) {
			throw new IndexOutOfBoundsException(arrayCharSequenceTokio[0]+"\n");
		}else {
			System.out.println("En esta posición se encuentra el caracter "+arrayCharSequenceTokio[index]);
			return arrayCharSequenceTokio[index];
		
		}

	}

	//Método para crear una subsecuencia con sus excepciones
	
	@Override
	public CharSequenceTokio subSequence(int start, int end) {
		if(start>end|| start<0||end<0||end>arrayCharSequenceTokio.length) {
			throw new IndexOutOfBoundsException(null+"\n");
		}
		
		char[] sub= Arrays.copyOfRange(arrayCharSequenceTokio,start-1,end);;
        System.out.println("La subcadena es " + new String(sub));
        return  new ArrayCharSequenceTokio(sub);
	}

	@Override
	public String toString() {
		return "ArrayCharSequenceTokio [arrayCharSequenceTokio=" + Arrays.toString(arrayCharSequenceTokio) + "]";
	}

	public char[] getArrayCharSequenceTokio() {
		return arrayCharSequenceTokio;
	}

	public void setArrayCharSequenceTokio(char[] arrayCharSequenceTokio) {
		
		this.arrayCharSequenceTokio = arrayCharSequenceTokio;
	}
	
}
