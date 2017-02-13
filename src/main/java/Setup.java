/**
 * Created by hjing on 2/13/17.
 */
public class Setup {
    static public void main( String[] args)
    {
        BuildPerson buildThinPerson = new BuildThinPerson();
        Director director = new Director(buildThinPerson);
        director.draw();

        BuildPerson buildFatPerson = new BuildFatPerson();
        director = new Director(buildFatPerson);
        director.draw();
    }
}
