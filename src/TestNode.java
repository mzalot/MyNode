import javax.xml.soap.Node;

/**
 TestNode
 The program will test my node
 Author: Mareks Zeile
 Collaborator(s):
 Collaboration:
 Date: 10/2/21
 **/
public class TestNode {
    public static void main(String[] args) {
        //set up test value
        Integer testVal = 5;
        //create two instance of a node class use to test contractors
        NodeProject n1 = new NodeProject(5);
        NodeProject n2 = new NodeProject(6);

        //test constructors
        System.out.println("Constructor check:");
        NodeProject n3 = new NodeProject();
        System.out.println("0 input constructor works");
        NodeProject n4 = new NodeProject(5);
        System.out.println("1 input constructor works");
        NodeProject n5 = new NodeProject(7,n1,n2);
        System.out.println("3 input constructor works");
        System.out.println();

        //check accessors
        System.out.println("Check accessors:");
        System.out.println("Does the value accessor work: " + (testVal.equals(n1.getValue())));
        System.out.println("Does the node1 accessor work: " + n5.getNode1().equals(n1));
        System.out.println("Does the node2 accessor work: " + n5.getNode2().equals(n2));
        System.out.println();

        //check mutators
        System.out.println("Check mutators:");
        System.out.print("Check setValue: ");
        n3.setValue(5);
        System.out.println(testVal.equals(n3.getValue()));
        System.out.print("Check setNode1: ");
        n3.setNode1(n1);
        System.out.println(n3.getNode1().equals(n1));
        System.out.print("Check setNode2: ");
        n3.setNode2(n2);
        System.out.println(n3.getNode2().equals(n2));
        System.out.println();

        //check toString
        System.out.println("Check toString method:");
        System.out.println("Output should be: Node: 5");
        System.out.println("Test output: " + n1.toString());
        System.out.println("Node: 5".equals(n1.toString()));
        System.out.println();

        //check equals
        System.out.println("Check equals method:");
        System.out.println("Nodes that have equal values equal each other: " + n1.equals(n4));
        System.out.println("Nodes with different values don't equal each other: " + n1.equals(n2));
    }
}
