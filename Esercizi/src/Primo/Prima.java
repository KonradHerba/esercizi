
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
    	
    	System.out.println("Liczba ma cyfr:");
    	System.out.println(dlugosc);
    	System.out.println("Wypisuje cyfry:");
    	
    	// tutaj jest blad do poprawy w domu
    	while (liczba > 0){
    		int cyfra = 0; 
    		cyfra = (liczba - cyfra % (10 ^ dlugosc)) / (10 ^ dlugosc); 
    		
    		System.out.println(liczba);
    		System.out.println(cyfra);
    		liczba = liczba - cyfra * 10 ^ dlugosc;
    		dlugosc = dlugosc - 1;
    	}
    	//System.out.println(liczba);
   	}
	// comment for github purpose
}
