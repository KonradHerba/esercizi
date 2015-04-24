package Primo;

import java.util.Scanner;
//temporary branch
public class Prima {
    public static void main(String[] args) {
    	int liczba;
    	try {
    		System.out.println("Podaj liczbe calkowita: ");
    		Scanner tekst = new Scanner(System.in);
    		liczba = Integer.parseInt(tekst.nextLine());
    		tekst.close();
    		}

        catch(NumberFormatException nfe) {
        	System.out.println("Zly format!");
        	liczba = 0;
        	}

    	while (liczba > 0){
    		System.out.println(liczba);
    		liczba = 0;
    	}
   	}
}
