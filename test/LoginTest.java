/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LoginTest {

    Login login = new Login();

    @Test
    public void testUsernameCorrect() {
        assertTrue(login.checkUserName("mb_1"));
    }

    @Test
    public void testUsernameIncorrect() {
        assertFalse(login.checkUserName("mbalz!!!"));
    }

    @Test
    public void testPasswordCorrect() {
        assertTrue(login.checkPasswordComplexity("Mbali@123"));
    }

    @Test
    public void testPasswordIncorrect() {
        assertFalse(login.checkPasswordComplexity("mbalzcute"));
    }

    @Test
    public void testCellCorrect() {
        assertTrue(login.checkCellPhoneNumber("+27838968976"));
    }

    @Test
    public void testCellIncorrect() {
        assertFalse(login.checkCellPhoneNumber("08966553"));
    }

    @Test
    public void testLoginSuccess() {
        login.registerUser("mbali_27", "mbaliiscute@", "+27838968976", "Mbali", "Dube");
        assertTrue(login.loginUser("mbali_27", "mbaliiscute@"));
    }

    @Test
    public void testLoginFail() {
        assertFalse(login.loginUser("wrong", "wrong"));
     
  
    }
}