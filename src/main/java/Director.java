/**
 * Created by hjing on 2/10/17.
 */
public class Director {
    private BuildPerson buildPerson;
    public Director( BuildPerson buildPerson)
    {
        this.buildPerson = buildPerson;
    }

    public void draw()
    {
        buildPerson.drawHead();
        buildPerson.drawBody();
        buildPerson.drawLegs();
    }

}
