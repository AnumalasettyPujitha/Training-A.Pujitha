public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=-1,b=1,sum=0;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				sum=a+b;
				System.out.print(sum+" ");
				a=b;
				b=sum;
			}
			System.out.println();
		}
	}

}
