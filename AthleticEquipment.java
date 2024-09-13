//#22- student-designed interface implemented
//#25 - meaningful class name
//#21 - inheritance hierarchy
public abstract class AthleticEquipment implements Equipment
{
  //#25 - meaningful variable names
  private String brand;
  private int conditionLevel; //represents the condition of the equipment, with 100 representing brand-new and 1 representing almost-broken

  public AthleticEquipment(String brand, int conditionLevel)
  {
    this.brand = brand;
    //sets conditionLevel to 100 if it's over 100
    if (conditionLevel > 100)
    {
      this.conditionLevel = 100;
    }
    else
    {
      this.conditionLevel = conditionLevel;
    }
  }

  //#25 - meaningful method name
  public String getBrand()
  {
    return brand;
  }

  //#10 - Setter method, #9 - setter method, used to change the brand of the equipment
  //#25 - meaningful method name
  public void setBrand(String brand)
  {
    this.brand = brand;
  }

  //#25 - meaningful method name
  //returns a string representing the condition of the equipment, based on its conditionLevel
  public String getCondition()
  {
    if (conditionLevel >= 75)
    {
      return "good";
    }
    if (conditionLevel >= 50)
    {
      return "fair";
    }
    if (conditionLevel >= 25)
    {
      return "poor";
    }
    return "very poor";
  }

  //#25 - meaningful method name
  //#20 - interaction between student-designed classes
  //Repairs the conditionLevel by 5
  public void repair()
  {
    conditionLevel += 5;  
    if (conditionLevel > 100)
    {
      conditionLevel = 100;
    }
  }
}