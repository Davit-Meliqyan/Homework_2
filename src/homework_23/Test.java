package homework_23;

public class Test {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.add(12);
        linkedList.add(34);
        linkedList.add(56);
        linkedList.add(78);
        linkedList.add(99);
        linkedList.add(0,57);
        linkedList.add(0,51);
        linkedList.add(12);
//        linkedList.add(52);
        System.out.println(linkedList.toString());
        linkedList.delete(0);
        linkedList.delete(6);
//        linkedList.delete(0);
//
//        System.out.println(linkedList.size());
        System.out.println(linkedList.toString());

    }
}
