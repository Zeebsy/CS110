import java.awt.*;
import javax.swing.*;

public class WarGUI extends JFrame {
	private GameOfWar game; //The game
	private JPanel topPanel,picPanel;  // break up regions
	private JLabel title;   // static title
	private JLabel p1Cards, p2Cards;
	private JButton button;
	
	public WarGUI() {
		game = new GameOfWar();
      	topPanel = new JPanel();
      	topPanel.setBackground(Color.blue);
      	picPanel = new JPanel(new FlowLayout());
      	button = new JButton();
      	button.addActionListener(this);
        topPanel.add(button);
	 
            public void actionPerformed(ActionEvent e)
            {
            	
            }
      	}
	}
	
//class WarGUI extends JFrame
//{
//  public WarGUI()
//  {
//    setLocation(400,300);
//    setDefaultCloseOperation(EXIT_ON_CLOSE);
//    JPanel main = new JPanel(new BorderLayout());
//    JPanel top = new JPanel(new GridLayout(1,2));
//    top.setIcon(new ImageIcon("jacks.jpeg"));
//    top.setIcon(new ImageIcon("aceh.jpeg"));
//    JPanel bottom = new JPanel();
//    bottom.add(new JLabel("JLabel 1"));
//    bottom.add(new JButton("JButton"));
//    bottom.add(new JLabel("JLabel 2"));
//    main.add(top,BorderLayout.CENTER);
//    main.add(bottom,BorderLayout.SOUTH);
//    getContentPane().add(main);
//    pack();
//  }
//  public static void main(String[] args){new WarGUI().setVisible(true);}
//}
