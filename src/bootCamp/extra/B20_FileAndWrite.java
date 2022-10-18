package bootCamp.extra;

import java.io.*;
public class B20_FileAndWrite {
            public static void main(String[] args) throws IOException {
                FileWriter writer=new FileWriter("C:\\Users\\Admin\\Desktop\\Target.txt");
                BufferedWriter bufferedWriter=new BufferedWriter(writer);
                bufferedWriter.write("selam arkadaşlar");
                bufferedWriter.newLine();
                bufferedWriter.write("nasılsınız?");
                bufferedWriter.newLine();
                bufferedWriter.write("the last try is done by me");
                bufferedWriter.newLine();
                bufferedWriter.write("azra ve babası");
                bufferedWriter.close();


                FileReader reader=new FileReader("C:\\Users\\Admin\\Desktop\\Target.txt");
                BufferedReader bufferedReader=new BufferedReader (reader);
                System.out.println(bufferedReader.readLine()); // selam arkadaşlar
                System.out.println(bufferedReader.readLine()); // nasılsınız?
                System.out.println(bufferedReader.readLine()); // the last try is done by me
                System.out.println(bufferedReader.readLine()); // azra ve babası
                System.out.println(bufferedReader.ready()); // false okunacak hazırda metin varmı diye sorguluyor
                // şu an kalmadı o yüzden false verdi
            }
}
