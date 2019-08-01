
import java.util.Arrays;
public class ArraysExercises {
//
//    String[] name = new String[10];
//        public static String addPerson() {
//
//        for (int i=0;i<name.length;i++) {
//            if (name[i] == null) {
//                name[i] = a;
//                break;
//            }
//        }
//    }
//
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

//       use person method built earlier
        Person [] people = new Person[3];
        people[0] = new Person("Aaron");
        people[1] = new Person("Nick");
        people[2] = new Person("Mario");


 /*
    or Person[] people = {new Person("Aaron"),new Person("Nick"),new Person("Mario"};

        for (String character : Person) {
            System.out.println(character.getName);

            }

        }
*/
    }
}

