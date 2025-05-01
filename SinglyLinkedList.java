import java.util.*;
import java.io.*;


public class SinglyLinkedList {

    public ListNode head;
    
    static class ListNode{
      int data;
      ListNode next; 
      
       ListNode(int d)
       {
        data = d;
        next = null;
      }
    }
    // Print the linked list
    public static void printList(SinglyLinkedList list)
    {
      ListNode current = list.head;
      System.out.println("Linked List : ");
      while(current!=null){
        System.out.print(current.data+"->");
        current= current.next;
      }
      System.out.print("null");
      System.out.println();
    }
    // Count the nodes in the list
    public static int CountNodes(SinglyLinkedList list)
    {
      if(list.head==null){
        return 0;
      }
      ListNode curNode = list.head; 
      int count = 0; 
      while(curNode!=null){
        count++;
        curNode=curNode.next;
      }
      
      return count;
    }
    //Insert the node at first position 
    public static void insertFirst(SinglyLinkedList list, int value){
      ListNode newNode = new ListNode(value);
      newNode.next=list.head;
      list.head = newNode;
    }
    //Insert the node at last position
    public static void insertLast(SinglyLinkedList list, int value){
      ListNode newNode = new ListNode(value);
      if(list.head==null)
      {
        list.head=newNode;
        return;
      }
      
      ListNode current= list.head;
      while(current.next!=null){
        current=current.next;
      }
      current.next=newNode;
    }
    //Insert the node at given position
    public static void insertPosition(SinglyLinkedList list, int value, int position)
    {
      ListNode newNode = new ListNode(value);
      if(list.head==null || position==1)
      {
         newNode.next=list.head;
         list.head=newNode;
         return;
      }
      ListNode prev = list.head;
      int count =1; 
      while(count<position-1)
      {
        prev=prev.next;
        count++;
      }
      newNode.next=prev.next;
      prev.next=newNode;
      
    }
    // Delete the first node
    public static void  deleteFirst(SinglyLinkedList list)
    {
      if(list.head==null)
      {
        return;
      }
      ListNode temp = list.head;
      list.head=list.head.next;
      temp.next=null;
      
    }
    //Delete the last last node
    public static void deleteLast(SinglyLinkedList list)
    {
      if(list.head==null)
      {
        return;
      }
      ListNode curNode = list.head;
      ListNode prev = null;
      while(curNode.next!=null)
      {
        prev = curNode;
        curNode=curNode.next;
      }
      prev.next = null;
    }
    //Delete the node at specified position
    public static void deleteatPosition(SinglyLinkedList list, int position)
    {
      if(list.head==null)
      {
        return;
      }
      if(position==1)
      {
        list.head=list.head.next;
        return;
      }
      ListNode cur = list.head;
      ListNode prev =null;
      int count =0; 
      while(count<position-1){
        prev = cur;
        cur = cur.next;
        count++;
      }
      prev.next = cur.next;
      cur.next=null;
    }
    public static int SearchNode (SinglyLinkedList list, int value)
    {
      ListNode cur = list.head;
      int position=1;
      while(cur!=null){
        if(cur.data==value)
        {
          return position;
        }
        position++;
        cur= cur.next;
      }
      System.out.println("Node value did not found in the list.");
      return 0;
    }
    
    public static void ReverseList(SinglyLinkedList list)
    {
      if(list.head ==null)
      {
        return;
      }
      ListNode prev = null;
      ListNode cur = list.head;
      ListNode temp =null;
      while(cur!=null)
      {
        temp = cur.next;
        cur.next=prev;
        prev=cur;
        cur = temp;
      }
      list.head = prev;
      
    }
    
    public static ListNode GetMiddleNode(SinglyLinkedList list)
    {
      if ( list.head ==null)
      {
        return list.head;
      }
      
      ListNode slowPtr = list.head;
      ListNode fastPtr = list.head;
      
      while(fastPtr!=null && fastPtr.next!=null)
      {
        slowPtr= slowPtr.next;
        fastPtr=fastPtr.next.next;
      }
      
      return slowPtr;
      
    }
    
    public static void DeleteDuplicates(SinglyLinkedList list)
    {
      
      ListNode prev = list.head;
      ListNode cur = list.head.next;
      
      while(cur!=null)
      {
        if(prev.data==cur.data)
        {
          prev.next=cur.next;
          cur=cur.next;
          prev=cur;
          
        }
        prev=cur;
        cur=cur.next;
      }
    }
    
    public static void main(String[] args){
      SinglyLinkedList sll = new SinglyLinkedList();
      printList(sll);
      insertLast(sll,0);
      printList(sll);
      insertLast(sll,10);
      insertLast(sll,20);
      insertLast(sll,30);
      insertLast(sll,40);
      insertLast(sll,50);
      printList(sll);
      insertLast(sll,60);
      printList(sll);
      insertPosition(sll,35,5);
      printList(sll);
      System.out.println("Count of Nodes : "+CountNodes(sll));
      deleteFirst(sll);
      printList(sll);
      deleteLast(sll);
      printList(sll);
      deleteatPosition(sll,4);
      printList(sll);
      System.out.println("Node value 30 found at position : "+SearchNode(sll,30));
      ReverseList(sll);
      printList(sll);
      System.out.println("Middle Node is : "+GetMiddleNode(sll).data);
      insertPosition(sll,20,3);
      printList(sll);
      DeleteDuplicates(sll);
      printList(sll);
    }

}