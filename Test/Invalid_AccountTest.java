import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Invalid_AccountTest {
    Invalid_Account invalid_account;
    @BeforeEach
    void setup(){
        invalid_account = new Invalid_Account();
    }
    @Test
    void invalidAccount() {
        String accountTest = "123abc_";
        boolean expect = true;
        boolean result = invalid_account.invalidAccount(accountTest);
        assertEquals(expect, result);
    }
    @Test
    void invalidAccount1() {
        String accountTest = "_abc123";
        boolean expect = true;
        boolean result = invalid_account.invalidAccount(accountTest);
        assertEquals(expect, result);
    }
    @Test
    void invalidAccount2() {
        String accountTest = "______";
        boolean expect = true;
        boolean result = invalid_account.invalidAccount(accountTest);
        assertEquals(expect, result);
    }
    @Test
    void invalidAccount3() {
        String accountTest = "123456";
        boolean expect = true;
        boolean result = invalid_account.invalidAccount(accountTest);
        assertEquals(expect, result);
    }
    @Test
    void invalidAccount4() {
        String accountTest = "abcdefg";
        boolean expect = true;
        boolean result = invalid_account.invalidAccount(accountTest);
        assertEquals(expect, result);
    }
    @Test
    void invalidAccount5() {
        String accountTest = ".@";
        boolean expect = false;
        boolean result = invalid_account.invalidAccount(accountTest);
        assertEquals(expect, result);
    }
    @Test
    void invalidAccount6() {
        String accountTest = "12345";
        boolean expect = false;
        boolean result = invalid_account.invalidAccount(accountTest);
        assertEquals(expect, result);
    }
    @Test
    void invalidAccount7() {
        String accountTest = "1234_";
        boolean expect = false;
        boolean result = invalid_account.invalidAccount(accountTest);
        assertEquals(expect, result);
    }
    @Test
    void invalidAccount8() {
        String accountTest = "abcde";
        boolean expect = false;
        boolean result = invalid_account.invalidAccount(accountTest);
        assertEquals(expect, result);
    }
}
