
public class hardCopyBooks extends book{
	private int totalPagesOfTheBook;
	public  hardCopyBooks(int bookId,int pages){
		super(bookId, pages);
		totalPagesOfTheBook =pages;
	}
	public void showThepagesOfTheBook(){
		System.out.println("total pages are: "+totalPagesOfTheBook);
	}
	
}
