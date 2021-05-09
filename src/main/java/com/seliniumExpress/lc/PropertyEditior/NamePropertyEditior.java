package com.seliniumExpress.lc.PropertyEditior;

import java.beans.PropertyEditorSupport;

public class NamePropertyEditior extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String capital=text.toUpperCase();
		setValue(capital);
	}

}
