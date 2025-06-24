public class SinglyLinkedLists{
    //representation of linked lists
    //instanace variable of type list node:
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    //print Linked Lists
    public void display(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
         System.out.print("null");
    }
    //length of linked lists:
    public int length(){
        if(head==null){
            return 0;
        }
        int count=0;
        ListNode current=head;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }
    //insert at begining
    public void insertFirst(int value){
        ListNode newNode= new ListNode(value);
        newNode.next=head;
        head=newNode;
    }
    //insert at end
    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(head==null){
            head=newNode;
            return;
        }
        ListNode current= head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;}
        //insert at given position
        public void insert(int pos,int val){
            ListNode node=new ListNode(val);
            if(pos==1){
                node.next=head;
                head=node;
            }
            else{
                ListNode previous= head;
                int count=1;
                while(count<pos-1){
                    previous=previous.next;
                    count++;
                }
                ListNode current=previous.next;
                previous.next=node;
                node.next=current;
            }
        }
    
    public static void main(String[] args){
        //creation of sll
        SinglyLinkedLists sll=new SinglyLinkedLists();
        sll.head= new ListNode(10);
        ListNode second=new ListNode(1);
        ListNode third=new ListNode(2);
        ListNode fourth= new ListNode(3);
        //connect all of the nodes;
        sll.head.next=second;
        second.next=third;
        third.next=fourth;
        //to print length of linked list
        System.out.println(sll.length());
        //insertfirst
        sll.insertFirst(11);
        //insert last
        sll.insertLast(22);
        //insert at any position
        sll.insert(2,22);
        sll.display();
    }
}