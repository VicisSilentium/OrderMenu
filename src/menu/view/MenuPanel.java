package menu.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import menu.controller.MenuController;
import menu.model.RestarauntMenu;
import java.awt.image.*;

public class MenuPanel extends JPanel
{
	// Declaration Section
	private MenuController baseController;
	private JButton submitButton;
	private JTextField userInputField;
	private JTextArea menuArea;
	private SpringLayout baseLayout;
	private JScrollPane textPane;
	private RestarauntMenu myRestarauntMenu;
	protected String currentInput;
	private ImageIcon pictureSource;
	private Image baseImage;
	private String menuStart;
	private int clickCount;

	public MenuPanel(MenuController baseController)
	{
		this.baseController = baseController;
		menuArea = new JTextArea(10, 35);
		textPane = new JScrollPane(menuArea);
		baseLayout = new SpringLayout();
		submitButton = new JButton("Click me to see the menu options.");
		userInputField = new JTextField(30);
		pictureSource = new ImageIcon(getClass().getResource(
				"/menu/view/images/baconweave.jpg"));
		menuStart = "1. Breakfast \n2. Lunch\n3. Dinner";

		setupPanel();
		setupLayout();
		setupListeners();
	}

	public void changeText(String Current)
	{
		menuArea.setText(Current);
	}

	private void setupPanel()
	{

		this.setLayout(baseLayout);
		this.add(submitButton);
		this.add(textPane);
		this.add(userInputField);

		menuArea.setEditable(false);
		menuArea.setWrapStyleWord(true);
		menuArea.setLineWrap(true);

		menuArea.setText(menuStart);

	}

	@Override
	protected void paintComponent(Graphics panelGraphics)
	{
		super.paintComponent(panelGraphics);
		baseImage = pictureSource.getImage();
		panelGraphics.drawImage(baseImage, 0, 0, getWidth(), getHeight(), null);
	}

	private void setupLayout()
	{

		baseLayout.putConstraint(SpringLayout.NORTH, textPane, 17,
				SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textPane, 82,
				SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 17,
				SpringLayout.SOUTH, textPane);
		baseLayout.putConstraint(SpringLayout.WEST, submitButton, 128,
				SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, userInputField, 17,
				SpringLayout.SOUTH, submitButton);
		baseLayout.putConstraint(SpringLayout.WEST, userInputField, 102,
				SpringLayout.WEST, this);
	}

	private void setupListeners()
	{

		submitButton.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent click)
			{
			

				String userChoice = userInputField.getText();
				String currentResult = baseController.checkMenu(userChoice);
				menuArea.setText(currentResult);

				if (userChoice  == "1")
				{
				
					
					
					
				}

				else if (userChoice == "2")
				{
					
					
					
				
				}

				else
				{
					clickCount = 0;
				}
			}
		});

	}

}
