package list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListIntTest extends ListIntTest {

    @Override
    public ListInt implementation() {
        return new ArrayListInt();
    }

}
