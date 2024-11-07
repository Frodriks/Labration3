import org.example.Validator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidatorTest {

    Validator validator = new Validator();

    @Test
    @DisplayName("Test Validator - Phone number is valid (True)")
    void testThatPhoneNumberIsValidTrue() {
        assertTrue(Validator.isPhoneNumberValid("074312421"));
    }

    @Test
    @DisplayName("Test Validator - Email is valid (False)")
    void isEmailValid() {
        assertFalse(Validator.isEmailValid("fredrik.ohlander@iths."));
    }
}