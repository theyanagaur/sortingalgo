package sortingalgo;
import java.util.Scanner;
public class Insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of element");
		int n = sc.nextInt();
		int[] array = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the "+i+" Element");
			array[i]=sc.nextInt();
		}
		
		for(int k = 1; k<=n-1;k++) {
			int min = array[k];
			int loc = k;
			for(int j = k+1;j<=n;j++){
				min = array[j];
				loc=j;
				
			}
			int temp = array[k];
			array[k]=array[loc];
			array[loc]=temp;
			
		}
		System.out.println("Array After Insertion Sort");
		for(int k = 0;k<n;k++) {
			System.out.print(array[k]+" ");
		}
		
		

	}

}