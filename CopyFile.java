import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public void copy(String sourcePath, String targetPath) throws IOException {
        try {
            File source = new File(sourcePath);
            File target = new File(targetPath);
            if (!source.exists()){
                throw new FileNotFoundException("k tim thay");
            }

            BufferedReader bf = new BufferedReader(new FileReader(source));
            PrintWriter writer = new PrintWriter(new FileWriter(target));
            String result = "";
            while ((result = bf.readLine())!= null){
                writer.println(result);
            }
            bf.close();
            writer.close();

        } catch (Exception e){
            System.err.println(e);
        }
    }

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap file nguon: ");
        String src = sc.nextLine();
        System.out.print("nhap file dich: ");
        String tar = sc.nextLine();
        CopyFile cp = new CopyFile();
        cp.copy(src,tar);

    }
}
