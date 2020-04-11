package main;

import java.util.Scanner;

public class Onion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the width: ");
			int width = sc.nextInt();
			int height = width * 2;
			int[][] onion = new int[width][height];
			//int k = 1;
			int holder = width;
			int k = 0;
			while (holder != 0) {
				int counter = width;
				int h = height/2;
				for (int i = k; i < counter; i++) {
					//onion[i][height - 1] = holder;
					onion[i][k] = holder;
					onion[i][height - k - 1] = holder;
				
				}
			
				for (int c = k; c < h; c++) {
					onion[k][c] = holder;
					onion[k][height - c - 1] = holder;
				}
				
				k++;
				counter--;
				h--;
				holder--;
			}
			
		
			
			
			//Displays 2D array (the onion)
			for (int r = 0; r < onion.length; r++) {
				for (int c = 0; c < onion[0].length; c++) {
					int val = onion[r][c];
					if (onion[r][c] > 9) {
						System.out.print((char)(65 + val - 10));
						continue;
					} else {
						System.out.print(val);
					}
					
				}
			System.out.println("");
			}
			
		
		
			
			
			
	}

  }
