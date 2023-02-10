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
        CustomList<Integer> sut = new CustomArrayList<>();
        //act
        sut.add(10);
        //assert
        assertEquals(10, sut.get(0));
        assertEquals(1, sut.getSize());
    }

    @Test
    void should_add_11_items() {
        CustomList<Integer> sut = new CustomArrayList<>();
       for (int i=0; i<11; i++){
           sut.add(i);
       }
       for (int i=0; i< sut.getSize(); i++){
          assertEquals(i+1, sut.getSize());
       }
       assertEquals(11, sut.getSize());
    }
    @Test
    void get() {
    }
}