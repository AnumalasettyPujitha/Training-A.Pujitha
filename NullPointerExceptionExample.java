public class NullPointerExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=null;
		try {
				System.out.println(s.length());
			}
		catch(NullPointerException ne) {
			ne.printStackTrace();
		}
		s=s+" is the given word";
		System.out.println(s);
	}

}
