package _02_Builder1;

public class Subway {
	private int size;
	private String bread;
	private String cheese;
	private String extraTopping;
	private boolean vegetable;
	private String source;
	
	public void setSize(int size) {
		this.size = size;
	}
	public void setBread(String bread) {
		this.bread = bread;
	}
	public void setCheese(String cheese) {
		this.cheese = cheese;
	}
	public void setExtraTopping(String extraTopping) {
		this.extraTopping = extraTopping;
	}
	public void setVegetable(boolean vegetable) {
		this.vegetable = vegetable;
	}
	public void setSource(String source) {
		this.source = source;
	}
	
	@Override
	public String toString() {
		return "Subway [size=" + size + ", bread=" + bread + ", cheese=" + cheese + ", extraTopping=" + extraTopping
				+ ", vegetable=" + vegetable + ", source=" + source + "]";
	}
	
	
	
}
