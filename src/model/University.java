package model;

public class University {

	private String name;
	private String address;
	private AcademicUnit root;

	public University(String name , String address) {
		this.name = name;
		this.address = address;
	}

	public String getAddress() {
		return address;
	}


	public String getName() {
		return name;
	}

	public void addAcademicUnit(String name, String director, int code) {
		AcademicUnit au = new AcademicUnit(name,code,director);
		if(root == null) {
			root = au;
		}else {
			AcademicUnit current = root;
			boolean added = false;
			while(added == false) {
				if(au.compareTo(current) > 0) {
					if(current.getRight() == null) {
						current.setRight(au);
						added = true;
					}else {
						current = current.getRight();
					}
				}
				else {
					if(current.getLeft() == null) {
						current.setLeft(au);
						added = true;
					}else {
						current = current.getLeft();
					}
				}
			}

		}

	}


}
