package com.raju.ds.arrays;

public class RatMaze {

	static boolean check(int maze[][], int x, int y, int n) {

		if (x == n - 1 && y == n - 1) { // check rat is reached to destination n-1,n-1.
			maze[x][y] = 2; // update destination
			return true; // reached base
		}

		if (x < 0 || x >= n || y < 0 || y >= n) {
			return false; // outside maze
		}

		if (maze[x][y] > 0) {
			return false; // blocked or visited cell
		}

		maze[x][y] = 2; // update path maza[i][j]==0 to 2

		return check(maze, x + 1, y, n) || check(maze, x - 1, y, n) || check(maze, x, y + 1, n)
				|| check(maze, x, y - 1, n);
	}

	static void printArray(int[][] maze) {

		for (int i[] : maze) {

			for (int j : i) {
				
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int maze[][] = { { 0, 0, 0, 0 }, { 1, 0, 1, 1 }, { 0, 0, 0, 0 }, { 1, 0, 1, 0 } };

		int n = maze.length;

		System.out.println("Solution does  exited " + check(maze, 0, 0, n));

		printArray(maze);

	}

}
