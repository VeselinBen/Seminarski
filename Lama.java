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

public class Lama extends JDialog {

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
			Lama dialog = new Lama();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void Lama1() {
		try {
			Lama dialog = new Lama();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Lama() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("slike/logo.jpg"));
		setTitle("Lama");
		setBounds(100, 100, 609, 569);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel label = new JLabel("");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			Image slike = new ImageIcon(this.getClass().getResource("/Lama.jpg")).getImage();
			label.setIcon(new ImageIcon(slike));
			label.setBounds(10, 11, 286, 222);
			contentPanel.add(label);
		}
		
		JLabel lblLama = new JLabel("Lama");
		lblLama.setForeground(new Color(0, 0, 0));
		lblLama.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLama.setBounds(361, 11, 189, 42);
		contentPanel.add(lblLama);
		
		JTextPane txtpnKolikoPutaSte = new JTextPane();
		txtpnKolikoPutaSte.setText("Lama ili obi\u010Dna lama (lat. Lama glama) je doma\u0107a vrsta, nastala domestifikacijom gvanaka. Gaji se u podru\u010Dju Anda, prvenstveno kao tegle\u0107a \u017Eivotinja, a manje zbog mesa i dlake. Pripitomljena je oko 3500 godina pre nove ere u Peruu. Javlja se u razli\u010Ditim bojama, od bele, preko sme\u0111e i sive do crne. \u010Cesto je \u0161arena, u kombinaciji ovih boja. Visina do vrha glave joj iznosi oko 1,8 m, a masa izme\u0111u 130 i 200 kg.\r\nOvaj pre\u017Eivar sa Anda je srodnik kamile. Postoje \u010Detiri vrste lama: gvanako, lama, alpaka i vikunja. Gvanako i vikunja su i danas divlje vrste; lame i alpake su jo\u0161 u pradavna vremena pripitomljene i postale doma\u0107e \u017Eivotinje. Obe te vrste na\u0161li su pripitomljene ve\u0107 prvi ameri\u010Dki doseljenici. Lame \u017Eive na visoravnima Kordiljera do visine od 4.500 metara. Lama se najvi\u0161e koristi kao teretna \u017Eivotinja; mo\u017Ee da nosi teret do 50 kilograma \u010Ditavih 12 sati! Alpaka ima kratku, mekanu i negovanu dlaku, pa se gaji prvenstveno zbog toga. \u017Denke obi\u010Dno ra\u0111aju jedno mladun\u010De godinu dana posle parenja. Sve vrste lama se slu\u017Ee neobi\u010Dnim na\u010Dinom odbrane. Pu\u0161taju protivnika da im se pribli\u017Ei, a onda mu naglo i \u017Eestoko pljunu u lice nakupljenu pljuva\u010Dku i sve \u0161to im se nalazi u ustima, odnosno izbljuvanu biljnu hranu.");
		txtpnKolikoPutaSte.setBounds(306, 59, 264, 183);
		contentPanel.add(txtpnKolikoPutaSte);
		
