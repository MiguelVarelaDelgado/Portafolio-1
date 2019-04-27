 

import java.util.ArrayList;

public class TestReinas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NReinas reinas= new NReinas(8);
		//reinas.buscarUnaSolucion();
		reinas.buscarSoluciones();
		ArrayList soluciones = reinas.getSoluciones();
		for (int i = 0; i<soluciones.size();i++){
			int[] aux  = (int[]) soluciones.get(i);
			System.out.println("Solucion " + (i+1) + ":");
			for (int j = 0; j<aux.length;j++){
				System.out.print("(" + (j+1) + "," + (aux[j]+1) + ")");
			}
			System.out.println("");
		}

	}
}
