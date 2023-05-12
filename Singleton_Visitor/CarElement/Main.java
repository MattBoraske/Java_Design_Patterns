import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<CarElement> list = new ArrayList<CarElement>();
		list.add(new Body());
		list.add(new Engine());
		list.add(new Wheel());

		ArrayList<Visitor> visitorList = new ArrayList<Visitor>();
		visitorList.add(PurchaseVisitor.getInstance());
		visitorList.add(RepairVisitor.getInstance());
		visitorList.add(PaintVisitor.getInstance());

		for (CarElement e : list) {
			for (Visitor v: visitorList){
				e.accept(v);
			}
			System.out.println();
		}
	}
}
