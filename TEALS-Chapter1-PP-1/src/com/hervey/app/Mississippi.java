package com.hervey.app;

public class Mississippi {

	public static void main(String[] args) {
		
		drawMississippi();

	}

	private static void drawMississippi() {
		drawM();
		System.out.println();
		drawI();
		System.out.println(); 
		drawS();
		System.out.println(); 
		drawS();
		System.out.println(); 
		drawI();
		System.out.println(); 
		drawS();
		System.out.println(); 
		drawS();
		System.out.println(); 
		drawI();
		System.out.println(); 
		drawP();
		System.out.println(); 
		drawP();
		System.out.println(); 
		drawI();
		
	}

	private static void drawP() {
		// TODO Auto-generated method stub
		
	}

	private static void drawI() {
		// will be built from seven rows of chars
		// the rows of chars are numbered from the bottom
		// each I is seven char wide

		System.out.println("IIIIIII"); // 7
		System.out.println("   I   "); // 6
		System.out.println("   I   "); // 5
		System.out.println("   I   "); // 4
		System.out.println("   I   "); // 3
		System.out.println("   I   "); // 2
		System.out.println("IIIIIII"); // 1
		
	}

	private static void drawS() {
		// will be built from seven rows of chars
		// the rows of chars are numbered from the bottom
		// each S is seven char wide

		System.out.println(" SSSSSS "); // 7
		System.out.println("S      S"); // 6
		System.out.println("S       "); // 5
		System.out.println(" SSSSSS "); // 4
		System.out.println("       S"); // 3
		System.out.println("S      S"); // 2
		System.out.println(" SSSSSS "); // 1
	}

	private static void drawM() {
		// M will be built from seven rows of char Ms
		// the rows of chars are numbered from the bottom
		// each M is seven char wide

		System.out.println("M     M"); // 7
		System.out.println("MM   MM"); // 6
		System.out.println("M M M M"); // 5
		System.out.println("M  M  M"); // 4
		System.out.println("M     M"); // 3
		System.out.println("M     M"); // 2
		System.out.println("M     M"); // 1

	}

	
	
	
	
	
	
	
	
	
}
