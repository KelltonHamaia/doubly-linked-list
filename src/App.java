public class App {
    public static void main(String[] args) throws Exception {
        DoublyLinkedList dll = new DoublyLinkedList();
        Node nodeY = new Node("Y");
        Node nodeA = new Node("A");
        Node nodeX = new Node("X");
        
        dll.add(nodeY);
        dll.add(nodeA);
        dll.add(nodeX);

        
        System.out.println("Tamanho: "+ dll.size());
        dll.showHead();
        dll.showTail();
        dll.showListInOrder();

        System.out.println("----------------------------------------------------");
        dll.showListInOrderReverse();

    }
}
