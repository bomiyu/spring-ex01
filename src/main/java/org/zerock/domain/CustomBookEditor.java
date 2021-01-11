package org.zerock.domain;

import java.beans.PropertyEditorSupport;

public class CustomBookEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		// text: java-spring
		int dash = text.indexOf("-");
		String title = text.substring(0, dash);
		String writer = text.substring(dash+1);
		
		Book book = new Book();
		book.setTitle(title);
		book.setWriter(writer);
		
		setValue(book);
	}
}
