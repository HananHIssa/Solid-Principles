/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.opencloseprinciple.OpenClosedPrinciple;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author hp
 */
public class OpenClosedPrincipleTest {
    
    public OpenClosedPrincipleTest() {
    }
    
    @Test
    public void testCreditCardPaymentProcessor()
    {
        OpenClosedPrinciple.CreditCardPaymentProcessor creditcard=new OpenClosedPrinciple.CreditCardPaymentProcessor();
        String amount=creditcard.processPayment(100.0);
        assertEquals("Processing credit card payment of $100.0",amount);
    }
    @Test
    public void testPayPalPaymentProcessor()
    {
        OpenClosedPrinciple.PayPalPaymentProcessor paypal=new OpenClosedPrinciple.PayPalPaymentProcessor();
        String amount=paypal.processPayment(100.0);
        assertEquals("Processing PayPal payment of $100.0",amount);
    }
    
    
}
