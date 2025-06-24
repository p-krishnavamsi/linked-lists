public class RemoveKey{
    private ListNode head;
    private class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void insertFirst(int value){
        ListNode newNode= new ListNode(value);
        newNode.next=head;
        head=newNode;
    }
    public void display(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
         System.out.print("null");
    }
    public void deleteNode(int key){
        ListNode current=head;
        ListNode temp=null;

        if(current != null && current.data == key){
            head=current.next;
            return;
        }
        while(current!=null && current.data!=key){
            temp=current;
            current=current.next;
        }if(current==null){
            return;
        }temp.next=current.next;
    }
    public static void main(String[] args){
        RemoveKey rk=new RemoveKey();
        rk.insertFirst(11);
        rk.insertFirst(19);
        rk.insertFirst(12);
        rk.insertFirst(122);
        rk.deleteNode(11);
        rk.display();
    }
}