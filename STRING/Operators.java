import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); //195
        System.out.println("a" + "b"); //ab
        System.out.println('a' + 3);  //100
        System.out.println((char)('a' + 3)); //d
        System.out.println("a" + 1); //a1   -- when an integer is added to a string Integer that will call toString()

        System.out.println("Kunal" + new ArrayList<>()); //Kunal[]
        

    }
}
    

