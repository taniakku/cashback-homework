package service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainUnderBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 350;
        int expected = 650;
        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);


    }

    @Test
    public void testRemainOverBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1300;
        int expected = 700;
        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);


    }

    @Test
    public void testRemainOnBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);


    }
}