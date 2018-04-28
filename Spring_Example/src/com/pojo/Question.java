package com.pojo;

import java.util.Iterator;
import java.util.List;
public class Question {
	int id;
	List<Answer> answers;
	public Question(int id,List<Answer> answers)
	{
		this.id=id;
		this.answers=answers;
	}
	public void Display()
	{
		System.out.println("id ::"+id);
		Iterator itr=answers.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
