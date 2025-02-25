//Name: Maathuri Manokanthan 
//Date: January 17,2022
//Course Code: ICS3U1
//Title: Java.io 
//Description: 
//Features: 
//Major Skills: 
//Areas of Concern: 

//import libraries 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton; 

//main class of the program 
public class RepetitionGUI extends JFrame implements ActionListener{
	
	//setting up the panels, labels and buttons for the entire program
	JFrame introFrame = new JFrame(); 		       //first window GUI features
	JPanel introPanel = new JPanel(); 
	JLabel titleLabel = new JLabel();
	JLabel msgLabel = new JLabel(); 
	JButton continueButton = new JButton(); 
	
	JFrame mainFrame = new JFrame();              //second window GUI features
	JPanel mainPanel = new JPanel();  
	JLabel title2Label = new JLabel(); 
	JLabel description2Label = new JLabel(); 
	JButton ifButton = new JButton(); 
	JButton forButton = new JButton(); 
	JButton whileButton = new JButton(); 
	
	JFrame ifFrame = new JFrame();                //if lesson window GUI features 
	JPanel ifPanel = new JPanel(); 
	JLabel iftitleLabel = new JLabel();
	JLabel ifdescriptionLabel = new JLabel(); 
	JLabel ifpicture1Label = new JLabel();
	JLabel ifpicture2Label = new JLabel();
	JButton ifpracticeButton = new JButton(); 
	JButton ifquizButton = new JButton(); 
	
	JFrame ifPracticeFrame = new JFrame();       //if practice window GUI features
	JPanel ifPracticePanel = new JPanel(); 
	JTextArea iftextArea = new JTextArea();
	JButton ifq1Button = new JButton(); 
	JButton ifq1solButton = new JButton(); 
	JButton ifq2Button = new JButton(); 
	JButton ifq2solButton = new JButton();
	JLabel ifpracticetitleLabel = new JLabel(); 
	JLabel ifdescription2Label = new JLabel(); 
	
	JFrame forFrame = new JFrame();                //for lesson window GUI features 
	JPanel forPanel = new JPanel(); 
	JLabel fortitleLabel = new JLabel();
	JLabel fordescriptionLabel = new JLabel(); 
	JLabel forpicture1Label = new JLabel();
	JLabel forpicture2Label = new JLabel();
	JButton forpracticeButton = new JButton(); 
	JButton forquizButton = new JButton(); 
	
	JFrame forPracticeFrame = new JFrame();       //for practice window GUI features
	JPanel forPracticePanel = new JPanel(); 
	JTextArea fortextArea = new JTextArea();
	JButton forq1Button = new JButton(); 
	JButton forq1solButton = new JButton(); 
	JButton forq2Button = new JButton(); 
	JButton forq2solButton = new JButton();
	JLabel forpracticetitleLabel = new JLabel(); 
	JLabel fordescription2Label = new JLabel(); 
	
	JFrame whileFrame = new JFrame();                //while lesson window GUI features 
	JPanel whilePanel = new JPanel(); 
	JLabel whiletitleLabel = new JLabel();
	JLabel whiledescriptionLabel = new JLabel(); 
	JLabel whilepicture1Label = new JLabel();
	JLabel whilepicture2Label = new JLabel();
	JButton whilepracticeButton = new JButton(); 
	JButton whilequizButton = new JButton(); 
	
	JFrame whilePracticeFrame = new JFrame();       //while practice window GUI features
	JPanel whilePracticePanel = new JPanel(); 
	JTextArea whiletextArea = new JTextArea();
	JButton whileq1Button = new JButton(); 
	JButton whileq1solButton = new JButton(); 
	JButton whileq2Button = new JButton(); 
	JButton whileq2solButton = new JButton();
	JLabel whilepracticetitleLabel = new JLabel(); 
	JLabel whiledescription2Label = new JLabel(); 
	
	//main method of the program 
	public RepetitionGUI() {
		
		//setting up the main title of the program 
		ImageIcon main = new ImageIcon("images/main.png");
		titleLabel.setText("Welcome To Java.io");
		titleLabel.setIcon(main);
		titleLabel.setHorizontalTextPosition(JLabel.CENTER);
		titleLabel.setVerticalTextPosition(JLabel.BOTTOM);
		titleLabel.setForeground(Color.white);  
		titleLabel.setBackground(Color.decode("#152238"));
		titleLabel.setIconTextGap(20);
		titleLabel.setFont(new Font("Georgia",Font.BOLD,45));                  
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);             
		titleLabel.setVerticalAlignment(SwingConstants.NORTH);       
		titleLabel.setOpaque(true);
		titleLabel.setBounds(200,100,500,170);
		titleLabel.setVisible(true); 
		
		//setting up the continue button
		continueButton.setText("CONTINUE");
		continueButton.setFont(new Font("Georgia",Font.PLAIN,12));
		continueButton.setBounds(775,500,100,50);
		continueButton.setFocusable(false);
		continueButton.addActionListener(this);
		continueButton.setForeground(Color.white);
		continueButton.setBackground(Color.decode("#405865"));
		continueButton.setVisible(true);
		
		//creating a panel for the intro window
		introPanel.setBounds(200,270,500,100);
		introPanel.setOpaque(false);
		
		//creating the welcome message label 
		msgLabel.setText("<html>This is an interactive educational software that will teach you about what and how to <br/>"
				+ "Repetition Control Structures. This software will teach you and also give you the <br/> "
				+ "opportunity to practice your skills and then later test your knowledge. Click 'CONTINUE' <br/>"
				+ "to start your journey at Java.io.</html>");
		msgLabel.setHorizontalTextPosition(JLabel.CENTER);
		msgLabel.setVerticalTextPosition(JLabel.BOTTOM);
		msgLabel.setHorizontalAlignment(SwingConstants.CENTER);
		msgLabel.setVerticalAlignment(SwingConstants.CENTER);
		msgLabel.setFont(new Font("Calibri",Font.PLAIN,14));
		msgLabel.setForeground(Color.white);
		msgLabel.setBounds(200,280,500,100);
		msgLabel.setVisible(true);
		introPanel.add(msgLabel);

