package pos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import inven.Inven;
import membership.Membership;

public class Main {
	private static JTable table;
	static int tableRow = 0;
	static DefaultTableModel tmodel;
	static DefaultTableCellRenderer dcr;

	public Main() {
		CoffeeInfo espre = new CoffeeInfo("����������", 2500);
		CoffeeInfo ameri = new CoffeeInfo("�Ƹ޸�ī��", 3000);
		CoffeeInfo latte = new CoffeeInfo("ī���", 3500);
		CoffeeInfo viena = new CoffeeInfo("�񿣳�Ŀ��", 3500);
		CoffeeInfo choco = new CoffeeInfo("��������Ǫġ��", 4000);

		JFrame f1 = new JFrame("ī�� ���� �ý���");
		f1.getContentPane().setFont(new Font("����", Font.PLAIN, 19));
		f1.setSize(1080, 800);
		f1.getContentPane().setLayout(null);
		f1.setBounds(400, 200, 1080, 800);

		String[] col = { "��ȣ", "�޴�", "����", "����", "�������" }; // �� ���

		tmodel = new DefaultTableModel(col, 0);
		dcr = new DefaultTableCellRenderer(); // �� �ٷ�� ��ü (üũ�ڽ� ����, ��� ����)
		dcr.setHorizontalAlignment(SwingConstants.CENTER); //
		table = new JTable(tmodel);

		TableColumnModel tcm = table.getColumnModel(); // ���̺� ��� ����
		for (int i = 0; i < tcm.getColumnCount(); i++) {
			tcm.getColumn(i).setCellRenderer(dcr);
		}

		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setRowHeight(31); // �� ���� ����
		table.getColumnModel().getColumn(0).setPreferredWidth(5);
		// üũ�ڽ��� ���� ��뿩�� Ȯ��
		table.getColumn("�������").setCellRenderer(dcr); // "�������"���� üũ�ڽ� �ֱ�
		JCheckBox box = new JCheckBox("��������ư");
		box.setHorizontalAlignment(JLabel.CENTER);
		table.getColumn("�������").setCellEditor(new DefaultCellEditor(box));
		// �� �������� table.getValueAt(��, ��)

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(27, 98, 598, 180);
		f1.getContentPane().add(scrollPane);
		scrollPane.setViewportView(table);

		JButton buttonCredit = new JButton("\uACB0\uC81C");
		buttonCredit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Paybill pay = new Paybill();
				f1.setVisible(false);
			}// ����
		});
		buttonCredit.setFont(new Font("����", Font.BOLD, 20));
		buttonCredit.setBounds(783, 696, 129, 50);
		f1.getContentPane().add(buttonCredit);

		JButton buttonMembership = new JButton("\uBA64\uBC84\uC27D");
		buttonMembership.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Membership mem = new Membership();
			}// �����
		});
		buttonMembership.setFont(new Font("����", Font.BOLD, 20));
		buttonMembership.setBounds(642, 25, 129, 50);
		f1.getContentPane().add(buttonMembership);

		JButton buttonInven = new JButton("\uC7AC\uACE0\uAD00\uB9AC");
		buttonInven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inven inven = new Inven();
			}// ���
		});
		buttonInven.setFont(new Font("����", Font.BOLD, 20));
		buttonInven.setBounds(771, 25, 129, 50);
		f1.getContentPane().add(buttonInven);

		JButton buttonEspre = new JButton("����������");
		buttonEspre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (espre.num == 0) {
					espre.row = tableRow++;
					Object[] obj = new Object[5];
					obj[0] = tableRow;
					obj[1] = espre.name;
					obj[2] = espre.price;
					obj[3] = ++espre.num;
					obj[4] = false;
					tmodel = (DefaultTableModel) table.getModel();
					tmodel.addRow(obj); // ���߰�
				} else {
					tmodel.setValueAt(++espre.num, espre.row, 3);
					tmodel.setValueAt(espre.price * espre.num, espre.row, 2);
				}
			}
		});
		buttonEspre.setFont(new Font("����", Font.BOLD, 15));
		buttonEspre.setBounds(642, 98, 130, 60);
		f1.getContentPane().add(buttonEspre);

		JButton buttonAmeri = new JButton("�Ƹ޸�ī��");
		buttonAmeri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (ameri.num == 0) {
					ameri.row = tableRow++;
					Object[] obj = new Object[5];
					obj[0] = tableRow;
					obj[1] = ameri.name;
					obj[2] = ameri.price;
					obj[3] = ++ameri.num;
					obj[4] = false;
					tmodel = (DefaultTableModel) table.getModel();
					tmodel.addRow(obj); // ���߰�
				} else {
					tmodel.setValueAt(++ameri.num, ameri.row, 3);
					tmodel.setValueAt(ameri.price * ameri.num, ameri.row, 2);
				}
			}
		});
		buttonAmeri.setFont(new Font("����", Font.BOLD, 15));
		buttonAmeri.setBounds(771, 98, 130, 60);
		f1.getContentPane().add(buttonAmeri);

		JButton buttonLatte = new JButton("\uCE74\uD398\uB77C\uB5BC");
		buttonLatte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (latte.num == 0) {
					latte.row = tableRow++;
					Object[] obj = new Object[5];
					obj[0] = tableRow;
					obj[1] = latte.name;
					obj[2] = latte.price;
					obj[3] = ++latte.num;
					obj[4] = false;
					tmodel = (DefaultTableModel) table.getModel();
					tmodel.addRow(obj); // ���߰�
				} else {
					tmodel.setValueAt(++latte.num, latte.row, 3);
					tmodel.setValueAt(latte.price * latte.num, latte.row, 2);
				}
			}
		});
		buttonLatte.setFont(new Font("����", Font.BOLD, 15));
		buttonLatte.setBounds(900, 98, 130, 60);
		f1.getContentPane().add(buttonLatte);

		JButton buttonViena = new JButton("\uBE44\uC5D4\uB098\uCEE4\uD53C");
		buttonViena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (viena.num == 0) {
					viena.row = tableRow++;
					Object[] obj = new Object[5];
					obj[0] = tableRow;
					obj[1] = viena.name;
					obj[2] = viena.price;
					obj[3] = ++viena.num;
					obj[4] = false;
					tmodel = (DefaultTableModel) table.getModel();
					tmodel.addRow(obj); // ���߰�
				} else {
					tmodel.setValueAt(++viena.num, viena.row, 3);
					tmodel.setValueAt(viena.price * viena.num, viena.row, 2);
				}
			}
		});
		buttonViena.setFont(new Font("����", Font.BOLD, 15));
		buttonViena.setBounds(642, 158, 130, 60);
		f1.getContentPane().add(buttonViena);

		JButton buttonChoco = new JButton("\uCD08\uCF54\uD504\uB77C\uD478\uCE58\uB178");
		buttonChoco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (choco.num == 0) {
					choco.row = tableRow++;
					Object[] obj = new Object[5];
					obj[0] = tableRow;
					obj[1] = choco.name;
					obj[2] = choco.price;
					obj[3] = ++choco.num;
					obj[4] = false;
					tmodel = (DefaultTableModel) table.getModel();
					tmodel.addRow(obj); // ���߰�
				} else {
					tmodel.setValueAt(++choco.num, choco.row, 3);
					tmodel.setValueAt(choco.price * choco.num, choco.row, 2);
				}
			}
		});
		buttonChoco.setFont(new Font("����", Font.BOLD, 12));
		buttonChoco.setBounds(771, 158, 130, 60);
		f1.getContentPane().add(buttonChoco);

		// �ӽ÷� ������뿩�� �� �������� ��ư
		JButton buttonImsi = new JButton("\uCFE0\uD3F0\uC5EC\uBD80");
		buttonImsi.setForeground(new Color(34, 139, 34));
		buttonImsi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(table.getValueAt(0, 4));
			}
		});
		buttonImsi.setFont(new Font("����", Font.BOLD, 14));
		buttonImsi.setBounds(900, 158, 130, 60);
		f1.getContentPane().add(buttonImsi);

		JButton buttonAllDelete = new JButton("\uC804\uCCB4\uC0AD\uC81C");
		buttonAllDelete.setForeground(new Color(220, 20, 60));
		buttonAllDelete.setBackground(new Color(255, 255, 51));
		buttonAllDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = tableRow - 1; i >= 0; i--) {
					tmodel.removeRow(i);
				}
				tableRow = 0;
				espre.num = 0;
				ameri.num = 0;
				latte.num = 0;
				viena.num = 0;
				choco.num = 0;
			}
		});
		buttonAllDelete.setFont(new Font("����", Font.BOLD, 17));
		buttonAllDelete.setBounds(642, 223, 125, 55);
		f1.getContentPane().add(buttonAllDelete);

		JButton button_6 = new JButton("");
		button_6.setFont(new Font("����", Font.BOLD, 26));
		button_6.setBounds(771, 218, 130, 60);
		f1.getContentPane().add(button_6);

		JButton button_7 = new JButton("");
		button_7.setFont(new Font("����", Font.BOLD, 26));
		button_7.setBounds(900, 218, 130, 60);
		f1.getContentPane().add(button_7);
		
		ImageIcon icon = new ImageIcon("Mainpont.png");
		JLabel la1 = new JLabel(icon);
		la1.setBounds(27, 8, 300, 80);
		f1.getContentPane().add(la1);
		
		JButton buttonBackLogin = new JButton("\uB85C\uADF8\uC778 \uD654\uBA74\uC73C\uB85C");
		buttonBackLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int confirm = JOptionPane.showConfirmDialog(null, "�α��� ȭ������ ���ðڽ��ϱ�?");
				if (confirm == 0) {
					Login log = new Login();
				}
			}//�α��� ȭ������
		});
		buttonBackLogin.setBounds(912, 696, 129, 50);
		f1.getContentPane().add(buttonBackLogin);

		f1.setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
		
		Main main = new Main();
		
	}
}