package computationalalgorithms;

import java.util.Scanner;

public class TowerOfHanoi {
	
	public static void solveHanoi(int n,char source,char auxiliary,char destination) {
		if(n==1) {
			System.out.println("Move dist 1 from "+ source + " to "+ destination);
			return;
		}
		solveHanoi(n-1, source, destination, auxiliary);
		System.out.println("Move disk "+ n + " from " + source + " to "+ destination);
		solveHanoi(n-1,auxiliary, source, destination);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Disks :");
		int n = sc.nextInt();
		sc.close();
		solveHanoi(n, 'A', 'B', 'C');

	}

}
