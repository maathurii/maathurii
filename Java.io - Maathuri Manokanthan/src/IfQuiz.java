import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 

public class IfQuiz implements ActionListener{ 
	
	//creating the multiple choice questions 
	String[] questions = {
								"The 'If' statement is an example of a",
								"What is the purpose of an if statement?",
								"How many 'if' statements can a single program have?", 
								"The body of an 'if' statement will only be executed if the condition is true.",
								"What happens to the code in the body of an 'if' statement if the condition is false?"
						 };

	//setting up the choices for the quiz		
	String[][] options = {
								{"correctional statement", "competitive statement", "repetition statement", "inquisitive statement"},		
								{"increase program speed", "allow program to skip code", "allow program to repeat code", "save time coding"},
								{"one","as many as you need", "none", "fifteen"},
								{"always","most of the time", "sometimes", "never"},
								{"code is executed", "code ends", "code resets", "code is skipped"},	
						 };

	//setting up the correct answers for the quiz
	char[] answers = 	 {
								'C',
								'C',
								'B',
								'A',
								'D'
						 };
	
	//initializing the other variables 
	char guess; 
	char answer; 
	int index; 
	int correct_guesses = 0; 
	int total_questions = questions.length; 
	int result; 
	
	//setting up the GUI features
	JFrame ifQuizFrame = new JFrame(); 
	JPanel ifQuizPanel = new JPanel();
	JPanel resultsPanel = new JPanel();
	JTextField textfield = new JTextField(); 
	JTextArea textarea = new JTextArea(); 
	JButton buttonA = new JButton();
	JButton buttonB = new JButton();
	JButton buttonC = new JButton();
	JButton buttonD = new JButton();
	JLabel answer_labelA = new JLabel(); 
	JLabel answer_labelB = new JLabel(); 
	JLabel answer_labelC = new JLabel(); 
	JLabel answer_labelD = new JLabel(); 
	JLabel seconds_left = new JLabel(); 
	JTextField number_right = new JTextField(); 
	JTextField percentage = new JTextField(); 
	
	public IfQuiz() {
		//setting up the main frame for the quiz
		ifQuizFrame.setTitle("If Structure: Quiz");
		ifQuizFrame.setResizable(false);
		ifQuizFrame.setSize(900,600); 
		ImageIcon image = new ImageIcon("images/logo.png"); 
		ifQuizFrame.setIconImage(image.getImage()); 		
		ifQuizFrame.getContentPane().setBackground(Color.decode("#152238"));
		
		//display the question number 
		textfield.setBounds(0,0,870,65); 
		textfield.setFont(new Font("Georgia",Font.BOLD,45));
		textfield.setForeground(Color.white);
		textfield.setBackground(Color.decode("#152238"));
		textfield.setBorder(BorderFactory.createLineBorder(Color.decode("#152238")));
		textfield.setHorizontalAlignment(JTextField.CENTER);
		textfield.setEditable(false);
		ifQuizFrame.add(textfield);
		
		//display the question  
		textarea.setBounds(10,70,870,60); 
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		textarea.setFont(new Font("Times New Roman",Font.PLAIN,25));
		textarea.setForeground(Color.white);
		textarea.setBorder(BorderFactory.createLineBorder(Color.decode("#152238")));
		textarea.setBackground(Color.decode("#152238"));
		textarea.setEditable(false);
		ifQuizFrame.add(textarea);
		
		//creating the panel to add the multiple choice questions and the labels for
		ifQuizPanel.setBounds(0,125,900,475);
		ifQuizPanel.setLayout(null);
		ifQuizPanel.setOpaque(false);
		
		//creating the buttons for the multiple choice questions 
		buttonA.setBounds(10,125,100,100);
		buttonA.setFont(new Font("Georgia",Font.BOLD,45));
		buttonA.setFocusable(false);
		buttonA.addActionListener(this);
		buttonA.setForeground(Color.white);
		buttonA.setBackground(Color.decode("#405865"));
		buttonA.setText("A");

		buttonB.setBounds(10,235,100,100);
		buttonB.setFont(new Font("Georgia",Font.BOLD,45));
		buttonB.setFocusable(false);
		buttonB.addActionListener(this);
		buttonB.setForeground(Color.white);
		buttonB.setBackground(Color.decode("#405865"));
		buttonB.setText("B");

		buttonC.setBounds(10,345,100,100);
		buttonC.setFont(new Font("Georgia",Font.BOLD,45));
		buttonC.setFocusable(false);
		buttonC.addActionListener(this);
		buttonC.setForeground(Color.white);
		buttonC.setBackground(Color.decode("#405865"));
		buttonC.setText("C");

		buttonD.setBounds(10,455,100,100);
		buttonD.setFont(new Font("Georgia",Font.BOLD,45));
		buttonD.setFocusable(false);
		buttonD.addActionListener(this);
		buttonD.setForeground(Color.white);
		buttonD.setBackground(Color.decode("#405865"));
		buttonD.setText("D");
		
		ifQuizPanel.add(buttonA);
		ifQuizPanel.add(buttonB);
		ifQuizPanel.add(buttonC);
		ifQuizPanel.add(buttonD);

		//creating the multiple choice answer labels
		answer_labelA.setBounds(130,125,500,100); 
		answer_labelA.setBackground(Color.decode("#405865"));
		answer_labelA.setForeground(Color.white);
		answer_labelA.setFont(new Font("Georgia",Font.PLAIN,30));

		answer_labelB.setBounds(130,235,500,100); 
		answer_labelB.setBackground(Color.decode("#405865"));
		answer_labelB.setForeground(Color.white);
		answer_labelB.setFont(new Font("Georgia",Font.PLAIN,30));

		answer_labelC.setBounds(130,345,500,100); 
		answer_labelC.setBackground(Color.decode("#405865"));
		answer_labelC.setForeground(Color.white);
		answer_labelC.setFont(new Font("Georgia",Font.PLAIN,30));

		answer_labelD.setBounds(130,455,500,100); 
		answer_labelD.setBackground(Color.decode("#405865"));
		answer_labelD.setForeground(Color.white);
		answer_labelD.setFont(new Font("Georgia",Font.PLAIN,30));
		
		ifQuizPanel.add(answer_labelA);
		ifQuizPanel.add(answer_labelB);
		ifQuizPanel.add(answer_labelC);
		ifQuizPanel.add(answer_labelD);

		//setting up the final score 
		number_right.setBounds(350,200,200,100);
		number_right.setBackground(Color.decode("#152238"));
		number_right.setForeground(Color.white);
		number_right.setFont(new Font("Georgia",Font.BOLD,70));
		number_right.setBorder(BorderFactory.createLineBorder(Color.decode("#152238")));
		number_right.setHorizontalAlignment(JTextField.CENTER);
		number_right.setEditable(false);
		resultsPanel.add(number_right);
		
		//setting up the percentage 
		percentage.setBounds(350,300,200,100);
		percentage.setBackground(Color.decode("#152238"));
		percentage.setForeground(Color.white);
		percentage.setFont(new Font("Georgia",Font.BOLD,70));
		percentage.setBorder(BorderFactory.createLineBorder(Color.decode("#152238")));
		percentage.setHorizontalAlignment(JTextField.CENTER);
		percentage.setEditable(false);
		resultsPanel.add(percentage);

		ifQuizFrame.add(ifQuizPanel);
		ifQuizFrame.setVisible(true);
		
		nextQuestion();
	}
	
