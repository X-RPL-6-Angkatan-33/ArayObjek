import java.util.Scanner;
public class testerAray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 

        int[] angka = {1, 2, 3};
        int[] angka2 = new int[5];
        angka2[0] = 10;
        angka2[4] = 100;
        String[] nama = {"Rusdi", "Amba", "Fuad"};
        String[] nama2 = new String[7];

        //Array Object
        
        System.out.println("Masukkan Jumlah Benda");
        int benda = in.nextInt();
        Product[] p = new Product[benda];
        for (int i = 0; i < p.length; i++) {
            System.out.println("-------Benda " +(i+1) +"-------");
            System.out.println("Masukkan Nama Objek");
            String name = in.next();
            System.out.println("Masukkan Nomor Objek");
            int number = in.nextInt();
            System.out.println("Masukkan Jumlah Objek");
            int quantity = in.nextInt();
            System.out.println("Masukkan Harga Objek");
            double price = in.nextDouble();
            p[i] = new Product(name, number, quantity, price);
            System.out.println("======Data Benda"+(i+1) +"======");
            p[i].print();
        }
        

    }
}
