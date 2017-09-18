/**
 * Created by abarajas on 4/26/17.
 */
public class References2 implements TryStuff {
    String string;

    @Override
    public void tryMethod() {
//        string = "hello";
//        System.out.println("String in the beginning: " + string);
//        String string2 = changeString(string);
//        System.out.println("String now is " + string);
//        System.out.println("String now is " + string2);

        Context example = new Context();
        System.out.println(example.number);
        int num2 = example.changeNumber();
        System.out.println(num2);


    }

    public String changeString(String originalString) {
        String temp = originalString.concat("Motto");
        return temp;
    }

    class Context {
        private int number;

        public Context() {
            number = 1;
        }

        public int changeNumber() {
            int result = this.number;
            result = result + 1;
         //   return this.number;
            return result;
        }
    }
}
