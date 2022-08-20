package CustomPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FXVacationRental extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup btnGrpLoc = new ButtonGroup();
	private final ButtonGroup btnGrpBed = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FXVacationRental frame = new FXVacationRental();
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
	public FXVacationRental() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JCheckBox chckbxParkSide = new JCheckBox("Park Side $600");
		btnGrpLoc.add(chckbxParkSide);
		chckbxParkSide.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JCheckBox chckbxPoolSide = new JCheckBox("Pool Side $750");
		btnGrpLoc.add(chckbxPoolSide);
		chckbxPoolSide.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JCheckBox chckbxLakeSide = new JCheckBox("Lake Side $825");
		btnGrpLoc.add(chckbxLakeSide);
		chckbxLakeSide.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblHeader = new JLabel("Welcome to Vacction Rental\r\n");
		lblHeader.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblasePrice = new JLabel("Base price for one Bedroom is $100.");
		lblasePrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JRadioButton rdbtnOneBed = new JRadioButton("One Bed $100");
		rdbtnOneBed.setSelected(true);
		btnGrpBed.add(rdbtnOneBed);
		rdbtnOneBed.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JRadioButton rdbtnTwoBed = new JRadioButton("Two Bed $175");
		btnGrpBed.add(rdbtnTwoBed);
		rdbtnTwoBed.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JRadioButton rdbtnThreeBed = new JRadioButton("Three Bed $250");
		btnGrpBed.add(rdbtnThreeBed);
		rdbtnThreeBed.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel = new JLabel("Additional Meal Price $200");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JCheckBox chckbxMeal = new JCheckBox("");
		
		JButton btnShowAmt = new JButton("Total Amount");
		btnShowAmt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				var totalPrice = 0;
				var bedPrice = 100;
				if(chckbxParkSide.isSelected())
				{
					totalPrice = totalPrice + 600;
				}
				if(chckbxPoolSide.isSelected())
				{
					totalPrice = totalPrice + 750;
				}
				if(chckbxLakeSide.isSelected())
				{
					totalPrice = totalPrice + 825;
				}
				if(chckbxMeal.isSelected())
				{
					totalPrice = totalPrice + 200;
				}
				if(rdbtnOneBed.isSelected())
				{
					totalPrice = totalPrice + 100;
				}
				if(rdbtnTwoBed.isSelected())
				{
					totalPrice = totalPrice + 175;
				}
				if(rdbtnThreeBed.isSelected())
				{
					totalPrice = totalPrice + 250;
				}
				
				JOptionPane.showMessageDialog(null, "Total Rent: $" + totalPrice );
				
			}
		});
		btnShowAmt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(91)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblasePrice, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblHeader, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(67, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(46)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(chckbxMeal, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
							.addGap(94))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(chckbxLakeSide, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(chckbxParkSide, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(chckbxPoolSide, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGap(70)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(rdbtnOneBed, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(rdbtnThreeBed)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addComponent(rdbtnTwoBed, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
							.addGap(72))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(172)
					.addComponent(btnShowAmt)
					.addContainerGap(197, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(12)
					.addComponent(lblHeader, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblasePrice)
					.addGap(25)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxParkSide)
						.addComponent(rdbtnOneBed))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxPoolSide)
						.addComponent(rdbtnTwoBed, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxLakeSide)
						.addComponent(rdbtnThreeBed, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 13, Short.MAX_VALUE)
							.addGap(14))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(chckbxMeal)
							.addPreferredGap(ComponentPlacement.UNRELATED)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnShowAmt, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
					.addGap(30))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
