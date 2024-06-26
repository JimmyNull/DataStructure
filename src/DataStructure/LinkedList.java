package DataStructure;

/**
 *  This my own practice made it available for public
 *  Please cite me if your going to use it =)
 */

public class LinkedList {

  Node head;
  private int size;
  public LinkedList() {
    head = null;
    size = 0;
  }

  public boolean addLast(Object data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      size++;
      return true;
    }

    Node cur = head;

    while (cur.next != null) {
      cur = cur.next;
    }

    cur.next = newNode;
    size++;
    return true;
  }

  public boolean removeLast() {
    if (head == null) {
      printError("List is empty...");
      return false;
    }

    if (head.next == null) {
      head = null; // If there's only one element, set head to null
      size--;
      return true;
    }

    Node cur = head;
    Node prev = null;

    while (cur.next != null) {
      prev = cur;
      cur = cur.next;
    }

    prev.next = null;
    size--;
    return true;
  }

  private void printError(String eMsg){
    System.out.print(eMsg);
  }

  public void printList() {
    System.out.println("Current List Size: " + size);
    Node cur = head;

    for (int i =0; i < size; i++) {
      System.out.println(cur.data);
      cur = cur.next;
    }
  }

  @Override
  public String toString() {
    // Initialize an empty string builder
    StringBuilder sb = new StringBuilder();

    // Iterate over the list and append each element to the string builder
    for (Node node = head; node != null; node = node.next) {
      sb.append(node.data);

      // Add a comma and a space between elements, but not after the last element
      if (node.next != null) {
        sb.append(", ");
      }
    }

    // Return the final string
    return sb.toString();
  }

  public class Node{
    Object data;
    Node next;
    public Node(Object data) {
      this.data = data;
      next = null;
    }
  }

}
