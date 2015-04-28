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
    	
    	while (liczba > 0){
    		int cyfra = 0; 
    		dlugosc = dlugosc - 1;
    		
    		cyfra = (int)(liczba / Math.pow(10, dlugosc)); 
    		liczba = liczba - (int)(cyfra * Math.pow(10, dlugosc));
    		
    		System.out.println(cyfra);
    	}
   	}
}
