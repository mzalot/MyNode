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

    //default constructor
    public NodeProject(){
    }
    //1 variable constructor
    public NodeProject(T value){
        this.value = value;
    }
    //3 variable constructor
    public NodeProject(T value, NodeProject node1, NodeProject node2){
        this.value = value;
        this.node1 = node1;
        this.node2 = node2;
    }
}
