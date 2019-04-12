package Items;

public class MyLinkedList implements  NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root != null) {
            //the list is empty, so this item becomes the head of the list
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if(comparison < 0) {
                //newItem is greater, move right if poss
                if(currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    //there is no next, so insert at end of the list
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            } else if(comparison > 0) {
                //newitem is less, insert before
                if(currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem); // if returns a record, we set the current item.previous to what the previous entry it was pointint to the the new item.
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                    //we are inserting newitem before what was the current item
                } else {
                    //the node without a previous is the root, so the new item needs to become the root
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root = newItem;

                }
            }
        }
        //check for empty listitem first, and add a new item in head of the list as if it was empty.  but if list wasnt empty,
        // you need to compare each item in teh list to check where the new item would be inserted
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem item) {

    }
}
