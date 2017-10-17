package ie.cit.soft8027.saq3.domain;

import java.util.Set;

public class Newspaper {
	private String title;

	private Set<Editor> editors;
	
	public Newspaper() { }
	
	public Newspaper(String title, Set<Editor> editors) {
		super();
		this.title = title;
		this.editors = editors;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<Editor> getEditors() {
		return editors;
	}

	public void setEditors(Set<Editor> editors) {
		this.editors = editors;
	}
}
