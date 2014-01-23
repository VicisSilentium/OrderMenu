package menu.controller;

import java.util.ArrayList;
import menu.model.RestarauntMenu;
import menu.view.MenuFrame;
import menu.view.MenuPanel;


public class MenuController
{
	// Declaration Section
	private RestarauntMenu myMenu;
	private MenuFrame appFrame;
	private MenuPanel appPanel;
	
	public MenuController()
	{
		myMenu = new RestarauntMenu();
	}

	public RestarauntMenu getMyMenu()
	{
		return myMenu;
	}

	public void setMyMenu(RestarauntMenu myMenu)
	{
		this.myMenu = myMenu;
	}

	public MenuFrame getAppFrame()
	{
		return appFrame;
	}

	public void setAppFrame(MenuFrame appFrame)
	{
		this.appFrame = appFrame;
	}

	public String getMenuResults()
	{
		String currentResult = "";

		return currentResult;
	}

	public void start()
	{
		setAppFrame(new MenuFrame(this));
		appPanel = appFrame.getMenuPanel();
		
	}

	public String breakfastMenu()
	{
		String breakfastMenu = "";

		for (String currentItem : myMenu.getBreakfastList())
		{
			breakfastMenu += currentItem + "\n";
		}
		return breakfastMenu;
	}

	public String lunchMenu()
	{
		String lunchMenu = "";

		for (String currentItem : myMenu.getLunchList())
		{
			lunchMenu += currentItem + "\n";
		}
		return lunchMenu;
	}

	public String dinnerMenu()
	{
		String dinnerMenu = "";

		for (String currentItem : myMenu.getDinnerList())
		{
			dinnerMenu += currentItem + "\n";
		}
		return dinnerMenu;
	}
	
	public String itemChoice(String input)
	{
		
		if (input.equals("1"))
		{
			appPanel.changeText("Congratulations! you have chosen Cake frosting!" );
		}

		else if (input.equals("2"))
		{
			appPanel.changeText("Congratulations! you have chosen !" );
		}
		else if (input.equals("3"))
		{
			appPanel.changeText("Congratulations! you have chosen !" );
		}
		else if (input.equals("4"))
		{
			appPanel.changeText("Congratulations! you have chosen !" );
		}
		else if (input.equals("5"))
		{
			appPanel.changeText("Congratulations! you have chosen !" );
		}
		
		return "";		
	}
	
	
	
	public String checkMenu(String input)
	{
		String current = "";

		if (input.equals("1")) // Breakfast Menu
		{
			current = breakfastMenu();
//			appPanel.changeText(current);

			itemChoice(current);
		}
		else if (input.equals("2"))
		{
			current = lunchMenu();
			
			if (input.equals("1"))
			{
				appPanel.changeText("Congratulations! you have chosen !" );
			}

			else if (input.equals("2"))
			{
				appPanel.changeText("Congratulations! you have chosen !" );
			}
			else if (input.equals("3"))
			{
				appPanel.changeText("Congratulations! you have chosen !" );
			}
			else if (input.equals("4"))
			{
				appPanel.changeText("Congratulations! you have chosen !" );
			}
			else if (input.equals("5"))
			{
				appPanel.changeText("Congratulations! you have chosen !" );
			}
		}
		else if (input.equals("3"))
		{
			current = dinnerMenu();
			
			if (input.equals("1"))
			{
				appPanel.changeText("Congratulations! you have chosen !" );
			}

			else if (input.equals("2"))
			{
				appPanel.changeText("Congratulations! you have chosen !" );
			}
			else if (input.equals("3"))
			{
				appPanel.changeText("Congratulations! you have chosen !" );
			}
			else if (input.equals("4"))
			{
				appPanel.changeText("Congratulations! you have chosen !" );
			}
			else if (input.equals("5"))
			{
				appPanel.changeText("Congratulations! you have chosen !" );
			}
		}
		else
		{
			start();
		}
			
		return current;
	}
}
