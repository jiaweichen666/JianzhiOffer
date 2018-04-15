package ConcurrentDemo;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<BigInteger> list = aSecondOfPrimes();
        Iterator<BigInteger> iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static List<BigInteger> aSecondOfPrimes() throws InterruptedException{
        PrimeGenrator genrator = new PrimeGenrator();
        new Thread(genrator).start();
        try {
            SECONDS.sleep(1);
        }   finally {
            genrator.cancel();
        }
        return genrator.get();
    }
}
