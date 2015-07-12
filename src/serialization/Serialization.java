package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) {
		SerializationModal serializationModal = new SerializationModal();
		serializationModal.setName("Chiranjeevi");
		serializationModal.setAge(28);
		serializationModal.setHeight(5.7);
		serializationModal.setWeight(67.0);
		
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("serialization.txt");
			ObjectOutputStream outputStream  = new ObjectOutputStream(fileOutputStream);
			outputStream.writeObject(serializationModal);
			outputStream.close();
			fileOutputStream.flush();
			
			FileInputStream fileInputStream = new FileInputStream("serialization.txt");
			ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
			SerializationModal modal = (SerializationModal)inputStream.readObject();
			System.out.println(modal.getName());
			System.out.println(modal.getAge());
			System.out.println(modal.getHeight());
			System.out.println(modal.getWeight());
			System.out.println(modal.mymethod());
			inputStream.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
