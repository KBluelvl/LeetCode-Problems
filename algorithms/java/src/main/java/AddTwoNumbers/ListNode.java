package AddTwoNumbers;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        String print = ""+val;
        if(next != null){
            print += ","+next;
        }
        return  print;
    }
}
