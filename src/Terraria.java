public class Terraria extends Game{
    private String worldType;

    public Terraria(double r, double p, String wt) {
        super(r, p);
        worldType = wt;
    }

    public String getWorldType() {
        return worldType;
    }

    public void changeWorldType() {
        if (worldType.equalsIgnoreCase("Crimson"))
        {
            worldType = "Corrupt";
        }
        else {
            worldType = "Crimson";
        }
    }
}
