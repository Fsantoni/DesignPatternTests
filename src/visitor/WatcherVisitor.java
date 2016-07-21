package visitor;
import java.util.Collection;
import java.util.Iterator;

public class WatcherVisitor implements Visitor {
	public void visit(Collection collection) {
		Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			Object o = iterator.next();
			if (o instanceof Visitable)
				((Visitable) o).accept(this);
			else if (o instanceof Collection)
				visit((Collection) o);
		}
	}

	public void visit(VisitableString vString) {
		System.out.println("�" + vString.getString() + "�");
	}

	public void visit(VisitableFloat vFloat) {
		System.out.println(vFloat.getFloat().toString() + "f");
	}
}