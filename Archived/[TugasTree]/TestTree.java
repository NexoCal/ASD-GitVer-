import java.util.ArrayList;
import java.util.Scanner;;

public class App {
    public static void main(String[] args) throws Exception {

        Tree <String> Pohon = new Tree <String>("Parent");
        Pohon.addChild("Parent", "Child1");
        Pohon.addChild("Parent", "Child2");

        Node <String> ChildNode3 = new Node<>("Child3");
        Pohon.addChild("Parent", ChildNode3);
        Pohon.addChild("Child1", "GrandChild1");

        Node <String> GrandChildNode = new Node<>("GrandChild2");
        Pohon.addChild("Child3", GrandChildNode);

        Pohon.draw();
    }
}
