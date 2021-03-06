package com.tutorialspoint.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class HelloWorld implements EntryPoint {
	public void onModuleLoad() {

		// add button to change font to big when clicked.
		Button Btn1 = new Button("Big Text");
		Btn1.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				RootPanel.get("mytext").setStyleName("gwt-Big-Text");
			}
		});

		// add button to change font to small when clicked.
		Button Btn2 = new Button("Small Text");
		Btn2.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				RootPanel.get("mytext").setStyleName("gwt-Small-Text");
			}
		});

		RootPanel.get("gwtGreenButton").add(Btn1);
		RootPanel.get("gwtRedButton").add(Btn2);
		
		RootPanel.get("sometext").setStylePrimaryName("MyText");
		RootPanel.get("sometext").addStyleName("BigText");
		RootPanel.get("sometext").addStyleName("LoudText");
	}
}