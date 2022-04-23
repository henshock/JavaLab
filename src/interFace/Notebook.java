package interFace;
//Notebook, Product, Warrantable, Object
public class Notebook extends Product implements Warrantable{
	
	public int warranty;
	@Override
	public int 保固天數() {
		return this.warranty;
	}
	
	public Notebook(String name1, int price1, int warranty) {
		//super();//compiler, javac,塞一行super()在這裏
		//.this.name = name1;
		//this.price = price1;
		super(name1, price1);
		this.warranty = warranty;
		//建構子
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	//override (@:Spring, hibernate, annotation)
	//8 basic, others are all classes,F3
	@Override
	public String desc() {
		String info = super.desc();//Product.desc(), alt + shift + l
		return String.format("%s,保固%d天", info ,this.warranty);
	}

	
	
	
}










