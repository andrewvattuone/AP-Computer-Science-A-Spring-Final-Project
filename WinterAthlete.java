//#22 - student-designed interface implemented
//#25 - meaningful class name
//#21 - inheritance hierarchy
public abstract class WinterAthlete implements Athlete
{
  //#25 - meaningful variable names
  private String name;
  private int numMedals;

  public WinterAthlete(String name, int numMedals)
  {
    this.name = name;
    this.numMedals = numMedals;
  }

  //#25 - meaningful method name
  //#20 - interaction between student-designed classes
  public void celebrate()
  {
    System.out.println("Wooohooo!!!!");
  }

  //#25 - meaningful method name
  public String getName()
  {
    return name;
  }

  //#25 - meaningful method name
  public int getNumMedals()
  {
    return numMedals;
  }

  //#25 - meaninful method name
  public void addMedal()
  {
    numMedals++;
  }
}