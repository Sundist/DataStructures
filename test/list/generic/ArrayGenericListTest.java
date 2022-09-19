package list.generic;

public class ArrayGenericListTest extends GenericListTest {

    @Override
    public GenericList implementation() {
        return new ArrayGenericList();
    }
}
