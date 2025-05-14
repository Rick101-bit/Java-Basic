
public class doubly {
    public static class node{
        int data;
        node next;
        node prev;
        node(int data){
            this.data =data;
        }

    }
    public static class doublylinkedlist{
        int count =0;
        node head =null;
        node tail = null;
        void insertatend(int data){
            node temp =new node(data);
            if(head == null){
                head =temp;
            }
            else{
                tail.next =temp;
                temp.prev =tail;
            }
            tail =temp;
            count++;

        }
        void inseertatbegining(int data){
            node temp =head;
            node newnode = new node(data);
            if(temp == null){
                head =temp;
            }
            else{
                newnode.next =temp;
                temp.prev =newnode;
                head =newnode;
                
            }
        }
        void displayf(){
            node temp = head;
            while(temp != null){
                System.out.println(temp.data);
                temp =temp.next;
            }
        }
        void displayb(){
            node temp =tail;
            while(temp != null){
                System.out.println(temp.data);
                temp =temp.prev;
            }

        }
        void deleteatidx(int idx){
            node temp =head;
            if(idx<0 && idx>count-1 ){
                System.out.println("ohh! you entered wrong index");
                return;
            }
            for(int i =1;i<=idx-1;i++){
                temp =temp.next;

            }
            temp.next.next.prev =temp;
            temp.next =temp.next.next;
          

        }


    }
    public static void main(String[] args) {
        doublylinkedlist ll =new doublylinkedlist();
       
         ll.insertatend(2);
          ll.insertatend(3);
           ll.insertatend(4);
            ll.insertatend(5);
             ll.insertatend(6);
              ll.insertatend(7);
              ll.inseertatbegining(9);
        System.out.println("this is the forward printing of the linkedlist ");
        ll.displayf();
        System.out.println("this is the backword printing of the  linkedlist ");
        ll.displayb();
        System.out.println();
        ll.deleteatidx(3);
        ll.displayf();
        
        
    }
    
}
