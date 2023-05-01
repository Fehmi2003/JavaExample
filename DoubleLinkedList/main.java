package bagliListeOrnegi;

public class main {

	public static void main(String[] args) {
		
		CiftBagliDogrusal liste=new CiftBagliDogrusal();
		liste=liste.siraylaEkle(liste, 5);	
		liste=liste.siraylaEkle(liste, 3);
		liste=liste.siraylaEkle(liste, 20);
		liste=liste.siraylaEkle(liste, 7);
		liste=liste.siraylaEkle(liste, 1);
		liste=liste.siraylaEkle(liste, 15);
		
		liste.yazdir(liste);
		System.out.println();
		liste.terstenYazdir(liste);
		System.out.println();
		
		liste.sil(liste,7);
		liste.yazdir(liste);
		System.out.println();
		
		liste.sil(liste,1);
		liste.yazdir(liste);
		System.out.println();
		
		liste.sil(liste,20);
		liste.yazdir(liste);
		System.out.println();
		
		liste.sil(liste,5);
		liste.yazdir(liste);
		System.out.println();
		
		
		
		
		
		/*
		DoublyLinkedList liste=new DoublyLinkedList();
		liste=liste.orderlyInsert(liste, 7);
		liste=liste.orderlyInsert(liste, 12);
		liste=liste.orderlyInsert(liste, 1);
		liste=liste.orderlyInsert(liste, 97);
		liste=liste.orderlyInsert(liste, 8);
		liste=liste.orderlyInsert(liste, 47);
		liste=liste.orderlyInsert(liste, 56);
		liste=liste.orderlyInsert(liste, 5);
		
		liste.print(liste);
		System.out.println("");
		//liste.terstenPrint(liste);
		
		liste.delete(liste, 8);
		liste.print(liste);
		System.out.println("");
		
		
		liste.delete(liste, 56);
		liste.print(liste);
		System.out.println("");
		
		
		liste.delete(liste, 97);
		liste.print(liste);
		System.out.println("");
		
		liste.delete(liste, 1);
		liste.print(liste);
		System.out.println("");
		*/
		/*DoublyLinkedList liste=new DoublyLinkedList();
		liste=liste.insert(liste, 7);
		liste=liste.insert(liste, 12);
		liste=liste.insert(liste, 1);
		liste=liste.insert(liste, 97);
		
		liste.print(liste);
		System.out.println("");
		liste.terstenPrint(liste);*/
		/*DaireselListe liste=new DaireselListe();
		liste=liste.orderlyInsert(liste, 3);
		liste=liste.orderlyInsert(liste, 5);
		liste=liste.orderlyInsert(liste, 4);
		liste=liste.orderlyInsert(liste, 20);
		liste=liste.orderlyInsert(liste, 6);
		liste=liste.orderlyInsert(liste, 1);
		liste.print(liste);
		System.out.println();
		
		liste.delete(liste, 4);
		System.out.println();
		liste.print(liste);
		
		liste.delete(liste, 20);
		System.out.println();
		liste.print(liste);
		
		
		liste.delete(liste, 1);
		System.out.println();
		liste.print(liste);*/
		
		//liste=liste.orderlyInsert(liste,45);
		//liste=liste.orderlyInsert(liste,34);
		//liste=liste.orderlyInsert(liste,17);
		//liste=liste.orderlyInsert(liste,33);
		
		/*LinkedList list=new LinkedList();
		list=list.insert(list, 3);
		list=list.insert(list, 4);
		list=list.insert(list, 8);
		list=list.insert(list, 6);
		list=list.insert(list, 2);
		list=list.insert(list, 30);
		list.print(list);
		System.out.println();
	
		list=list.delete(list, 6);
		list.print(list);
		System.out.println();
		
		list=list.delete(list, 2);
		list.print(list);
		System.out.println();
		
		list=list.delete(list, 8);
		list.print(list);
		
		System.out.println();*/
		/*Node yeniDugum=new Node(3);
		
		list.root=yeniDugum;
		
		yeniDugum=new Node(40);
		list.root.next=yeniDugum;
		
		yeniDugum=new Node(5);
		list.root.next.next=yeniDugum;
		
		Node iter=list.root;
		while(iter!=null) 
		{
			System.out.print(iter.data+" ");
			iter=iter.next;
		}*/

	}

}
