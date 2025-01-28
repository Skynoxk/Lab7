package Ex4;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Magazine implements Printable{
	String author;
	int pagenumber;
	int year;
	public Magazine(String author, int pagenumber, int year) {
		// TODO Auto-generated constructor stub
		this.author = author;
		this.year = year;
		this.pagenumber = pagenumber;
	}
	@Override
	public void printDetail() {
		// TODO Auto-generated method stub
		System.out.println("===========Magazine==========");
		System.out.println("Author : " + author) ;
		System.out.println("Year : " + year);
		System.out.println("Page Number : " + pagenumber);
	}
	
}
