class Node
{
	int key;
	String value;
	Node next;
	Node(int key,String value)
	{
		this.key=key;
		this.value=value;
		next=null;
	}
	void setKey(int key)
	{
		this.key=key;
	}
	void setvalue(String value){
		this.value=value;
	}
	int getKey()
	{
		return key;
	}
	String getvalue()
	{
		return value;
	}
	void setNext(Node next)
	{
		this.next=next;
	}
	Node getNext()
	{
		return next;
	}
}
class MHashMap
{
	MHashMap(){}
	Node bucket[]=new Node[10];
	int hashCode(int key)
	{
		return key%10;
	}
	void iterate()
	{
		System.out.println("length==="+bucket.length);
		for(int i=0;i<bucket.length;i++)
		{
			Node currentnode=bucket[i];
			while(currentnode!=null )
			{
				System.out.println(currentnode.getKey()+" "+currentnode.getvalue());
				currentnode=currentnode.next;
			}
		}
	}
	void put(int key,String value)
	{
		int hashvalue=hashCode(key);
		Node entry=new Node(key,value);
		System.out.println("new entry=="+entry.getKey()+" "+entry.getvalue());
		if(bucket[hashvalue]==null)
		{	bucket[hashvalue]=entry;
			System.out.println("not exist");
		}
		else
		{
			Node currentEntry=bucket[hashvalue];
			if(currentEntry.next==null)
			{
				System.out.println("make Entry for "+entry.getKey()+" "+entry.getvalue());
				if(currentEntry.getKey()==entry.getKey())
				{
					System.out.println("Entry exist");
					currentEntry.setvalue(entry.getvalue());
					return;
				}
				bucket[hashvalue].next=entry;
				System.out.println("code=="+bucket[hashvalue].next.getKey()+" "+bucket[hashvalue].next.getvalue());
				return;
			}
			else{
			while(currentEntry.next!=null)
			{
				System.out.println("current element="+currentEntry.getKey());
				if(currentEntry.getKey()==entry.getKey())
				{
					System.out.println("Entry exist");
					currentEntry.setvalue(entry.getvalue());
					return;
				}
				currentEntry=currentEntry.next;
			}
			}
			currentEntry.next=entry;

			
			 
		}
	}
	public String get(int key)
	{
		int hashvalue=hashCode(key);
		Node currentNode=bucket[hashvalue];
		while(currentNode!=null)
		{
			if(currentNode.getKey()==key)
				return currentNode.getvalue();
			currentNode=currentNode.next;
			
		}
		return null;
	}

}
public class MYHashMap {
	public static void main(String args[])
	{
		MHashMap mh=new MHashMap();
		mh.put(1,"A");
		mh.put(2,"F");
		mh.put(11,"D");
		mh.put(12,"A");
		mh.put(1,"B");
		mh.put(22,"A");
		mh.put(16,"D");
		mh.put(9,"K");
		mh.put(12,"G");
		System.out.println(mh.get(11));
		mh.iterate();
		
	}
	
}
