package tables;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Inven {
	
	public static void main(String[] args) {
		String select = JOptionPane.showInputDialog("�Է�(1), ����(2)");
		
		InvenDao id = new InvenDao();
		InvenDto dto = new InvenDto();
		
		if(select.equals("1")){
			
			String bean = JOptionPane.showInputDialog("����");
			int bean2 = Integer.parseInt(bean);
			dto.setBean2(bean2);
			String milk = JOptionPane.showInputDialog("����");
			int milk2 = Integer.parseInt(milk);
			dto.setMilk2(milk2);
			String choco = JOptionPane.showInputDialog("���ݸ�");
			int choco2 = Integer.parseInt(choco);
			dto.setChoco2(choco2);
			String cream = JOptionPane.showInputDialog("ũ��");
			int cream2 = Integer.parseInt(cream);
			dto.setCream2(cream2);
			String cup = JOptionPane.showInputDialog("��");
			int cup2 = Integer.parseInt(cup);
			dto.setCup2(cup2);
			String straw = JOptionPane.showInputDialog("����");
			int straw2 = Integer.parseInt(straw);
			dto.setStraw2(straw2);
			
			try {
				id.insert(dto);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		else if(select.equals("2")) {	
			
			String bean = JOptionPane.showInputDialog("����");
			int bean2 = Integer.parseInt(bean);
			dto.setBean2(bean2);
			String milk = JOptionPane.showInputDialog("����");
			int milk2 = Integer.parseInt(milk);
			dto.setMilk2(milk2);
			String choco = JOptionPane.showInputDialog("���ݸ�");
			int choco2 = Integer.parseInt(choco);
			dto.setChoco2(choco2);
			String cream = JOptionPane.showInputDialog("ũ��");
			int cream2 = Integer.parseInt(cream);
			dto.setCream2(cream2);
			String cup = JOptionPane.showInputDialog("��");
			int cup2 = Integer.parseInt(cup);
			dto.setCup2(cup2);
			String straw = JOptionPane.showInputDialog("����");
			int straw2 = Integer.parseInt(straw);
			dto.setStraw2(straw2);
			
			
			try {
				id.update(dto);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
