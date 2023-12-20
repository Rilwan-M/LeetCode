public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }



    public static void main(String[] args){

        ListNode obj1 = new ListNode(9);

        // obj1.next = new ListNode(6);
        // obj1.next.next = new ListNode(1);
        // obj1.next.next.next = new ListNode(2);
        // obj1.next.next.next.next = new ListNode(2);


        ListNode obj2 = new ListNode(1);
        obj2.next = new ListNode(9);
        obj2.next.next = new ListNode(9);
        obj2.next.next.next = new ListNode(9);
        obj2.next.next.next.next= new ListNode(9);
        obj2.next.next.next.next.next = new ListNode(9);
        obj2.next.next.next.next.next.next = new ListNode(9);
        obj2.next.next.next.next.next.next.next = new ListNode(9);
        obj2.next.next.next.next.next.next.next.next = new ListNode(9);
        obj2.next.next.next.next.next.next.next.next.next= new ListNode(9);
        // obj2.next.next.next.next.next.next.next.next.next.next.next= new ListNode(9);
        // obj2.next.next.next.next.next.next.next.next.next.next.next.next= new ListNode(9);

        long num1=0,num2=0;
        int i=0;

        while (obj1!=null || obj2!=null){

            int val1 = (obj1 != null ) ? obj1.val : 0;
            int val2 = (obj2 != null ) ? obj2.val : 0;

            num1= num1+ val1 * (long) Math.pow(10,i);
            num2= num2+ val2 * (long) Math.pow(10,i);
            
            if(obj1!=null)
                obj1 = obj1.next;

            if(obj2!=null)
                obj2 = obj2.next;
            i++;
        }

        System.out.printf("num1 = %d num2 = %d\n",num1,num2);
        System.out.printf("total = %d ",num1+num2);
        
        long total = num1+num2;
        System.out.println((int)total%10);
        ListNode obj3 = new ListNode((int)total%10);
        ListNode current = obj3;

        total = total/10;

        while(total > 0){
            current.next = new ListNode((int)total%10);
            total = total/10;
            current = current.next;
        }

        while(obj3 != null){
            System.out.printf("%d",obj3.val);
            obj3 = obj3.next;
        }



    }
}