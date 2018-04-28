package com.pojo;

public class Answer {
	int id;
	String name;
	String givenby;
	public Answer(int id,String name,String givenby)
	{
		this.id=id;
		this.name=name;
		this.givenby=givenby;
	}
	public String toString()
	{
		return "id::"+id+"Name::"+name+"Given BY ::"+givenby;
	}

}
