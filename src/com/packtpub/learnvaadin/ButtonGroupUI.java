package com.packtpub.learnvaadin;

import org.vaadin.peter.buttongroup.ButtonGroup;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
public class ButtonGroupUI extends UI {

	@Override
	protected void init(VaadinRequest request) {

		ButtonGroup group = new ButtonGroup();

		group.addButton(new Button("Left Button"));
		group.addButton(new Button("Middle Button"));
		group.addButton(new Button("Right Button"));

		setContent(group);
	}
}