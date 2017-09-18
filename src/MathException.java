/**
 * Created by abarajas on 8/3/17.
 */
public class MathException implements TryStuff {

    @Override
    public void tryMethod() {
        try{
            int shouldComplain = 12 / 0;
            System.out.println(shouldComplain);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
