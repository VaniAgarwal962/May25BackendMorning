package SynchronizationIssue.AdderSubtractorSyncBlock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    private Value value;
    public Subtractor(Value value) {
        this.value = value;
    }

    @Override
    public Void call() throws Exception {

        for(long i = 0; i <=100000; i++){
//            System.out.println("Subtracting " + i);
            synchronized (value){
                value.setX(value.getX()-i);
            }

        }

        return null;
    }
}
