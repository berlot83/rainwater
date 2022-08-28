package com.waterfall;

import java.util.Arrays;
import java.util.List;

public class IslandFlowRainwater {

	/*
	 * Toda a isla equivale al array bidimesional, se estima que en los bordes el
	 * agua pude fluir, pero en el interior hay que avergiduarlo
	 */
	static int[][] islandSurface = { 
			{ 9, 4, 8, 2, 7 }, 
			{ 1, 5, 9, 5, 4 }, 
			{ 2, 7, 3, 8, 6 }, 
			{ 4, 5, 4, 6, 1 },
			{ 1, 2, 7, 9, 8 } 
	};

	/* Iteramos el array bidimensional */
	public static void main(String[] args) {
		for (int i = 0; i < islandSurface.length; i++) {
			for (int j = 0; j < islandSurface[i].length; j++) {
				System.out.println("(" + i + ", " + j + ") --> " + isFlowRainwater(islandSurface, i, j));
			}
		}

	}

	/*
	 * 1) Chequeamos si alguno de los lugares que tengo alrededor es menor al numero
	 * que estoy parado si por donde pasamos tira ArrayIndexOutOfBoundsException
	 * significa que es borde, por ende el agua tiene por donde escaparse
	 * 
	 */
	private static boolean isFlowRainwater(int[][] array, Integer x, Integer y) {
		try {
			int value = array[x][y];
			int up = array[x][y - 1];
			int down = array[x][y + 1];
			int left = array[x - 1][y];
			int rigth = array[x + 1][y];
			List<Integer> sidenumbers = Arrays.asList(up, down, left, rigth);
			return sidenumbers.stream().anyMatch(sides -> sides < value);
		} catch (ArrayIndexOutOfBoundsException e) {
			return true;
		}
	}

}
