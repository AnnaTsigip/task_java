

public class exp_007 {

    long[] source = new long[1];
    long[] copy = new long[source.length + 1];
    System.arraycopy(source, 0, copy, 0, source.length);
    source = copy;
    

}
