public class circular {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data =data;
        }
    }
    public static class circularlinked{
        node head = null;
        node tail = null;
        void insertatend(int data){
            node temp =new node(data);
            if(head == null){
                head = temp;
            }
            else{
                tail.next = temp;
            }
            tail =temp;
            temp.next =head;
        }
        void inseertatbegining(int data){
            node temp =head;
            node temp2 =tail;
            node newnode =  new node(data);
            if(temp ==null){
                head =newnode;
                newnode.next =head;
                return;

            }
            else{
                 newnode.next =head;
                 head =newnode;
                 temp2.next =head;
            }
        }
        void display(){
            node temp =head;
            System.out.println("the linkedlist is ...");
            do{
                System.out.println(temp.data);
                temp =temp.next;
            }
            while(temp != head);
        }



    }
    public static void main(String[] args) {
        circularlinked ll =new circularlinked();
        ll.insertatend(2);
        ll.insertatend(3);
        ll.insertatend(4);
        ll.insertatend(5);
        ll.display();
        ll.inseertatbegining(8);
        System.out.println("after changing head");
        ll.display();
    }
    
}
