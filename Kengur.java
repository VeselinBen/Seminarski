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

public class Kengur extends JDialog {

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
			Kengur dialog = new Kengur();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void Kengur1() {
		try {
			Kengur dialog = new Kengur();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Kengur(AnimalModel animal) {
		
	}
	
	/**
	 * Create the dialog.
	 */
	public Kengur() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Veselin\\Desktop\\logo.jpg"));
		setTitle("Kengur");
		setBounds(100, 100, 609, 569);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel label = new JLabel("");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			Image slike = new ImageIcon(this.getClass().getResource("/Kengur.jpg")).getImage();
			label.setIcon(new ImageIcon(slike));
			label.setBounds(10, 11, 286, 306);
			contentPanel.add(label);
		}
		
		JLabel lblKengur = new JLabel("Kengur");
		lblKengur.setForeground(new Color(0, 0, 0));
		lblKengur.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblKengur.setBounds(361, 11, 189, 42);
		contentPanel.add(lblKengur);
		
		JTextPane txtpnKolikoPutaSte = new JTextPane();
		txtpnKolikoPutaSte.setText("Kengur (lat. Macropus) je rod torbara iz porodice kengura i valabija (Macropodidae). U op\u0161toj upotrebi, naziv se koristi da se opi\u0161u najve\u0107e vrste iz ove porodice: crveni, antilopski i isto\u010Dni i zapadni sivi kengur iz roda Macropus. Porodica tako\u0111e uklju\u010Duje i manje vrste, kao \u0161to su valabiji i kenguri penja\u010Di (\u017Eive na drve\u0107u), ukupno oko 63 vrsta ovih torbara. Kenguri su endemski rod jer \u017Eive samo u Australiji, dok manji makropodi \u017Eive u Australiji i Novoj Gvineji.\r\nKengur je simbol Australije; lik kengura se nalazi na Grbu Australije[1], na nekim nov\u010Danicama [2] i koristi se od strane mnogih australijskih organizacija.\r\nNaziv\r\nRe\u010D kengur vodi poreklo od australijskog aborid\u017Einskog jezika Guugu Yimidhirr od re\u010Di gangurru, odnose\u0107i se na sivog kengura.[3] Naziv prvi put spominje 4. avgusta 1770. godine na obalama reke Endevur (na mestu dana\u0161njeg Kuktauna gde se nasukala barka Endevur) kapetan D\u017Eejms Kuk kao re\u010D \u201Ekangooroo\u201C ili \u201Ekanguru\u201C.[4]\r\nPrema nekim izvorima, D\u017Eejmsa Kuka je zanimalo ime ovih, tada, nepoznatih \u017Eivotinja. Kada je postavio pitanje Aborid\u017Einima na engleskom jeziku za njihovo ime, oni su odgovorili na svom - \u201EKenguru\u201C, \u0161to u stvari zna\u010Di \u201ENe razumemo\u201C. Kapetan je odgovor prihvatio kao ime \u017Eivotinje i svetu prikazao nepoznatu \u017Eivotinjsku vrstu.[5]\r\nPrvi susreti sa kengurima\r\nUvre\u017Eeno je mi\u0161ljenje da je D\u017Eejms Kuk prvi Evropljanin koji je video kengure. To me\u0111utim, nije ta\u010Dno. Jo\u0161 1629. godine holandski kapetan broda Batavija Francisko Pelsaert (Francisco Pelsaert) je zabele\u017Eio svoj susret sa ovim neobi\u010Dnim \u017Eivotinjama. Krajem 17. veka, jedan drugi kapetan, Vilijam Dampier (William Dampier) u svom brodskom dnevniku opisuje kengure i jo\u0161 dodaje da im je meso vrlo ukusno. 1770. godine je Kukova ekspedicija uhvatila nekoliko primeraka, a biolog Josef Banks ih podrobnije opisao. Prva dva primerka u Evropu su stigla 1773. godine i to direktno u englesku kraljevsku palatu. A koju godinu kasnije stanovnici Londona su za paprenu sumu mogli da ih vide i u\u017Eivo.\r\n\r\nOp\u0161ti pregled\r\n\r\nIsto\u010Dni sivi kengur u pokretu\r\nCrveni kengur (Macropus rufus) je najve\u0107i torbar na svetu. U ne\u0161to manjem broju, crveni kenguri nastanjuju suve i polusuve centralne delove kontinenta. Odrasli mu\u017Ejak mo\u017Ee biti 2 metra visok i 90 kg te\u017Eak.\r\nIsto\u010Dni sivi kengur (Macropus giganteus) manje je poznatiji nego crveni kengur (izvan Australije), ali naj\u010De\u0161\u0107e vi\u0111en jer nastanjuje plodne oblasti isto\u010Dne Australije. Mu\u017Ejak mo\u017Ee biti visok do 2 metra i te\u017Eiti oko 66 kg.\r\nZapadni sivi kengur (Macropus fuliginosus) je neznatno manji od isto\u010Dnog sivog kengura, visine do 1.4 m i te\u017Eine od 54 kg za odraslog mu\u017Ejaka. \u017Divi u ju\u017Enim delovima Zapadne Australije, Ju\u017Ene Australije blizu obale i oko basena reke Darling.\r\nAntilopski kengur (Macropus antilopinus) je dru\u0161tveni kengur koji nastanjuje daleke severne delove kontinenta - travnate ravnice i \u0161umovite krajeve.\r\nFizi\u010Dki opis\r\nKenguri imaju malu glavu, duga\u010Dke, velike i jake zadnje noge prilago\u0111ene za skakanje kao i duga\u010Dak mi\u0161i\u0107av rep koji im slu\u017Ei da odr\u017Ee ravnote\u017Eu. Njihov rep mo\u017Ee izdr\u017Eati \u010Dak do 90 kg. Kao i svi ostali torbari, i kenguri imaju torbu koja se zove marsupijum u kojoj nose mladun\u010Dad posle poro\u0111aja.\r\nKenguri su jedine ve\u0107e \u017Eivotinje koje primenjuju skakanje kao oblik kretanja. Uobi\u010Dajena brzina skakutanja crvenog kengura iznosi oko 20\u201325 km/h, ali mo\u017Ee da ubrza i do 70 km/h na kra\u0107im razdaljinama, dok na du\u017Eim uspeva da odr\u017Ei brzinu do 40 km/h. Zbog svojih duga\u010Dkih nogu, kengur ne mo\u017Ee da hoda normalno.\r\nProse\u010Dni \u017Eivotni vek kengura iznosi 4-6 godina, dok je zabele\u017Een rekord od 23 godine.");
		txtpnKolikoPutaSte.setBounds(306, 59, 264, 245);
		contentPanel.add(txtpnKolikoPutaSte);
		
		JTextPane txtpnPasminakotskogGoveda = new JTextPane();
		txtpnPasminakotskogGoveda.setText("Kengur (lat. Macropus) je rod torbara iz porodice kengura i valabija (Macropodidae). U op\u0161toj upotrebi, naziv se koristi da se opi\u0161u najve\u0107e vrste iz ove porodice: crveni, antilopski i isto\u010Dni i zapadni sivi kengur iz roda Macropus. Porodica tako\u0111e uklju\u010Duje i manje vrste, kao \u0161to su valabiji i kenguri penja\u010Di (\u017Eive na drve\u0107u), ukupno oko 63 vrsta ovih torbara. Kenguri su endemski rod jer \u017Eive samo u Australiji, dok manji makropodi \u017Eive u Australiji i Novoj Gvineji.\r\nKengur je simbol Australije; lik kengura se nalazi na Grbu Australije[1], na nekim nov\u010Danicama [2] i koristi se od strane mnogih australijskih organizacija.\r\nNaziv\r\nRe\u010D kengur vodi poreklo od australijskog aborid\u017Einskog jezika Guugu Yimidhirr od re\u010Di gangurru, odnose\u0107i se na sivog kengura.[3] Naziv prvi put spominje 4. avgusta 1770. godine na obalama reke Endevur (na mestu dana\u0161njeg Kuktauna gde se nasukala barka Endevur) kapetan D\u017Eejms Kuk kao re\u010D \u201Ekangooroo\u201C ili \u201Ekanguru\u201C.[4]\r\nPrema nekim izvorima, D\u017Eejmsa Kuka je zanimalo ime ovih, tada, nepoznatih \u017Eivotinja. Kada je postavio pitanje Aborid\u017Einima na engleskom jeziku za njihovo ime, oni su odgovorili na svom - \u201EKenguru\u201C, \u0161to u stvari zna\u010Di \u201ENe razumemo\u201C. Kapetan je odgovor prihvatio kao ime \u017Eivotinje i svetu prikazao nepoznatu \u017Eivotinjsku vrstu.[5]\r\nPrvi susreti sa kengurima\r\nUvre\u017Eeno je mi\u0161ljenje da je D\u017Eejms Kuk prvi Evropljanin koji je video kengure. To me\u0111utim, nije ta\u010Dno. Jo\u0161 1629. godine holandski kapetan broda Batavija Francisko Pelsaert (Francisco Pelsaert) je zabele\u017Eio svoj susret sa ovim neobi\u010Dnim \u017Eivotinjama. Krajem 17. veka, jedan drugi kapetan, Vilijam Dampier (William Dampier) u svom brodskom dnevniku opisuje kengure i jo\u0161 dodaje da im je meso vrlo ukusno. 1770. godine je Kukova ekspedicija uhvatila nekoliko primeraka, a biolog Josef Banks ih podrobnije opisao. Prva dva primerka u Evropu su stigla 1773. godine i to direktno u englesku kraljevsku palatu. A koju godinu kasnije stanovnici Londona su za paprenu sumu mogli da ih vide i u\u017Eivo.\r\n\r\nOp\u0161ti pregled\r\n\r\nIsto\u010Dni sivi kengur u pokretu\r\nCrveni kengur (Macropus rufus) je najve\u0107i torbar na svetu. U ne\u0161to manjem broju, crveni kenguri nastanjuju suve i polusuve centralne delove kontinenta. Odrasli mu\u017Ejak mo\u017Ee biti 2 metra visok i 90 kg te\u017Eak.\r\nIsto\u010Dni sivi kengur (Macropus giganteus) manje je poznatiji nego crveni kengur (izvan Australije), ali naj\u010De\u0161\u0107e vi\u0111en jer nastanjuje plodne oblasti isto\u010Dne Australije. Mu\u017Ejak mo\u017Ee biti visok do 2 metra i te\u017Eiti oko 66 kg.\r\nZapadni sivi kengur (Macropus fuliginosus) je neznatno manji od isto\u010Dnog sivog kengura, visine do 1.4 m i te\u017Eine od 54 kg za odraslog mu\u017Ejaka. \u017Divi u ju\u017Enim delovima Zapadne Australije, Ju\u017Ene Australije blizu obale i oko basena reke Darling.\r\nAntilopski kengur (Macropus antilopinus) je dru\u0161tveni kengur koji nastanjuje daleke severne delove kontinenta - travnate ravnice i \u0161umovite krajeve.\r\nFizi\u010Dki opis\r\nKenguri imaju malu glavu, duga\u010Dke, velike i jake zadnje noge prilago\u0111ene za skakanje kao i duga\u010Dak mi\u0161i\u0107av rep koji im slu\u017Ei da odr\u017Ee ravnote\u017Eu. Njihov rep mo\u017Ee izdr\u017Eati \u010Dak do 90 kg. Kao i svi ostali torbari, i kenguri imaju torbu koja se zove marsupijum u kojoj nose mladun\u010Dad posle poro\u0111aja.\r\nKenguri su jedine ve\u0107e \u017Eivotinje koje primenjuju skakanje kao oblik kretanja. Uobi\u010Dajena brzina skakutanja crvenog kengura iznosi oko 20\u201325 km/h, ali mo\u017Ee da ubrza i do 70 km/h na kra\u0107im razdaljinama, dok na du\u017Eim uspeva da odr\u017Ei brzinu do 40 km/h. Zbog svojih duga\u010Dkih nogu, kengur ne mo\u017Ee da hoda normalno.\r\nProse\u010Dni \u017Eivotni vek kengura iznosi 4-6 godina, dok je zabele\u017Een rekord od 23 godine.");
		txtpnPasminakotskogGoveda.setBounds(10, 328, 560, 146);
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
