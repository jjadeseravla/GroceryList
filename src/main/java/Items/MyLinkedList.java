package Items;

public class MyLinkedList implements NodeList {
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
        //check for empty listitem first, and add a new item in head of the list as if it was empty.  but if list wasnt empty,
        // you need to compare each item in teh list to check where the new item would be inserted
        if(this.root !=null)

    {
        //the list is empty, so this item becomes the head of the list
        this.root = newItem;
        return true;
    }

    ListItem currentItem = this.root;
        while(currentItem !=null)

    {
        int comparison = (currentItem.compareTo(newItem));
        if (comparison < 0) {
            //newItem is greater, move right if poss
            if (currentItem.next() != null) {
                currentItem = currentItem.next();
            } else {
                //there is no next, so insert at end of the list
                currentItem.setNext(newItem).setPrevious(currentItem);
                return true;
            }
        } else if (comparison > 0) {
            //newitem is less, insert before
            if (currentItem.previous() != null) {
                currentItem.previous().setNext(newItem).setPrevious(currentItem.previous()); // if returns a record, we set the current item.previous to what the previous entry it was pointint to the the new item.
                newItem.setNext(currentItem).setPrevious(newItem);
                //we are inserting newitem before what was the current item
            } else {
                //the node without a previous is the root, so the new item needs to become the root
                newItem.setNext(this.root).setPrevious(newItem); //need to make new item the root and need this to be second item
                this.root = newItem; //set head to become new item
            }
            return true;  //if record is at the head or placed inside list, we should return true
        } else {
            //equal, so dont want to add this item, cos dont want duplicates
            System.out.println(newItem.getValue() + " is already present, not added");
            return false;
        }
    }
        return false;
}

    @Override
    public boolean removeItem(ListItem item) {
        //set previous link where item to be deleted is
        if(item != null) {
            System.out.println("deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if(comparison == 0) {
                //found the item to delete
                if(currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else { //comparison > 0, we are at an item greater than the one to be deleted
                //so the item is not on the list
                return false;
            }
        }
        //we have reached the end of the list
        //without finding the item to delete
        return false;
    }

    @Override
    public void traverse(ListItem item) {
        if(root == null) {
            System.out.println("List is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }

    }
}
