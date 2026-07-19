import java.util.LinkedList;
import java.util.Queue;

public class PrintQueue {
  Queue<String> printQueue = new LinkedList<>();
  //addJob(String document)
  public void addJob(String document){
    printQueue.offer(document);
  }
  //processNextJob()
  public void processNextJob(){
    while (!printQueue.isEmpty()){
      String job = printQueue.poll();
      System.out.println(job);
    }
  }

  //viewNextJob()
  public void viewNextJob(){
    System.out.println(printQueue.peek());
  }

  //queueSize()
  public void queueSize(){
     System.out.println(printQueue.size());
  }

  public static void main(String[] args){
    PrintQueue jobs = new PrintQueue();
    jobs.addJob("document1");
        jobs.addJob("document2");
    jobs.addJob("document3");
    jobs.addJob("document4");
    jobs.queueSize();
    jobs.viewNextJob();

    jobs.processNextJob();



  }
  
}
