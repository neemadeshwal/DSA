
public class NodeClient {
    public static void main(String[] args) {
        System.out.println("----------------");

        basicSetup nodeClient = new basicSetup();

        nodeClient.addNodeAtStart(10);

        nodeClient.addAtIndex(20, 1);
        nodeClient.addAtIndex(30, 2);
        nodeClient.addAtIndex(40, 3);
        nodeClient.addAtIndex(60, 4);
        nodeClient.display();
        System.out.println();

        nodeClient.ReverseLinkedListFunc(nodeClient);
        nodeClient.display();

    }

}