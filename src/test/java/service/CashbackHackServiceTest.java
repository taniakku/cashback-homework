package service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemainUnderBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 250;
        int expected = 750;
        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);

    }

    @Test
    public void shouldRemainOverBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1400;
        int expected = 600;
        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);

    }

    @Test
    public void shouldRemainOnBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);

    }
}