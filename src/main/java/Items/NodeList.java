package Items;

public interface NodeList {
    ListItem getRoot();  //this is the list item itself as any item that we create must have a starting node eg head of the list
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem item); //to help us go through items.  starts from head of the root and print out the items of each structure
}
