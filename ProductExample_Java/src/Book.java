public class Book extends Product {

	/**
	 * 
	 * New variables for the Book class
	 * 
	 */

	String myAuthor;
	String bookTitle;
	String numOfPages;
	
	
	public Book(String stockNumber, String price, String myAuthor, String bookTitle, String numOfPages)
	{
		super(stockNumber, price);
		this.myAuthor = myAuthor;
		this.bookTitle = bookTitle;
		this.numOfPages = numOfPages;
		
	}
	
	
	public String getMyAuthor()
	{
		return myAuthor;
		
	}
	
	public void setMyAuthor(String myAuthor)
	{
		this.myAuthor = myAuthor;
	}
	
	public String getBookTitle()
	{
		return bookTitle;
	}
	
	public void setBookTitle(String bookTitle)
	{
		this.bookTitle = bookTitle;
	}
	
	public String numOfPages()
	{
		return numOfPages;
	}
	
	public void numOfPages(String numOfPages)
	{
		this.numOfPages = numOfPages;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book myNewBook = new Book("123456", " $9.99", "Amelia Atwater-Rhodes", "Shattered Mirror", "239");
		
		
		System.out.println("The book was written by: " + myNewBook.myAuthor + " and was called " + myNewBook.bookTitle + 
				" it has approximately " + myNewBook.numOfPages + " pages.");

	}

}
