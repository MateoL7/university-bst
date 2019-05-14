package model;

public class AcademicUnit {

	private String name;
	private int code;
	private String director;
	private AcademicUnit right;
	private AcademicUnit left;
	
	public AcademicUnit(String pName, int pCode, String pDirector) {
		name = pName;
		code = pCode;
		director = pDirector;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * @param director the director to set
	 */
	public void setDirector(String director) {
		this.director = director;
	}

	/**
	 * @return the right
	 */
	public AcademicUnit getRight() {
		return right;
	}

	/**
	 * @param right the right to set
	 */
	public void setRight(AcademicUnit right) {
		this.right = right;
	}

	/**
	 * @return the left
	 */
	public AcademicUnit getLeft() {
		return left;
	}

	/**
	 * @param left the left to set
	 */
	public void setLeft(AcademicUnit left) {
		this.left = left;
	}
	
	
}
