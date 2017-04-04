import java.util.Scanner;
public class book {
	protected int bookId;
	protected String bookTitle;
	protected String bookAuthor;
	protected double bookPrice;
	protected float getMemberIdFromTheMemberClass;
	protected int borrowBook;
	protected int ammountOfContent;
	public book(int id,int pages){
		bookId = id;
		//ammountOfContent = pages;
	}
	Scanner input = new Scanner(System.in);
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public float getGetMemberIdFromTheMemberClass() {
		return getMemberIdFromTheMemberClass;
	}
	public void setGetMemberIdFromTheMemberClass(int getMemberIdFromTheMemberClass) {
		this.getMemberIdFromTheMemberClass = getMemberIdFromTheMemberClass;
	}
	public void showBookId(){
		System.out.println("book id is: "+bookId);
	}
	public void showBookTitle(){
		System.out.println("book id is: "+bookTitle);
	}
	public void showBookAuthor(){
		System.out.println("book id is: "+bookAuthor);
	}
	public void showBookPrice(){
		System.out.println("book id is: "+bookPrice);
	}
	public void borrowBook(){
		int choose;
		System.out.println("wanna borrow this book? 1- yes"+"\n"+"2 - no");
		choose = input.nextInt();
		if(choose == 1){
			borrowBook =1;
		}
		else{
			borrowBook = 0;
		}
	}
}
