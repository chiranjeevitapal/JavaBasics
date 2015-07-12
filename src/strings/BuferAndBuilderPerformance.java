package strings;

public class BuferAndBuilderPerformance {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();  
		StringBuffer buffer = new StringBuffer("hello ");
		
		for(int i=0; i<10000000; i++){
			buffer.append("buffer");
		}
		System.out.println("Time taken by buffer : "+(System.currentTimeMillis()-startTime)+" ms");
		startTime = System.currentTimeMillis();
		StringBuilder builder = new StringBuilder("hi ");
		for(int i=0; i<10000000; i++){
			builder.append("builder");
		}
		System.out.println("Time taken by builder : "+(System.currentTimeMillis()-startTime)+" ms");
	}

}
