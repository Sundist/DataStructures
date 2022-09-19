package list.generic;

public class CircularGenericListTest extends GenericListTest {

    @Override
    public GenericList implementation() {
        return new CircularGenericList();
    }
}
