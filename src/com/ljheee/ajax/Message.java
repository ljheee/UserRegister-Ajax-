package com.ljheee.ajax;

import java.util.Date;

public class Message {

	private String author;
	private String content;
	private Date time;
	public Message() {
	}
	public Message(String author, String content) {
		super();
		this.author = author;
		this.content = content;
		time = new Date();
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	
}
