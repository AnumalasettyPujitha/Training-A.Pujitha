class Book
{
	String book_company;
	String subject_name;
	int number_of_pages;
	String author;
	String colour;
	float weight;
	Book()
	{
		book_company="Mahishi";
		subject_name="Biology";
		number_of_pages=200;
		author="Winley";
		colour="Blue";
		weight=23.7f;
	}
	void display()
	{
		System.out.println(book_company);
		System.out.println(subject_name);
		System.out.println(number_of_pages);
		System.out.println(author);
		System.out.println(colour);
		System.out.println(weight);

	}
	
}
class TextBook
{
	public static void main(String args[])
	{
		Book tb=new Book();
		tb.display();		
	}
}