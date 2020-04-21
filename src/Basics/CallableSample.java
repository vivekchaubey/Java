package Basics;

import java.util.concurrent.*;

public class CallableSample implements Callable
{

 public String call() throws Exception
{
 System.out.println("Writing from within the call function");
 Thread.sleep(9000);
 return "Slept for three seconds :)";
}

 public static void main(String[] args) throws Exception
 {
CallableSample object=new CallableSample();
 Callable callable=new CallableSample();

ExecutorService executorService=Executors.newSingleThreadExecutor();
        System.out.println("Submitting Call function");
Future<String> future=executorService.submit(callable);
            Thread.sleep(8000);

System.out.println("Printing this while Call function is processing the output");
System.out.println("Call function processing is complete");
System.out.println("Now writing the function output");
String output=future.get();
 System.out.println("Call output:  "+output);
}

}
