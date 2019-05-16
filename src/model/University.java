package model;

import java.util.ArrayList;
import java.util.List;

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
	
	   public List<AcademicUnit> preorder(){
	        return preorder(root);  
	    }
	    private List<AcademicUnit> preorder(AcademicUnit current){
	        List<AcademicUnit> lis= new ArrayList<>();
	        if(current != null) {
	            lis.add(current);
	            List<AcademicUnit> lis2 = preorder(current.getLeft());
	            List<AcademicUnit> lis3 = preorder(current.getRight());
	            lis.addAll(lis2);
	            lis.addAll(lis3);
	        }
	        return lis;
	    }
	    
	    //Mejor usar este
	    public List<AcademicUnit> preorder2(){
	        List<AcademicUnit> lis= new ArrayList<>();
	        preorder2(root,lis);
	        return lis;
	    }
	    private void preorder2(AcademicUnit current,List<AcademicUnit> lis){
	        if(current != null) {
	            lis.add(current);
	            preorder2(current.getLeft(),lis);
	            preorder2(current.getRight(),lis);
	            
	        }
	    }


}
