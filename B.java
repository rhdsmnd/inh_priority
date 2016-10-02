import javax.management.AttributeList;

public class B extends A {
	public AttributeList a() {
		System.out.println("In B");
		return new AttributeList();
	}
}
