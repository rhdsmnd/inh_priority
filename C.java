import javax.management.AttributeList;
import java.util.ArrayList;

public class C {
	public static void main(String[] args) {
		B newB = new B();
		AttributeList test = newB.a(new AttributeList());
		A a = newB;

		System.out.println(a.a().getClass());
	}
}
