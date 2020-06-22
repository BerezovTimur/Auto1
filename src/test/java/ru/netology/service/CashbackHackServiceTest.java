package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    void shouldBuyUnder1000() {
        int actual = cashbackHackService.remain(900);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    void shouldBuyOver1000() {
        int actual = cashbackHackService.remain(1200);
        int expected = 800;
        assertEquals(expected, actual);
    }

    @Test
    void shouldBuyButNotBuy() {
        int actual = cashbackHackService.remain(0);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    void shouldBuy1000() {
        int actual = cashbackHackService.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

}