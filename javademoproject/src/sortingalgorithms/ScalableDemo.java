package sortingalgorithms;

public class ScalableDemo {
	public static void main(String[] args) {
		String[] myarray= {"TV","Radio","raDio"};
		mysearchmethod(myarray);
	}

	private static void mysearchmethod(String[] myarray) {
		
		long start = System.currentTimeMillis();
		for(int i=0;i<myarray.length;i++) {
			if(myarray[i]=="radio") {
				System.out.println("Radio Found");
			}
		}
		long end=System.currentTimeMillis();
		System.out.println("Took "+(end-start)+" milliseconds to complete");
	}
}
