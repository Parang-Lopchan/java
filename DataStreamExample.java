import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamExample {
    public static void main(String[] args) {
        String fileName = "data.dat";

        // Writing data
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(25);
            dos.writeFloat(3.14f);
            dos.writeUTF("Hello World");
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing data: " + e.getMessage());
        }

        // Reading data
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            int intValue = dis.readInt();
            float floatValue = dis.readFloat();
            String stringValue = dis.readUTF();

            System.out.println("Read values:");
            System.out.println("Int: " + intValue);
            System.out.println("Float: " + floatValue);
            System.out.println("String: " + stringValue);
        } catch (IOException e) {
            System.out.println("Error reading data: " + e.getMessage());
        }
    }
}
