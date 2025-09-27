package in.dsa;

class Node2
{
    int data;
    Node2 next;
    public Node2(int data) {
        super();
        this.data = data;
        this.next=null;
    }    
}
public class Linked_list {
    Node2 head;
    public void printll()
    {
        if(head==null)
        {
            System.out.println("ll is empty");
        }
        else
        {
            Node2 curr=head;
            while(curr!=null)
            {
                System.out.print(curr.data+" ");
                curr=curr.next;
            }
        }
        System.out.println();
    }
    public void add(int ele)
    {
        Node2 temp=new Node2(ele);
        if(head == null)
        {
            head=temp;
        }
        else
        {
            Node2 curr=head;
            while(curr.next!=null)
            {
                curr =curr.next;
            }
            curr.next=temp;
        }
    }
    
    public void add_after(int val,int newval)
    {
    	Node2 curr=head;
    	while(curr !=null)
    	{
    		if(curr.data ==val)
    		{
    			Node2 temp=new Node2(newval);
    			temp.next=curr.next;
    			curr.next=temp;
    			return;
    		}
    		curr=curr.next;
    	}
    	System.out.println("ele not present");
    }
    
    
    public void delete_first()
    {
    	if(head==null)
    	{
    		System.out.println("ll is empty");
    		return;
    	}
    	head=head.next;
    }
    
    
    public void delete_last()
    {
    	if(head==null)
    	{
    		System.out.println("ll is already empty");
    	}
    	if( head.next==null)
    	{
    		head=null;
    	}else {
    	Node2 curr=head;
    	while(curr.next.next !=null)
    	{
    		curr=curr.next;
    	}
    	curr.next=null;
    	}
    }
    
    
    public void delete_at(int index)
    {
    	if(index<0 ||index>=size())
    	{
    		System.out.println("index out of range");
    		return;
    	}
    	if(index==0)
    	{
    		delete_first();
    	}else if(index==size()-1)
    	{
    		delete_last();
    	}
    	else
    	{
    		int count=0;
    		Node2 curr=head;
    		while(count<index-1)
    		{
    			count++;
    			curr=curr.next;
    		}
    		curr.next=curr.next.next;
    	}
    }
    
    public void add_all(int [] arr)
    {
    	for(int val:arr)
    	{
    		add(val);
    	}
    }
    
    public void addFirst(int ele)
    {
        Node2 temp=new Node2(ele);
        temp.next=head;
        head=temp;
    }
    
    
    public int size()
    {
        int count=0;
        Node2 cur=head;
        while(cur!=null)
        {
            count++;
            cur=cur.next;
        }
        return count;    
    }
    public void add_at(int index,int ele)
    {
        if(index==0)
        {
            addFirst(ele);
        }
        if(index==size())
        {
            add(ele);
        }
        else
        {
            Node2 curr=head;
            int count=0;
            Node2 temp=new Node2(ele);
            while(count<index-1)
            {
                count++;
                curr=curr.next;
            }
            temp.next=curr.next;
            curr.next=temp;
        }
    }
    public static void main(String[] args) {
        Linked_list l=new Linked_list(); 
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(50);
       // l.addFirst(60); 
        l.printll();
       // l.addFirst(70);
       // l.printll();
       // l.add_at(3, 5000);
        l.add_after(30, 35);
//        l.delete_first();
//        l.delete_last();
        l.delete_at(2);
        l.printll();
        int [] arr= {60,70,80};
        l.add_all(arr);
        l.printll();
        System.out.println(l.size());
        
        // assignment: add after the element
        //assignment:ele,after ele,before ele
    }
}