package LinkedListExample;

public class LinkedList
{
    Node root;

    public LinkedList insert(LinkedList list, int data)
    {
        Node yeniDugum=new Node(data);
        if(list.root==null)
            list.root=yeniDugum;
        else
        {
            Node iter=list.root;
            while(iter.next!=null)
                iter=iter.next;
            iter.next=yeniDugum;
        }
        return list;
    }

    public LinkedList orderlyInsert(LinkedList list,int data)
    {
        Node yeniDugum=new Node(data);
        //if the list is empty
        if(list.root==null) {
            list.root=yeniDugum;
            return list;
        }

        if(yeniDugum.data<list.root.data)
        {
            //root u değiştirelim.
            yeniDugum.next=list.root;
            list.root=yeniDugum;
        }

        else
        {
            Node iter=list.root;
            while(iter.next!=null && iter.next.data<yeniDugum.data)
                iter=iter.next;

            Node temp=iter.next;
            iter.next=yeniDugum;
            yeniDugum.next=temp;
        }
        return list;
    }

    public void print(LinkedList list)
    {
        Node iter=list.root;
        while(iter!=null) {
            System.out.print(iter.data+" ");
            iter=iter.next;
        }
    }

    public LinkedList delete(LinkedList list, int deletedData)
    {
        //eğer silinecek düğüm rootta ise
        if(list.root!=null && list.root.data==deletedData)
        {
            list.root=list.root.next;
            return list;
        }

        Node iter=list.root;
        //root düğüm haricinde bir yerde ise yada listede yoksa
        while(iter.next!=null && iter.next.data!=deletedData)
            iter=iter.next;

        if(iter.next==null)
            System.out.println("Sayı Bulunamadı.");
        else
            iter.next=iter.next.next;

        return list;
    }
}