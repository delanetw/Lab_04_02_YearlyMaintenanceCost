public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Enter your house maintenance costs for every season: ");
        double spring = 900;
        double summer = 1200;
        double fall = 780;
        double winter = 1350;

        double mainCost = spring + summer + fall + winter;
        System.out.println("Your total yearly maintenance cost is: " + mainCost);
    }
}