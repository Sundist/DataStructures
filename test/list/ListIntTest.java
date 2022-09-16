package list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public abstract class ListIntTest {


    public abstract ListInt implementation();

    @Test
    public void testSimpleAdd() {
        ListInt list = implementation();
        int[] array = addAllToList(list);

        for (int i = 0; i < array.length; i++) {
            assertEquals(array[i], list.get(i));
        }
    }

    @Test
    public void testSimpleSize() {
        ListInt list = implementation();
        int[] array = addAllToList(list);

        assertEquals(array.length, list.size());
    }

    @Test
    public void testSimpleDelete() {
        ListInt list = implementation();
        int[] array = addAllToList(list);

        for (int a : array) {
            list.remove(a);
        }

        assertEquals(0, list.size());
    }

    private int[] addAllToList(ListInt list) {
        int[] array = {1, 2, 3, 4, 5};
        for (int a : array) {
            list.add(a);
        }
        return array;
    }
}
