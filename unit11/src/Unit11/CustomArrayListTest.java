package Unit11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayListTest {
    /*
    *
    */

    @Test
    void should_add_one_item_to_list() {
        //the three a's
        //Arrangement, Act, Assert

        //Arrangement
        CustomList<Integer> customList = new CustomArrayList<>();
        //act
        customList.add(10);
        //assert
        assertEquals(10, customList.get(0));
        assertEquals(1, customList.getSize());
    }

    @Test
    void getSize() {
    }

    @Test
    void get() {
    }
}