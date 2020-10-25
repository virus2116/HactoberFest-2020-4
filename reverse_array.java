import java.util.Scanner;
public class reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int []arr;
		arr= new int[6];
		for (int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=arr.length-1;i>=0;i--){
			System.out.println(arr[i]);
		}
		
		
		
	}

}
