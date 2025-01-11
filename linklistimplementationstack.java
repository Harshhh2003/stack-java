public class linklistimplementationstack{
   
    public static class linkliststack{
        public static  void display(node head){
            node temp = head;
            while(temp !=null){
                System.out.println(temp.data  + "   ");
            } System.out.println();
        }
        node head = null; int size =0;
        void push(int x){
            node temp = new node(x);
            temp.next = head;
            head = temp;
            size++;

        }node getHead() {
            return head;
        }
    }        public static class node{
        int data; node next;
        node(int data){
            this.data = data;

        }
    }
    public static void main(String[] args) {
        linkliststack st = new linkliststack();
   st.push(10);

   st.push(20);
   st.push(30);
   st.push(40);
System.out.println("stack element  are   :    "   );
st.getHead();

        
    }
}