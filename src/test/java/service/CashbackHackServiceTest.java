package service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainUnderBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int expected = 995;
        int actual = cashbackHackService.remain(500);

        assertEquals(actual, expected);


    }

    @Test
    public void testRemainOverBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int expected = 997;
        int actual = cashbackHackService.remain(1300);

        assertEquals(actual, expected);


    }

    @Test
    public void testRemainOnBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int expected = 1000;
        int actual = cashbackHackService.remain(1000);

        assertEquals(actual, expected);


    }
}