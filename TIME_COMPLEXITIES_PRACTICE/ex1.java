// the execution for this statements are constants
// if there's no dependencies in the input size then the time complexity is O(n)


public class ex1 {


    int print() {
        System.out.println("say hello");
        int a = 89;
        int b = 101;
        System.out.println("sum" + (a + b));
        return b;
    }
        

    public static void main(String[] args) {
        ex1 obj = new ex1();

        int result = obj.print();

        System.out.println("returned value:" + result);
    }
    }
