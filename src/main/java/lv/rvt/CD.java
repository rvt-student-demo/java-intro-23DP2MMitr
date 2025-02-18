package lv.rvt;

public class CD implements Packable {
	private String author;
	private String name;
	private int year;

	public CD(String author, String name, int year) {
		this.author = author;
		this.name = name;
		this.year = year;
	}

	public double weight(){
		return 0.1;
	};

	@Override
	public String toString() {
		return this.author + ": " + this.name + " (" + this.year + ")";
	}
}