import javax.xml.soap.Node;

/**
 NodeProject
 The program will create a node
 Author: Mareks Zeile
 Collaborator(s):
 Collaboration:
 Date: 9/29/21
 **/
public class NodeProject <T>{
    //instance data
    //two node project instances to store pointers
    private NodeProject node1;
    private NodeProject node2;
    //store a way to assign values to the nodes
    private T value;

    //1 variable constructor
    public NodeProject(T value){
        this.value = value;
    }
}
