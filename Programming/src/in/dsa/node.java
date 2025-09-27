package in.dsa;

public class node {
	
	int data;
	node next;
	node (int data)
	{
		this.data=data;
		this.next=null;
	}

}


class linked_list1
{
	node head;
	
	public void printall()
	{
		if(head ==null)
		{
			System.out.println("the linked list is empty");
		}else
		{
			node curr=head;
			while(curr !=null)
			{
				System.out.print(curr.data+" ");
				curr=curr.next;
			}
		}
	}
	
	public void add_data(int ele)
	{
		node temp=new node(ele);
		if(head ==null)
		{
			head=temp;
		}else
		
		{
			node curr=head;
			while(curr.next !=null)
			{
				curr=curr.next;
			}
			curr.next=temp;
		}
	}
	
	public void addFirst(int ele)
	{
		node temp=new node(ele);
		
		if(head ==null)
		{
			head=temp;
		
		}else
		{  
				temp.next=head;
				head=temp;
		}
	}
	
//	public void add_last(int ele)
//	{
//		node temp=new node(ele);
//		if(head==null)
//		{
//			head=temp;
//		}
//		else
//		{
//			node curr=head;
//			while(curr.next.next==null)
//			{
//				curr=curr.next;
//				//curr.next.next=temp;
//			}
//			 curr.next=temp;;
//		}
//		
//	}
	
	public void add_after(int val,int newval)
	{
		node temp=new node(newval);
		node curr=head;
		while(curr !=null)
		{
			if(curr.data==val)
			{
				temp.next=curr.next;
				curr.next=temp;
				return;
			}
			curr=curr.next;
		}
		System.out.println("element not found");
	}
	
	public int size()
	{
		node curr=head;
		int count=0;
		while(curr !=null)
		{
			count++;
			curr=curr.next;
		}
		return count;
	}
	
	public void add_at(int index,int newval)
	{
		node temp=new node(newval);
		
		if(index ==0)
		{
		   addFirst(newval);
		}
		if(index==size())
		{
			add_data(newval);
		}else
		{
			node curr=head;
			for(int i=0;i<index-1;i++)
			{
				curr=curr.next;
			}
			temp.next=curr.next;
			curr.next=temp;
		}
	}
	
	public void delete_first()
	{
		
		if(head ==null)
		{
			System.out.println("list is empty");
			return;
		}
		head=head.next;
	}
	
	public void delete_last()
	{
		if(head ==null)
		{
			System.out.println("ll is empty");
		}
		if(head.next==null)
		{
			head=null;
		}
		else
		{
			node curr=head;
			
			while(curr.next.next !=null)
			{
				curr=curr.next;
				
			}
			curr.next=null;
		}
	}
	
	public void del_last()
	{
		node curr=head;
		for(int i=0;i<size()-2;i++)
		{
			
			curr=curr.next;
		}
		curr.next=null;
		
	}
	
	public void del_at(int index)
	{
		if(index<0 || index<size())
		{
			System.out.println("index out of range");
		}else
		{
			node curr=head;
			while(curr.next !=null)
			{
				curr=curr.next;
			}
			curr.data=index;
			
		}
	}



	public static void main(String[] args) {
		linked_list1 l=new linked_list1();
		l.add_data(10);
		l.add_data(20);
		l.add_data(30);
		l.add_data(40);
		l.add_data(60);
		//l.addFirst(50);
		//l.add_after(30, 35);
		//l.add_at(2, 35);
		//l.delete_first();
		//l.delete_last();
		//l.del_last();
		l.del_at(2);
		System.out.println(l.size());
		l.printall();
	}
}