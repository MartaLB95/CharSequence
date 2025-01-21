package m1_16_Marta_Laveda_Box;

	public interface CharSequenceTokio extends CharSequence{
		
		/**
	     * Devuelve la longitud de esta secuencia de caracteres.
	     * @return  Número de chars que existen en la secuencia.
	     */
	    int length();

	    /**
	     * Devuelve el char que se situa en el índice indicado por index.
	     * Un índice válido toma valores entre 0 y length() - 1.
	     * Si el índice no es válido se devuelve el caracter cero (char con valor cero)
	     *
	     * @param   index   índice del char a ser devuelto.
	     * @return  el char localizado en index o el char con valor cero si el �ndice es incorrecto.
	     */
	    char charAt(int index);

	    /**
	     * Devuelve una nueva CharSequenceTokio que es un subsecuencia de esta secuencia.
	     * La subsecuencia empieza en el caracter situado en la posici�n start y acaba
	     * en el caracter situado en la posici�n end - 1.
	     * Si start == end se devuelve un CharSequenceTokio sin caracteres.
	     * Si start no es una posici�n v�lida o si end no es una posici�n v�lida o si
	     * start > end se devuelve un objeto nulo (null).
	     *
	     * @param   start   el índice de comienzo, incluido.
	     * @param   end     el índice de fin, excluido
	     * @return  La subsecuencia especificada o null si los índices no son válidos.
	     */
	    CharSequenceTokio subSequence(int start, int end);

	    /**
	     * Devuelve una representación con forma de String de la secuencia de caracteres.
	     * La longitud del String será igual a la longitud de la secuencia.
	     * @return  Un String que contiene exactamente la secuencia de caracteres.
	     */
	    public String toString();
}
