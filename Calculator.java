//import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// import java frameworks  


import javax.swing.*;


public class Calculator implements ActionListener
{
	
	double number, answer;
	int calculation;
	
	JFrame frame;
	JTextField text;
	JPanel panel;
	
	JLabel label ;

	// mentioned button patterns
	JRadioButton onRadioButton = new JRadioButton("on");
    JRadioButton offRadioButton = new JRadioButton("off");
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("<~");
    JButton buttonEqual = new JButton("=");
    JButton buttonMultiple = new JButton("x");
    JButton buttonDivide = new JButton("/");
    JButton buttonAdd = new JButton("+");
    JButton buttonSubtract = new JButton("-");
    JButton buttonSquare = new JButton("x\u00B2");
    JButton buttonReciprocal = new JButton("1/x");
    JButton buttonSqrt = new JButton("\u221A");
    JButton buttonCubrt = new JButton("x\u00B3");
    JButton buttonPI = new JButton("\u03C0");

	Calculator()
	{
		prepareWindow();     // function passed in constructor
		addComponents();
		addActionEvent();
	}
	    public void prepareWindow() {
		frame = new JFrame();
        frame.setTitle(" Calculator ");
        frame.setSize(523,523);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

		public void addComponents() //  Window Package
		{
		
		text = new JTextField();
		text.setBounds(0,40,500,40);
		text.setEditable(false);
		text.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.add(text);
		
		label= new JLabel(" Viyas ");
		frame.add(label);
		label.setBounds(250, 0, 80, 50);
		label.setForeground(Color.white);
		
		
		panel = new JPanel(new GridLayout(5,4,5,8));
		frame.add(panel);
		panel.setBounds(0,110,500,370);
		panel.setBackground(Color.black);
		
		
//	button UIs 
		panel.add(buttonSeven);  //7
		buttonSeven.setBackground(Color.red);
		buttonSeven.setForeground(Color.white);
		buttonSeven.setFont(new Font("Times New Roman",Font.BOLD,23));
		
		panel.add(buttonEight); //8
	    buttonEight.setBackground(Color.red);
		buttonEight.setForeground(Color.white);
	    buttonEight.setFont(new Font("Times New Roman",Font.BOLD,23));
	    
	    
	    panel.add(buttonNine);  //9
	    buttonNine.setBackground(Color.red);
		buttonNine.setForeground(Color.white);
	    buttonNine.setFont(new Font("Times New Roman",Font.BOLD,23));
	    
	    panel.add(onRadioButton); // on
	    onRadioButton.setBackground(Color.black);
	    onRadioButton.setForeground(Color.white);
	    onRadioButton.setFont(new Font("Digital",Font.BOLD,23));
	    
	    panel.add(offRadioButton); //off
	    offRadioButton.setBackground(Color.black);
	    offRadioButton.setForeground(Color.white);
	    offRadioButton.setFont(new Font("Digital",Font.BOLD,23));
	   
	    panel.add(buttonFour); //4
	    buttonFour.setBackground(Color.red);
		buttonFour.setForeground(Color.white);
	    buttonFour.setFont(new Font("Times New Roman",Font.BOLD,23));
	    
	    panel.add(buttonFive); //5
	    buttonFive.setBackground(Color.red);
		buttonFive.setForeground(Color.white);
	    buttonFive.setFont(new Font("Times New Roman",Font.BOLD,23));
	    
	    panel.add(buttonSix);  //6
	    buttonSix.setBackground(Color.red);
		buttonSix.setForeground(Color.white);
	    buttonSix.setFont(new Font("Times New Roman",Font.BOLD,23));
	    
	    panel.add(buttonAdd);  //+ 
	    buttonAdd.setBackground(Color.red);
		buttonAdd.setForeground(Color.white);
	    buttonAdd.setFont(new Font("Digital",Font.BOLD,23));
	    
	    panel.add(buttonSubtract); // -
	    buttonSubtract.setBackground(Color.red);
		buttonSubtract.setForeground(Color.white);
	    buttonSubtract.setFont(new Font("Digital",Font.BOLD,23));
	    
	     
	    panel.add(buttonOne); //1	    
	    buttonOne.setBackground(Color.red);
		buttonOne.setForeground(Color.white);
	    buttonOne.setFont(new Font("Times New Roman",Font.BOLD,23));
	    
	    panel.add(buttonTwo); //2
	    buttonTwo.setBackground(Color.red);
		buttonTwo.setForeground(Color.white);
	    buttonTwo.setFont(new Font("Times New Roman",Font.BOLD,23));
	    
	    
	    panel.add(buttonThree);//3
	    buttonThree.setBackground(Color.red);
		buttonThree.setForeground(Color.white);
	    buttonThree.setFont(new Font("Times New Roman",Font.BOLD,23));
	    
	    panel.add(buttonDivide); //  "/"
	    buttonDivide.setBackground(Color.red);
		buttonDivide.setForeground(Color.white);
	    buttonDivide.setFont(new Font("Digital",Font.BOLD,23));
	    
	    panel.add(buttonMultiple); // "*"
	    buttonMultiple.setBackground(Color.red);
		buttonMultiple.setForeground(Color.white);
	    buttonMultiple.setFont(new Font("Digital",Font.BOLD,23));
	    
	    
	    panel.add(buttonDot); // "."
	    buttonDot.setBackground(Color.red);
		buttonDot.setForeground(Color.white);
	    buttonDot.setFont(new Font("Digital",Font.BOLD,23));
	    
	    
	    panel.add(buttonZero);// 0
	    buttonZero.setBackground(Color.red);
		buttonZero.setForeground(Color.white);
	    buttonZero.setFont(new Font("Times New Roman",Font.BOLD,23));
	    
	    
	    panel.add(buttonEqual); // =
	    buttonEqual.setBackground(Color.red);
		buttonEqual.setForeground(Color.white);
	    buttonEqual.setFont(new Font("Digital",Font.BOLD,23));
	    
	    
	    panel.add(buttonClear); // clear
	    buttonClear.setBackground(Color.red);
		buttonClear.setForeground(Color.white);
	    buttonClear.setFont(new Font("Digital",Font.BOLD,23));
	    
	    
	    panel.add(buttonDelete);// Delete
	    buttonDelete.setBackground(Color.red);
		buttonDelete.setForeground(Color.white);
	    buttonDelete.setFont(new Font("Digital",Font.BOLD,23));
	    
	    panel.add(buttonSquare); // Square
	    buttonSquare.setBackground(Color.red);
		buttonSquare.setForeground(Color.white);
	    buttonSquare.setFont(new Font("Digital",Font.BOLD,23));
	    
	    panel.add(buttonSqrt); // Square root
		buttonSqrt.setBackground(Color.red);
		buttonSqrt.setForeground(Color.white);
		buttonSqrt.setFont(new Font("Digital",Font.BOLD,23));
		
		panel.add(buttonReciprocal); // Reciprocal
		buttonReciprocal.setBackground(Color.red);
		buttonReciprocal.setForeground(Color.white);
		buttonReciprocal.setFont(new Font("Digital",Font.BOLD,23));
		
		panel.add(buttonCubrt);// Cube Root
		buttonCubrt.setBackground(Color.red);
		buttonCubrt.setForeground(Color.white);
		buttonCubrt.setFont(new Font("Digital",Font.BOLD,23));
		
		panel.add(buttonPI); // PI
		buttonPI.setBackground(Color.red);
		buttonPI.setForeground(Color.white);
		buttonPI.setFont(new Font("Digital",Font.BOLD,23));
		
	
	}
	
		public void addActionEvent()   // actionEvent_Perfomed 
		{
			onRadioButton.addActionListener(this);     
	        // ON_OFF_Function
	        offRadioButton.addActionListener(this);
	        buttonClear.addActionListener(this);
	        buttonDelete.addActionListener(this);
	        buttonEqual.addActionListener(this);	        
	        buttonSqrt.addActionListener(this);          
	        buttonSquare.addActionListener(this);
	        buttonReciprocal.addActionListener(this);
	        buttonCubrt.addActionListener(this);
	        buttonMultiple.addActionListener(this);
	        buttonAdd.addActionListener(this);
	        buttonDivide.addActionListener(this);
	        buttonSubtract.addActionListener(this);
	        // mathamatical_Functions
	        buttonSeven.addActionListener(this);
	        buttonEight.addActionListener(this);
	        buttonNine.addActionListener(this);        
	        buttonFour.addActionListener(this);
	        buttonFive.addActionListener(this);
	        buttonSix.addActionListener(this);
	        buttonOne.addActionListener(this);
	        buttonTwo.addActionListener(this);
	        buttonThree.addActionListener(this);
	        buttonZero.addActionListener(this);
	        buttonDot.addActionListener(this);
	        buttonPI.addActionListener(this);
            // Number_Pattern
//	        this.add(panel);
		}
		
	public void add(JPanel panel2) 
	{
				this.add(panel);
	}


	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object source = e.getSource();
		
		if (source == buttonOne) 
		{
            text.setText(text.getText() + "1");
        }
		if (source == buttonTwo)
		{
			text.setText(text.getText()+"2");
		}
		if(source == buttonThree)
		{
			text.setText(text.getText()+"3");
		}
		if(source == buttonFour)
		{
			text.setText(text.getText()+"4");
		}
		if(source == buttonFive)
		{
			text.setText(text.getText()+"5");
		}
		if(source == buttonSix)
		{
			text.setText(text.getText()+"6");
		}
		if(source == buttonSeven)
		{
			text.setText(text.getText()+"7");
		}
		if(source == buttonEight)
		{
			text.setText(text.getText()+"8");
		}
		if(source == buttonNine)
		{
			text.setText(text.getText()+"9");
		}
		if (source == buttonZero) 
		{
            if (text.getText().equals("0")) {
                return;
            } else {
                text.setText(text.getText() + "0");
            }
		}
		if (source == buttonDot) 
		{
            if (text.getText().contains(".")) 
            {
                return;
            } else 
            {
                text.setText(text.getText() + ".");
            }
		}
////////////////////////////////////////////////////////////
		if(source == onRadioButton)
		{
			enable();
		}
		else if(source == offRadioButton)
		{
			disable();
		}
		else if(source == buttonClear)
		{
			label.setText("");
			text.setText("");
		}
		else if(source == buttonDelete)
		{
			int length = text.getText().length();
			int number = length - 1;
			
			
			if(length > 0)
			{
				StringBuilder back = new StringBuilder(text.getText());
                back.deleteCharAt(number);
                text.setText(back.toString());
			}
			if (text.getText().endsWith(""))
			   {
			     label.setText("");
			   }
		}
//////////////////////////////////////////////////////////////////////////////////		
		
		else if(source == buttonAdd)
		{
			String str = text.getText();
			number = Double.parseDouble(text.getText());
			text.setText("");
			label.setText(str + "+");
			calculation = 1;
		}
		else if(source == buttonSubtract)
		{
			String str = text.getText();
			number = Double.parseDouble(text.getText());
			text.setText("");
			label.setText(str + "-");
			calculation = 2;
		}
		else if(source == buttonMultiple)
		{
			String str = text.getText();
			number = Double.parseDouble(text.getText());
			text.setText("");
			label.setText(str + "X");
			calculation = 3;
		}
		else if(source == buttonDivide)
		{
			String str = text.getText();
			number = Double.parseDouble(text.getText());
			text.setText("");
			label.setText(str + "/");
			calculation = 4;
		}
		else if(source == buttonPI)
		{
			String str = text.getText();
			number = Double.parseDouble(text.getText());
		    final Double pi = 3.14*(number);
		    text.setText(Double.toString(pi));
		    label.setText("PI "+str);
		}
		
		else if(source == buttonSqrt)
		{
			String str = text.getText();
			number = Double.parseDouble(text.getText());
			Double sqrt = Math.sqrt(number);
			text.setText(Double.toString(sqrt));
			label.setText("squarert" +str);
		}
		else if(source == buttonCubrt)
		{
			String str = text.getText();
			number = Double.parseDouble(text.getText());
			Double cubrt = number*number*number;
			text.setText(Double.toString(cubrt));
			label.setText("cubert" + str);
		}
		
		else if(source == buttonSquare)
		{
			String str = text.getText();
			number = Double.parseDouble(text.getText());
			Double square = Math.pow(number, 2);
			String string = Double.toString(square);
			
			if(string.endsWith(".0"))
			{
				text.setText(string.replace(".0", ""));
			}else 
			{
				text.setText(string);
			}
			label.setText("sqaure" +str);		
		}
		else if(source == buttonReciprocal)
		{
			String str = text.getText();
			number = Double.parseDouble(text.getText());
			Double reciprocal = 1/number;
			String string = Double.toString(reciprocal);
			
			if(string.endsWith(".0"))
			{
				text.setText(string.replace(".0",""));
			}else {
				text.setText(string);
			}
			label.setText("reciprocal"+ str);
		}
		
		else if(source == buttonEqual)
		{
			switch(calculation)
			{
			case 1 :
			   answer = number + Double.parseDouble(text.getText());
			   if(Double.toString(answer).endsWith(".0"))
			   {
				   text.setText(Double.toString(answer).replace(".0",""));
			   }
			   else
			   {
				  text.setText(Double.toString(answer));   
			   }
			   label.setText("");
			   break;
			   
			   
			   
			case 2:
				answer = number - Double.parseDouble(text.getText());
				if(Double.toString(answer).endsWith(".0"))
				{
					text.setText(Double.toString(answer).replace(".0", ""));
				}else
				{
					text.setText(Double.toString(answer));
				}
				label.setText("");
				break;
				
			case 3:
				answer = number * Double.parseDouble(text.getText());
				if(Double.toString(answer).endsWith(".0"))
				{
					text.setText(Double.toString(answer).replace(".0", ""));
				}else
				{
					text.setText(Double.toString(answer));
				}
				label.setText("");
				break;
				
			case 4:
				answer = number / Double.parseDouble(text.getText());
				if(Double.toString(answer).endsWith(".0"))
				{
					text.setText(Double.toString(answer).replace(".0", ""));
				}else
				{
					text.setText(Double.toString(answer));
				}
				label.setText("");
				break;
			}
		}
		
	
}
	public void enable()
	{  // OnButton Perform to enable blow pattern
		onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        text.setEnabled(true);
        label.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonDivide.setEnabled(true);
        buttonSqrt.setEnabled(true);
        buttonSquare.setEnabled(true);
        buttonCubrt.setEnabled(true);
        buttonReciprocal.setEnabled(true);
        buttonPI.setEnabled(true);
        buttonSubtract.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonMultiple.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonAdd.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonZero.setEnabled(true);
        buttonDot.setEnabled(true);
	}
	public void disable()
	{  // OffButton Perform to disable Function
		onRadioButton.setEnabled(true);
        offRadioButton.setEnabled(false);
        text.setText("");
        label.setText(" ");
        buttonClear.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonDivide.setEnabled(false);
        buttonSqrt.setEnabled(false);
        buttonSquare.setEnabled(false);
        buttonCubrt.setEnabled(false);
        buttonPI.setEnabled(false);
        buttonReciprocal.setEnabled(false);
        buttonSubtract.setEnabled(false);
        buttonSeven.setEnabled(false);
        buttonEight.setEnabled(false);
        buttonNine.setEnabled(false);
        buttonMultiple.setEnabled(false);
        buttonFour.setEnabled(false);
        buttonFive.setEnabled(false);
        buttonSix.setEnabled(false);
        buttonAdd.setEnabled(false);
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonZero.setEnabled(false);
        buttonDot.setEnabled(false);
	}
public static void main(String args[])
{
	new Calculator();
}
}

// this application make smooth and better