		JTextPane txtpnPasminakotskogGoveda = new JTextPane();
		txtpnPasminakotskogGoveda.setText("Slede\u0107e karakteristike se posebno odnose na lame. Stomatologija odraslih: -indisori 1/3 o\u010Dnjaci 1/1, premolari 2/2, molari 3/2; ukupno 32. U gornjoj vilici, komprimirani, o\u0161tri, \u0161iljasti laniariformni sjekuti\u0107i u blizini prednjeg ruba premaksile prati se u mu\u0161kom dijelu barem umjerenim, o\u0161trim, zakrivljenim pravim o\u010Dnjakom u prednjem dijelu gornje \u010Deljusti. 14] Izolovani pse\u0107i premolar koji slijedi u kamilama nije prisutan. Zubi molarnih serija, koji su u me\u0111usobnom dodiru, sastoje se od dva vrlo mala premolara (prvi skoro rudimentarni) i tri \u0161iroka molara, konstruisana uglavnom kao i oni iz Camelusa. U donjoj vilici, tri sekuti\u0107a su dugi, spatularni i opru\u017Eni; spoljni su najmanji. Pored njih je zakrivljen, supektni o\u010Dnjak, nakon kojeg slijedi izolirani minutni, a \u010Desto i listopadni jednostavan koni\u010Dni premolar; zatim jedna susjedna serija od jednog premolara i tri molara, koji se razlikuju od onih u kamelusu tako \u0161to imaju malu pomo\u0107nu kolonu na prednjoj spoljnoj ivici.\r\nImena delova tela lame: 1 u\u0161i - 2 ankete - 3 grebena - 4 le\u0111a - 5 kukova - 6 sapi - 7 baza repa - 8 repa - 9 stra\u017Enjice - 10 sko\u010Dnog zgloba - 11 metatarsal gland - 12 peta - 13 topovske kosti - 14 gaskin - 15 kolena - 16 bokova - 17 barela - 18 lakta - 19 pastera - 20 fetlock - 21 kolena - 22 grudi - 23 ta\u010Dke ramena - 24 ramena - 25 grla - 26 obraza ili \u010Deljusti - 27 nju\u0161ke\r\nLobanja uglavnom podse\u0107aju na Camelus, dok je ve\u0107a mo\u017Edana \u0161upljina i orbite i manje razvijeni kranijalni grebeni zbog svoje manje veli\u010Dine. Nosne kosti su kra\u0107e i \u0161ire, a spojene su sa premaksilom.\r\nVertebrae:\r\ncervikalni 7,\r\ndorzalni 12,\r\nlumbar 7,\r\nsakralni 4,\r\nkaudal 15 do 20.\r\nU\u0161i su prili\u010Dno duge i blago zakrivljene prema unutra, karakteristi\u010Dno poznate kao \"banana\". Nema le\u0111ne grbe. Stopala su uska, prsti su vi\u0161e odvojeni nego u kamilama, od kojih svaki ima poseban taban za tablete. Rep je kratak, a vlakna su duga, vunasta i meka.\r\n\r\nU bitnim strukturnim karakteristikama, kao iu op\u0161tem izgledu i navikama, sve \u017Eivotinje ovog roda veoma su sli\u010Dne jedna drugoj, tako da je pitanje da li ih treba smatrati da pripadaju jednoj, dve, ili vi\u0161e vrsta kontroverznost me\u0111u prirodoslovcima.\r\n\r\nPitanje se komplikuje okolnostima velike ve\u0107ine pojedinaca koji su do\u0161li pod opservaciju ili u potpuno ili djelomi\u010Dno pripitomljenoj dr\u017Eavi. Mnogi su potomci predaka koji su prethodno bili pripitomljeni, stanje koje te\u017Ei da proizvede odre\u0111enu koli\u010Dinu varijacija od prvobitnog tipa. \u010Cetiri oblika koja se obi\u010Dno razlikuju od strane stanovnika Ju\u017Ene Amerike prepoznata su kao razli\u010Dite vrste, iako sa te\u0161ko\u0107ama u definisanju njihovih karakteristi\u010Dnih karakteristika.\r\n\r\nSu:\r\n\r\nlama, Lama glama (Linnaeus);\r\nalpaka, Vicugna pacos (Linnaeus);\r\nguanako (od Kuechua huanaco), Lama guanicoe (Muller); i\r\nvicuna, Vicugna vicugna (Molina)\r\nLama i alpaka su poznate samo u doma\u0107oj dr\u017Eavi i varijabilne su po veli\u010Dini i brojnim bojama, \u010Desto su bijele, sme\u0111e ili pune. Neki su sivi ili crni. Guanaco i vicuna su divlji, prvi je ugro\u017Een, i gotovo jednoli\u010Dne svetlo-sme\u0111e boje, prelaze\u0107i u belu ispod. Oni se svakako razlikuju jedni od drugih, vicuna je manja, vitka u svojim proporcijama i ima kra\u0107u glavu od guanaka. Vicuna \u017Eivi u stadima na tmurnim i uzvi\u0161enim dijelovima planinskog lanca koji grani\u010De sa podru\u010Djem vje\u010Dnog snijega, usred stijena i provalija, koje se javljaju na razli\u010Ditim pogodnim lokalitetima \u0161irom Perua, u ju\u017Enom dijelu Ekvadora i na jugu do sredine Bolivija. Njegovi maniri su veoma sli\u010Dni pona\u0161anju divokoze Evropskih Alpa; ona je budna, divlja i pla\u0161ljiva. Vlakna su izuzetno delikatna i mekana, visoko cenjena za potrebe tkanja, ali koli\u010Dina koju svaka \u017Eivotinja proizvodi je minimalna. Alpake su potomci divljih predaka vicne, dok su doma\u0107e lame potomci divljih predaka gvanaka, iako je do\u0161lo do zna\u010Dajne hibridizacije izme\u0111u ove dve vrste.\r\n\r\nDiferencijalne karakteristike izme\u0111u lama i alpaka uklju\u010Duju ve\u0107u veli\u010Dinu lame, du\u017Eu glavu i zakrivljene u\u0161i. Vlakna alpake su op\u0107enito skuplja, ali ne uvijek vrijednija. Alpacas ima tendenciju da ima konzistentniju boju po celom telu. Najo\u010Diglednija vizuelna razlika izme\u0111u ljame i kamile je da kamile imaju grbu ili grbe, a lame ne.\r\n\r\nLame nisu pre\u017Eiva\u010Di, pseudo-pre\u017Eivari ili modifikovani pre\u017Eivari. Imaju slo\u017Een \u017Eeludac sa nekoliko odeljaka koji im dozvoljavaju da konzumiraju hranu ni\u017Eeg kvaliteta i celuloze. Odeljci \u017Eeluca omogu\u0107avaju fermentaciju \u010Dvrstih namirnica, zatim regurgitaciju i ponovno \u017Evakanje. Pre\u017Eivari imaju \u010Detiri odjeljka (krave, ovce, koze), dok lame imaju samo tri pregrade za \u017Eeludac: burag, omasum i abomasum.\r\n\r\nI");
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
					//	Menu.NewScreen();
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
