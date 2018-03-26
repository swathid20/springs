package java8;
import java.util.stream.IntStream;

public class IntStreamExample {

    public static void main(String[] args) {
        /* Loop through Array using IntStream */
        new IntStreamExample().UsingStream();

        /* Loop through Array using IntStream with ParallelStream. */
        new IntStreamExample().UsingParallelStream();
    }

    /**
     * Loop through Array using IntStream
     */
    public void UsingStream() {
        System.out.println("Using IntStream");
        System.out.println("------------------------------------------");

        /* Create String array */
        String[] arrayNames = {"Vicky Thakor", "Chirag Thakor", "Dave Hill", "Finn Jones"};

        /**
         * - Start loop from "range(startInclusive {initial value}, endExclusive {upper limit}}
         * - Filter data.(If condition)
         * - forEach (value that matches filter condition)
         */
        IntStream.range(0, arrayNames.length)
                 .filter(i -> arrayNames[i].endsWith("Thakor"))
                 .forEach(i -> {
                    System.out.println(arrayNames[i]);
                 });
        System.out.println("+++++++++++++++++++++++++++");
    }

    /**
     * Loop through Array using IntStream with ParallelStream.
     * Note: Use it when you want to divide your task in multiple core of CPU and order doesn't matter for the operation.
     */
    public void UsingParallelStream() {
        System.out.println("Using IntStream with ParallelStream");
        System.out.println("------------------------------------------");

        /* Create String array */
        String[] arrayNames = {"Vicky Thakor", "Chirag Thakor", "Dave Hill", "Finn Jones"};

        /**
         * - Start loop from "range(startInclusive {initial value}, endExclusive {upper limit}}
         * - ParallelStream (Perform your task by dividing it in CPU core.) 
         * - Filter data. (If condition)
         * - forEach (value that matches filter condition)
         */
        IntStream.range(0, arrayNames.length)
                 .parallel()
                 .filter(i -> arrayNames[i].endsWith("Thakor"))
                 .forEach(i ->  {
                    System.out.println(arrayNames[i]);
                 });
        System.out.println("+++++++++++++++++++++++++++");
    }
}
/*
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    IntStream i = IntStream.concat(IntStream.of(6,5,7,1, 2, 3, 3),IntStream.of(9,8));
    boolean d = i.allMatch(n-> n > 0 );
    System.out.println(d);
  }
}





IntStream anyMatch(IntPredicate predicate) returns whether any elements of this stream match the provided predicate
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    IntStream i = IntStream.of(6,5,7,1, 2, 3, 3);
    boolean d = i.anyMatch(n-> n > 0 );
    System.out.println(d);
  }
}

IntStream average() returns an OptionalDouble describing the arithmetic mean of
 elements of this stream, or an empty optional if this stream is empty.


import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    IntStream i = IntStream.of(6,5,7,1, 2, 3, 3);
    OptionalDouble d = i.average();
    if(d.isPresent()){
      System.out.println(d.getAsDouble());
    }else{
      System.out.println("no value");  
    }    
  }
}


*/