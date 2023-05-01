package bagliListeOrnegi;

import java.awt.List;

public class CiftBagliDogrusal 
{
	Node root;
	
	
	CiftBagliDogrusal ekle(CiftBagliDogrusal liste, int data)
	{
		Node yeniDugum=new Node(data);
		if(liste.root==null)
			liste.root=yeniDugum;
		else {
			Node iter=liste.root;
			while(iter.next!=null)
				iter=iter.next;
			
			iter.next=yeniDugum;
			yeniDugum.previous=iter;
			
		}
		
		return liste;
	}
	
	void yazdir(CiftBagliDogrusal liste)
	{
		Node iter=liste.root;
		while(iter!=null) 
		{
			System.out.print(iter.data+ " ");
			iter=iter.next;
		}
	}
	
	void terstenYazdir(CiftBagliDogrusal liste) 
	{
		//burada iter i son d���me eri�tirmemiz gerekir.
		Node iter=sonDugumuBul(liste);
		while(iter!=null)
		{
			System.out.print(iter.data+" ");
			iter=iter.previous;
		}
	}
	
	Node sonDugumuBul(CiftBagliDogrusal liste)
	{
		Node iter=liste.root;
		while(iter.next!=null)
			iter=iter.next;
		
		return iter;
	}
	
	
	CiftBagliDogrusal siraylaEkle(CiftBagliDogrusal liste, int data)
	{
		Node yeniDugum=new Node(data);
		
		//liste bo� ise
		if(liste.root==null)
			liste.root=yeniDugum;
		
		//e�er eklenecek data root dan k���kse
		else if(yeniDugum.data<liste.root.data)
		{
			//root de�i�iyor.
			yeniDugum.next=liste.root;
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
	
	CiftBagliDogrusal sil(CiftBagliDogrusal liste, int silinecekData)
	{
		//e�er silinecek d���m root ise
		if(liste.root!=null && liste.root.data==silinecekData) 
		liste.root=liste.root.next;
		
		//e�er silinecekdata root d���nda listede bir yerde ise
		//ya da listede yoksa
		else {
			Node iter=liste.root;
			while(iter.next!=null && iter.next.data!=silinecekData)
				iter=iter.next;
			
			if(iter.next==null)
			System.out.println("Silinecek Veri Listede De�il");
			else {
				
				if(iter.next.next!=null)
				iter.next.next.previous=iter;
				iter.next=iter.next.next;
				
				//iter.next=iter.next.next;
				//if(iter.next!=null)
				//iter.next.previous=iter;
			}
					
		}
		
		return liste;
	}
	
	
	
	
	
	
	
	
	
}
