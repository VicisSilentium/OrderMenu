package menu.view;

import javax.swing.JFrame;

import menu.controller.MenuController;

public class MenuFrame extends JFrame
{
//		Declaration Section
		private MenuController baseController;
		private MenuPanel basePanel;
		
		public MenuFrame(MenuController baseController)
		{
			this.baseController = baseController;
			basePanel = new MenuPanel(baseController);

			setupFrame();	
		}

		public MenuPanel getMenuPanel()
		{
			return basePanel;
		}
		
		private void setupFrame()
		{
			this.setContentPane(basePanel);
			this.setSize(550, 350);
			this.setVisible(true);
		}
		
		
}
