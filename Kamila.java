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

public class Kamila extends JDialog {

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
			Kamila dialog = new Kamila();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void Kamila1() {
		try {
			Kamila dialog = new Kamila();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Kamila() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Veselin\\Desktop\\logo.jpg"));
		setTitle("Kamila");
		setBounds(100, 100, 609, 569);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel label = new JLabel("");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			Image slike = new ImageIcon(this.getClass().getResource("/Kamila.jpg")).getImage();
			label.setIcon(new ImageIcon(slike));
			label.setBounds(10, 11, 264, 222);
			contentPanel.add(label);
		}
		
		JLabel lblKamila = new JLabel("Kamila");
		lblKamila.setForeground(new Color(0, 0, 0));
		lblKamila.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblKamila.setBounds(361, 11, 189, 42);
		contentPanel.add(lblKamila);
		
		JTextPane txtpnKolikoPutaSte = new JTextPane();
		txtpnKolikoPutaSte.setText("Kamila (Camelus) je rod papkara koji obuhvata dve savremene vrste. Rod naseljava pustinjska i polupustinjska podru\u010Dja Afrike i Azije, a prenesen je i u Australiju. Ona je jedna od najstarijih \u010Dovekovih pomo\u0107nika i ljudi u Egiptu je koriste ve\u0107 vi\u0161e od 3.000 godina.\r\nPoput lama, koje pripadaju istoj porodici, razlikuju se od ostalih papkara po tome \u0161to se oslanjaju na poslednji i pretposlednji \u010Dlanak prsta.[3] Drugi i peti prst su im tokom evolucije potpuno i\u0161\u010Dezli. Zubi su im selenodontni. Imaju o\u010Dnjake u gornjoj vilici, a broj sekuti\u0107a je smanjen, imaju ih samo po jedan sa svake strane.[4] Nemaju tre\u0107i \u017Eeludac (omasum), \u010Dime se razlikuju od pravih pre\u017Eivara.[3] \u017Deludac im je ina\u010De vi\u0161ekomorni i u naborima sluzoko\u017Ee \u017Eeluca zadr\u017Eavaju vodu. Zato kamile mogu dugo, i do 8 dana, da izdr\u017Ee bez nje. Tako\u0111e, dugo mogu da izdr\u017Ee i bez hrane jer su im u grbama sme\u0161tene masne rezerve.[4] Dugo vremena nije bilo poznato da li osim domestifikovanih postoje i divlje vrste. Prona\u0161ao ih je ruski istra\u017Eiva\u010D Pr\u017Eevalski u pustinji Gobi.[3]\r\n\r\nGrba jedne kamile predstavlja pravo skladi\u0161te masno\u0107a, koje potom slu\u017Ei za ishranu njenog tela za vreme dok je na putovanju. Danima pre polaska na du\u017Ei put kamila samo jede i pije, a ona mo\u017Ee toliko pojesti da joj na le\u0111ima naraste grba masti te\u0161ka i do pedesetak kilograma. Pored grbe, kamila ima torbe u obliku fla\u0161a sme\u0161tene poput obloge na zidovima stomaka, \u0161to je pravi rezervoar za vodu. Tako snabdevena osnovnim zalihama mo\u017Ee da prevaljuje velike razdaljine, pa putuje do nekoliko dana preko pustinje od jednog do drugog izvora vode, a da je ne pije i da jo\u0161 du\u017Ee izdr\u017Ei prehranjuju\u0107i se isklju\u010Divo masno\u0107ama nakupljenim u njenoj grbi. Zbog toga na kraju tih dugih putovanja kamilina grba izgubi prvobitni izgled i splasne kao izgu\u017Evana lopta. Tada \u0107e kamili biti potreban du\u017Ei odmor da povrati izgubljenu snagu.");
		txtpnKolikoPutaSte.setBounds(284, 59, 286, 182);
		contentPanel.add(txtpnKolikoPutaSte);
		
		JTextPane txtpnPasminakotskogGoveda = new JTextPane();
		txtpnPasminakotskogGoveda.setText("Poput lama, koje pripadaju istoj porodici, razlikuju se od ostalih papkara po tome \u0161to se oslanjaju na poslednji i pretposlednji \u010Dlanak prsta.[3] Drugi i peti prst su im tokom evolucije potpuno i\u0161\u010Dezli. Zubi su im selenodontni. Imaju o\u010Dnjake u gornjoj vilici, a broj sekuti\u0107a je smanjen, imaju ih samo po jedan sa svake strane.[4] Nemaju tre\u0107i \u017Eeludac (omasum), \u010Dime se razlikuju od pravih pre\u017Eivara.[3] \u017Deludac im je ina\u010De vi\u0161ekomorni i u naborima sluzoko\u017Ee \u017Eeluca zadr\u017Eavaju vodu. Zato kamile mogu dugo, i do 8 dana, da izdr\u017Ee bez nje. Tako\u0111e, dugo mogu da izdr\u017Ee i bez hrane jer su im u grbama sme\u0161tene masne rezerve.[4] Dugo vremena nije bilo poznato da li osim domestifikovanih postoje i divlje vrste. Prona\u0161ao ih je ruski istra\u017Eiva\u010D Pr\u017Eevalski u pustinji Gobi.[3]\r\nGrba jedne kamile predstavlja pravo skladi\u0161te masno\u0107a, koje potom slu\u017Ei za ishranu njenog tela za vreme dok je na putovanju. Danima pre polaska na du\u017Ei put kamila samo jede i pije, a ona mo\u017Ee toliko pojesti da joj na le\u0111ima naraste grba masti te\u0161ka i do pedesetak kilograma. Pored grbe, kamila ima torbe u obliku fla\u0161a sme\u0161tene poput obloge na zidovima stomaka, \u0161to je pravi rezervoar za vodu. Tako snabdevena osnovnim zalihama mo\u017Ee da prevaljuje velike razdaljine, pa putuje do nekoliko dana preko pustinje od jednog do drugog izvora vode, a da je ne pije i da jo\u0161 du\u017Ee izdr\u017Ei prehranjuju\u0107i se isklju\u010Divo masno\u0107ama nakupljenim u njenoj grbi. Zbog toga na kraju tih dugih putovanja kamilina grba izgubi prvobitni izgled i splasne kao izgu\u017Evana lopta. Tada \u0107e kamili biti potreban du\u017Ei odmor da povrati izgubljenu snagu.");
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
