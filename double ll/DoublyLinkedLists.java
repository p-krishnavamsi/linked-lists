import java.util.NoSuchElementException;

public class DoublyLinkedLists{
    private ListNode head;
    private ListNode tail;
    private int length;
    private class ListNode{
        private int data;
        private ListNode next;
        private ListNode previous;
        public ListNode(int data){
            this.data=data;
        }
    }
    public DoublyLinkedLists(){
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public int length(){
        return length;
    }
    public void displayForward(){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void displayBackward(){
        ListNode temp=tail;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.previous;
        }
        System.out.println("null");

    }
    public void insertFirst(int value){
            ListNode newNode= new ListNode(value);
            if(isEmpty()){
                tail=newNode;
            }
            else{
                head.previous=newNode;
            }
            newNode.next=head;
            head=newNode;
            length++;
    }
     public void insertLast(int value){
            ListNode newNode= new ListNode(value);
            if(isEmpty()){
                head=newNode;
            }
            else{
                tail.next=newNode;
                newNode.previous=tail;
            }
            
            tail=newNode;
            length++;
    }
    public ListNode delete(){
        if(isEmpty()){
            throw new NoSuchElementException("List is empty");
        }
        ListNode temp=head;
        if(head==tail){
            tail=null;
        }else{
        head.next.previous=null;
        }
        head=head.next;
        temp.next=null;
        length--;
        return temp;
    }
      public ListNode deleteLast(){
        if(isEmpty()){
            throw new NoSuchElementException("List is empty");
        }
        ListNode temp=tail;
        if(head==tail){
            head=null;
        }else{
        tail.previous.next=null;
        }
        tail=tail.previous;
        temp.previous=null;
        length--;
        return temp;
    }


    public static void main(String[] args){
        DoublyLinkedLists dll=new DoublyLinkedLists();
        dll.insertFirst(1);
        dll.insertFirst(2);
        dll.insertFirst(9);
        dll.displayForward();
        //dll.displayBackward();
        //dll.insertLast(11);
        //dll.insertLast(22);
        //dll.insertLast(99);
        dll.delete();
        dll.delete();
        dll.delete();
       // dll.delete();
        dll.displayForward();
        //dll.displayBackward();

    }
}