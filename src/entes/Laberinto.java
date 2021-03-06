package entes;

import java.awt.Color;
import java.awt.Graphics;

public class Laberinto {
	private final int NFILAS = 17;
	private final int NCOLUMNAS = 31;
	private final int ANCHO = 40;
	private final int ALTO = 40;

	public void pintarLaberinto(Graphics grafico,int mapaSelect) {
		
		int[][] laberinto = getLaberinto(mapaSelect);

		for (int i = 0; i < NFILAS; i++) {
			for (int j = 0; j < NCOLUMNAS; j++) {
				if (laberinto[i][j] == 1) {
					grafico.setColor(Color.orange);
					grafico.fillRect(j * 40, i * 40, ANCHO, ALTO);
					grafico.setColor(Color.red);
					grafico.drawRect(j * 40, i * 40, ANCHO, ALTO);
				}
				if (laberinto[i][j] == 2) {
					grafico.setColor(Color.darkGray);
					grafico.fillRect(j * 40, i * 40, ANCHO, ALTO);
				}
				if (laberinto[i][j] == 3) {
					grafico.setColor(Color.green);
					grafico.fillRect(j * 40, i * 40, ANCHO, ALTO);
				}
				if (laberinto[i][j] == 4) {
					grafico.setColor(Color.blue);
					grafico.fillRect(j * 40, i * 40, ANCHO, ALTO);
				}
			}
		}

	}

	public static int[][] getLaberinto(int mapaSelect) {
		switch(mapaSelect) {
//		// Mapa Gabriel		
		case 1: int laberinto0[][] = {
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 0, 0, 1, 0, 4, 0, 4, 0, 4, 0, 1, 4, 1, 4, 1, 0, 1, 4, 0, 4, 4, 4, 0, 4, 1, 0, 0, 4, 1, 1 },
				{ 1, 1, 0, 1, 1, 4, 0, 4, 0, 4, 4, 1, 4, 1, 4, 4, 0, 4, 4, 0, 4, 0, 0, 0, 4, 4, 0, 4, 4, 1, 1 },
				{ 1, 1, 0, 0, 0, 4, 1, 4, 0, 4, 0, 4, 4, 1, 4, 1, 4, 1, 4, 0, 4, 4, 4, 0, 4, 1, 4, 0, 4, 0, 1 },
				{ 1, 1, 0, 1, 1, 4, 1, 4, 1, 4, 0, 0, 4, 1, 4, 1, 1, 1, 4, 1, 1, 1, 4, 1, 4, 1, 0, 0, 4, 1, 1 },
				{ 1, 0, 0, 1, 0, 4, 4, 4, 0, 4, 0, 0, 4, 1, 4, 0, 0, 1, 4, 0, 4, 4, 4, 0, 4, 0, 0, 0, 4, 0, 1 },
				{ 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 3, 3, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 0, 0, 2, 2, 1 },
				{ 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 3, 3, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 3, 0, 0, 2, 0, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 3, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 2, 0, 1 },
				{ 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 2, 0, 1 },
				{ 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 3, 0, 0, 2, 0, 1 },
				{ 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 3, 3, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 2, 0, 1 },
				{ 1, 0, 5, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 3, 3, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 2, 0, 1 },
				{ 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 3, 1, 0, 3, 0, 0, 3, 0, 0, 3, 1, 0, 2, 0, 1 },
				{ 1, 1, 1, 0, 5, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 2, 2, 1 },
				{ 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 9 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }

		};
		return laberinto0;
//		// Mapa Augusto
		case 2: int laberinto1[][] = {
				{ 1, 1, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 2, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3 },
				{ 1, 0, 0, 1, 2, 0, 0, 0, 0, 0, 0, 0, 2, 3, 4, 4, 3, 3, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 4, 4, 3 },
				{ 1, 1, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 2, 3, 3, 4, 3, 3, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 1, 0, 2, 2, 2, 2, 2, 2, 2, 2, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 3, 3, 3, 3, 3 },
				{ 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 1, 0, 1, 3, 0, 1, 0, 1, 0, 1, 1, 3, 3, 3, 3, 3 },
				{ 1, 1, 0, 1, 0, 1, 0, 3, 3, 3, 4, 3, 3, 0, 3, 1, 0, 3, 3, 1, 0, 0, 0, 0, 1, 1, 3, 3, 4, 3, 3 },
				{ 1, 0, 0, 0, 0, 1, 0, 3, 4, 4, 3, 4, 3, 0, 3, 3, 0, 3, 3, 0, 0, 1, 1, 1, 1, 1, 3, 3, 4, 3, 3 },
				{ 1, 0, 1, 1, 0, 1, 0, 3, 4, 4, 3, 3, 3, 0, 3, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 1, 3, 3, 3, 3, 3 },
				{ 1, 0, 0, 0, 0, 1, 0, 3, 3, 3, 4, 3, 3, 0, 1, 0, 0, 1, 3, 1, 0, 1, 0, 0, 0, 1, 3, 3, 4, 4, 3 },
				{ 1, 1, 0, 0, 1, 1, 0, 3, 3, 3, 1, 0, 1, 0, 0, 1, 1, 1, 3, 0, 0, 1, 0, 0, 1, 1, 3, 3, 4, 4, 3 },
				{ 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 3, 1, 0, 1, 0, 0, 0, 1, 3, 3, 3, 3, 3 },
				{ 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 3, 3, 3, 3 },
				{ 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1 },
                { 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
				{ 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 9 },
				{ 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 3, 3, 3, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 1 }

		};
		return laberinto1;
//		// Mapa Alessandro
		default: int laberinto2[][] = {
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 3, 3, 3, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1 },
				{ 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 3, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1 },
				{ 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 3, 0, 1, 0, 0, 1, 1, 1, 0, 0, 3, 3, 0, 1, 0, 1, 1, 0, 1 },
				{ 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 3, 1, 1, 3, 3, 0, 1, 0, 0, 0, 0, 1 },
				{ 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 3, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 1 },
				{ 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1 },
				{ 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 4, 0, 0, 1, 1, 1, 0, 1, 1 },
				{ 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1 },
				{ 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 3, 1, 1, 0, 1, 0, 0, 1, 0, 1 },
				{ 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 3, 0, 0, 0, 1, 0, 1, 0, 0, 1 },
				{ 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 3, 0, 1, 0, 3, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1 },
				{ 1, 3, 0, 3, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 1, 1, 0, 1, 4, 1, 0, 1, 0, 1 },
				{ 1, 3, 0, 3, 3, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 3, 1, 3, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1 },
				{ 1, 3, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 3, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 4, 1 },
				{ 1, 3, 3, 3, 3, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 3, 3, 0, 1, 0, 0, 0, 1, 0, 0, 9 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }

  	};
		return laberinto2;  
	}

 }

}
