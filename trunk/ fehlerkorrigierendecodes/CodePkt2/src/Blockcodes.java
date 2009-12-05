/**
 * Fehlerkorigierende Codes
 * Wolfgang Braun
 * 
 * Uebungsblatt 3 - Aufgabe 7
 * Zweite Punkt Aufgabe
 */

/**
 * @author Tim Bartsch, Christian Rech
 * @stand 25.11.09
 * @version alpha 1.0
 */
public class Blockcodes {
	
	public int [][] matrix;
	
	//habe ich nur geschrieben, dass irgendwas da steht
	public void createBlockcodeMatrix(){
		matrix = new int [7][4];
	}
	
	
	/**
	 * Methode um eine Dezimalzahl in einen binären String umzuwandeln
	 * @param zahl
	 * @return
	 */
	//kein Plan ob wir nach einer besseren Lösung suchen sollten. Siehe hierzu auch Methode <code>string2Vektor</code>
	private String dez2Bin(int zahl) {
		//System.out.println(Integer.toBinaryString(zahl));
		return Integer.toBinaryString(zahl);
	}
	
	/**
	 * Methode welche einen binäre Zahle (gespeichert als String) 
	 * in ein Array speichert
	 * @param binZahl
	 * @return
	 */
	// siehe Methode <code>dez2Bin</code>
	private int[] string2Vektor(String binZahl) {
		int [] vektor = new int[binZahl.length()];
		
		for (int i = 0; i < binZahl.length(); i++)
			vektor[i] = (int) binZahl.charAt(i);
	
		return vektor; 
	}
	
	
	/**
	 * Methode um eine Matrix und einen Vektor zu multiplizieren
	 */
	//noch nicht getestet !!!!!!!!!!!!!!!!!!!!!!!!!
	private int[] multiMatrix(int[][] matrix, int[] vektor) {
		int [] resultVektor = new int [matrix.length];
		
	      for(int i = 0; i < matrix.length; i++) {
	          for(int j = 0; j < vektor.length-1; j++) {
	            for(int k = 0; k < vektor.length; k++){
	              resultVektor[i] += matrix[j][k]*vektor[k];
	            }
	          }  
	         }
	      return resultVektor;
	}

	
	/**
	 * Methode um Matrix auszugeben
	 */
	//Methode wird wahrscheinlich nicht gebraucht, da wir ja Matrix vorgeben.
	private void printMatrix() {
	    int x= matrix.length;
	    System.out.println("Matrix 1 : ");
	      for(int i = 0; i < x; i++) {
	    	  System.out.println();
	    	  for(int j = 0; j <= x; j++) {
	    		  System.out.print(" "+ matrix[i][j]);
	    	  }
	      }
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
