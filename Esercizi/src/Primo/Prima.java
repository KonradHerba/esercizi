
package Primo;

import java.util.Scanner;

public class Prima {
    public static void main(String[] args) {
    	int liczba;
    	System.out.println("Podaj liczbe calkowita: ");
    	try {
    		Scanner tekst = new Scanner(System.in);
    		liczba = Integer.parseInt(tekst.nextLine());
    		tekst.close();
    		}

        catch(NumberFormatException nfe) {
        	System.out.println("Zly format!");
        	liczba = 0;
        	}
    	
    	int dlugosc = String.valueOf(liczba).length();
    	



    	


    }
}
