import java.util.HashMap;
import java.util.Map;

//Done.

public class Purse {

  //Denomination is the key, Integer is the value
  private Map<Denomination, Integer> cash;

  //Constructor
  public Purse() {
    cash = new HashMap<>();
  }

  public void add(Denomination type, int num) {
    //Add
    cash.put(type, num);

  }

  public double remove(Denomination type, int num) {
    cash.put(type, num - cash.get(type));

    return type.amt()* num;
  }

  //Couldn't get it to display right using get value for the list of denominations and the total value so added this class
  public Map<Denomination, Integer> getCash() {
    return cash;
  }

  public double getValue()
  {
    double total = 0.0;
    for (Map.Entry<Denomination, Integer> entry : cash.entrySet())
    {
      total+= entry.getKey().amt() * entry.getValue();
    }
    return total;
  }

  public String toString()
  {
    String text = "Purse Contains: \n";
    for (Denomination key : cash.keySet()) {
      text += cash.get(key) + " " + key.name();

    }
    return text + "Total: $ " + getValue();
  }
}
