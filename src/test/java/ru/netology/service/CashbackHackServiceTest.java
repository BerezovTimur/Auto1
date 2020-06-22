package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    private CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void shouldBuyUnder1000() {
        int actual = cashbackHackService.remain(900);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldBuyOver1000() {
        int actual = cashbackHackService.remain(1200);
        int expected = 800;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldBuyButNotBuy() {
        int actual = cashbackHackService.remain(0);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldBuy1000() {
        int actual = cashbackHackService.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }
}
