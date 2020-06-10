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

public class Zirafa extends JDialog {

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
			Zirafa dialog = new Zirafa();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void Zirafa1() {
		try {
			Zirafa dialog = new Zirafa();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Zirafa() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Veselin\\Desktop\\logo.jpg"));
		setTitle("Zirafa");
		setBounds(100, 100, 609, 569);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel label = new JLabel("");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			Image slike = new ImageIcon(this.getClass().getResource("/Zirafa.JPG")).getImage();
			label.setIcon(new ImageIcon(slike));
			label.setBounds(10, 11, 286, 307);
			contentPanel.add(label);
		}
		
		JLabel lblZirafa = new JLabel("Zirafa");
		lblZirafa.setForeground(new Color(0, 0, 0));
		lblZirafa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblZirafa.setBounds(361, 11, 189, 42);
		contentPanel.add(lblZirafa);
		
		JTextPane txtpnKolikoPutaSte = new JTextPane();
		txtpnKolikoPutaSte.setText("\u017Dirafa (lat. Giraffa camelopardalis) je afri\u010Dki sisar iz reda papkara, najvi\u0161i od svih kopnenih \u017Eivotinja. Mu\u017Ejaci mogu biti visoki od 4.5 do 5.5 metara i te\u017Eiti do 1,360 kilograma. Rekordna te\u017Eina jednog mu\u017Ejaka je iznosila pribli\u017Eno 2.000 kg, a visina 5.87 m.[2] Generalno, mu\u017Ejaci su krupniji od \u017Eenki, koje su od mu\u017Ejaka ni\u017Ee 70-100 cm.\r\n\u017Dirafe su srodstvu sa jelenima, antilopama i govedima, ali su grupisane u zasebnu familiju, familiju \u017Eirafa (Giraffidae) u koju jo\u0161 spada njihov najbli\u017Ei ro\u0111ak, okapi. \u017Dirafe \u017Eive na prostoru od \u010Cada do Ju\u017Ene Afrike.\r\nUkupna populacija \u017Eirafa je procenjena na 110.000 do 150.000 jedinki. Kenija sa 45,000, Tanzanija sa 30.000 i Bocvana sa 12.000 \u017Eirafa imaju najve\u0107e populacije.[3]\r\nOba pola imaju rogove, mada su rogovi kod \u017Eenki manji. Rogovi su zapravo ko\u0161tani izra\u0161taji lobanje, pokriveni ko\u017Eom i dlakom, dugi do 13,5 cm. Kod mu\u017Ejaka, kalcijum se talo\u017Ei na kostima lobanje tokom celog \u017Eivota prave\u0107i nove izra\u0161taje. Rogovi rastu, pre svega, na \u010Delu, oko o\u010Diju i na nosnoj kosti, pa glava tokom godina postaje sve krupnija i te\u017Ea. O\u010Di \u017Eirafe su krupne i sme\u0111e, za\u0161ti\u0107ene dugim i crnim trepavicama.\r\n\u017Dirafe poseduju ta\u010Dke koje prekrivaju celo telo, osim donje delove njihovih stomaka. Ne postoje dve \u017Eirafe sa istim rasporedom \u0161ara na telu. To je kao slu\u010Daj sa \u010Dovekom ili zebrama; ne postoje dva \u010Doveka sa istim otiskom prstiju ili dve zebre sa istim \u0161arama. \u017Dirafe imaju duga\u010Dke i sna\u017Ene vratove, prekrivene grivom koju \u010Dine kratke i o\u0161tre dlake. Vrat \u010Dini samo sedam pr\u0161ljenova, kao i kod drugih sisara, ali oni kod odraslih jedinki mogu da budu \u0161iroki i do 28 cm. Tako vrat mo\u017Ee da dostigne i dva metra. Ove \u017Eivotinje tako\u0111e imaju neznatno izdu\u017Eenije prednje noge, oko 10% du\u017Ee nego njihove zadnje noge.\r\nImaju veoma duga\u010Dak i lepljiv jezik. Jezik \u017Eirafe je dug do 45 cm i prekriven gustom pljuva\u010Dkom. Kada jede, \u017Eivotinja ga uvija oko li\u0161\u0107a i granja i povla\u010Di ga nadole. Koristi ga i za vla\u017Eenje i \u010Di\u0161\u0107enje o\u010Diju.\r\nDa bi se krv pumpala sve do glave i dovodila kiseonik do mozga, potrebno je i posebno srce koje je kod \u017Eirafe duga\u010Dko 60 cm, te\u0161ko vi\u0161e od 11 kg (25 puta ve\u0107e od \u010Dovekovog), i pumpa 60 do 75 litara krvi u minutu. I krvni pritisak dvostruko je ve\u0107i nego kod \u010Doveka. Zahvaljuju\u0107i jednom veoma istan\u010Dnom krvnom sistemu \u017Eirafe ne padnu u nesvest kad naglo podignu glavu jer im se krv sjuri u glavu i obratno. To je zbog sistema zalistaka koji pode\u0161avaju arterijski i venski krvotok, kao i zbog zidova krvnih sudova koji natapaju mozak koji su veoma rastegljivi.");
		txtpnKolikoPutaSte.setBounds(306, 64, 264, 261);
		contentPanel.add(txtpnKolikoPutaSte);
		
		JTextPane txtpnPasminakotskogGoveda = new JTextPane();
		txtpnPasminakotskogGoveda.setText("\u017Dirafa (lat. Giraffa camelopardalis) je afri\u010Dki sisar iz reda papkara, najvi\u0161i od svih kopnenih \u017Eivotinja. Mu\u017Ejaci mogu biti visoki od 4.5 do 5.5 metara i te\u017Eiti do 1,360 kilograma. Rekordna te\u017Eina jednog mu\u017Ejaka je iznosila pribli\u017Eno 2.000 kg, a visina 5.87 m.[2] Generalno, mu\u017Ejaci su krupniji od \u017Eenki, koje su od mu\u017Ejaka ni\u017Ee 70-100 cm.\r\n\u017Dirafe su srodstvu sa jelenima, antilopama i govedima, ali su grupisane u zasebnu familiju, familiju \u017Eirafa (Giraffidae) u koju jo\u0161 spada njihov najbli\u017Ei ro\u0111ak, okapi. \u017Dirafe \u017Eive na prostoru od \u010Cada do Ju\u017Ene Afrike.\r\nUkupna populacija \u017Eirafa je procenjena na 110.000 do 150.000 jedinki. Kenija sa 45,000, Tanzanija sa 30.000 i Bocvana sa 12.000 \u017Eirafa imaju najve\u0107e populacije.[3]\r\nOba pola imaju rogove, mada su rogovi kod \u017Eenki manji. Rogovi su zapravo ko\u0161tani izra\u0161taji lobanje, pokriveni ko\u017Eom i dlakom, dugi do 13,5 cm. Kod mu\u017Ejaka, kalcijum se talo\u017Ei na kostima lobanje tokom celog \u017Eivota prave\u0107i nove izra\u0161taje. Rogovi rastu, pre svega, na \u010Delu, oko o\u010Diju i na nosnoj kosti, pa glava tokom godina postaje sve krupnija i te\u017Ea. O\u010Di \u017Eirafe su krupne i sme\u0111e, za\u0161ti\u0107ene dugim i crnim trepavicama.\r\n\u017Dirafe poseduju ta\u010Dke koje prekrivaju celo telo, osim donje delove njihovih stomaka. Ne postoje dve \u017Eirafe sa istim rasporedom \u0161ara na telu. To je kao slu\u010Daj sa \u010Dovekom ili zebrama; ne postoje dva \u010Doveka sa istim otiskom prstiju ili dve zebre sa istim \u0161arama. \u017Dirafe imaju duga\u010Dke i sna\u017Ene vratove, prekrivene grivom koju \u010Dine kratke i o\u0161tre dlake. Vrat \u010Dini samo sedam pr\u0161ljenova, kao i kod drugih sisara, ali oni kod odraslih jedinki mogu da budu \u0161iroki i do 28 cm. Tako vrat mo\u017Ee da dostigne i dva metra. Ove \u017Eivotinje tako\u0111e imaju neznatno izdu\u017Eenije prednje noge, oko 10% du\u017Ee nego njihove zadnje noge.\r\nImaju veoma duga\u010Dak i lepljiv jezik. Jezik \u017Eirafe je dug do 45 cm i prekriven gustom pljuva\u010Dkom. Kada jede, \u017Eivotinja ga uvija oko li\u0161\u0107a i granja i povla\u010Di ga nadole. Koristi ga i za vla\u017Eenje i \u010Di\u0161\u0107enje o\u010Diju.\r\nDa bi se krv pumpala sve do glave i dovodila kiseonik do mozga, potrebno je i posebno srce koje je kod \u017Eirafe duga\u010Dko 60 cm, te\u0161ko vi\u0161e od 11 kg (25 puta ve\u0107e od \u010Dovekovog), i pumpa 60 do 75 litara krvi u minutu. I krvni pritisak dvostruko je ve\u0107i nego kod \u010Doveka. Zahvaljuju\u0107i jednom veoma istan\u010Dnom krvnom sistemu \u017Eirafe ne padnu u nesvest kad naglo podignu glavu jer im se krv sjuri u glavu i obratno. To je zbog sistema zalistaka koji pode\u0161avaju arterijski i venski krvotok, kao i zbog zidova krvnih sudova koji natapaju mozak koji su veoma rastegljivi.");
		txtpnPasminakotskogGoveda.setBounds(20, 323, 560, 164);
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
