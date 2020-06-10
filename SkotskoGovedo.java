package seminarski;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;

public class SkotskoGovedo extends JDialog {

	//IZGLED NASLEDJIVANJA ABSTRACTNE KLASE
	
	/*public class SkotskoGovedo extends AbstractZivotinja{
		ime(){
		System.out.println("Sima");
		}
		godiste(){
		System.out.println(1998);
		}
		potice(){
		System.out.println("Skotska");
		}
		pol(){
		System.out.println("Musko");
		}
	}*/
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			SkotskoGovedo dialog = new SkotskoGovedo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void SkotskoGovedo() {
		try {
			SkotskoGovedo dialog = new SkotskoGovedo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public SkotskoGovedo() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Veselin\\Desktop\\logo.jpg"));
		setTitle("Skotsko govedo");
		setBounds(100, 100, 609, 569);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel label = new JLabel("");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			Image slike = new ImageIcon(this.getClass().getResource("/Govedo.png")).getImage();
			label.setIcon(new ImageIcon(slike));
			label.setBounds(10, 11, 286, 222);
			contentPanel.add(label);
		}
		
		JLabel lblSkotskoGovedo = new JLabel("Skotsko govedo");
		lblSkotskoGovedo.setForeground(new Color(0, 0, 0));
		lblSkotskoGovedo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSkotskoGovedo.setBounds(361, 11, 189, 42);
		contentPanel.add(lblSkotskoGovedo);
		
		JTextPane txtpnKolikoPutaSte = new JTextPane();
		txtpnKolikoPutaSte.setText("Koliko puta ste nai\u0161li na zapu\u0161tene pa\u0161njake, zarasle u travu. Napu\u0161tena imanja nije imao ko da radi i u Sloveniji su se setili da tu po\u010Dnu uzgajati \u0161kotsko gove\u010De. Takav,ekstenzivan na\u010Din uzgoja je ubrzo pokazao svoje prednosti. Napu\u0161tena imanja uglavnom dugi niz godina nisu tretirana pesticidima, nije kori\u0161teno ve\u0161ta\u010Dko \u0111ubrivo ...\r\nStvorena je osnova za ekolo\u0161ki uzgoj goveda. Dugodlako \u0161kotsko govedo poti\u010De od divljeg goveda britanskih ostrva. To je najstarije poznata vrsta goveda. \u017Divotinje su poznate po dugoj dlaci i \u0161iroko istaknutim rogovima, \u0161to im daje prvobitan i prirodan izgled. Iako poseduju duge rogove, \u017Eivotinje su vrlo mirne i dru\u017Eeljubive.\r\n");
		txtpnKolikoPutaSte.setBounds(306, 59, 264, 183);
		contentPanel.add(txtpnKolikoPutaSte);
		
		JTextPane txtpnPasminakotskogGoveda = new JTextPane();
		txtpnPasminakotskogGoveda.setText("Pasmina \u0161kotskog goveda je posebno cenjena zbog njene izuzetne prilagodljivosti vremenskim uslovima. Govedo je \u017Eivelo vekovima u surovim, zaba\u010Denim \u0160kotskim planinama. Extremno o\u0161tri uslovi omogu\u0107ili su proces prirodne selekcije, gde samo oni najja\u010Di i najprilagodljiviji pre\u017Eivljavaju i prenose gene na vrstu. \u0160kotsko govedo zahteva za svoj razvoj izuzetno malo u pogledu zaklona, hrane i skupih \u017Eitarica. U stvari, \u0161kotsko govedo \u017Eivi u uslovima u kojima bi mnoge druge vrste izumrle. \r\nPrezimljavaju na pa\u0161njaku, iako imaju na raspolaganju staju. Krave se bez problema tele napolju, na temperaturi minus dvadeset stepeni i imaju jako izra\u017Een maj\u010Dinski nagon - vrlo su dobre i bri\u017Ene majke. Idealnu za\u0161titu od hladno\u0107e daje im zimska dlaka koja se sastoji od dva sloja. Gornji sloj je duga\u010Dka dlaka koja lako odbija ki\u0161u i sneg te odr\u017Eava suvom donju, vrlo meku, mahovinastu dlaku koja slu\u017Ei za zadr\u017Eavanje toplote. Zbog svoje otpornosti na sneg i hladno\u0107u rasprostiru se na severu do Aljaske i Skandinavije.\r\nPrilago\u0111ene su tako\u0111e i na manje surove i toplije krajeve, pa se farme nalaze u Teksasu i D\u017Eord\u017Eiji. U su\u0161nim razdobljima, kad je premalo trave na pa\u0161njaku, pona\u0161aju se izuzetne \u0161tedljivo i skromno, kao da nagonski ose\u0107aju, da je potrebno \u0161tedeti hranu.\r\n\u017Divotinje su izuzetno otporne i na bolesti. Duga dlaka i uvojci preko o\u010Diju \u0161tite im o\u010Di od lete\u0107ih insekata i sun\u010Devih zraka, pa su zato konjuktivitis i rak o\u010Diju retka bolest. Govedo je mirno i retko do\u017Eivljava stres, pa su i bolesti povezane sa stresom retkost. \u017Dive do 25 godina.");
		txtpnPasminakotskogGoveda.setBounds(10, 244, 560, 242);
		contentPanel.add(txtpnPasminakotskogGoveda);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton backButton = new JButton("Back");
				backButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				backButton.setActionCommand("Back");
				buttonPane.add(backButton);
				getRootPane().setDefaultButton(backButton);
			}
		}
	}
}
