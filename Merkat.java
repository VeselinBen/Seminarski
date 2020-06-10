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

public class Merkat extends JDialog {

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
			Merkat dialog = new Merkat();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void Merkat1() {
		try {
			Merkat dialog = new Merkat();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Merkat() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Veselin\\Desktop\\logo.jpg"));
		setTitle("Merkat");
		setBounds(100, 100, 609, 569);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel label = new JLabel("");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			Image slike = new ImageIcon(this.getClass().getResource("/Merkat.jpg")).getImage();
			label.setIcon(new ImageIcon(slike));
			label.setBounds(10, 11, 264, 222);
			contentPanel.add(label);
		}
		
		JLabel lblMerkat = new JLabel("Merkat");
		lblMerkat.setForeground(new Color(0, 0, 0));
		lblMerkat.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMerkat.setBounds(361, 11, 189, 42);
		contentPanel.add(lblMerkat);
		
		JTextPane txtpnKolikoPutaSte = new JTextPane();
		txtpnKolikoPutaSte.setText("Na\u010Din \u017Eivota: aktivan je danju, dobro se penje po drve\u0107u; izrazito je dru\u0161tven \u2013 dominatan par oko sebe okuplja grupu od 10 do 50 \u010Dlanova; kada se grupa nalazi na otvorenom prostoru, jedan \u010Dlan uvek dr\u017Ei stra\u017Eu spreman da piskom upozori na opasnost; kopa duboke rupe u zemlji i gradi veoma slo\u017Eene sisteme tunela. Ishrana: vo\u0107e, bobice, zrnevlje, sitni glodari, insekti i larve. Du\u017Eina: do 40 centimetara (sa repom). Te\u017Eina: do 1 kg. Razmno\u017Eavanje: \u017Eenka ra\u0111a 2 - 5 mladih, nakon 80 dana trudno\u0107e. \u017Divotni vek: do 15 godina, u ve\u0161ta\u010Dkim uslovima.\r\nmerkat (afrikaans meerkat) (Suricata suricatta), zvijer iz por. mungosa (Herpestidae). Tijelo mu je dugo do 35 cm, a rep 25 cm; te\u017Eak oko 0,7 kg. Dlaka je obojena tonovima sme\u0111e i \u017Eu\u0107kaste boje. Karakteristi\u010Dna je tamna \u00BBmaska\u00AB oko o\u010Diju. Hrani se ugl. kukcima ali i manjim kralje\u017Enjacima, jajima i nekim biljkama. Nakon brje\u0111osti od 11 tjedana \u017Eenka koti 3 mlada. Merkat je izrazito dru\u0161tvena \u017Eivotinja koja obitava u skupinama od 30 jedinki, aktivnih tijekom dana. Skrivaju se u spletu podzemnih hodnika. Nastanjuje savane i druga otvorena podru\u010Dja ju\u017E. Afrike, Bocvane, Zimbabvea i Mozambika. Merkati \u017Eive 5 do 15 godina.");
		txtpnKolikoPutaSte.setBounds(272, 59, 298, 182);
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
