import java.util.ArrayList;
import java.util.List;

public class Syncronisation implements Runnable{

	public static final int counter = 1;
	List<Integer> sampleList = new ArrayList<Integer>();
	public synchronized void increment(){
		
		for(int i=0; i<1000; i++){
			sampleList.add(counter+i);
		}
		for(int i : sampleList){
			System.out.println(i);
		}
	}

	@Override
	public void run() {
		System.out.println("Thread running ... "+Thread.currentThread().getName());
		increment();
		
		
	}
	
}
