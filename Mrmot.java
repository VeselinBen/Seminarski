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

public class Mrmot extends JDialog {

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
			Mrmot dialog = new Mrmot();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void Mrmot1() {
		try {
			Mrmot dialog = new Mrmot();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Mrmot() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Veselin\\Desktop\\logo.jpg"));
		setTitle("Mrmot");
		setBounds(100, 100, 609, 569);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel label = new JLabel("");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			Image slike = new ImageIcon(this.getClass().getResource("/Mrmot.jpg")).getImage();
			label.setIcon(new ImageIcon(slike));
			label.setBounds(10, 11, 321, 319);
			contentPanel.add(label);
		}
		
		JLabel lblMrmot = new JLabel("Mrmot");
		lblMrmot.setForeground(new Color(0, 0, 0));
		lblMrmot.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMrmot.setBounds(361, 11, 189, 42);
		contentPanel.add(lblMrmot);
		
		JTextPane txtpnKolikoPutaSte = new JTextPane();
		txtpnKolikoPutaSte.setText("Ve\u0107ina antilopa \u017Eivi u Africi, ali postoje i antilope na Arapskom poluotoku, Indiji, Rusiji i Jugoisto\u010Dnoj Aziji. Mnoge vrste antilopa unesene su u dr\u017Eave izvan svog areala, pogotovo u SAD, radi egzoti\u010Dnog lova. Velik broj antilopa \u017Eivi u Teksasu, gdje im odgovara klima. Antilope \u017Eive u razli\u010Ditim stani\u0161tima, naj\u010De\u0161\u0107e u savanama. Ima vrsta koje \u017Eive u \u0161umama, pustinjama, polumo\u010Dvarnim podru\u010Djima, stjenovitim podru\u010Djima ili hladnim krajevima Rusije. Vrste koje \u017Eive u \u0161umama i \u0161ikarama, stalno su na tom podru\u010Dju, dok se ostale antilope sele u velikim migracijama u potrazi za travom i ki\u0161om. Vrste antilopa poput gazela i gnua, imaju vrlo impresivne masovne migracije po \u010Demu su rekorderi me\u0111u sisavcima.\r\nSve antilope su parnoprsta\u0161i, pre\u017Eiva\u010Di; mu\u017Ejaci, a ponekad i \u017Eenke imaju rogove. Razlike u visini i te\u017Eini izme\u0111u vrsta antilopa velike su. Raspon visina je od 20 cm do 180 cm, a raspon te\u017Eina od 1 kg do 950 kg. Ve\u0107ina antilopa mo\u017Ee brzo tr\u010Dati, a neke se mogu i vrlo spretno penjati po stijenama. Neke se propinju i stoje samo na dvije noge, kako bi dohvatile li\u0161\u0107e drve\u0107a. Ve\u0107ina antilopa mo\u017Ee sko\u010Diti visoko u zrak. Boja krzna naj\u010De\u0161\u0107e je sme\u0111a, ponekad imaju \u0161are ili su jednobojne. Gazele imaju bijele stra\u017Enjice. Neke vrste imaju velike pruge po sredini tijela.");
		txtpnKolikoPutaSte.setBounds(341, 49, 229, 278);
		contentPanel.add(txtpnKolikoPutaSte);
		
		JTextPane txtpnPasminakotskogGoveda = new JTextPane();
		txtpnPasminakotskogGoveda.setText("Sve antilope su parnoprsta\u0161i, pre\u017Eiva\u010Di; mu\u017Ejaci, a ponekad i \u017Eenke imaju rogove. Razlike u visini i te\u017Eini izme\u0111u vrsta antilopa velike su. Raspon visina je od 20 cm do 180 cm, a raspon te\u017Eina od 1 kg do 950 kg. Ve\u0107ina antilopa mo\u017Ee brzo tr\u010Dati, a neke se mogu i vrlo spretno penjati po stijenama. Neke se propinju i stoje samo na dvije noge, kako bi dohvatile li\u0161\u0107e drve\u0107a. Ve\u0107ina antilopa mo\u017Ee sko\u010Diti visoko u zrak. Boja krzna naj\u010De\u0161\u0107e je sme\u0111a, ponekad imaju \u0161are ili su jednobojne. Gazele imaju bijele stra\u017Enjice. Neke vrste imaju velike pruge po sredini tijela.\r\nImaju razvijena osjetila vida, njuha i sluha kako bi na vrijeme uo\u010Dili predatore. Mogu vidjeti na daleke udaljenosti. Imaju sustav komunikacije unutar vrste. Mu\u017Ejaci su ve\u0107i od \u017Eenki i imaju du\u017Ee rogove. Kod nekih vrsta \u017Eenke su te\u017Ee. \u017Denke nekih vrsta nemaju rogove. U pojedinim vrstama, mu\u017Ejaci se rogovima bore za \u017Eenke. Te borbe vi\u0161e su ritualne, nego opasne.\r\nAntilope se ponekad dijele na prave, \u0161umske i stepske antilope; a u pave antilope jedino predstavnici podporodice Antilopinae sa rodovima: Ammodorcas Thomas, 1891 (Dibatag); Antidorcas Sundevall, 1845 (Springbok); Antilope Pallas, 1766 (Blackbuck); Dorcatragus Noack, 1894; Gazella de Blainville, 1816; Litocranius Kohl, 1886; Madoqua Ogilby, 1836; Neotragus C. H. Smith, 1827; Oreotragus A. Smith, 1834 - klipspringer; Ourebia Laurillard, 1842; Pantholops Hodgson, 1834; Procapra Hodgson, 1846; Qurliqnoria Bohlin, 1937 \u2020; Raphicerus C. H. Smith, 1827; Saiga Gray, 1843 (saiga).");
		txtpnPasminakotskogGoveda.setBounds(10, 324, 560, 163);
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
