package list;

import org.junit.jupiter.api.Test;

public class DoublyListIntTest extends ListIntTest {
    @Test

    @Override
    public ListInt implementation() {
        return new DoublyLinkedListInt();
    }
}
