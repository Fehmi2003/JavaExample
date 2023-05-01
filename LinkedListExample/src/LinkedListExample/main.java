package LinkedListExample;





public class main {

    public static void main(String[] args)
    {
        LinkedList list=new LinkedList();
        list=list.orderlyInsert(list, 3);
        list=list.orderlyInsert(list, 2);
        list=list.orderlyInsert(list, 6);
        list=list.orderlyInsert(list,5);
        list=list.orderlyInsert(list,4);
        list.print(list);

        list=list.delete(list, 4);
        System.out.println();
        list.print(list);

        list=list.delete(list, 5);
        System.out.println();
        list.print(list);

        list=list.delete(list, 2);
        System.out.println();
        list.print(list);
		/*Node yeniDugum=new Node(45);
		list.root=yeniDugum;

		yeniDugum=new Node(117);
		list.root.next=yeniDugum;

		yeniDugum=new Node(34);
		list.root.next.next=yeniDugum;

		Node iter=list.root;
		while(iter!=null)
		{
			System.out.print(iter.data+" ");
			iter=iter.next;
		}*/
    }
}