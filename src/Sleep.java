//A class that tells the user how much sleep they need to get at night
public class Sleep
{
    private int currentSleep;
    private int newSleep;

    public Sleep(int sleepNow)
    {
        // a Sleep constructor from the current sleep time
        // @param sleepNow (the current amount of sleep the user gets)
        currentSleep = sleepNow;
    }

    public Sleep(int sleepNow, int mreSleep)
    {
        // a second Sleep constructor from the current sleep time and the new sleep time
        // @param sleepNow (the current amount of sleep the user gets)
        // @param mreSleep (the wanted amount of sleep the user gets)
        currentSleep = sleepNow;
        newSleep = mreSleep;
    }

    //tells the user how much they sleep at night
    //@return currentSleep
    public String getSleep()
    {
        return "You function on " + currentSleep + " hours of sleep. ";
    }

    //tells the user how many more hours of sleep they need
    //@param currentSleep (current amount of sleep)
    //@param newSleep (the desired amount of sleep)
    //@return moreHours (the number of more hours that the user should sleep)
    public String goodSleep(int currentSleep, int newSleep)
    {
        int moreHours = newSleep -= currentSleep;
        {
            if (moreHours == 1)
            {
                return "That sounds good! You should get " + moreHours + " more hour of sleep. ";
            }
            else
            {
                return "That sounds good! You should get " + moreHours + " more hours of sleep. ";
            }
        }
    }
}
