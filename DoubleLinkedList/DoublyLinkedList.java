package bagliListeOrnegi;

public class DoublyLinkedList 
{
	Node root;
	
	DoublyLinkedList insert(DoublyLinkedList liste,int data){
		
		Node yeniDugum=new Node(data);
		if(liste.root==null)
			liste.root=yeniDugum;
		else 
		{
			Node iter=liste.root;
			while(iter.next!=null)
				iter=iter.next;
			
			iter.next=yeniDugum;
			yeniDugum.previous=iter;
		}
		return liste;
	}
	
	
	void print(DoublyLinkedList liste) 
	{
		Node iter=liste.root;
		while(iter!=null) 
		{
			System.out.print(iter.data+ " ");
			iter=iter.next;
		}
	}
	
	void terstenPrint(DoublyLinkedList liste)
	{
		Node iter=findLastNode(liste);
		
		while(iter!=null)
		{
			System.out.print(iter.data+" ");
			iter=iter.previous;
		}
	}
	
	Node findLastNode(DoublyLinkedList liste) 
	{
		Node iter=liste.root;
		while(iter.next!=null) 
			iter=iter.next;
		
		return iter;
	}
	
	DoublyLinkedList orderlyInsert(DoublyLinkedList liste, int data)
	{
	    Node yeniDugum=new Node(data);
	    
	    //liste boþ ise
	    if(liste.root==null)
	    	liste.root=yeniDugum;
	    	
	    //eklenecek elemanýn root dan küçük olma durumu
	    else if(yeniDugum.data<liste.root.data)
	    {
	    	//root u deðiþtiriyoruz.
	    	yeniDugum.next=liste.root;
	    	yeniDugum.previous=null;
	    	
	    	liste.root.previous=yeniDugum;
	    	liste.root=yeniDugum;
	    }
	    
	    else 
	    {
	    	Node iter=liste.root;
	    	while(iter.next!=null && iter.next.data<yeniDugum.data)
	    		iter=iter.next;
	    	
	    	Node temp=iter.next;
	    	
	    	iter.next=yeniDugum;
	    	yeniDugum.previous=iter;
	    	
	    	yeniDugum.next=temp;
	    	if(temp!=null)
	    	temp.previous=yeniDugum;
	    	
	    }
	    	    	
		return liste;
	}
	
	DoublyLinkedList delete(DoublyLinkedList liste, int silinecekData)	
	{
		//silinecek düðüm rootda ise
		if(liste.root!=null &&liste.root.data==silinecekData)
			liste.root=liste.root.next;
	
		//root düðüm dýþýnda listede br yerlerde ya da hiç listede deðilse
		else {
			
			Node iter=liste.root;		
			while(iter.next!=null && iter.next.data!=silinecekData)
				iter=iter.next;
			
			if(iter.next==null)
				System.out.println("Silinecek eleman listede deðil.");	
			else
			{
				if(iter.next.next!=null)
					iter.next.next.previous=iter;
				iter.next=iter.next.next;
				
				//iter.next=iter.next.next;
				//if(iter.next!=null)
				//	iter.next.previous=iter;
			}	
		}
		return liste;
	}
	
	
}
