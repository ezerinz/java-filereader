package pembacafile;

import java.io.*;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    try {
      File file = new File("text.txt");
      File hasil = new File("hasil.txt");
      FileWriter penulis = new FileWriter(hasil);
      Scanner sc = new Scanner(file);
      int count = 1;
      String simpanText = "";

      while (sc.hasNextLine()) {
        String data = sc.nextLine();
        if (data.contains("Amelia")) {
          simpanText += Integer.toString(count) + ". " + data + " Cantik"
                        + "\n";
        } else {
          simpanText += Integer.toString(count) + ". " + data + "\n";
        }
        count++;
      }

      penulis.write(simpanText);
      penulis.close();
      sc.close();

    } catch (Exception e) {
      System.out.println(e);
      e.getStackTrace();
    }
  }
}
