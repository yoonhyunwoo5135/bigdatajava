package test;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CarUser {

	CarDao dao = new CarDao();
	CarDto dto = new CarDto();

	public CarUser() {
		CarDto dto = new CarDto();
		String select = JOptionPane.showInputDialog("입력(1), 수정(2), 삭제(3), 조회(4)");

		if (select.equals("1")) {

			String id = JOptionPane.showInputDialog("id를 입력하세요");
			dto.setId(id);
			String name = JOptionPane.showInputDialog("name을 입력하세요");
			dto.setName(name);
			String content = JOptionPane.showInputDialog("content를 입력하세요");
			dto.setContent(content);
			String price = JOptionPane.showInputDialog("price를 입력하세요");
			dto.setPrice(price);

			dao.insert(dto);
		} else if (select.equals("2")) {

			String id = JOptionPane.showInputDialog("id를 입력하세요");
			dto.setId(id);
			String name = JOptionPane.showInputDialog("name을 입력하세요");
			dto.setName(name);
			String content = JOptionPane.showInputDialog("content를 입력하세요");
			dto.setContent(content);
			String price = JOptionPane.showInputDialog("price를 입력하세요");
			dto.setPrice(price);

			dao.update(dto);
		} else if (select.equals("3")) {

			String id = JOptionPane.showInputDialog("id를 입력하세요");
			dto.setId(id);

			dao.delete(dto);
		} else if (select.equals("4")) {
			
			ArrayList list = dao.selectAll();

			String id = JOptionPane.showInputDialog("id를 입력하세요");
			dto.setId(id);

			dao.selectAll();
			
			for (int i = 0; i < list.size(); i++) {
				CarDto dto2 = (CarDto)list.get(i);			
				System.out.println(dto2);
				
			}
		} // if, else if end

	}// public end

	public static void main(String[] args) {
		CarUser car = new CarUser();

	}

}
