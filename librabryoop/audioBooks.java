
public class audioBooks extends book{
	private int totalDurationOfTheBook;
	public audioBooks(int bookId,int duration) {
		super(bookId, duration);
		totalDurationOfTheBook = duration;
	}
	public void showTheDurationOfTheBook(){
		System.out.println("total duration "+totalDurationOfTheBook);
	}
	
}
