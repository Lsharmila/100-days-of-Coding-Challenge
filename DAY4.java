import java.util.*;
  public class Main{
      public static void main (String[] args) {
          
          SingleLinkedList sll=new SingleLinkedList();
          sll.Makenew();
          
          
          System.out.print("\n Going to insercet at Front");
          sll.insbeg(9);
          sll.insatpos(12);
          sll.insend(34);
          sll.display(); 
      }
      
  }
  class node{
      int data;    
      node next;
  }
class  SingleLinkedList{
    node head;
    public void Makenew(){
        Scanner sc=new Scanner(System.in); 
        node temp;
        head=new node();
        System.out.print("Enter the head Node value: ");
        head.data=sc.nextInt();
        head.next=null;
        temp=head;
        System.out.print("Enter the node Length: ");
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
        node newnode=new node();
        System.out.print("\nEnter the node values:"+i+"-> ");
        newnode.data=sc.nextInt();
        newnode.next=null;
        temp.next=newnode;
        temp=temp.next;
        }
    }
    public void insbeg(int n){
        node temp=head;
        node newnode=new node();
        newnode.data=n;
        newnode.next=temp;
        head=newnode;
    }
    public void insatpos(int n){
        node temp=head;
        node newnode=new node();
        int pos=3;
        for(int i=1;i<pos-1;i++)
        temp=temp.next;
        newnode.data=n;
        newnode.next=null;
        newnode.next=temp.next;
        temp.next=newnode;
        
    }
    public void insend(int n){
        node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        node newnode=new node();
        newnode.data=n;
        newnode.next=null;
        temp.next=newnode;
        
    }
    public void display(){
        node temp=head;
        int k=0;
        while(temp!=null){
            k=k+1;
            System.out.print("\n This is "+ k +" Node value:");
        System.out.println(temp.data);
        temp=temp.next;
        }
    }
}
