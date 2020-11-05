import java.util.Scanner;
public class ArrayIndexOutOfBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		try {
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
				arr[i]=arr[i]+arr[i+1];
			}
		}
		catch(ArrayIndexOutOfBoundsException aie) {
			aie.printStackTrace();
		}
		finally{
			System.out.println("Array elements are ");
			for(int i=0;i<arr.length;i++)
				System.out.print(arr[i]+" ");
		}
	}

}
