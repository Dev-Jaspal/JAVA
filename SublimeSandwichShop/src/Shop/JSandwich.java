package Shop;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class JSandwich extends JFrame {

	private JPanel contentPane;
	private JList lstSandwich;
	private JList lstIngrident;
	private JList lstType;
	private String msg = " ";
	private int totalPrice = 0;
	private int sand = 0;
	private int ing = 0;
	private int chi = 0;
	private JLabel lblOrder;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JSandwich frame = new JSandwich();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JSandwich() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lstSandwich = new JList();
		lstSandwich.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				sand = 0;
				if(lstSandwich.getSelectedIndex() == 0)
				{
					sand = sand + 10;
					msg = msg + " Spicy chicken sandwich $10";
				}
				
				if(lstSandwich.getSelectedIndex() == 1)
				{
					sand = sand + 20;
					msg = msg + " Cremy chicken sandwich $10";
				}
				
				if(lstSandwich.getSelectedIndex() == 2)
				{
					sand = sand + 30;
					msg = msg + " Crispy chicken sandwich $10";
				}
				
				//lblOrder.setText(totalPrice);
			}
		});
		
		lstSandwich.setModel(new AbstractListModel() {
			String[] values = new String[] {"Spicy chicken sandwich", "Cremy chicken sandwich", "Crispy chicken sandwich"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		lstIngrident = new JList();
		lstIngrident.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				ing = 0;
				if(lstIngrident.getSelectedIndex() == 0)
				{
					ing = ing + 100;
					msg = msg + " Spicy chicken sandwich $10";
				}
				
				if(lstIngrident.getSelectedIndex() == 1)
				{
					ing = ing + 102;
					msg = msg + " Cremy chicken sandwich $10";
				}
				
				if(lstIngrident.getSelectedIndex() == 2)
				{
					ing = ing + 103;
					msg = msg + " Crispy chicken sandwich $10";
				}
			}
			
		});
		lstIngrident.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});
		lstIngrident.setModel(new AbstractListModel() {
			String[] values = new String[] {"Fried chicken", "Roasted chicken", "Grilled chicken", "BBQ chicken", "Chicken breast"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		lstType = new JList();
		lstType.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				chi = 0;
				if(lstType.getSelectedIndex() == 0)
				{
					chi = chi + 10;
					msg = msg + " Spicy chicken sandwich $10";
				}
				
				if(lstType.getSelectedIndex() == 1)
				{
					chi = chi + 13;
					msg = msg + " Cremy chicken sandwich $10";
				}
				
				if(lstType.getSelectedIndex() == 2)
				{
					chi = chi + 11;
					msg = msg + " Crispy chicken sandwich $10";
				}
				totalPrice = chi + ing + sand;
				lblOrder.setText(((Integer)totalPrice).toString());
			}
		});
		lstType.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});
		lstType.setModel(new AbstractListModel() {
			String[] values = new String[] {"White bread", "Multi grain", "Whole wheat"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JLabel lblShop = new JLabel("Subline Sandwich Shop");
		lblShop.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		lblOrder = new JLabel("Total price");
		lblOrder.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblOrder, GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lstSandwich, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lstIngrident, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lstType, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGap(97)
							.addComponent(lblShop, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addComponent(lblShop)
					.addGap(34)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lstSandwich, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
						.addComponent(lstIngrident, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
						.addComponent(lstType, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
					.addComponent(lblOrder, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addGap(21))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
