package bagliListeOrnegi;

import java.awt.List;

public class LinkedList 
{
	Node root;
	
	public LinkedList insert(LinkedList liste, int data) 
	{
		Node yeniDugum=new Node(data);
		if(liste.root==null)
			liste.root=yeniDugum;
		else 
		{
			Node iter=liste.root;
			while(iter.next!=null)
				iter=iter.next;
			iter.next=yeniDugum;
		}
		return liste;
	}
	
	public void print(LinkedList liste) 
	{
		Node iter=liste.root;
		while(iter!=null)
		{
			System.out.print(iter.data+" ");
			iter=iter.next;
		}
	}
	
	public LinkedList orderlyInsert(LinkedList liste, int data) 
	{
		Node yeniDugum=new Node(data);
		//ba�l� liste bo� ise
		if(liste.root==null) 
		{
			liste.root=yeniDugum;
			return liste;
		}
		
		//ilk eleman�n root'dan k���k olma durumu
		if(yeniDugum.data<liste.root.data)
		{
			//root de�i�ecek
			yeniDugum.next=liste.root;
			liste.root=yeniDugum;
		}
		else 
		{
			Node iter=liste.root;
			while(iter.next!=null && iter.next.data<yeniDugum.data)
				iter=iter.next;
			
			Node temp=iter.next;
			iter.next=yeniDugum;
			yeniDugum.next=temp;
		}
		
		return liste;
	}
	
	public LinkedList delete(LinkedList liste, int deletedData) 
	{
		//e�er silinecek eleman root ise
		if(liste.root!=null && liste.root.data==deletedData) 
		{
			liste.root=liste.root.next;
			return liste;
		}
		
		Node iter=liste.root;
		while(iter.next!=null && iter.next.data!=deletedData)
			iter=iter.next;
		
		if(iter.next==null)
			System.out.println("Say� bulunamad�");
		else
			iter.next=iter.next.next;
		
		return liste;
	}
	
}
