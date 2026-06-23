package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Mandiri2 {

    public static void main(String[] args) {

        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt", true))) {

            penulis.println("Sabtu");
            penulis.println("Minggu");

            System.out.println("Dua hari baru berhasil ditambahkan");

        } catch (IOException e) {
            System.out.println("Gagal menambah data: " + e.getMessage());
        }
    }
}
