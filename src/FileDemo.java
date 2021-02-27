import java.io.*;

public class FileDemo {

    public static void main(String[] args) throws Exception {
        File file =new File("Demo.txt");
        FileOutputStream fos=new FileOutputStream(file);
        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeUTF("Demo Content");


        FileInputStream fis=new FileInputStream(file);
        DataInputStream dis=new DataInputStream(fis);
        String str=dis.readUTF();
        System.out.println(str);



    }
}
