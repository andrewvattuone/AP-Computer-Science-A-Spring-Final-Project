//#21 - inheritance heirarchy
//#25 - meaningful class name
public class Snowboarder extends WinterAthlete
{
  //#25 - meaningful variable name
  private boolean isBeginner;

  public Snowboarder(String name, int numMedals, boolean isBeginner)
  {
    super(name, numMedals);
    this.isBeginner = isBeginner;
  }

  //#25 - meaingful method name
  public void doFlip()
  {
    int chance = (int) (Math.random() * 100) + 1;
    if (isBeginner)
    {
      if (chance < 20)
      {
        System.out.println("Woah! Sick double flip bruh!");
      }
      else if (chance < 40)
      {
        System.out.println("Woah! Nice flip bruh!");
      }
      else
      {
        System.out.println("Gnarly wipeout dude! Keep practicing that flip.");
      }
    }
    else
    {
      if (chance < 15)
      {
        System.out.println("A triple flip? I've never seen something so radical dude!");
      }
      else if (chance < 50)
      {
        System.out.println("Woah! Sick double flip bruh!");
      }
      else if (chance < 80)
      {
        System.out.println("Nice warm up flip. Would be way cooler to see a double or triple flip though.");
      }
      else
      {
        System.out.println("What a gnarly wipeout! Better keep practicing those flips.");
      }
    }
    System.out.print(getName() + ": ");
    //#20 - interaction between student-designed classes
    celebrate();
  }
}