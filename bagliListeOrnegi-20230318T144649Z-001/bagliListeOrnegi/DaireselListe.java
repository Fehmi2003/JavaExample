package bagliListeOrnegi;

public class DaireselListe 
{
	Node root;
	
	DaireselListe insert(DaireselListe liste, int data) 
	{
		Node yeniDugum=new Node(data);
		if(liste.root==null)
		{
			liste.root=yeniDugum;
			liste.root.next=liste.root;
		}
		else 
		{
			Node iter=liste.root;
			while(iter.next!=liste.root)
				iter=iter.next;
			
			iter.next=yeniDugum;
			yeniDugum.next=liste.root;
		}
		return liste;
	}
	
	void print(DaireselListe liste) 
	{
		Node iter=liste.root;
		System.out.print(iter.data+" ");
		iter=iter.next;
		
		while(iter!=liste.root) 
		{
			System.out.print(iter.data+" ");
			iter=iter.next;
		}
	}
	
	DaireselListe orderlyInsert(DaireselListe liste, int data) 
	{
		Node yeniDugum=new Node(data);
		if(liste.root==null)
		{
			liste.root=yeniDugum;
			liste.root.next=liste.root;
		}
		
		//ilk eleman root'dan küçükse
		else if(yeniDugum.data<liste.root.data)
		{		
			Node iter=liste.root;
			while(iter.next!=liste.root)
				iter=iter.next;
			
			iter.next=yeniDugum;
			yeniDugum.next=liste.root;
			liste.root=yeniDugum;			
		}		
		else 
		{
			Node iter=liste.root;
			while(iter.next!=liste.root && 
					iter.next.data<yeniDugum.data)
			iter=iter.next;
			
			Node temp=iter.next;
			
			iter.next=yeniDugum;
			yeniDugum.next=temp;		
		}
		
		return liste;
	}
	
	
	DaireselListe delete(DaireselListe liste, int silinecekData) 
	{
		Node iter=liste.root;
		
		//eðer silinecek düðüm root ise
		if(liste.root.data==silinecekData)
		{
			while(iter.next!=liste.root)
				iter=iter.next;
			
			iter.next=liste.root.next;
			liste.root=liste.root.next;
		}
		
		else 
		{
		while(iter.next!=liste.root &&
				iter.next.data!=silinecekData)
			iter=iter.next;
		
		if(iter.next==liste.root)
		System.out.println("Silinecek data listede yok.");
		
		else 
			iter.next=iter.next.next;
		}
		
		return liste;
	}
	
	
	
}
