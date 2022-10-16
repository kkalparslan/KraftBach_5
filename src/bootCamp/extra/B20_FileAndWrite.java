package bootCamp.extra;

import java.io.*;

public class B20_FileAndWrite {



            public static void main(String[] args) throws IOException {
                FileWriter writer=new FileWriter("C:\\Users\\Admin\\Desktop\\Target.txt");
                BufferedWriter bufferedWriter=new BufferedWriter(writer);
                bufferedWriter.write("selam arkadaşlar");
                bufferedWriter.close();

            //    FileReader reader=new FileReader("C:\\Users\\Admin\\Desktop\\Target.txt");
                BufferedReader bufferedReader=new BufferedReader
                        (new FileReader("C:\\\\Users\\\\Admin\\\\Desktop\\\\Target.txt"));
                System.out.println(bufferedReader.readLine());
            }
}