	public void nextQuestion() {
		//this if structure allows the questions to change 
		if(index>=total_questions) {
			results();
		}
		else {
			textfield.setText("Question "+(index+1));
			textarea.setText(questions[index]);
			answer_labelA.setText(options[index][0]);
			answer_labelB.setText(options[index][1]);
			answer_labelC.setText(options[index][2]);
			answer_labelD.setText(options[index][3]);
		}
	}
	
	@Override 
	public void actionPerformed(ActionEvent e) { 
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);

		if(e.getSource() == buttonA) {
			answer= 'A';
			if(answer == answers[index]) {
				correct_guesses++;
			}
		}

		if(e.getSource() == buttonB) {
			answer= 'B';
			if(answer == answers[index]) {
				correct_guesses++;
			}
		}

		if(e.getSource() == buttonC) {
			answer= 'C';
			if(answer == answers[index]) {
				correct_guesses++;
			}
		}

		if(e.getSource() == buttonD) {
			answer= 'D';
			if(answer == answers[index]) {
				correct_guesses++;
			}
		}
		displayAnswer();
	}
	
	public void displayAnswer() { 
		
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		if (answers[index] != 'A')
			answer_labelA.setForeground(new Color(255,0,0));
		if (answers[index] != 'B')
			answer_labelB.setForeground(new Color(255,0,0));
		if (answers[index] != 'C')
			answer_labelC.setForeground(new Color(255,0,0));
		if (answers[index] != 'D')
			answer_labelD.setForeground(new Color(255,0,0));
		
		Timer pause = new Timer(1000, new ActionListener() {
			
			@Override 
			public void actionPerformed(ActionEvent e) {
				answer_labelA.setForeground(Color.white);
				answer_labelB.setForeground(Color.white);
				answer_labelC.setForeground(Color.white);
				answer_labelD.setForeground(Color.white);
				
				answer = ' ';
				buttonA.setEnabled(true);
				buttonB.setEnabled(true);
				buttonC.setEnabled(true);
				buttonD.setEnabled(true);
				index++;
				nextQuestion(); 
			}
		});
		pause.setRepeats(false);
		pause.start();
	}
	
	public void results() {
		
		//setting up the results panel 
		resultsPanel.setBounds(0,125,870,785);
		resultsPanel.setBackground(Color.decode("#152238"));
		resultsPanel.setOpaque(true);
		resultsPanel.setLayout(null);
		
		buttonA.setEnabled(false);
		buttonA.setVisible(false);
		
		buttonB.setEnabled(false);
		buttonB.setVisible(false);

		buttonC.setEnabled(false);
		buttonC.setVisible(false);

		buttonD.setEnabled(false);
		buttonD.setVisible(false);

		result = (int)((correct_guesses/(double)total_questions)*100);
		
		textfield.setText("RESULTS");
		textarea.setText("");
		answer_labelA.setText("");
		answer_labelB.setText("");
		answer_labelC.setText("");
		answer_labelD.setText("");
		
		number_right.setText(correct_guesses + "/" + total_questions);
		percentage.setText(result+"%");
		
		ifQuizFrame.add(resultsPanel);
	}
	
}