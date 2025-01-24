package _02_Builder3_solution;

public class Subway {
	private int size;
	private String bread;
	private String cheese;
	private String extraTopping;
	private boolean vegetable;
	private String source;
	
	public Subway() {
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
