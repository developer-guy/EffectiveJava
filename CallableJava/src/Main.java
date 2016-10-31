import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5); /*defines number of thread */
        List<Future<String >> returnValues = new ArrayList<>();
        Callable<String> callable = new CustomCallable();

        for(int i = 0 ; i < 10 ; i++){
            Future<String> futureVal = executorService.submit(callable);
            returnValues.add(futureVal);
        }

        for(Future future : returnValues){
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}
