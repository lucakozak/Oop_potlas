package book;


public class BookEnum extends Book {
	public enum style {
		SCIFI, COOK, ROMANCE, OTHER
	};

	private style bookStyle;

	public BookEnum(String title, String author, int dateOfissue, int price, style bookStyle) {
		super(title, author, dateOfissue, price);
		this.bookStyle = bookStyle;
	}

	public String toString() {
		return super.toString() + " style: " + this.bookStyle;
	}

	public style getBookStyle() {
		return bookStyle;
	}

	public void setBookStyle(style bookStyle) {
		this.bookStyle = bookStyle;
	}
}