package menu.model;

import java.util.ArrayList;


public class RestarauntMenu
{

	// Declaration Section
	private ArrayList<String> breakfastList;
	private ArrayList<String> lunchList;
	private ArrayList<String> dinnerList;
	private ArrayList<String> menuList;

	public RestarauntMenu()
	{
		breakfastList = new ArrayList<String>();
		lunchList = new ArrayList<String>();
		dinnerList = new ArrayList<String>();
		menuList = new ArrayList<String>();
		fillTheBreakfastList();
		fillTheLunchList();
		fillTheDinnerList();
		fillTheMenuList();
	}

	public ArrayList<String> getBreakfastList()
	{
		return breakfastList;
	}
	public ArrayList<String> getLunchList()
	{
		return lunchList;
	}
	public ArrayList<String> getDinnerList()
	{
		return dinnerList;
	}
	public ArrayList<String> getMenuList()
	{
		return menuList;
	}

	private void fillTheBreakfastList()
	{
		breakfastList.add("1) Cake Frosting*");
		breakfastList.add("2) Bacon*");
		breakfastList.add("3) Doughnuts*");
		breakfastList.add("4) Milkshakes*");
		breakfastList.add("5) Deep-Fried Twinkies*");
		breakfastList.add("*Contains Laxamis Maximus");

	}
	private void fillTheLunchList()
	{
		lunchList.add("1) French Fries*");
		lunchList.add("2) Bacon Weave X5*");
		lunchList.add("3) Triple Chocolate Lava Cake*");
		lunchList.add("4) Colorado Omlet*");
		lunchList.add("5) Double Chicken Cheese Bacon Sandwich (Chicken Being the Bun*)");
		lunchList.add("*Contains Laxamis Maximus");
	}
	private void fillTheDinnerList()
	{
		dinnerList.add("1) Triple Baconator*");
		dinnerList.add("2) Steak with Onions*");
		dinnerList.add("3) Syrup covered,grease lathered, sausage, triple bacon, double ham, pepper, spicy pepper, onion rings*");
		dinnerList.add("4) Deep Fried Stick O' Butter w/ Deep Fried Kool-Aid*");        
		dinnerList.add("5) Cinnamon Squares*");
		dinnerList.add("*Contains Laxamis Maximus");

	}
	private void fillTheMenuList()
	{
		menuList.add("1) breakfastList");
		menuList.add("2) lunchList");
		menuList.add("3) dinnerList");
	}
	
	public String getMenuTopic()
	{
		String menuTopic = "";
		
		int myMenuListPosition = (int) (menuList.size());
		menuTopic = menuList.get(myMenuListPosition);
		
		
		return menuTopic;
	}
}
