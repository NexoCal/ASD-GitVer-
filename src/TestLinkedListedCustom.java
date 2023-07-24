class TestLinkedListedCustom1 {
    public static void main(String[] args) {
        LinkedListCustom<String> cars = new LinkedListCustom<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.addFirst("Toyota");
        cars.addLast("Mitsubishi");

        System.out.println("Size of Linked List: " + cars.size());
        System.out.println("First element: " + cars.getFirst());
        System.out.println("Last element: " + cars.getLast());
        System.out.println("Element at index 4 -> " + cars.get(4));

        cars.add(6, "Wuling");
        System.out.println("\nAdd Wuling at index 6\n");

        System.out.println("Wuling in this LinkedList? = " + cars.contains("Wuling"));
        System.out.println("Remove first -> " + cars.removeFirst());
        System.out.println("Remove last -> " + cars.removeLast());
        System.out.println("Remove at index 3 -> " + cars.remove(3));
        System.out.println("\nSize of Linked List: " + cars.size());
        System.out.println("\nAdd last -> Nissan");

        cars.addLast("Nissan");

        System.out.println("Add first -> Ferrari");

        cars.addFirst("Ferrari");

        System.out.println("\nSize of Linked List: " + cars.size());
        System.out.println("First element: " + cars.getFirst());
        System.out.println("Last element: " + cars.getLast());

        System.out.println("");
        System.out.println("Car inside linkedlist: ");

        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Car at index " + i + " = " + cars.get(i));
        }
    }
}

class TestLinkedListedCustom2 {

    public static void main(String[] args) {
        LinkedListCustom<Mahasiswa> mhs = new LinkedListCustom<Mahasiswa>();
        mhs.add(new Mahasiswa("16523001", "Idris", 3.88));
        mhs.add(new Mahasiswa("16523002", "Agus", 3.18));
        mhs.add(new Mahasiswa("16523003", "Dani", 3.42));
        mhs.add(new Mahasiswa("16523008", "Roni", 3.67));
        mhs.add(new Mahasiswa("16523020", "Sinta", 3.05));

        LinkedListCustom.Element ptr = mhs.first;

        while (ptr != null) {
            Mahasiswa m = (Mahasiswa) ptr.data;
            System.out.println("NIM: " + m.getNIM());
            System.out.println("Nama: " + m.getNama());
            System.out.println("IPK: " + m.getIPK());
            System.out.println("");
            ptr = ptr.next;
        }

        ((Mahasiswa) mhs.getElement(3).data).setNama("NexoCal");
        System.out.println("Nama Mahasiswa diubah menjadi: " + ((Mahasiswa) mhs.getElement(3).data).getNama());

        ((Mahasiswa) mhs.getElement(3).data).setNIM("22523404");
        System.out.println("NIM Mahasiswa diubah menjadi: " + ((Mahasiswa) mhs.getElement(3).data).getNIM());

        ((Mahasiswa) mhs.getElement(3).data).setIPK(4.0);
        System.out.println("IPK Mahasiswa diubah menjadi: " + ((Mahasiswa) mhs.getElement(3).data).getIPK());

        System.out.println("\n!!Data Mahasiswa Index 3 telah diupdate!!\n");
        ptr = mhs.first;

        while (ptr != null) {
            Mahasiswa m = (Mahasiswa) ptr.data;
            System.out.println("NIM: " + m.getNIM());
            System.out.println("Nama: " + m.getNama());
            System.out.println("IPK: " + m.getIPK());
            System.out.println("");
            ptr = ptr.next;
        }
        /*
         * Ganti kode ini untuk mengganti IPK mahasiswa di indeks ke-3
         * Kemudian tampilkan data mahasiswa yang ada di indeks ke-3
         */
    }
}
