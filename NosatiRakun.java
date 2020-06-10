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

public class NosatiRakun extends JDialog {

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
			NosatiRakun dialog = new NosatiRakun();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void NosatiRakun() {
		try {
			NosatiRakun dialog = new NosatiRakun();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public NosatiRakun() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Veselin\\Desktop\\logo.jpg"));
		setTitle("Nosati rakun");
		setBounds(100, 100, 609, 569);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel label = new JLabel("");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			Image slike = new ImageIcon(this.getClass().getResource("/Rakun.jpg")).getImage();
			label.setIcon(new ImageIcon(slike));
			label.setBounds(10, 11, 264, 222);
			contentPanel.add(label);
		}
		
		JLabel lblSkotskoGovedo = new JLabel("Nosati rakun");
		lblSkotskoGovedo.setForeground(new Color(0, 0, 0));
		lblSkotskoGovedo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSkotskoGovedo.setBounds(361, 11, 189, 42);
		contentPanel.add(lblSkotskoGovedo);
		
		JTextPane txtpnKolikoPutaSte = new JTextPane();
		txtpnKolikoPutaSte.setText("Rakun (Procyon lotor) sisavac je srednje veli\u010Dine koji nastanjuje Sjevernu Ameriku. On je najve\u0107i pripadnik porodice Procyonidae; dug je od 40 do 70 cm i te\u017Ei izme\u0111u 3,5 i 9 kg, a ishrana mu se sastoji od oko 40% beskralje\u0161njaka, 33% biljaka i 27% kralje\u0161njaka. Ima sivkasto krzno, od kojeg je skoro 90% gusto potkrzno koje ga \u0161titi od hladno\u0107e. Dvije su prepoznatljive odlike rakuna izuzetno spretne ruke i \"maska\" na licu; to su \u010Deste teme u mitologiji nekih sjevernoameri\u010Dkih starosjedila\u010Dkih plemena. Rakuni su poznati po svojoj inteligenciji, a istra\u017Eivanja su pokazala da rje\u0161enja zadataka mogu pamtiti do tri godine.\r\nPrvobitno su stani\u0161te rakuna umjerene i mje\u0161ovite \u0161ume Sjeverne Amerike, ali zbog svoje prilagodljivosti stani\u0161tu pro\u0161irili su svoj areal na planinska podru\u010Dja, obalne mo\u010Dvare i urbana podru\u010Dja, gdje ih mnogi ljudi smatraju \u0161teto\u010Dinama. Zbog bjegova i uvo\u0111enja sredinom 20. stolje\u0107a, rakuni danas nastanjuju sredi\u0161nji dio Europe, Kavkaz i Japan.\r\n\r\nIako se prije smatralo da je samotna \u017Eivotinja, sada postoje dokazi da rakuni pokazuju dru\u0161tveno pona\u0161anje specifi\u010Dno za spolove. \u017Denke u srodstvu \u010Desto dijele neko podru\u010Dje, dok nesrodni mu\u017Ejaci \u017Eive zajedno u grupi od najvi\u0161e \u010Detiri \u017Eivotinje kako bi odr\u017Eali svoju poziciju protiv drugih mu\u017Ejaka tijekom sezone parenja. Veli\u010Dina teritorija varira od tri hektara kod \u017Eenki u gradovima do 50 km2 kod mu\u017Ejaka koji nastanjuju preriju. Nakon skotnosti od oko 65 dana u prolje\u0107e se ra\u0111a dva do pet mladunaca. Mladunce odgaja majka sve do disperzije u kasnu jesen. Iako rakuni u zato\u010Deni\u0161tvu mogu do\u017Eivjeti 20 godina, njihova prosje\u010Dna du\u017Eina \u017Eivota u divljini samo je 1,8 do 3,1 godina. U mnogim su slu\u010Dajevima lov i promet dva naj\u010De\u0161\u0107a uzroka smrti.");
		txtpnKolikoPutaSte.setBounds(278, 59, 292, 181);
		contentPanel.add(txtpnKolikoPutaSte);
		
		JTextPane txtpnPasminakotskogGoveda = new JTextPane();
		txtpnPasminakotskogGoveda.setText("Rakun (Procyon lotor) sisavac je srednje veli\u010Dine koji nastanjuje Sjevernu Ameriku. On je najve\u0107i pripadnik porodice Procyonidae; dug je od 40 do 70 cm i te\u017Ei izme\u0111u 3,5 i 9 kg, a ishrana mu se sastoji od oko 40% beskralje\u0161njaka, 33% biljaka i 27% kralje\u0161njaka. Ima sivkasto krzno, od kojeg je skoro 90% gusto potkrzno koje ga \u0161titi od hladno\u0107e. Dvije su prepoznatljive odlike rakuna izuzetno spretne ruke i \"maska\" na licu; to su \u010Deste teme u mitologiji nekih sjevernoameri\u010Dkih starosjedila\u010Dkih plemena. Rakuni su poznati po svojoj inteligenciji, a istra\u017Eivanja su pokazala da rje\u0161enja zadataka mogu pamtiti do tri godine.\r\nPrvobitno su stani\u0161te rakuna umjerene i mje\u0161ovite \u0161ume Sjeverne Amerike, ali zbog svoje prilagodljivosti stani\u0161tu pro\u0161irili su svoj areal na planinska podru\u010Dja, obalne mo\u010Dvare i urbana podru\u010Dja, gdje ih mnogi ljudi smatraju \u0161teto\u010Dinama. Zbog bjegova i uvo\u0111enja sredinom 20. stolje\u0107a, rakuni danas nastanjuju sredi\u0161nji dio Europe, Kavkaz i Japan.\r\nIako se prije smatralo da je samotna \u017Eivotinja, sada postoje dokazi da rakuni pokazuju dru\u0161tveno pona\u0161anje specifi\u010Dno za spolove. \u017Denke u srodstvu \u010Desto dijele neko podru\u010Dje, dok nesrodni mu\u017Ejaci \u017Eive zajedno u grupi od najvi\u0161e \u010Detiri \u017Eivotinje kako bi odr\u017Eali svoju poziciju protiv drugih mu\u017Ejaka tijekom sezone parenja. Veli\u010Dina teritorija varira od tri hektara kod \u017Eenki u gradovima do 50 km2 kod mu\u017Ejaka koji nastanjuju preriju. Nakon skotnosti od oko 65 dana u prolje\u0107e se ra\u0111a dva do pet mladunaca. Mladunce odgaja majka sve do disperzije u kasnu jesen. Iako rakuni u zato\u010Deni\u0161tvu mogu do\u017Eivjeti 20 godina, njihova prosje\u010Dna du\u017Eina \u017Eivota u divljini samo je 1,8 do 3,1 godina. U mnogim su slu\u010Dajevima lov i promet dva naj\u010De\u0161\u0107a uzroka smrti.");
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
