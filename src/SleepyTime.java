import java.util.Scanner;

public class SleepyTime
    //Asks the user how much they sleep at night,
        //determines if they need more sleep or not,
    //then calculates how much more sleep they should get.
{
    public static void main(String []args)
    {
        //Asks the user how much they sleep
        Scanner input = new Scanner(System.in);
        System.out.println("How many hours do you sleep at night? ");

        int hours = input.nextInt();

        //calls the Sleep class
        Sleep sleep1 = new Sleep(hours);
        //Tells user how much they sleep
        System.out.print(sleep1.getSleep());

        if (hours < 8)
        {
            //If they sleep for less than 8 hours, that isn't enough
            System.out.println("That's not enough! ");
            if (hours < 4)
            {
                //Less than 4 hours is especially bad
                System.out.println("Ur practically nocturnal!");
            }
            if (hours < 0)
            {
                //Less than 0 hours is impossible
                System.out.println("In fact, that's impossible!");
            }
            System.out.println("");
            //Asks the user how much sleep they think they should get
            System.out.println("How many hours of sleep do you think you should get? ");

            int betterHours = input.nextInt();
            Sleep sleep2 = new Sleep(hours,betterHours);

            // while loop for as long as the new amount of sleep is less than 8
            while (betterHours < 8)
            {
                if (betterHours < 8)
                {
                    System.out.println("You're still gonna need more than that...");
                    System.out.println("");
                    // redoes the current section of the code
                    System.out.println("How many hours of sleep do you think you should get? ");
                    int evenBetterHours = input.nextInt();
                    betterHours = evenBetterHours;
                }
            }
            //method that tells the user how much more sleep they need to get to hit their goal
            System.out.println(sleep2.goodSleep(hours, betterHours));
        }
        else
        {
            //if the user has gotten more than 8 hours of sleep, then they're good
            System.out.println("That's a good amount!");
        }
    }
}
