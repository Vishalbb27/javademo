package threadingdemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFrameworkDemo {
	public static void main(String[] args) {
		VideoProcessorTask[] tasks= {
				new VideoProcessorTask("Bank"),
				new VideoProcessorTask("School"),
				new VideoProcessorTask("Conference"),
				new VideoProcessorTask("HomeSecurity")				
		};
		ExecutorService newFixedThreadPool=Executors.newFixedThreadPool(4);
		for(VideoProcessorTask vptask:tasks) {
			newFixedThreadPool.submit(vptask);
		}
		newFixedThreadPool.shutdown();
	}
}

class VideoProcessorTask implements Runnable{
	String sourceName;
	
	public VideoProcessorTask(String source) {
		this.sourceName=source;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Utils.printmessage("Processing video from "+sourceName+" started...");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Utils.printmessage("Processing video from "+sourceName+"ended...");
	}
}