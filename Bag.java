import java.util.ArrayList;

public class Bag
{

  ArrayList<Item> list;

  /** Constructor method */
  public Bag()
  {
    list = new ArrayList<Item>();
  }

  /** Add an item to the ArrayList
  @param itemName the name of the item to be added */
  public void add(String itemName)
  {
    list.add(new Item(itemName, 1));
  }

  /** Counts the amount of the items added to the list  */
  public int count(String itemName)
  {
    int itemCount = 0; 
    for(int i = 0; i < list.size(); i++)
    {
      if(list.get(i).name == itemName)
      {
        itemCount++;
      }
    }
    return itemCount;
  }

  public class Item
  {
    private String name;
    private int quantity;

    public Item(String itemName2, int quantity2)
    {
      name = itemName2;
      quantity = quantity2;
    }
  }

}
