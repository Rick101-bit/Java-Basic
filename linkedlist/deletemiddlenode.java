public class deletemiddlenode {
    public static class  node {
        int data;
        node next;
        node(int data){
            this.data =data;
        }
    }
    public static class linkedlist{
            int count =0;
            node head =null;
            node tail =null;
            void insertAtEnd(int data){
                node temp =new node(data);
                if(head ==null){
                    head =temp;
                }
                else{
                    tail.next =temp;
                }
                tail =temp;
                count++;
            }
            void display(){
                node temp =head;
                while(temp!= null){
                    System.out.println(temp.data);
                    temp =temp.next;

                }
            }
            void deletemiddlenode(){
                node slow =head;
                node fast =head;
                while(fast.next.next != null && fast.next.next.next != null){
                    slow =slow.next;
                    fast =fast.next.next;
                }
               slow.next =slow.next.next;
               
            }
    }
    public static void main(String[] args) {
        linkedlist ll =new linkedlist();
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.display();
         ll.deletemiddlenode();
        System.out.println("now the  linkedlist is");
        ll.display();
    }
    
        
    
    
}
