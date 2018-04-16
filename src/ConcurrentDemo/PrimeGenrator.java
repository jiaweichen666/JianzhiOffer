package ConcurrentDemo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PrimeGenrator implements Runnable {
    private final List<BigInteger> primes = new ArrayList<>();
    private volatile boolean cancelled;
    public void run(){
        BigInteger p = BigInteger.ONE;
        while (!cancelled){
            p = p.nextProbablePrime();
            synchronized (this){
                primes.add(p);
            }
        }
    }
    public void cancel(){
        cancelled = true;
    }
    public synchronized List<BigInteger> get(){
        return new ArrayList<BigInteger>(primes);
    }
}
