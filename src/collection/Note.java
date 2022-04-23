package collection;

public class Note<T extends Number> {
	
	private T content;

	public Note(T content) {
		this.content = content;
	}
	public T getContent() {
		return content;
	}
	public void setContent(T content) {
		this.content = content;
	}

}
