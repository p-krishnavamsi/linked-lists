public class Slldelete{
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
    //delete first node
public ListNode deleteFirst(){
    if(head==null){
        return null;
    }
    ListNode temp=head;
    head=head.next;
    temp =null;
    return temp;
}
//delete last node
public ListNode deleteLast(){
    if(head==null|| head.next==null){
        return head;
    }
    ListNode current=head;
    ListNode previous=null;
    while(current.next!=null){
        previous=current;
        current=current.next;
    }
    previous.next=null;
    return current;
}
    //delete at given postion
    public ListNode delete(int pos){
        ListNode pre=head;
        int count=1;
        if(pos==1){
            head=head.next;
        }
        else{
                while(count<pos-1){
                    pre=pre.next;
                    count++;
                }
                ListNode current=pre.next;
                pre.next=current.next;
        }
        return head;
    }
    public void deleteNode(int k){
        ListNode current=head;
        ListNode temp=null;
        if(current!=null&&current.data==k){
            head=current.next;
            return;
        }
        while(current!=null && current.data!=k){
            temp=current;
            current=current.next;
        }
        if(current==null){
            return;
        }
        temp.next=current.next;
    }
    public static void main(String[] args){
        //creation of sll
        Slldelete sll=new Slldelete();
        sll.head= new ListNode(10);
        ListNode second=new ListNode(1);
        ListNode third=new ListNode(2);
        ListNode fourth= new ListNode(3);
        sll.head.next=second;
        second.next=third;
        third.next=fourth;
        //sll.deleteFirst();
        //sll.deleteLast();
       // sll.delete(2);

       sll.deleteNode(10);
        sll.display();
    }
}