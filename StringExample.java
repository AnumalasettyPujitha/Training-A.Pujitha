import java.util.Scanner;
public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();//to read a word
		String s2=sc.nextLine();//to read a line
		System.out.println("Lengths of the strings are: "+s1.length()+","+s2.length());//to find length of the strings
		System.out.println(s1+s2);//to combine two strings (s1.concat(s2)) is also used
		System.out.println(s1.isEmpty());//to know whether the string is empty or not and it returns a boolean value
		System.out.println(s1.charAt(4));//returns a character at index 4
		System.out.println(s1.equals(s2));//to compare two strings and it returns a boolean value
		System.out.println(s1.compareTo(s2));//to compare two strings and it returns a integer value
		System.out.println(s1.codePointAt(5));//returns an ascii value of the character at the index 5
		System.out.println(s2.startsWith("am"));//to know whether the string starts with am or not
		System.out.println(s2.substring(4,9));//returns a string between the indices
		System.out.println(s1.replace('a','s'));//replaces the character a with s of the string s1
		System.out.println(s2.split(" "));//returns a character array of s2 after splitting at spaces
		System.out.println(s1.toLowerCase());//returns s1 in lower case
		System.out.println(s1.toUpperCase());//returns s1 in upper case
		System.out.println(s1.trim());//returns s1 after deleting places starting and ending
		System.out.println(s1.toCharArray());//returns character array of s1
	}

}
