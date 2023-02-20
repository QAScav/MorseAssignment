package morseKorse;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class morseTest {
    @Test
    public void testholdning() {
        translate TDD = new translate();
        TDD.toHolding("Hej");
        String actual = TDD.toBeTranslated.get(0);
        String expected = "Hej";
        assertEquals(expected, actual);
        System.out.println(TDD.toBeTranslated);
    }

    @Test
    public void testHoldingtoMorse() {
        //arrange
        translate TDD = new translate();
        //act
        TDD.toHolding("aa");
        TDD.HoldingToMorse();
        String expected = ".- .- ";
        String actual = TDD.getResult();
        System.out.println(TDD.getResult());
        assertEquals(expected, actual);
    }

    @Test
    public void testHoldingtoEnglish() {
        //arrange
        translate TDD = new translate();
        //act
        TDD.toHolding(".- .-");
        TDD.HoldingToEnglish();
        String expected = "aa";
        String actual = TDD.getResult();
        System.out.println(TDD.getResult());
        assertEquals(expected, actual);
    }


}












