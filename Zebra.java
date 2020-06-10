package seminarski;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Zebra extends JDialog {

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
			Zebra dialog = new Zebra();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void Zebra1() {
		try {
			Zebra dialog = new Zebra();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Zebra() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Veselin\\Desktop\\logo.jpg"));
		setTitle("Zebra");
		setBounds(100, 100, 609, 569);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel label = new JLabel("");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			Image slike = new ImageIcon(this.getClass().getResource("/Zebra.jpg")).getImage();
			label.setIcon(new ImageIcon(slike));
			label.setBounds(10, 11, 264, 255);
			contentPanel.add(label);
		}
		
		JLabel lblZebra = new JLabel("Zebra");
		lblZebra.setForeground(new Color(0, 0, 0));
		lblZebra.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblZebra.setBounds(361, 11, 189, 42);
		contentPanel.add(lblZebra);
		
		JTextPane txtpnKolikoPutaSte = new JTextPane();
		txtpnKolikoPutaSte.setText("Zebra je naziv za nekoliko vrsta \u017Eivotinja koje pripadaju porodici Equidae (porodici konja) i koje \u017Eive u centralnoj i ju\u017Enoj Africi.\r\nObuhva\u0107a dva podroda s ukupno tri \u017Eive vrste, a to su:\r\nHippotigris Smith, 1841 (dvije vrste)\r\nDolichohippus Heller, 1912 (jedna vrsta)\r\nNjihovi najbli\u017Ei srodnici su podrod pravih konja (Equus) i podrod magarci (Asinus).[1]\r\nOpis\r\nOdrasle zebre te\u017Ee do 300 kg i uglavnom se nalaze u stepama i retkim \u0161umama. Jedna porodica se obi\u010Dno sastoji od pastuva, nekoliko kobila i njihovih \u017Edrebadi. Grupe porodica formiraju krdo. \u017Denke imaju trudno\u0107u od otprilike 12 meseci i daju obi\u010Dno samo jedno \u017Edrebe, obi\u010Dno u toku ki\u0161ne sezone. Mladun\u010De je svetlije nego odrasle \u017Eivotinje i pruge su mu tamnosme\u0111e i bele. Zebru love lavovi i pegava hijena. Zebre ponekad uspeju da se odbrane po\u0161to imaju odli\u010Dna \u010Dula vida, mirisa i sluha, a i uspe\u0161no se slu\u017Ee kopitama i zubima kada su napadnute.niti jedna zebra nema indenti\u010Dne pruge.\r\nVrste\r\nObi\u010Dna ili Bur\u010Delova zebra (Equus burchelli) je jedini predstavnik Equidae na teritoriji Zimbabvea. U Zimbabveu se nalazi u prili\u010Dnom broju u skoro svim nacionalni i safari parkovima a potisnuta je sa centralnog platoa. U skorije vreme se gaji na privatnim ran\u010Devima i za\u0161ti\u0107enim podru\u010Djima zbog svoje turisti\u010Dke vrednosti.\r\nZebre u Nacionalnom parku Eto\u0161a u Namibiji\r\nU Africi \u017Eive jo\u0161 dve vrste zebri: planinska zebra (Equus zebra) i Grevijeva zebra (Equus grevyi). Vrste zebri se me\u0111usobno razlikuju po prugama. Pruge planinske zebre su \u0161iroke i naizmeni\u010Dno crne i bijele, pruge Grevijeve zebre su tako\u0111e naizmeni\u010Dno crne i bijele ali veoma uske, dok se kod obi\u010Dne zebre izme\u0111u \u0161irokih crnih i belih pruga nalaze i svetlije sme\u0111e pruge.");
		txtpnKolikoPutaSte.setBounds(284, 59, 286, 214);
		contentPanel.add(txtpnKolikoPutaSte);
		
		JTextPane txtpnPasminakotskogGoveda = new JTextPane();
		txtpnPasminakotskogGoveda.setText("Pasmina \u0161kotskog goveda je posebno cenjena zbog njene izuzetne prilagodljivosti vremenskim uslovima. Govedo je \u017Eivelo vekovima u surovim, zaba\u010Denim \u0160kotskim planinama. Extremno o\u0161tri uslovi omogu\u0107ili su proces prirodne selekcije, gde samo oni najja\u010Di i najprilagodljiviji pre\u017Eivljavaju i prenose gene na vrstu. \u0160kotsko govedo zahteva za svoj razvoj izuzetno malo u pogledu zaklona, hrane i skupih \u017Eitarica. U stvari, \u0161kotsko govedo \u017Eivi u uslovima u kojima bi mnoge druge vrste izumrle. \r\nPrezimljavaju na pa\u0161njaku, iako imaju na raspolaganju staju. Krave se bez problema tele napolju, na temperaturi minus dvadeset stepeni i imaju jako izra\u017Een maj\u010Dinski nagon - vrlo su dobre i bri\u017Ene majke. Idealnu za\u0161titu od hladno\u0107e daje im zimska dlaka koja se sastoji od dva sloja. Gornji sloj je duga\u010Dka dlaka koja lako odbija ki\u0161u i sneg te odr\u017Eava suvom donju, vrlo meku, mahovinastu dlaku koja slu\u017Ei za zadr\u017Eavanje toplote. Zbog svoje otpornosti na sneg i hladno\u0107u rasprostiru se na severu do Aljaske i Skandinavije.\r\nPrilago\u0111ene su tako\u0111e i na manje surove i toplije krajeve, pa se farme nalaze u Teksasu i D\u017Eord\u017Eiji. U su\u0161nim razdobljima, kad je premalo trave na pa\u0161njaku, pona\u0161aju se izuzetne \u0161tedljivo i skromno, kao da nagonski ose\u0107aju, da je potrebno \u0161tedeti hranu.\r\n\u017Divotinje su izuzetno otporne i na bolesti. Duga dlaka i uvojci preko o\u010Diju \u0161tite im o\u010Di od lete\u0107ih insekata i sun\u010Devih zraka, pa su zato konjuktivitis i rak o\u010Diju retka bolest. Govedo je mirno i retko do\u017Eivljava stres, pa su i bolesti povezane sa stresom retkost. \u017Dive do 25 godina.");
		txtpnPasminakotskogGoveda.setBounds(10, 277, 560, 209);
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
