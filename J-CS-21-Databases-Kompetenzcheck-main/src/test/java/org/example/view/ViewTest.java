package org.example.view;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ViewTest {

    @Test
    public void getPMInfoTest(){
        View view = new View();
        assertEquals("Berlin", view.getPMInfo().getLocation());
    }

}
