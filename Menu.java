package seminarski;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class Menu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Veselin\\Desktop\\logo.jpg"));
		setTitle("Mapa zooloski vrt");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		Image slike = new ImageIcon(this.getClass().getResource("/Mapa.png")).getImage();
		label.setIcon(new ImageIcon(slike));
		label.setBounds(0, 0, 609, 569);
		contentPane.add(label);
		
		JPanel Kamila = new JPanel();
		Kamila.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setVisitedAnimal(1);
				getAnimal(1);
				seminarski.Kamila.Kamila1();
			}
		});
		
		Kamila.setBounds(0, 0, 111, 128);
		contentPane.add(Kamila);
		
		JPanel Zebra = new JPanel();
		Zebra.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisitedAnimal(3);
				getAnimal(3);
				seminarski.Zebra.Zebra1();
			}
		});
		
		Zebra.setBounds(57, 139, 127, 104);
		contentPane.add(Zebra);
		
		JPanel Skotsko_govedo = new JPanel();
		Skotsko_govedo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisitedAnimal(2);
				getAnimal(2);
				seminarski.SkotskoGovedo.SkotskoGovedo();
			}
		});
		
		Skotsko_govedo.setBounds(216, 50, 102, 92);
		contentPane.add(Skotsko_govedo);
		
		JPanel Crna_azijska_antilopa = new JPanel();
		Crna_azijska_antilopa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisitedAnimal(4);
				getAnimal(4);
				seminarski.CrnaAzijskaAntilopa.CrnaAzijskaAntilopa();
			}
		});
		
		Crna_azijska_antilopa.setBounds(302, 145, 102, 98);
		contentPane.add(Crna_azijska_antilopa);
		
		JPanel Mrmot = new JPanel();
		Mrmot.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisitedAnimal(5);
				getAnimal(5);
				seminarski.Mrmot.Mrmot1();
			}
		});
		
		Mrmot.setBounds(281, 261, 69, 69);
		contentPane.add(Mrmot);
		
		JPanel Merkat = new JPanel();
		Merkat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisitedAnimal(7);
				getAnimal(7);
				seminarski.Merkat.Merkat1();
			}
		});
		
		Merkat.setBounds(364, 289, 50, 69);
		contentPane.add(Merkat);
		
		JPanel Lama = new JPanel();
		Lama.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisitedAnimal(6);
				getAnimal(6);
				seminarski.Lama.Lama1();
			}
		});
		
		Lama.setBounds(53, 289, 111, 69);
		contentPane.add(Lama);
		
		JPanel Zirafa = new JPanel();
		Zirafa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisitedAnimal(8);
				getAnimal(9);
				seminarski.Zirafa.Zirafa1();
			}
		});
		
		Zirafa.setBounds(98, 369, 88, 85);
		contentPane.add(Zirafa);
		
		JPanel Kengur = new JPanel();
		Kengur.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisitedAnimal(9);
				getAnimal(9);
				seminarski.Kengur.Kengur1();
			}
		});
		
		Kengur.setBounds(255, 380, 69, 78);
		contentPane.add(Kengur);
		
		JPanel Nosati_rakun = new JPanel();
		Nosati_rakun.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisitedAnimal(10);
				getAnimal(10);
				seminarski.NosatiRakun.NosatiRakun();
			}
		});
		
		Nosati_rakun.setBounds(317, 484, 78, 56);
		contentPane.add(Nosati_rakun);
	}
	
	private AnimalModel getAnimal(int id) {
		String sql = "SELECT * FROM zivotinja WHERE animal_id = " + id;
		
		try(Connection conn = (Connection) ConnectionClass.getConnection()){
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				return new AnimalModel(rs.getString("name"), rs.getString("imagePath"));
			}
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}
	
	private void setVisitedAnimal(int id) {
		Random rand = new Random();
		String sql = "INSERT INTO posete (poseta_id, zivotinja_id) VALUES (?, ?);";
		
		try(Connection conn = (Connection) ConnectionClass.getConnection()){
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, rand.nextInt());
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
