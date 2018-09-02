package java8.predicate; 
import java.util.function.Predicate;
public class PredicateExample {
    public static void main(String[] args)
    {
        // Creating predicate
        Predicate<Integer> I = i -> (i < 18); 
 
        // Calling Predicate method
        System.out.println(I.test(10)); 
    }
}
