package DataStructureTest;

import static org.junit.Assert.*;
import DataStructure.LinkedList;
import DataStructure.LinkedList.Node;
import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LinkedListTest {
  private static final int TIMEOUT = 500;

  @Test(timeout = TIMEOUT)
  public void test_addLast_method() {
    LinkedList list = new LinkedList();
    list.addLast("Hello World?");
    assertEquals("Should print out: ","Hello orld?", list.toString());
  }

  @Test(timeout = TIMEOUT)
  public void test_addFirst_method() {
    LinkedList list = new LinkedList();

  }
}// end test
