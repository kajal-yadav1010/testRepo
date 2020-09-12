import java.util.ArrayList;
import java.util.List;

public class ListClass {
private List lfruits=new ArrayList();

public void add(String fruit) {
	lfruits.add(fruit);
}
public void remove(String fruit) {
	lfruits.remove(fruit);
}
public int size() {
	return lfruits.size();
}
public void removeAll() {
	lfruits.clear();
}
}
