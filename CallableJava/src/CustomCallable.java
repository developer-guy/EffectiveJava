import java.util.concurrent.Callable;

/**
 * Created by bapaydin on 31.10.2016.
 */
public class CustomCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        String executionInfo = "Now application is working on this thread : " + Thread.currentThread().getName();
        return executionInfo;
    }
}
