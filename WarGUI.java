import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class WarGUI extends JFrame implements ActionListener {
	private GameOfWar game; //The game
	private JPanel topPanel,picPanel;  // break up regions
	private JLabel title;   // static title
   private JPanel main;
	private JLabel p1Cards, p2Cards;
	private JButton button;
   private ImageIcon image, image2;
	
	public WarGUI() {
      setLayout(new GridLayout(3,3));

      // setLayout(new BorderLayout());
		game = new GameOfWar();
      topPanel = new JPanel();
   	topPanel.setBackground(Color.blue);
   	picPanel = new JPanel();
      picPanel.setBackground(Color.green);
      
   	//Creates title, sets font, adds the title to the top Panel
      title = new JLabel("WAR! Click flip to play!");
      title.setFont(new Font("ARIAL",Font.BOLD,36));
      topPanel.add(title);
      
      //Creates the button, adds a listener, adds it to the top panel
      button = new JButton("Flip!");
   	button.addActionListener(this);
      topPanel.add(button);
      
      //Creates and posts the jpg photos. Player 1 on the right, player 2 on the left
      image = new ImageIcon(game.p1.getCardImage()); 
      JLabel imageLabel = new JLabel(image);
      picPanel.add(imageLabel); 
      
      image2 = new ImageIcon(game.p1.getCardImage()); 
      JLabel imageLabel2 = new JLabel(image2);
      picPanel.add(imageLabel2); 
	   
      add(topPanel);
      add(picPanel);
      
      }
      
   public void actionPerformed(ActionEvent e)
   {
      if (e.getSource().equals(button)) {
         game.flip();
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
