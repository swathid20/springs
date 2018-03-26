package java7.forkjoin;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
public class ForkJoinTaskDemo {
       public static void main(String[] args) throws InterruptedException, ExecutionException {
              ForkJoinPool fjp = new ForkJoinPool(10);
             
              DemoTask task = new DemoTask();
              
              for(int i=1;i<3;i++) {
              ForkJoinTask<String>  fjt = ForkJoinTask.adapt(task);
              fjp.invoke(fjt);
              System.out.println(fjt.isDone());
              }
              
          //    DemoTask task1 = new DemoTask();
        //      ForkJoinTask<String>  fjt1 = ForkJoinTask.adapt(task1);
           //   System.out.println(fjt.getPool());
            //  System.out.println(fjt.isDone());//more methods
            //  System.out.println(fjt.tryUnfork());
          //    fjt.complete("true");
            
          //    fjp.invoke(fjt1);
             
            //  System.out.println(fjt1.isDone());
              
       }
}
class DemoTask implements Callable<String>{
       public String call() {
              try {
            	  System.out.println("Task Done");
                     Thread.sleep(10000);
              } catch (InterruptedException e) {
                     System.out.println(e);
              }
              return "Task Done";
       }
}
