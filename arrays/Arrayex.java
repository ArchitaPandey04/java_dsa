class Arrayex {
    public static void main(String[] args) {

        int marks[] = { 90, 70, 80, 60 };

        // when size is not known

        int size = 4;
        int[] unknownsize = new int[size];

        // ACCESSING ARRAY
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);

        System.out.println(marks.length);

        System.out.println(unknownsize[0]);


        // print all the data of marks array
        for (int i = 0; i < marks.length; i++) {
            System.out.println("the value of index is: " + i + " " + marks[i]);
        }
        
        // enhance / for-each loop
        for (int value : marks) {
            System.out.println(value);
        }

        // MODIFICATION









    }

    } 