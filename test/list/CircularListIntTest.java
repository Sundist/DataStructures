package list;

import org.junit.jupiter.api.Test;

public class CircularListIntTest extends ListIntTest {
    @Test

    @Override
    public ListInt implementation() {
        return new CircularLinkedListInt();
    }
}
