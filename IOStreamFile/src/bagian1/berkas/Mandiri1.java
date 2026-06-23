package bagian1.berkas;

import java.io.File;

public class Mandiri1 {
    public static void main(String[] args) {

        File file = new File("laporan.txt");

        if (file.exists()) {
            System.out.println("File ditemukan.");
            System.out.println("Ukuran file: " + file.length() + " byte");
        } else {
            System.out.println("File tidak ditemukan.");
        }
    }
}
