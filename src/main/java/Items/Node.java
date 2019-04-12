package Items;

public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftlink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftlink = item;
        return this.leftlink;
    }

    @Override
    int compareTo(ListItem item) {
        if(item != null) {  //using a String method even though ListItem class states object
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1; //returns null
        }
    }
}
