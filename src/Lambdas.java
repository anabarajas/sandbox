import java.util.ArrayList;
import java.util.List;

/**
 * Created by abarajas on 2/22/17.
 */
public class Lambdas implements TryStuff {

    //List<String> list1 =Arrays.asList("ana", "cristina");
    List<String> list1 = new ArrayList<>();



    public void tryMethod() {
        String result = list1.stream().filter(s -> s.contains("x")).findFirst().orElse(null);
        if (result == null) {
            result = "Result was null";
        }
        System.out.println(result);

    }

//    public void tryMethod(){
//        boolean result = isPrime(5);
//        System.out.println("isPrime returns: " + result);
//    }
//
//    private boolean isPrime(int number) {
//        IntPredicate isDivisible = index -> number % index == 0;
//
//        return number > 1
//                && IntStream.range(2, number).noneMatch(
//                isDivisible);
//    }

//    public void tryMethod() {
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        String transformedList = list.parallelStream().map(i -> String.valueOf(i + 5)).collect(Collectors.joining(", "));
//
////        String transformedList2 = list.stream().map(i -> new Function<Integer, String>() {
////            @Override
////            public String apply(Integer integer) {
////                return String.valueOf(integer + 5);
////            }
////        }).collect(Collectors.joining(", "));
//        System.out.println(transformedList);
//    }
}

