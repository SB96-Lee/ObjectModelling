package _02_Builder2;

public class Subway {
	private int size;
	private String bread;
	private String cheese;
	private String extraTopping;
	private boolean vegetable;
	private String source;
	
	public Subway() {
	}
	
	public Subway(int size) {
		this.size = size;
	}
	
	public Subway(int size, String bread) {
		this.size = size;
		this.bread = bread;
	}
	
	public Subway(int size, String bread, String cheese) {
		this.size = size;
		this.bread = bread;
		this.cheese = cheese;
	}
	
	/*
	 // 오버로딩 안됨. 생성자 또는 메서드 모두 모든 주문선택을 넣을 수 없음. 
	  public Subway(int size, String bread, String extraTopping) 
	  { this.size = size; this.bread = bread;
	  this.cheese = cheese; }
	 */
	
	public Subway(int size, String bread, String cheese, String extraTopping) {
		this.size = size;
		this.bread = bread;
		this.cheese = cheese;
		this.extraTopping = extraTopping;
	}
	
	public Subway(int size, String bread, String cheese, String extraTopping, boolean vegetable) {
		this.size = size;
		this.bread = bread;
		this.cheese = cheese;
		this.extraTopping = extraTopping;
		this.vegetable = vegetable;
	}
	
	public Subway(int size, String bread, String cheese, String extraTopping, boolean vegetable, String source) {
		this.size = size;
		this.bread = bread;
		this.cheese = cheese;
		this.extraTopping = extraTopping;
		this.vegetable = vegetable;
		this.source = source;
	}
	

	
	@Override
	public String toString() {
		return "Subway [size=" + size + ", bread=" + bread + ", cheese=" + cheese + ", extraTopping=" + extraTopping
				+ ", vegetable=" + vegetable + ", source=" + source + "]";
	}
	
	
	
}