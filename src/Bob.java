import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//        He answers 'Whatever.' to anything else.
//        Write the Java code necessary so that a user of your command line application can have a conversation with Bob.
        boolean talking = true;
        System.out.print("Start a conversation: ");
        do {
        String userInput = scanner.nextLine();
        System.out.println(userInput);

            if (userInput.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userInput.endsWith("!")) {
                //System.out.println(userInput);
                System.out.println("Whoa, chill out!");
            } else if (userInput.isEmpty()) {
                //System.out.println(userInput);
                System.out.println("Fine. Be that way!");
            } else if(userInput.equalsIgnoreCase("bye")){

                talking = false;
            } else {
                System.out.println("Whatever");
            }
        } while(talking);
        System.out.println("Bob gets on his phone.");
    }
}


//while (!userInput.equals("End conversation."));
//        String input = "Codeup Rocks!";
//
//        input.equals("codeup rocks!"); // false
//        input.equals("Codeup Rocks!"); // true
//
//        input.equalsIgnoreCase("codeup rocks!"); // true
//        input.equalsIgnoreCase("Codeup Rocks!"); // true
//
//        input.startsWith("codeup") // false
//        input.startsWith("Codeup") // true
//
//        input.endsWith("rocks") // false
//        input.endsWith("rocks!") // false
//        input.endsWith("Rocks!") // true
//