		//setting up the introduction window 
		introFrame.setTitle("Java.io");
		introFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		introFrame.setResizable(false);
		introFrame.setSize(900,600);
		introFrame.setVisible(true);
		ImageIcon image = new ImageIcon("images/logo.png"); 
		introFrame.setIconImage(image.getImage()); 		
		introFrame.getContentPane().setBackground(Color.decode("#152238"));
		
		//allowing the other features to be visible on the window
		introFrame.add(titleLabel);
		introFrame.add(continueButton);
		introFrame.add(introPanel);
		introFrame.add(msgLabel);

	}

		
	//this method creates the second window 
	private void RepetitionIntro()  {
		
		//setting up the panel for this window
		mainPanel.setSize(900,600); 
		mainPanel.setLayout(null);
		mainPanel.setOpaque(false);
		
		//title label setup 
		title2Label.setText("Repetition Control Structures");
		title2Label.setBounds(10,40,870,75);
		title2Label.setFont(new Font("Georgia",Font.BOLD,45));
		title2Label.setHorizontalTextPosition(JLabel.CENTER);
		title2Label.setVerticalTextPosition(JLabel.BOTTOM);
		title2Label.setForeground(Color.white);  
		title2Label.setBackground(Color.decode("#152238"));
		title2Label.setHorizontalAlignment(SwingConstants.CENTER);             
		title2Label.setVerticalAlignment(SwingConstants.NORTH);       
		title2Label.setOpaque(false);
		title2Label.setVisible(true); 
		mainPanel.add(title2Label);
		
		//repetition control structure description label
		ImageIcon second = new ImageIcon("images/programming.png"); 
		description2Label.setText("<html> A repetitive control structure is a structure of code that allows a <br/>"
				+ "set of related statements to be repeated. The repetition can repeat <br/>"
				+ "as many times as the user wants the set of codes to be repeated. <br/>"
				+ "There are three repetitive control structures that the user can use: <br/>"
				+ "if structure, for structure and the while structure. Each of these <br/>"
				+ "structures are used a little bit differently but follow a similar idea.<br/>"
				+ "To learn more about each of these structures, click on the buttons <br/>"
				+ "below to learn more about them and get the chance to practice your<br/>"
				+ "skills,and then take part in a small assessment.</html>");
		description2Label.setBounds(30,120,820,250);
		description2Label.setIcon(second);
		description2Label.setFont(new Font("Calibri",Font.PLAIN,15));
		description2Label.setForeground(Color.white);
		description2Label.setHorizontalTextPosition(JLabel.LEFT);
		description2Label.setVerticalTextPosition(JLabel.BOTTOM);
		description2Label.setHorizontalAlignment(SwingConstants.CENTER);             
		description2Label.setVerticalAlignment(SwingConstants.CENTER);
		description2Label.setOpaque(false);
		description2Label.setVisible(true);
		mainPanel.add(description2Label);
		
		//setting up the if button
		ifButton.setText("IF");
		ifButton.setFont(new Font("Georgia",Font.PLAIN,12));
		ifButton.setBounds(20,450,260,50);
		ifButton.setFocusable(false);
		ifButton.addActionListener(this);
		ifButton.setForeground(Color.white);
		ifButton.setBackground(Color.decode("#405865"));
		ifButton.setVisible(true);
		mainPanel.add(ifButton);
		
		//setting up the for button
		forButton.setText("FOR");
		forButton.setFont(new Font("Georgia",Font.PLAIN,12));
		forButton.setBounds(310,450,260,50);
		forButton.setFocusable(false);
		forButton.addActionListener(this);
		forButton.setForeground(Color.white);
		forButton.setBackground(Color.decode("#405865"));
		forButton.setVisible(true);
		mainPanel.add(forButton);
		
		//setting up the while button
		whileButton.setText("WHILE");
		whileButton.setFont(new Font("Georgia",Font.PLAIN,12));
		whileButton.setBounds(600,450,260,50);
		whileButton.setFocusable(false);
		whileButton.addActionListener(this);
		whileButton.setForeground(Color.white);
		whileButton.setBackground(Color.decode("#405865"));
		whileButton.setVisible(true);
		mainPanel.add(whileButton);
		
		//setting up the main frame 
		mainFrame.setTitle("Intro: Repetition Control Structures");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		mainFrame.setResizable(false);
		mainFrame.setSize(900,600); 
		ImageIcon image = new ImageIcon("images/logo.png"); 
		mainFrame.setIconImage(image.getImage()); 		
		mainFrame.getContentPane().setBackground(Color.decode("#152238"));
		mainFrame.setVisible(true);
		mainFrame.add(mainPanel);

	}
	
	//this method will create the If Lesson
	private void IfLesson() {
		//setting up the main panel for this window
		ifPanel.setSize(900,600); 
		ifPanel.setLayout(null);
		ifPanel.setOpaque(false);
		
		//setting up the title for this window 
		iftitleLabel.setText("If Structure");
		iftitleLabel.setBounds(10,40,870,75);
		iftitleLabel.setFont(new Font("Georgia",Font.BOLD,45));
		iftitleLabel.setHorizontalTextPosition(JLabel.CENTER);
		iftitleLabel.setVerticalTextPosition(JLabel.BOTTOM);
		iftitleLabel.setForeground(Color.white);  
		iftitleLabel.setBackground(Color.decode("#152238"));
		iftitleLabel.setHorizontalAlignment(SwingConstants.CENTER);             
		iftitleLabel.setVerticalAlignment(SwingConstants.NORTH);       
		iftitleLabel.setOpaque(false);
		iftitleLabel.setVisible(true); 
		ifPanel.add(iftitleLabel);
		
		//adding the general if structure image to the code
		ImageIcon generalif = new ImageIcon("images/generalif.jpg"); 
		ifpicture1Label.setBounds(500,120,435,200);
		ifpicture1Label.setHorizontalAlignment(SwingConstants.LEFT);             
		ifpicture1Label.setVerticalAlignment(SwingConstants.CENTER); 
		ifpicture1Label.setIcon(generalif);
		ifpicture1Label.setOpaque(false);
		ifpicture1Label.setVisible(true);
		ifPanel.add(ifpicture1Label);
		
		//adding the demo code image to the window
		ImageIcon codeif = new ImageIcon("images/codeif.png");
		ifpicture2Label.setBounds(500,320,435,200);
		ifpicture2Label.setHorizontalAlignment(SwingConstants.LEFT);             
		ifpicture2Label.setVerticalAlignment(SwingConstants.CENTER); 
		ifpicture2Label.setIcon(codeif);
		ifpicture2Label.setOpaque(false);
		ifpicture2Label.setVisible(true);
		ifPanel.add(ifpicture2Label);
		
		//setting up the lesson blurb on the window 
		ifdescriptionLabel.setText("<html> An if statement is a simple repetition decision structure. This is used to decide whether a"
				+ " particular section of code will be executed. The section of code will only be executed if the “if"
				+ " statement” is true. If you take a look at the first picture on the right, you can visually see how this "
				+ " structure works. To explain the picture, the if statement is now in control of the ongoing code. "
				+ " The code will read the condition, and see if the code is true or false. If the statement is true, the "
				+ " code will run through the code listed underneath the if statement. If the statement is false, the"
				+ " code will leave the if statement and continue with the code listed outside of the if structure.<br/>"
				+ " <br/>To help you further understand, take a look at the if structure code example under the general if "
				+ " structure. The variable ‘i’ is initialized to 10. The ‘i’ variable is being checked by the if-statement. "
				+ " The condition of this statement is if the variable ‘i’ is less than 15, it will output the message “10"
				+ " is less than 15”. Since 10 is less than 15, the statement is true, and the message will be "
				+ " outputted and will exit the structure. Outside the if structure, there is a print statement, which will "
				+ " also be executed in the output as well.</html> ");
		ifdescriptionLabel.setBounds(20,80,434,400);
		ifdescriptionLabel.setFont(new Font("Calibri",Font.PLAIN,14));
		ifdescriptionLabel.setForeground(Color.white);
		ifdescriptionLabel.setHorizontalTextPosition(JLabel.LEFT);
		ifdescriptionLabel.setVerticalTextPosition(JLabel.BOTTOM);
		ifdescriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);             
		ifdescriptionLabel.setVerticalAlignment(SwingConstants.CENTER);
		ifdescriptionLabel.setOpaque(false);
		ifdescriptionLabel.setVisible(true);
		ifPanel.add(ifdescriptionLabel);
		
		//setting up the practice button for this window 
		ifpracticeButton.setText("PRACTICE"); 
		ifpracticeButton.setFont(new Font("Georgia",Font.PLAIN,12));
		ifpracticeButton.setBounds(20,470,217,50);
		ifpracticeButton.setFocusable(false);
		ifpracticeButton.addActionListener(this);
		ifpracticeButton.setForeground(Color.white);
		ifpracticeButton.setBackground(Color.decode("#405865"));
		ifpracticeButton.setVisible(true);
		ifPanel.add(ifpracticeButton);
		
		//setting up the quiz button for this window 
		ifquizButton.setText("QUIZ"); 
		ifquizButton.setFont(new Font("Georgia",Font.PLAIN,12));
		ifquizButton.setBounds(250,470,217,50);
		ifquizButton.setFocusable(false);
		ifquizButton.addActionListener(this);
		ifquizButton.setForeground(Color.white);
		ifquizButton.setBackground(Color.decode("#405865"));
		ifquizButton.setVisible(true);
		ifPanel.add(ifquizButton);
		
		//setting up the main window 
		ifFrame.setTitle("If Structure");
		ifFrame.setResizable(false);
		ifFrame.setSize(900,600); 
		ImageIcon image = new ImageIcon("images/logo.png"); 
		ifFrame.setIconImage(image.getImage()); 		
		ifFrame.getContentPane().setBackground(Color.decode("#152238"));
		ifFrame.setVisible(true);
		ifFrame.add(ifPanel);	
	}
	
	//this method will create the practice section for this code
	private void IfPractice() {
		//setting up the main panel for this window
		ifPracticePanel.setSize(900,600); 
		ifPracticePanel.setLayout(null);
		ifPracticePanel.setOpaque(false);
		
		//setting up the menu of options on the left side 
		ifq1Button.setText("QUESTION #1"); 
		ifq1Button.setFont(new Font("Georgia",Font.PLAIN,12));
		ifq1Button.setBounds(30,30,300,100);
		ifq1Button.setFocusable(false);
		ifq1Button.addActionListener(this);
		ifq1Button.setForeground(Color.white);
		ifq1Button.setBackground(Color.decode("#405865"));
		ifq1Button.setVisible(true);
		ifPracticePanel.add(ifq1Button);
		
		ifq1solButton.setText("QUESTION #1 SOLUTION"); 
		ifq1solButton.setFont(new Font("Georgia",Font.PLAIN,12));
		ifq1solButton.setBounds(30,160,300,100);
		ifq1solButton.setFocusable(false);
		ifq1solButton.addActionListener(this);
		ifq1solButton.setForeground(Color.white);
		ifq1solButton.setBackground(Color.decode("#405865"));
		ifq1solButton.setVisible(true);
		ifPracticePanel.add(ifq1solButton);
		
		ifq2Button.setText("QUESTION #2"); 
		ifq2Button.setFont(new Font("Georgia",Font.PLAIN,12));
		ifq2Button.setBounds(30,290,300,100);
		ifq2Button.setFocusable(false);
		ifq2Button.addActionListener(this);
		ifq2Button.setForeground(Color.white);
		ifq2Button.setBackground(Color.decode("#405865"));
		ifq2Button.setVisible(true);
		ifPracticePanel.add(ifq2Button);
		
		ifq2solButton.setText("QUESTION #2 SOLUTION"); 
		ifq2solButton.setFont(new Font("Georgia",Font.PLAIN,12));
		ifq2solButton.setBounds(30,420,300,100);
		ifq2solButton.setFocusable(false);
		ifq2solButton.addActionListener(this);
		ifq2solButton.setForeground(Color.white);
		ifq2solButton.setBackground(Color.decode("#405865"));
		ifq2solButton.setVisible(true);
		ifPracticePanel.add(ifq2solButton);
		
		//creating the title for this panel 
		ifpracticetitleLabel.setText("Practice");
		ifpracticetitleLabel.setBounds(350,30,525,50);
		ifpracticetitleLabel.setFont(new Font("Georgia",Font.BOLD,45));
		ifpracticetitleLabel.setHorizontalTextPosition(JLabel.CENTER);
		ifpracticetitleLabel.setVerticalTextPosition(JLabel.BOTTOM);
		ifpracticetitleLabel.setForeground(Color.white);  
		ifpracticetitleLabel.setBackground(Color.decode("#152238"));
		ifpracticetitleLabel.setHorizontalAlignment(SwingConstants.CENTER);             
		ifpracticetitleLabel.setVerticalAlignment(SwingConstants.NORTH);       
		ifpracticetitleLabel.setOpaque(false);
		ifpracticetitleLabel.setVisible(true); 
		ifPracticePanel.add(ifpracticetitleLabel);
		
		//creating the instruction label 
		ifdescription2Label.setText("<html> In this section, you will get the chance to practice coding if structures. Click the question button"
				+ " on the left side to see your practice question. You can type your answers in the text area below,"
				+ " and then copy and paste it into your Eclipse to see if it works. We have also included a solution "
				+ " option underneath the question to see if your code is similar. Remember there are many ways to"
				+ " code a program, and with practice you will learn the most efficient way to do so. </html>");
		ifdescription2Label.setBounds(350,80,525,100);
		ifdescription2Label.setFont(new Font("Calibri",Font.PLAIN,12));
		ifdescription2Label.setForeground(Color.white);
		ifdescription2Label.setHorizontalTextPosition(JLabel.CENTER);
		ifdescription2Label.setVerticalTextPosition(JLabel.CENTER);
		ifdescription2Label.setHorizontalAlignment(SwingConstants.CENTER);             
		ifdescription2Label.setVerticalAlignment(SwingConstants.CENTER);
		ifdescription2Label.setOpaque(false);
		ifdescription2Label.setVisible(true);
		ifPracticePanel.add(ifdescription2Label);
		
		//setting up the text field area 
		iftextArea.setBounds(350,200,525,325);	
		iftextArea.setFont(new Font("Calibri",Font.PLAIN,12));
		iftextArea.setForeground(Color.white);
		iftextArea.setBackground(Color.decode("#6A8D92"));
		ifPracticePanel.add(iftextArea);

		//setting up the main window 
		ifPracticeFrame.setTitle("If Structure: Practice");
		ifPracticeFrame.setResizable(false);
		ifPracticeFrame.setSize(900,600); 
		ImageIcon image = new ImageIcon("images/logo.png"); 
		ifPracticeFrame.setIconImage(image.getImage()); 		
		ifPracticeFrame.getContentPane().setBackground(Color.decode("#152238"));
		ifPracticeFrame.setVisible(true);
		ifPracticeFrame.add(ifPracticePanel);	
	}
	
	private void ForLesson() {
		//setting up the main panel for this window
		forPanel.setSize(900,600); 
		forPanel.setLayout(null);
		forPanel.setOpaque(false);

		//setting up the title for this window 
		fortitleLabel.setText("For Loop Structure");
		fortitleLabel.setBounds(10,40,870,75);
		fortitleLabel.setFont(new Font("Georgia",Font.BOLD,45));
		fortitleLabel.setHorizontalTextPosition(JLabel.CENTER);
		fortitleLabel.setVerticalTextPosition(JLabel.BOTTOM);
		fortitleLabel.setForeground(Color.white);  
		fortitleLabel.setBackground(Color.decode("#152238"));
		fortitleLabel.setHorizontalAlignment(SwingConstants.CENTER);             
		fortitleLabel.setVerticalAlignment(SwingConstants.NORTH);       
		fortitleLabel.setOpaque(false);
		fortitleLabel.setVisible(true); 
		forPanel.add(fortitleLabel);

		//adding the general if structure image to the code
		ImageIcon generalfor = new ImageIcon("images/generalfor.jpeg"); 
		forpicture1Label.setBounds(500,120,435,200);
		forpicture1Label.setHorizontalAlignment(SwingConstants.LEFT);             
		forpicture1Label.setVerticalAlignment(SwingConstants.CENTER); 
		forpicture1Label.setIcon(generalfor);
		forpicture1Label.setOpaque(false);
		forpicture1Label.setVisible(true);
		forPanel.add(forpicture1Label);

		//adding the demo code image to the window
		ImageIcon codefor = new ImageIcon("images/codefor.jpeg");
		forpicture2Label.setBounds(500,320,435,200);
		forpicture2Label.setHorizontalAlignment(SwingConstants.LEFT);             
		forpicture2Label.setVerticalAlignment(SwingConstants.CENTER); 
		forpicture2Label.setIcon(codefor);
		forpicture2Label.setOpaque(false);
		forpicture2Label.setVisible(true);
		forPanel.add(forpicture2Label);

		//setting up the lesson blurb on the window 
		fordescriptionLabel.setText("<html>A for loop is an easy way to create a loop. Loops are used in java to repeatedly execute a block"
				+ " of statements. Using a for loop, allows you to initialize, create a conditional statement all in one"
				+ " line make it easier and faster to code. Similar to the if structure, the loop will only be repeated if"
				+ " certain conditions are met. If you take a look at the first picture, you will see a visual breakdown"
				+ " of how the for loop structure works. To explain the picture, the for loop is now in control of the"
				+ " ongoing code. The code will check the conditions and test to see if it’s true. If it’s false it will go"
				+ " outside of the loop. If it’s true, the loop will continue. The statements inside the body of the loop"
				+ " will get executed, and get updated as it goes. The update is essentially increasing or decreasing"
				+ " every time the code runs, so the program will stop eventually. The loop will keep going until the"
				+ " condition is false, and then the loop will end. <br/>"
				+ " <br/> To help you further understand, take a look at the for loop structure below the general for loop"
				+ " structure. The variable i is initialized with value 1, and the condition is checked. Since 1 is less"
				+ " than or equal to 5, the loop will continue into the body. “Hello World” will be printed and then the"
				+ " value of i will increase by 1. Now that i = 2, it is still less than or equal to 5, so it will print Hello"
				+ " World for the second time, and then the value of i will increase by 1 again. This process will"
				+ " repeat 5 times, until the value of i = 6. Once i = 6 the condition will be false, so the loop will end.</html>");
		fordescriptionLabel.setBounds(20,80,434,400);
		fordescriptionLabel.setFont(new Font("Calibri",Font.PLAIN,13));
		fordescriptionLabel.setForeground(Color.white);
		fordescriptionLabel.setHorizontalTextPosition(JLabel.LEFT);
		fordescriptionLabel.setVerticalTextPosition(JLabel.BOTTOM);
		fordescriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);             
		fordescriptionLabel.setVerticalAlignment(SwingConstants.CENTER);
		fordescriptionLabel.setOpaque(false);
		fordescriptionLabel.setVisible(true);
		forPanel.add(fordescriptionLabel);

		//setting up the practice button for this window 
		forpracticeButton.setText("PRACTICE"); 
		forpracticeButton.setFont(new Font("Georgia",Font.PLAIN,12));
		forpracticeButton.setBounds(20,470,217,50);
		forpracticeButton.setFocusable(false);
		forpracticeButton.addActionListener(this);
		forpracticeButton.setForeground(Color.white);
		forpracticeButton.setBackground(Color.decode("#405865"));
		forpracticeButton.setVisible(true);
		forPanel.add(forpracticeButton);

		//setting up the quiz button for this window 
		forquizButton.setText("QUIZ"); 
		forquizButton.setFont(new Font("Georgia",Font.PLAIN,12));
		forquizButton.setBounds(250,470,217,50);
		forquizButton.setFocusable(false);
		forquizButton.addActionListener(this);
		forquizButton.setForeground(Color.white);
		forquizButton.setBackground(Color.decode("#405865"));
		forquizButton.setVisible(true);
		forPanel.add(forquizButton);

		//setting up the main window 
		forFrame.setTitle("For Loop Structure");
		forFrame.setResizable(false);
		forFrame.setSize(900,600); 
		ImageIcon image = new ImageIcon("images/logo.png"); 
		forFrame.setIconImage(image.getImage()); 		
		forFrame.getContentPane().setBackground(Color.decode("#152238"));
		forFrame.setVisible(true);
		forFrame.add(forPanel);	
	}
	
	private void ForPractice() {
		//setting up the main panel for this window
		forPracticePanel.setSize(900,600); 
		forPracticePanel.setLayout(null);
		forPracticePanel.setOpaque(false);

		//setting up the menu of options on the left side 
		forq1Button.setText("QUESTION #1"); 
		forq1Button.setFont(new Font("Georgia",Font.PLAIN,12));
		forq1Button.setBounds(30,30,300,100);
		forq1Button.setFocusable(false);
		forq1Button.addActionListener(this);
		forq1Button.setForeground(Color.white);
		forq1Button.setBackground(Color.decode("#405865"));
		forq1Button.setVisible(true);
		forPracticePanel.add(forq1Button);

		forq1solButton.setText("QUESTION #1 SOLUTION"); 
		forq1solButton.setFont(new Font("Georgia",Font.PLAIN,12));
		forq1solButton.setBounds(30,160,300,100);
		forq1solButton.setFocusable(false);
		forq1solButton.addActionListener(this);
		forq1solButton.setForeground(Color.white);
		forq1solButton.setBackground(Color.decode("#405865"));
		forq1solButton.setVisible(true);
		forPracticePanel.add(forq1solButton);

		forq2Button.setText("QUESTION #2"); 
		forq2Button.setFont(new Font("Georgia",Font.PLAIN,12));
		forq2Button.setBounds(30,290,300,100);
		forq2Button.setFocusable(false);
		forq2Button.addActionListener(this);
		forq2Button.setForeground(Color.white);
		forq2Button.setBackground(Color.decode("#405865"));
		forq2Button.setVisible(true);
		forPracticePanel.add(forq2Button);

		forq2solButton.setText("QUESTION #2 SOLUTION"); 
		forq2solButton.setFont(new Font("Georgia",Font.PLAIN,12));
		forq2solButton.setBounds(30,420,300,100);
		forq2solButton.setFocusable(false);
		forq2solButton.addActionListener(this);
		forq2solButton.setForeground(Color.white);
		forq2solButton.setBackground(Color.decode("#405865"));
		forq2solButton.setVisible(true);
		forPracticePanel.add(forq2solButton);

		//creating the title for this panel 
		forpracticetitleLabel.setText("Practice");
		forpracticetitleLabel.setBounds(350,30,525,50);
		forpracticetitleLabel.setFont(new Font("Georgia",Font.BOLD,45));
		forpracticetitleLabel.setHorizontalTextPosition(JLabel.CENTER);
		forpracticetitleLabel.setVerticalTextPosition(JLabel.BOTTOM);
		forpracticetitleLabel.setForeground(Color.white);  
		forpracticetitleLabel.setBackground(Color.decode("#152238"));
		forpracticetitleLabel.setHorizontalAlignment(SwingConstants.CENTER);             
		forpracticetitleLabel.setVerticalAlignment(SwingConstants.NORTH);       
		forpracticetitleLabel.setOpaque(false);
		forpracticetitleLabel.setVisible(true); 
		forPracticePanel.add(forpracticetitleLabel);

		//creating the instruction label 
		fordescription2Label.setText("<html> In this section, you will get the chance to practice coding for loop structures. Click the question button"
				+ " on the left side to see your practice question. You can type your answers in the text area below,"
				+ " and then copy and paste it into your Eclipse to see if it works. We have also included a solution "
				+ " option underneath the question to see if your code is similar. Remember there are many ways to"
				+ " code a program, and with practice you will learn the most efficient way to do so. </html>");
		fordescription2Label.setBounds(350,80,525,100);
		fordescription2Label.setFont(new Font("Calibri",Font.PLAIN,12));
		fordescription2Label.setForeground(Color.white);
		fordescription2Label.setHorizontalTextPosition(JLabel.CENTER);
		fordescription2Label.setVerticalTextPosition(JLabel.CENTER);
		fordescription2Label.setHorizontalAlignment(SwingConstants.CENTER);             
		fordescription2Label.setVerticalAlignment(SwingConstants.CENTER);
		fordescription2Label.setOpaque(false);
		fordescription2Label.setVisible(true);
		forPracticePanel.add(fordescription2Label);

		//setting up the text field area 
		fortextArea.setBounds(350,200,525,325);	
		fortextArea.setFont(new Font("Calibri",Font.PLAIN,12));
		fortextArea.setForeground(Color.white);
		fortextArea.setBackground(Color.decode("#6A8D92"));
		forPracticePanel.add(fortextArea);

		//setting up the main window 
		forPracticeFrame.setTitle("For Loop Structure: Practice");
		forPracticeFrame.setResizable(false);
		forPracticeFrame.setSize(900,600); 
		ImageIcon image = new ImageIcon("images/logo.png"); 
		forPracticeFrame.setIconImage(image.getImage()); 		
		forPracticeFrame.getContentPane().setBackground(Color.decode("#152238"));
		forPracticeFrame.setVisible(true);
		forPracticeFrame.add(forPracticePanel);	
	}
	
	private void WhileLesson() {
		//setting up the main panel for this window
		whilePanel.setSize(900,600); 
		whilePanel.setLayout(null);
		whilePanel.setOpaque(false);

		//setting up the title for this window 
		whiletitleLabel.setText("While Loop Structure");
		whiletitleLabel.setBounds(10,40,870,75);
		whiletitleLabel.setFont(new Font("Georgia",Font.BOLD,45));
		whiletitleLabel.setHorizontalTextPosition(JLabel.CENTER);
		whiletitleLabel.setVerticalTextPosition(JLabel.BOTTOM);
		whiletitleLabel.setForeground(Color.white);  
		whiletitleLabel.setBackground(Color.decode("#152238"));
		whiletitleLabel.setHorizontalAlignment(SwingConstants.CENTER);             
		whiletitleLabel.setVerticalAlignment(SwingConstants.NORTH);       
		whiletitleLabel.setOpaque(false);
		whiletitleLabel.setVisible(true); 
		whilePanel.add(whiletitleLabel);

		//adding the general if structure image to the code
		ImageIcon generalwhile = new ImageIcon("images/generalwhile.jpeg"); 
		whilepicture1Label.setBounds(500,120,435,200);
		whilepicture1Label.setHorizontalAlignment(SwingConstants.LEFT);             
		whilepicture1Label.setVerticalAlignment(SwingConstants.CENTER); 
		whilepicture1Label.setIcon(generalwhile);
		whilepicture1Label.setOpaque(false);
		whilepicture1Label.setVisible(true);
		whilePanel.add(whilepicture1Label);

		//adding the demo code image to the window
		ImageIcon codewhile = new ImageIcon("images/codewhile.jpeg");
		whilepicture2Label.setBounds(500,320,435,200);
		whilepicture2Label.setHorizontalAlignment(SwingConstants.LEFT);             
		whilepicture2Label.setVerticalAlignment(SwingConstants.CENTER); 
		whilepicture2Label.setIcon(codewhile);
		whilepicture2Label.setOpaque(false);
		whilepicture2Label.setVisible(true);
		whilePanel.add(whilepicture2Label);

		//setting up the lesson blurb on the window 
		whiledescriptionLabel.setText("<html> A while loop is another type of loop that will allow you to repeatedly execute a block of"
				+ " statements. This loop is repeated based on a Boolean condition. Unlike the for loop, the while"
				+ " loop only has two parts to its condition. In the while loop, you have the test expression and the"
				+ " update expression, you don’t initialize within the conditions of this loop.  If you take a look at the"
				+ " first picture, you will see a visual breakdown of how the while loop structure works. To explain"
				+ " the picture, the for loop is now in control of the ongoing code. The code will check the conditions"
				+ " and test to see if it’s true. If it’s false it will go outside of the loop. If it’s true, the loop will"
				+ " continue. The statements inside the body of the loop will get executed, and get updated as it"
				+ " goes. The update is essentially increasing or decreasing every time the code runs, so the"
				+ " program will stop eventually. The loop will keep going until the condition is false, and then the"
				+ " loop will end. It’s very similar to how the for loop works except there is one less expression"
				+ " within the condition. <br/>"
				+ "<br/> To help you further understand, take a look at the for loop structure below the general while loop"
				+ " structure. The variable i is initialized with value 1. Notice how this is done before the while loop"
				+ " starts. Once the variable has been initialized, it will continue into the loop. It will check to see if i"
				+ " is less than 6. Since i = 1 and it is less than 6, it will print Hello World. Then the variable i will be"
				+ " increased by 1. Now that i = 2, it is still less than 6, so it will print Hello World for the second"
				+ " time, and then the variable i will increase by 1 again. This process will repeat until i is greater"
				+ " than 6. Once i is greater than 6 the condition will be false, so the loop will end.</html>");
		whiledescriptionLabel.setBounds(20,80,434,400);
		whiledescriptionLabel.setFont(new Font("Calibri",Font.PLAIN,12));
		whiledescriptionLabel.setForeground(Color.white);
		whiledescriptionLabel.setHorizontalTextPosition(JLabel.LEFT);
		whiledescriptionLabel.setVerticalTextPosition(JLabel.BOTTOM);
		whiledescriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);             
		whiledescriptionLabel.setVerticalAlignment(SwingConstants.CENTER);
		whiledescriptionLabel.setOpaque(false);
		whiledescriptionLabel.setVisible(true);
		whilePanel.add(whiledescriptionLabel);

		//setting up the practice button for this window 
		whilepracticeButton.setText("PRACTICE"); 
		whilepracticeButton.setFont(new Font("Georgia",Font.PLAIN,12));
		whilepracticeButton.setBounds(20,470,217,50);
		whilepracticeButton.setFocusable(false);
		whilepracticeButton.addActionListener(this);
		whilepracticeButton.setForeground(Color.white);
		whilepracticeButton.setBackground(Color.decode("#405865"));
		whilepracticeButton.setVisible(true);
		whilePanel.add(whilepracticeButton);

		//setting up the quiz button for this window 
		whilequizButton.setText("QUIZ"); 
		whilequizButton.setFont(new Font("Georgia",Font.PLAIN,12));
		whilequizButton.setBounds(250,470,217,50);
		whilequizButton.setFocusable(false);
		whilequizButton.addActionListener(this);
		whilequizButton.setForeground(Color.white);
		whilequizButton.setBackground(Color.decode("#405865"));
		whilequizButton.setVisible(true);
		whilePanel.add(whilequizButton);

		//setting up the main window 
		whileFrame.setTitle("While Loop Structure");
		whileFrame.setResizable(false);
		whileFrame.setSize(900,600); 
		ImageIcon image = new ImageIcon("images/logo.png"); 
		whileFrame.setIconImage(image.getImage()); 		
		whileFrame.getContentPane().setBackground(Color.decode("#152238"));
		whileFrame.setVisible(true);
		whileFrame.add(whilePanel);	
	}
	
	private void WhilePractice() {
		//setting up the main panel for this window
		whilePracticePanel.setSize(900,600); 
		whilePracticePanel.setLayout(null);
		whilePracticePanel.setOpaque(false);

		//setting up the menu of options on the left side 
		whileq1Button.setText("QUESTION #1"); 
		whileq1Button.setFont(new Font("Georgia",Font.PLAIN,12));
		whileq1Button.setBounds(30,30,300,100);
		whileq1Button.setFocusable(false);
		whileq1Button.addActionListener(this);
		whileq1Button.setForeground(Color.white);
		whileq1Button.setBackground(Color.decode("#405865"));
		whileq1Button.setVisible(true);
		whilePracticePanel.add(whileq1Button);

		whileq1solButton.setText("QUESTION #1 SOLUTION"); 
		whileq1solButton.setFont(new Font("Georgia",Font.PLAIN,12));
		whileq1solButton.setBounds(30,160,300,100);
		whileq1solButton.setFocusable(false);
		whileq1solButton.addActionListener(this);
		whileq1solButton.setForeground(Color.white);
		whileq1solButton.setBackground(Color.decode("#405865"));
		whileq1solButton.setVisible(true);
		whilePracticePanel.add(whileq1solButton);

		whileq2Button.setText("QUESTION #2"); 
		whileq2Button.setFont(new Font("Georgia",Font.PLAIN,12));
		whileq2Button.setBounds(30,290,300,100);
		whileq2Button.setFocusable(false);
		whileq2Button.addActionListener(this);
		whileq2Button.setForeground(Color.white);
		whileq2Button.setBackground(Color.decode("#405865"));
		whileq2Button.setVisible(true);
		whilePracticePanel.add(whileq2Button);

		whileq2solButton.setText("QUESTION #2 SOLUTION"); 
		whileq2solButton.setFont(new Font("Georgia",Font.PLAIN,12));
		whileq2solButton.setBounds(30,420,300,100);
		whileq2solButton.setFocusable(false);
		whileq2solButton.addActionListener(this);
		whileq2solButton.setForeground(Color.white);
		whileq2solButton.setBackground(Color.decode("#405865"));
		whileq2solButton.setVisible(true);
		whilePracticePanel.add(whileq2solButton);

		//creating the title for this panel 
		whilepracticetitleLabel.setText("Practice");
		whilepracticetitleLabel.setBounds(350,30,525,50);
		whilepracticetitleLabel.setFont(new Font("Georgia",Font.BOLD,45));
		whilepracticetitleLabel.setHorizontalTextPosition(JLabel.CENTER);
		whilepracticetitleLabel.setVerticalTextPosition(JLabel.BOTTOM);
		whilepracticetitleLabel.setForeground(Color.white);  
		whilepracticetitleLabel.setBackground(Color.decode("#152238"));
		whilepracticetitleLabel.setHorizontalAlignment(SwingConstants.CENTER);             
		whilepracticetitleLabel.setVerticalAlignment(SwingConstants.NORTH);       
		whilepracticetitleLabel.setOpaque(false);
		whilepracticetitleLabel.setVisible(true); 
		whilePracticePanel.add(whilepracticetitleLabel);

		//creating the instruction label 
		whiledescription2Label.setText("<html> In this section, you will get the chance to practice coding while loop structures. Click the question button"
				+ " on the left side to see your practice question. You can type your answers in the text area below,"
				+ " and then copy and paste it into your Eclipse to see if it works. We have also included a solution "
				+ " option underneath the question to see if your code is similar. Remember there are many ways to"
				+ " code a program, and with practice you will learn the most efficient way to do so. </html>");
		whiledescription2Label.setBounds(350,80,525,100);
		whiledescription2Label.setFont(new Font("Calibri",Font.PLAIN,12));
		whiledescription2Label.setForeground(Color.white);
		whiledescription2Label.setHorizontalTextPosition(JLabel.CENTER);
		whiledescription2Label.setVerticalTextPosition(JLabel.CENTER);
		whiledescription2Label.setHorizontalAlignment(SwingConstants.CENTER);             
		whiledescription2Label.setVerticalAlignment(SwingConstants.CENTER);
		whiledescription2Label.setOpaque(false);
		whiledescription2Label.setVisible(true);
		whilePracticePanel.add(whiledescription2Label);

		//setting up the text field area 
		whiletextArea.setBounds(350,200,525,325);	
		whiletextArea.setFont(new Font("Calibri",Font.PLAIN,12));
		whiletextArea.setForeground(Color.white);
		whiletextArea.setBackground(Color.decode("#6A8D92"));
		whilePracticePanel.add(whiletextArea);

		//setting up the main window 
		whilePracticeFrame.setTitle("While Loop Structure: Practice");
		whilePracticeFrame.setResizable(false);
		whilePracticeFrame.setSize(900,600); 
		ImageIcon image = new ImageIcon("images/logo.png"); 
		whilePracticeFrame.setIconImage(image.getImage()); 		
		whilePracticeFrame.getContentPane().setBackground(Color.decode("#152238"));
		whilePracticeFrame.setVisible(true);
		whilePracticeFrame.add(whilePracticePanel);	
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//giving the continue button an action 
		if(e.getSource() == continueButton) {
			RepetitionIntro();
		}
		
		else if(e.getSource()==ifButton) {
			IfLesson();
		}
		
		else if(e.getSource() == ifpracticeButton) {
			IfPractice(); 
		}
		
		else if (e.getSource() == ifq1Button) {
			JOptionPane.showMessageDialog(this,"Write a program that reads an integer from the user and "
					+ "\r\n determines if the integer is odd or even.","Question 1",JOptionPane.INFORMATION_MESSAGE);
		}
		
		else if (e.getSource() == ifq1solButton) {
			JFrame ifq1Frame = new JFrame();
			JLabel ifq1Label = new JLabel();
			ImageIcon ifq1sol = new ImageIcon("images/ifquestion1.png"); 
			ifq1Label.setIcon(ifq1sol);
			ifq1Frame.add(ifq1Label);
			ifq1Frame.setTitle("Question 1 Solution");
			ifq1Frame.pack(); 
			ifq1Frame.setVisible(true); 
		}
		
		else if (e.getSource() == ifq2Button) {
			JOptionPane.showMessageDialog(this,"If a student received a grade of 82, determine what letter grade they received"
					+ "\r\n by creating a program that uses an if structure. Use the legend below to create"
					+ "\r\n your conditions. "
					+ "\r\n A:>=90 & <=100, B:>=80 & <=89, C:>=70 & <=79, D: >=60 & <=69 & F:<=59","Question 2",JOptionPane.INFORMATION_MESSAGE);
		}
		
		else if (e.getSource() == ifq2solButton) {
			JFrame ifq2Frame = new JFrame();
			JLabel ifq2Label = new JLabel();
			ImageIcon ifq2sol = new ImageIcon("images/ifquestion2.png"); 
			ifq2Label.setIcon(ifq2sol);
			ifq2Frame.add(ifq2Label);
			ifq2Frame.setTitle("Question 2 Solution");
			ifq2Frame.pack(); 
			ifq2Frame.setVisible(true); 
		}
		
		else if (e.getSource() == ifquizButton) {
			new IfQuiz();
		}
		
		else if (e.getSource() == forButton) {
			ForLesson();
		}
		
		else if (e.getSource() == forpracticeButton) {
			ForPractice();
		}

		else if (e.getSource() == forq1Button) {
			JOptionPane.showMessageDialog(this,"Write a program that uses a for loop strucuture to print even"
					+ "\r\n numbers between 1 and 100 in an increasing order.","Question 1",JOptionPane.INFORMATION_MESSAGE);
		}

		else if (e.getSource() == forq1solButton) {
			JFrame ifq1Frame = new JFrame();
			JLabel ifq1Label = new JLabel();
			ImageIcon ifq1sol = new ImageIcon("images/forquestion1.png"); 
			ifq1Label.setIcon(ifq1sol);
			ifq1Frame.add(ifq1Label);
			ifq1Frame.setTitle("Question 1 Solution");
			ifq1Frame.pack(); 
			ifq1Frame.setVisible(true); 
		}

		else if (e.getSource() == forq2Button) {
			JOptionPane.showMessageDialog(this,"Write a program that prompts the user to input a positive"
					+ "\r\n integer. It should then print the multiplication table of that number.","Question 2",JOptionPane.INFORMATION_MESSAGE);
		}

		else if (e.getSource() == forq2solButton) {
			JFrame ifq2Frame = new JFrame();
			JLabel ifq2Label = new JLabel();
			ImageIcon ifq2sol = new ImageIcon("images/forquestion2.png"); 
			ifq2Label.setIcon(ifq2sol);
			ifq2Frame.add(ifq2Label);
			ifq2Frame.setTitle("Question 2 Solution");
			ifq2Frame.pack(); 
			ifq2Frame.setVisible(true); 
		}
		
		else if (e.getSource() == forquizButton) {
			new ForQuiz();
		}
		
		else if (e.getSource() == whileButton) {
			WhileLesson();
		}
		else if (e.getSource() == whilepracticeButton) {
			WhilePractice();
		}
		
		else if (e.getSource() == whileq1Button) {
			JOptionPane.showMessageDialog(this,"Using a while loop, write a program that display numbers"
					+ "\r\n from number 1 to 10","Question 1",JOptionPane.INFORMATION_MESSAGE);
		}

		else if (e.getSource() == whileq1solButton) {
			JFrame ifq1Frame = new JFrame();
			JLabel ifq1Label = new JLabel();
			ImageIcon ifq1sol = new ImageIcon("images/whilequestion1.png"); 
			ifq1Label.setIcon(ifq1sol);
			ifq1Frame.add(ifq1Label);
			ifq1Frame.setTitle("Question 1 Solution");
			ifq1Frame.pack(); 
			ifq1Frame.setVisible(true); 
		}

		else if (e.getSource() == whileq2Button) {
			JOptionPane.showMessageDialog(this,"Write a program that prompts the user to enter a number greater than 0."
					+ "\r\n It should print the sum of the numbers until the user enters 0.","Question 2",JOptionPane.INFORMATION_MESSAGE);
		}

		else if (e.getSource() == whileq2solButton) {
			JFrame ifq2Frame = new JFrame();
			JLabel ifq2Label = new JLabel();
			ImageIcon ifq2sol = new ImageIcon("images/whilequestion2.png"); 
			ifq2Label.setIcon(ifq2sol);
			ifq2Frame.add(ifq2Label);
			ifq2Frame.setTitle("Question 2 Solution");
			ifq2Frame.pack(); 
			ifq2Frame.setVisible(true); 
		}
		
		else if (e.getSource() == whilequizButton) {
			new WhileQuiz();
		}
	
	}
}

	