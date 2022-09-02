package list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListIntTest extends ListIntTest {

    @Override
    public ListInt implementation() {
        return new LinkedListInt();
    }

}
