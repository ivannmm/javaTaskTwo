package javaTaskTwo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class readLineTest {

    @Test
    void getFile() {
        ArrayList<String> expected = new ArrayList<>();
        expected.add("C:\\Games\\Frostpunk");
        find find = new find();
        ArrayList<String> result = find.getFile(true, "C:\\Games", "openfontlicense.txt");
        assertEquals(expected, result);
    }
}