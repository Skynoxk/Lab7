package Ex4;



public class Book implements Printable{
	String author;
	String title;
	int pageNumber;
	Book (String author, String title, int pageNumber){
		this.author = author;
		this.title = title;
		this.pageNumber = pageNumber;
	}
	@Override
	public void printDetail() {
		// TODO Auto-generated method stub
		System.out.println("==========Book============");
		System.out.println("Author : " + author);
		System.out.println("Title : " + title);
		System.out.println("Page number : " + pageNumber);
	}
}
