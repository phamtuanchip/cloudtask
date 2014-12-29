package com.nttdata.mobilecheckin.model;

import java.util.ArrayList;
import java.util.List;


public class Notification extends Task{
	private List<String> emails = new ArrayList<String>() ;

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}
}
