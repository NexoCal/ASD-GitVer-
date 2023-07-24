

public class TugasASDTree {
    
    public static void main(String[] args) {
        
        Tree <String> Teman = new Tree<String>("Agung");
        Teman.addChild("Agung", "Budi");
        Teman.addChild("Agung", "Beni");
        Teman.addChild("Agung", "Basuki");

        Node <String> TemanBudi1 = new Node<String>("Cholis");
        Node <String> TemanBudi2 = new Node<String>("Cholil");

        Teman.addChild("Budi", TemanBudi1);
        Teman.addChild("Budi", TemanBudi2);

        Node <String> TemanCholil = new Node<String>("Damar");

        Teman.addChild("Cholil", TemanCholil);

        Node <String> TemanBasuki = new Node<String>("Chandra");
        Teman.addChild("Basuki", TemanBasuki);

        System.out.println("Struktur pohon:");
        Teman.draw();

        System.out.println("\n"+"Teman - Teman Budi:");
        Teman.showChild(Teman.getNode("Budi"));

        System.out.println("");

        System.out.println("Struktur pohon mulai dari budi:");
        Teman.DrawFrom(Teman.getNode("Budi"), 0);
    }


}
