package tapacademy;
import java.util.Scanner;
class Arrays{
	
	public int largArr(int[] arr) {
	int max=0;
	for(int i=0;i<arr.length;i++) {
		
		if(arr[i] > max) {
			max = arr[i];
		}
		
	}
	return max;
	
}
}

public class ArrPro { 

	public static void main(String[] args) {
		Arrays ar = new Arrays();
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter No of elements");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int res = ar.largArr(arr);
		System.out.println(res);
	}

}
