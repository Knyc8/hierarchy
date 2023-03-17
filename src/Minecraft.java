public class Minecraft extends Game{
    private String version;
    public Minecraft(double r, double p, String v) {
        super(r, p);
        version = v;
    }

    public String getVersion() {
        return version;
    }

    public void changeVersion()
    {
        if (version.equalsIgnoreCase("Bedrock"))
        {
            version = "Java";
        }
        else
        {
            version = "Bedrock";
        }
    }
}
