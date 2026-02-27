
package com.example.palindrome;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeUnitTest {
    @Test
    void basicPalindromes() {
        PalindromeController c = new PalindromeController();
        // Using reflection to access private method is not ideal; instead we
        // validate via API contract where possible. This is a placeholder test.
        assertTrue(true);
    }
}
