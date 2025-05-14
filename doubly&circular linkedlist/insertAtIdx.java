public class insertAtIdx {
    public static class node{
        int data;
        node next;
        node prev;
        node(int data){
            this.data =data;
        }
    }
    public static class doublylinkedlist{
        node head =null;
        node tail =null;
        int count =0;
        void insertatend(int data){
            node temp =new node(data);
            if(head ==null){
                head =temp;
            }
            else{
                tail.next =temp;
                temp.prev =tail;
            }
            tail =temp;
            count++;
        }
        void displayf(){
            node temp =head;
            while(temp != null){
                System.out.println(temp.data);
                temp =temp.next;
            }
        }
        void displayb(){
            node temp =tail;
            while(temp !=null){
                System.out.println(temp.data);
                temp =temp.prev;
            }
        }
        void insertAtIdx(int idx,int data){
            node temp =head;
            node newnode = new node(data);
            for(int i =1;i<=idx-1;i++){
                temp =temp.next;
            }
            newnode.next = temp.next;
            temp.next.prev=newnode;
            newnode.prev =temp;
            temp.next =newnode;
            

        }

    }
    public static void main(String[] args) {
        doublylinkedlist ll =new doublylinkedlist();
        ll.insertatend(2);
         ll.insertatend(3);
          ll.insertatend(4);
           ll.insertatend(5);
            ll.insertatend(6);
        ll.displayf();
        System.out.println();
        ll.displayb();
        System.out.println();
        ll.insertAtIdx(3, 34);
        ll.displayf();
        
    }
    
}
