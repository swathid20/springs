package nio;
import java.io.IOException;
import java.nio.channels.AsynchronousChannelGroup;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/*
 * AsynchronousChannelGroup has been introduced in JDK 7. AsynchronousChannelGroup belongs to the package
 *  java.nio.channels. AsynchronousChannelGroup performs resource sharing in the group of asynchronous 
 *  channels. AsynchronousChannelGroup instance is created using its static method withFixedThreadPool 
 *  and withCachedThreadPool. AsynchronousChannelGroup provides the method to shut down the complete
 *   thread groups. In our example we have taken a simple example to show demo of AsynchronousChannelGroup.
 *    
 */
public class AsynchronousChannelGroupTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		Runnable r= new AsynchronousChannelGroupTest(). new SampleThread();
		ExecutorService service = Executors.newCachedThreadPool();
		service.execute(r);
		AsynchronousChannelGroup acg = AsynchronousChannelGroup.withCachedThreadPool(service, 2);
		
		System.out.println(acg.isShutdown());
		acg.awaitTermination(2,TimeUnit.SECONDS);
		acg.shutdownNow();
	}
	class SampleThread implements Runnable {
        @Override
        public void run() {
            for (int cnt =0; cnt<5 ; cnt++) {
                System.out.println("run:" + cnt);
            }
        }
    }
}
 