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
	public void printDetail() {
		// TODO Auto-generated method stub
		System.out.println("Print detail of Books");
		System.out.println(author);
		System.out.println(title);
		System.out.println(pageNumber);
	}
}
