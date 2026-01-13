package SuperConcept;

public class ChildDemoe extends ParentDemo {
	public ChildDemoe(String str) {
		super(str);
		System.out.println(str);
		System.out.println("Child cONSTRUCTOR");
	}
	public void getdata() {
//		super.getdata();
		System.out.println("B IS RETURN");
	}
	public static void main(String[] args) {
		
		ChildDemoe cd = new ChildDemoe("Pushpa");
		cd.getdata();
	}

}
