import java.util.*;
public class CircularLinkedLists{
    private ListNode last;
    private int length;

private class ListNode{
    private ListNode next;
    int data;

public ListNode(int data){
    this.data=data;
}
}
public CircularLinkedLists(){
    last=null;
    length=0;
}
public int length(){
    return length;
}
public boolean isEmpty(){
    return length==0;
}
public void createCircularLinkedLists(){
    ListNode first=new ListNode(1);
    ListNode second=new ListNode(22);
    ListNode third=new ListNode(12);
    ListNode fourth=new ListNode(14);
    first.next=second;
    second.next=third;
    third.next=fourth;
    last=fourth;
    last.next=first;

}
public void insertFirst(int value){
    ListNode temp=new ListNode(value);
    if(last==null){
        last=temp;
    }else{
        temp.next=last.next;
    }
    last.next=temp;
    length++;
}
public void insertLast(int data){
    ListNode temp=new ListNode(data);
    if(last==null){
        last=temp;
        last.next=last;
    }else{
        temp.next=last.next;
        last.next=temp;
        last=temp;
    }
    length++;
}
public void print(){
    if(last==null){
        return;
    }
    ListNode first=last.next;
    while(first!=last)
    {
        System.out.print(first.data+" ");
        first=first.next;
    }
    System.out.println(first.data+" ");


}
public ListNode deleteFirst(){
    //ListNode temp=last.next;
    if(isEmpty()){
        throw new NoSuchElementException("it is empty");
    } ListNode temp=last.next;
        if(last.next==last){
            last=null;
        }else{
            last.next=temp.next;
            temp.next=null;
        }
        temp.next=null;
        length--;
        return temp;

    }
    public ListNode deleteLast(){
    //ListNode temp=last.next;
    if(isEmpty()){
        throw new NoSuchElementException("it is empty");
    } ListNode temp=last.next;//temp-->head
    ListNode previous=null;
        if(last.next==last){
            last=null;
        }else{
            while(temp.next!=temp){
           previous=temp;
           temp=temp.next;
        }}
        previous.next=null;
        length--;
        return temp;

    }


public static void main(String[] args){
    CircularLinkedLists csll= new CircularLinkedLists();
    //csll.createCircularLinkedLists();
    csll.print();
    csll.insertFirst(1);
    csll.insertFirst(11);
    csll.insertFirst(111);
    csll.insertLast(2);
    csll.insertLast(22);
    csll.insertLast(222);
    csll.print();
    csll.deleteFirst();
    csll.deleteLast();
    csll.print();
}}
