package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class Mandiri3 {
    public static void main(String[] args) {

        File file = new File("sementara.txt");

        try {

            file.createNewFile();

            System.out.println("Sebelum dihapus: " + file.exists());

            if (file.delete()) {
                System.out.println("File berhasil dihapus.");
            } else {
                System.out.println("File gagal dihapus.");
            }

            System.out.println("Sesudah dihapus: " + file.exists());

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
