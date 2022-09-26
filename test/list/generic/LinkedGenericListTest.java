package list.generic;

public class LinkedGenericListTest extends GenericListTest {
    @Override
    public GenericList implementation() {
        return new LinkedGenericList<Integer>();
    }
}
