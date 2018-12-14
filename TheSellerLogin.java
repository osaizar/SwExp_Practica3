package TheSeller;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class TheSellerLogin extends JFrame {
    DB dabaBase = new DB();
    int contSales;
    int error = 0;
    private JButton jButton1;
    private JButton jButton10;
    private JButton jButton11;
    private JButton jButton12;
    private JButton jButton13;
    private JButton jButton14;
    private JButton jButton15;
  
    public TheSellerLogin() {
	initComponents();
	jPanel1.setVisible(true);
	jPanel2.setVisible(false);
	jPanel3.setVisible(false);
	jPanel4.setVisible(false);
	jPanel5.setVisible(false);
	jPanel6.setVisible(false);
	jPanel7.setVisible(false);
	jPanel8.setVisible(false);
    }
  
    private JButton jButton16;
    private JButton jButton17;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JButton jButton8;
    private JButton jButton9;
  
    private void initComponents() {
	jPanel1 = new JPanel();
	jLabel1 = new JLabel();
	jLabel2 = new JLabel();
	jTextField2 = new JTextField();
	jTextField1 = new JTextField();
	jButton8 = new JButton();
	jLabel12 = new JLabel();
	jButton17 = new JButton();
	jPanel2 = new JPanel();
	jButton2 = new JButton();
	jButton4 = new JButton();
	jButton3 = new JButton();
	jButton5 = new JButton();
	jScrollPane1 = new JScrollPane();
	jTextArea1 = new JTextArea();
	jButton10 = new JButton();
	jButton11 = new JButton();
	jLabel13 = new JLabel();
	jPanel3 = new JPanel();
	jLabel3 = new JLabel();
	jLabel4 = new JLabel();
	jButton1 = new JButton();
	jLabel18 = new JLabel();
	jPanel4 = new JPanel();
	jButton6 = new JButton();
	jButton7 = new JButton();
	jButton15 = new JButton();
	jLabel14 = new JLabel();
	jPanel5 = new JPanel();
	jLabel5 = new JLabel();
	jLabel6 = new JLabel();
	jTextField3 = new JTextField();
	jTextField4 = new JTextField();
	jButton9 = new JButton();
	jLabel15 = new JLabel();
	jPanel6 = new JPanel();
	jLabel7 = new JLabel();
	jLabel8 = new JLabel();
	jLabel9 = new JLabel();
	jLabel10 = new JLabel();
	jButton12 = new JButton();
	jButton13 = new JButton();
	jLabel16 = new JLabel();
	jPanel7 = new JPanel();
	jButton14 = new JButton();
	jScrollPane2 = new JScrollPane();
	jTextArea3 = new JTextArea();
	jLabel17 = new JLabel();
	jPanel8 = new JPanel();
	jButton16 = new JButton();
	jScrollPane3 = new JScrollPane();
	jTextArea4 = new JTextArea();
	jLabel11 = new JLabel();
	menuBar = new JMenuBar();
    
	setDefaultCloseOperation(3);
	setMinimumSize(new Dimension(466, 374));
	getContentPane().setLayout(null);
    
	jPanel1.setLayout(null);
    
	jLabel1.setText("User ID");
	jPanel1.add(jLabel1);
	jLabel1.setBounds(56, 90, 60, 14);
    
	jLabel2.setText("Password");
	jPanel1.add(jLabel2);
	jLabel2.setBounds(52, 130, 60, 14);
    
	jTextField2.setText(" ");
	jPanel1.add(jTextField2);
	jTextField2.setBounds(170, 130, 69, 20);
    
	jTextField1.setText(" ");
	jTextField1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		    TheSellerLogin.this.jTextField1ActionPerformed(evt);
		}
	    });
	jPanel1.add(jTextField1);
	jTextField1.setBounds(170, 90, 69, 20);
    
	jButton8.setText("Ok");
	jButton8.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		    TheSellerLogin.this.jButton8ActionPerformed(evt);
		}
	    });
	jPanel1.add(jButton8);
	jButton8.setBounds(270, 200, 80, 23);
    
	jLabel12.setIcon(new ImageIcon(getClass().getResource("/data/logo.png")));
	jPanel1.add(jLabel12);
	jLabel12.setBounds(50, -10, 360, 60);
    
	jButton17.setText("About");
	jButton17.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		    TheSellerLogin.this.jButton17ActionPerformed(evt);
		}
	    });
	jPanel1.add(jButton17);
	jButton17.setBounds(270, 270, 80, 23);
    
	getContentPane().add(jPanel1);
	jPanel1.setBounds(10, 11, 446, 331);
    
	jPanel2.setLayout(null);
    
	jButton2.setIcon(new ImageIcon(getClass().getResource("/data/1p.png")));
	jButton2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		    TheSellerLogin.this.jButton2ActionPerformed(evt);
		}
	    });
	jPanel2.add(jButton2);
	jButton2.setBounds(20, 210, 101, 89);
    
	jButton4.setIcon(new ImageIcon(getClass().getResource("/data/2p.png")));
	jButton4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		    TheSellerLogin.this.jButton4ActionPerformed(evt);
		}
	    });
	jPanel2.add(jButton4);
	jButton4.setBounds(130, 210, 120, 90);
    
	jButton3.setIcon(new ImageIcon(getClass().getResource("/data/3p.png")));
	jButton3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		    TheSellerLogin.this.jButton3ActionPerformed(evt);
		}
	    });
	jPanel2.add(jButton3);
	jButton3.setBounds(250, 210, 80, 90);
    
	jButton5.setIcon(new ImageIcon(getClass().getResource("/data/4p.png")));
	jButton5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		    TheSellerLogin.this.jButton5ActionPerformed(evt);
		}
	    });
	jPanel2.add(jButton5);
	jButton5.setBounds(340, 210, 80, 90);
    
	jTextArea1.setColumns(20);
	jTextArea1.setEditable(false);
	jTextArea1.setRows(5);
	jScrollPane1.setViewportView(jTextArea1);
    
	jPanel2.add(jScrollPane1);
	jScrollPane1.setBounds(20, 50, 270, 160);
    
	jButton10.setText("Cash box");
	jButton10.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		    TheSellerLogin.this.jButton10ActionPerformed(evt);
		}
	    });
	jPanel2.add(jButton10);
	jButton10.setBounds(300, 50, 90, 50);
    
	jButton11.setText("Finish");
	jButton11.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		    TheSellerLogin.this.jButton11ActionPerformed(evt);
		}
	    });
	jPanel2.add(jButton11);
	jButton11.setBounds(300, 110, 90, 60);
    
	jLabel13.setIcon(new ImageIcon(getClass().getResource("/data/logo.png")));
	jPanel2.add(jLabel13);
	jLabel13.setBounds(30, 0, 360, 60);
    
	getContentPane().add(jPanel2);
	jPanel2.setBounds(10, 10, 440, 330);
    
	jPanel3.setLayout(null);
    
	jLabel3.setText("An error has occurred. Please contact SalesAdmin");
	jPanel3.add(jLabel3);
	jLabel3.setBounds(80, 110, 430, 14);
    
	jLabel4.setIcon(new ImageIcon(getClass().getResource("/data/error.png")));
	jPanel3.add(jLabel4);
	jLabel4.setBounds(20, 90, 60, 60);
    
	jButton1.setText("Ok");
	jButton1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		    TheSellerLogin.this.jButton1ActionPerformed(evt);
		}
	    });
	jPanel3.add(jButton1);
	jButton1.setBounds(240, 140, 80, 23);
    
	jLabel18.setIcon(new ImageIcon(getClass().getResource("/data/logo.png")));
	jPanel3.add(jLabel18);
	jLabel18.setBounds(20, 10, 360, 60);
    
	getContentPane().add(jPanel3);
	jPanel3.setBounds(40, 20, 360, 240);
    
	jPanel4.setLayout(null);
    
	jButton6.setText("Users");
	jButton6.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		    TheSellerLogin.this.jButton6ActionPerformed(evt);
		}
	    });
	jPanel4.add(jButton6);
	jButton6.setBounds(150, 100, 90, 23);
    
	jButton7.setText("Sales");
	jButton7.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		    TheSellerLogin.this.jButton7ActionPerformed(evt);
		}
	    });
	jPanel4.add(jButton7);
	jButton7.setBounds(150, 140, 90, 23);
    
	jButton15.setText("Finish");
	jButton15.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		    TheSellerLogin.this.jButton15ActionPerformed(evt);
		}
	    });
	jPanel4.add(jButton15);
	jButton15.setBounds(150, 180, 90, 23);
    
	jLabel14.setIcon(new ImageIcon(getClass().getResource("/data/logo.png")));
	jPanel4.add(jLabel14);
	jLabel14.setBounds(30, 10, 360, 60);
    
	getContentPane().add(jPanel4);
	jPanel4.setBounds(10, 12, 440, 330);
    
	jPanel5.setLayout(null);
    
	jLabel5.setText("User ID");
	jPanel5.add(jLabel5);
	jLabel5.setBounds(56, 90, 60, 14);
    
	jLabel6.setText("Sales");
	jPanel5.add(jLabel6);
	jLabel6.setBounds(60, 130, 60, 14);
    
	jTextField3.setText(" ");
	jPanel5.add(jTextField3);
	jTextField3.setBounds(170, 130, 69, 20);
    
	jTextField4.setText(" ");
	jTextField4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		    TheSellerLogin.this.jTextField4ActionPerformed(evt);
		}
	    });
	jPanel5.add(jTextField4);
	jTextField4.setBounds(170, 90, 69, 20);
    
	jButton9.setText("Finish");
	jButton9.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		    TheSellerLogin.this.jButton9ActionPerformed(evt);
		}
	    });
	jPanel5.add(jButton9);
	jButton9.setBounds(270, 200, 80, 23);
    
	jLabel15.setIcon(new ImageIcon(getClass().getResource("/data/logo.png")));
	jPanel5.add(jLabel15);
	jLabel15.setBounds(30, 10, 360, 60);
    
	getContentPane().add(jPanel5);
	jPanel5.setBounds(10, 11, 446, 331);
    
	jPanel6.setLayout(null);
    
	jLabel7.setIcon(new ImageIcon(getClass().getResource("/data/1p.png")));
	jLabel7.setText("32 €");
	jPanel6.add(jLabel7);
	jLabel7.setBounds(40, 60, 110, 80);
    
	jLabel8.setIcon(new ImageIcon(getClass().getResource("/data/2p.png")));
	jLabel8.setText("75 €");
	jPanel6.add(jLabel8);
	jLabel8.setBounds(180, 60, 180, 93);
    
	jLabel9.setIcon(new ImageIcon(getClass().getResource("/data/4p.png")));
	jLabel9.setText("15 €");
	jPanel6.add(jLabel9);
	jLabel9.setBounds(190, 150, 130, 80);
    
	jLabel10.setIcon(new ImageIcon(getClass().getResource("/data/3p.png")));
	jLabel10.setText("10 €");
	jPanel6.add(jLabel10);
	jLabel10.setBounds(40, 150, 110, 87);
    
	jButton12.setText("Manage");
	jPanel6.add(jButton12);
	jButton12.setBounds(150, 230, 90, 23);
    
	jButton13.setText("Ok");
	jButton13.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		    TheSellerLogin.this.jButton13ActionPerformed(evt);
		}
	    });
	jPanel6.add(jButton13);
	jButton13.setBounds(260, 230, 90, 23);
    
	jLabel16.setIcon(new ImageIcon(getClass().getResource("/data/logo.png")));
	jPanel6.add(jLabel16);
	jLabel16.setBounds(30, 10, 360, 60);
    
	getContentPane().add(jPanel6);
	jPanel6.setBounds(10, 12, 440, 330);
    
	jPanel7.setLayout(null);
    
	jButton14.setText("Ok");
	jButton14.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		    TheSellerLogin.this.jButton14ActionPerformed(evt);
		}
	    });
	jPanel7.add(jButton14);
	jButton14.setBounds(270, 250, 80, 23);
    
	jTextArea3.setColumns(20);
	jTextArea3.setEditable(false);
	jTextArea3.setRows(5);
	jScrollPane2.setViewportView(jTextArea3);
    
	jPanel7.add(jScrollPane2);
	jScrollPane2.setBounds(50, 50, 300, 170);
    
	jLabel17.setIcon(new ImageIcon(getClass().getResource("/data/logo.png")));
	jPanel7.add(jLabel17);
	jLabel17.setBounds(20, 0, 360, 60);
    
	getContentPane().add(jPanel7);
	jPanel7.setBounds(10, 12, 440, 330);
    
	jPanel8.setLayout(null);
    
	jButton16.setText("Ok");
	jButton16.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		    TheSellerLogin.this.jButton16ActionPerformed(evt);
		}
	    });
	jPanel8.add(jButton16);
	jButton16.setBounds(280, 230, 80, 23);
    
	jTextArea4.setBackground(new Color(204, 204, 204));
	jTextArea4.setColumns(20);
	jTextArea4.setEditable(false);
	jTextArea4.setRows(5);
	jTextArea4.setText("This is an application prepared for\nthe Master in Cybersecurity provided \nby the Computer Security Lab (Cosec),\nUniversity Carlos III of Madrid");
	jScrollPane3.setViewportView(jTextArea4);
    
	jPanel8.add(jScrollPane3);
	jScrollPane3.setBounds(50, 100, 310, 100);
    
	jLabel11.setIcon(new ImageIcon(getClass().getResource("/data/logo.png")));
	jPanel8.add(jLabel11);
	jLabel11.setBounds(40, 10, 360, 60);
    
	getContentPane().add(jPanel8);
	jPanel8.setBounds(10, 12, 440, 330);
    
	menuBar.setMargin(new Insets(89, 32769, 32769, 32769));
	menuBar.setMinimumSize(new Dimension(89, 32769));
	setJMenuBar(menuBar);
    
	pack();
    }
  
    private void jTextField1ActionPerformed(ActionEvent evt) {}
  
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
  
    private void jButton2ActionPerformed(ActionEvent evt) {
	jTextArea1.append("Color ink      32€\n");
    }
  
    private JLabel jLabel12;
  
    private void jButton4ActionPerformed(ActionEvent evt) {
	jTextArea1.append("Printer      75€\n");
    }
  
    private JLabel jLabel13;
  
    private void jButton3ActionPerformed(ActionEvent evt) {
	jTextArea1.append("Back ink      10€\n");
    }
  
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel17;
  
    private void jButton5ActionPerformed(ActionEvent evt) {
	jTextArea1.append("Web cam      15€\n");
    }
  
    private JLabel jLabel18;
    private JLabel jLabel2;
    private JLabel jLabel3;
  
    private void jButton1ActionPerformed(ActionEvent evt) {
	if (error == 0) {
	    jPanel3.setVisible(false);
	    jPanel1.setVisible(true);
	} else if (error == 1) {
	    jPanel3.setVisible(false);
	    jPanel5.setVisible(true);
	} else if (error == 2) {
	    jPanel3.setVisible(false);
	    jPanel2.setVisible(true);
	}
    }
  
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
  
    //Login method
    private void jButton8ActionPerformed(ActionEvent evt) {
	String userID_name = jTextField1.getText().replaceAll(" ", "");
	String pass = jTextField2.getText().replaceAll(" ", "");

	/*
	 * We check if the given userId and password match an entry on the DB
	 * without checking first wrong cases
	 */
	if ((userID_name.equals("")) || (pass.equals(""))) {
	    jPanel3.setVisible(true);
	    jLabel3.setText("All fields should be completed");
	    jPanel1.setVisible(false);
	    cleanJPanel1();
	    error = 0;
	} else {
	    int[] results = dabaBase.login(userID_name);
	    int passDB = results[0];
	    int UserId = results[1];
	    int passInserted = Integer.parseInt(pass);
      
	    if ((userId=-1) || (passDB=-1)) {
		//The DB method sets '-1' as the default values, so if there has
		//been an error while searching for the username on the DB, this
		//case will be executed
		jPanel3.setVisible(true);
		jLabel3.setText("Invalid username");
		jPanel1.setVisible(false);
		cleanJPanel1();
		error = 0;
	    } else if (passInserted == passDB) {

		jPanel1.setVisible(false);

		if (UserId == 1) {
		    //Admin login
		    jPanel4.setVisible(true);
		} else {
		    //Regular user login
		    jPanel2.setVisible(true);
		}

		cleanJPanel1();
	    } else {
		jPanel3.setVisible(true);
		jLabel3.setText("Invalid password");
		jPanel1.setVisible(false);
		cleanJPanel1();
		error = 0;
	    }
	}
    }
  

    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;
  
    //This disrespecto to the pawa of regex needs to be fixed
    private boolean containsLetters(String word) {
	for (int i = 0; i < word.length(); i++) {
	    String character = String.valueOf(word.charAt(i));
	    if (character.matches("[a-zA-Z]")) {
		return true;
	    }
	}
	return false;
    }
    
    private JPanel jPanel6;
    private JPanel jPanel7;
    private JPanel jPanel8;
    private JScrollPane jScrollPane1;

    private void jButton10ActionPerformed(ActionEvent evt) {
	if (jTextArea1.getText().equals("")) {
	    jPanel3.setVisible(true);
	    jLabel3.setText("You should sell something");
	    jPanel2.setVisible(false);
	    error = 2;
	} else {
	    contSales += 1;
	    jTextArea1.setText("");
	}
    }
  
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JTextArea jTextArea1;
  
    private void jTextField4ActionPerformed(ActionEvent evt) {}
  
    // Sales method
    private void jButton9ActionPerformed(ActionEvent evt) {
	String userID = jTextField4.getText().replaceAll(" ", "");
	String sales = jTextField3.getText().replaceAll(" ", "");
	if (containsLetters(sales)) {
	    jPanel3.setVisible(true);
	    jLabel3.setText("Sales should contain numbers");
	    jPanel5.setVisible(false);
	    cleanJPanel5();
	    error = 1;
	} else {
	    int salesInt = Integer.parseInt(sales);
	    if (salesInt > 99) {
		jPanel3.setVisible(true);
		jLabel3.setText("Sales cannot exceed 99 per day");
		jPanel5.setVisible(false);
		cleanJPanel5();
		error = 1;
	    } else if (salesInt < 0) {
		jPanel3.setVisible(true);
		jLabel3.setText("Sales cannot be negative");
		jPanel5.setVisible(false);
		cleanJPanel5();
		error = 1;
	    } else if (salesInt > contSales) {
		jPanel3.setVisible(true);
		jLabel3.setText("Sales cannot exceed " + contSales);
		jPanel5.setVisible(false);
		cleanJPanel5();
		error = 1;
	    } else {
		dabaBase.updatePlus(userID, salesInt);
		contSales = 0;
		jPanel1.setVisible(true);
		jPanel5.setVisible(false);
		cleanJPanel5();
	    }
	}
    }
  
    private void jButton11ActionPerformed(ActionEvent evt) {
	jPanel5.setVisible(true);
	jPanel2.setVisible(false);
	cleanJPanel2();
	jTextField3.setText(String.valueOf(contSales));
    }
  
    private void jButton7ActionPerformed(ActionEvent evt) {
	jPanel6.setVisible(true);
	jPanel4.setVisible(false);
    }
  
    private void jButton13ActionPerformed(ActionEvent evt) {
	jPanel6.setVisible(false);
	jPanel4.setVisible(true);
    }
  
    private void jButton6ActionPerformed(ActionEvent evt) {
	jPanel4.setVisible(false);
	jPanel7.setVisible(true);
	LinkedList<LinkedList<String>> dataSales = dabaBase.selectAll();
	Iterator<LinkedList<String>> it = dataSales.iterator();
	String dataToScreen = "";
    
	while (it.hasNext()) {
	    LinkedList<String> listEachUser = (LinkedList)it.next();
	    Iterator<String> it2 = listEachUser.iterator();
	    int cont = 0;
	    while (it2.hasNext()) {
		if (cont == 0) {
		    dataToScreen = dataToScreen + "Name and surname: " + (String)it2.next() + " ";
		} else if (cont == 1) {
		    dataToScreen = dataToScreen + (String)it2.next() + "\n";
		} else if (cont == 2) {
		    dataToScreen = dataToScreen + "Profile: " + (String)it2.next() + "\n";
		} else if (cont == 3) {
		    dataToScreen = dataToScreen + "Sales: " + (String)it2.next() + "\n";
		} else if (cont == 4) {
		    dataToScreen = dataToScreen + "Plus: " + (String)it2.next() + "\n";
		}
		cont++;
	    }
	    dataToScreen = dataToScreen + "\n";
	}
	jTextArea3.setText(dataToScreen);
    }
  
    private void jButton14ActionPerformed(ActionEvent evt) {
	jPanel4.setVisible(true);
	jPanel7.setVisible(false);
	cleanJPanel7();
    }
  
    private void jButton15ActionPerformed(ActionEvent evt) {
	jPanel4.setVisible(false);
	jPanel1.setVisible(true);
    }
  
    private void jButton16ActionPerformed(ActionEvent evt) {
	jPanel8.setVisible(false);
	jPanel1.setVisible(true);
    }
  
    private void jButton17ActionPerformed(ActionEvent evt) {
	jPanel8.setVisible(true);
	jPanel1.setVisible(false);
    }
  
    public void cleanJPanel1() {
	jTextField1.setText("");
	jTextField2.setText("");
    }
  
    public void cleanJPanel7() { jTextArea3.setText(""); }
  
    public void cleanJPanel5() {
	jTextField4.setText("");
    }
  

    public void cleanJPanel2() { jTextArea1.setText(""); }
  
    private JTextArea jTextArea3;
    private JTextArea jTextArea4;
    private JTextField jTextField1;
  
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
		    new TheSellerLogin().setVisible(true);
		}
	    });
    }
  
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JMenuBar menuBar;
}
