package Model;

public class ChefRayon extends Employe
{

    private boolean EstChef;
    private String Rayon;

    public ChefRayon()
    {
    }

    public String getRayon()
    {
        return Rayon;
    }

    public void setRayon(String rayon)
    {
        Rayon = rayon;
    }

    public boolean isEstChef()
    {
        return EstChef;
    }

    public void setEstChef(boolean estChef)
    {
        EstChef = estChef;
    }

}
