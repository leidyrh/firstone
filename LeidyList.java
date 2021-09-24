
public class LeidyList {

	//write a constructor that defines the size of the list
	//Notice, that this "size" is not the same as the size of the container masterList
	//write a global variable size, this is meant to keep track of the number of elements in the list
	//read: and not the size of your internal masterlist
	//write a method to get a value from the list at index i
	//write a method to display the values of the list
	//write a method to add a value to the list
		// what happeens
	//write a method to remove value from the list
	//write a method
	//write a method

	  private int[] masterList;
	  private int count; //variable to track the number of elements
	  
	  //constructor
	  public LeidyList(int size) {
	    masterList = new int[size];
	  }

	  public void add(int item) {
	    if (masterList.length == count) {
	    	//create a new array 2x the size
	      int[] newItems = new int[count * 2];

	      for (int i = 0; i < count; i++)
	        newItems[i] = masterList[i];

	      masterList = newItems;
	    }
	    masterList[count ++] = item; // add a item at the end
	  }

	  public void reverse() {
	    int[] newItems = new int[count];

	    for (int i = 0; i < count; i++)
	      newItems[i] = masterList[count - i - 1];

	    masterList = newItems;
	  }


	  public void clear(int index) {
		  //validate index
	    if (index < 0 || index >= count)
	      throw new IllegalArgumentException();// throw an exception 

	    for (int i = index; i < count; i++)// as long as i is less that count increment i after each step 
	      masterList[i] = masterList[i + 1];// in each interaction set item i to the right side of the item

	    count--;// decrement count by one, count represents the total number of items
	  }

	  public int indexOf(int item) {
		  //if item fund, return index, otherwise return -1
	    for (int i = 0; i < count; i++)
	      if (masterList[i] == item) // if items of i equal item, return i
	        return i;

	    return -1;
	  }

	  public void print() {
	    for (int i = 0; i < count; i++)
	      System.out.println(masterList[i]);
	  }
	}
