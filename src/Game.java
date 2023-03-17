public class Game {
    private double rating;
    private double price;

    public Game(double r, double p)
    {
        rating = r;
        price = p;
    }

    public double getRating()
    {
        return rating;
    }

    public double getPrice()
    {
        return price;
    }

    public void buyGame(String name)
    {
        System.out.println("You bought the game!");
    }
}
