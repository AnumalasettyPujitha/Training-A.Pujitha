class College{
	private static int a=10;
	static class Department{
		public static void showValue() {
			System.out.println(a);
		}
	}
}
public class StaticInnerClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College.Department.showValue();
	}

}
