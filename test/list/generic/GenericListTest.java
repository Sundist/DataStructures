package list.generic;

import list.ListInt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public abstract class GenericListTest {

    public abstract GenericList implementation();

    @Test
    public void genericSimpleAdd() {
        GenericList list = implementation();
        Integer[] array = addAllToList(list);

        for (int i = 0; i < array.length; i++) {
            assertEquals(array[i], (Integer) list.get(i));
        }
    }

    @Test
    public void genericSimpleDelete() {
        GenericList list = implementation();
        Integer[] array = addAllToList(list);

        assertEquals(array.length, list.size());
    }

    @Test
    public void genericSimpleSize() {
        GenericList list = implementation();
        Integer[] array = addAllToList(list);

        for (Integer a : array) {
            list.remove(a);
        }

        assertEquals(0, list.size());
    }


    private Integer[] addAllToList(GenericList list) {
        Integer[] array = {1, 2, 3, 4, 5};
        for (Integer a : array
        ) {
            list.add(a);
        }
        return array;
    }


}
