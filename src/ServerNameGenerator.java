import java.util.Scanner;
import java.util.Random;
public class ServerNameGenerator {


            public static void main(String[] args)
            {
                String[] noun={"Blizzard", "Snow", "Rain", "Sleet","Wind","Breeze","Downdraft","Drought","Gale", "Heat",};
                String[] adj={"Cold", "Unsettled", "Pleasant", "Beautiful","Balmy","Unpredictable","Delightful","Extreme","Damp", "Wintry",};
                Random r = new Random();
                int randomNumber=r.nextInt(noun.length);
                int randomNumber2=r.nextInt(adj.length);
                System.out.print("Here is your forecast: ");
                System.out.print(adj[randomNumber2] +" ");
                System.out.println(noun[randomNumber]);
            }

    }

