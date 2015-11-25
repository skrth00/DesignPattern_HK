package com.iterator.dinermerger.before;

public class DinerMenu{

  static final int MAX_ITEMS = 3;
    int numberOfItems = 0;
    MenuItem[] menuItems;
  
    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("채식주의자 BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("그냥 BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("오늘의 스프",
                "Soup of the day, with a side of potato salad", false, 3.29);
    }
    public void addItem(String name, String description, boolean vegetarian, double price)
    {
      MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
      if (numberOfItems >= MAX_ITEMS) {
        System.err.println("Sorry, menu is full!  Can't add item to menu");
      }
      
      else{
    menuItems[ numberOfItems ]= menuItem;
    numberOfItems = numberOfItems + 1;
    }
        
        
 }
    public MenuItem[] getMenuItems() {
        return menuItems;
    }
    
}