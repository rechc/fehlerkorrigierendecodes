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
	//hab beim Suchen diese Methode gefunden und wollte die mal testen. 
	//Wir wollen ja eigentlich keinen String zurueck
	private String dezToBin(int zahl) {
		//System.out.println(Integer.toBinaryString(zahl));
		return Integer.toBinaryString(zahl);
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
