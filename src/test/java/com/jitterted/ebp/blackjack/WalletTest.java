package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class WalletTest {

    @Test
    public void newWalletIsEmpty() throws Exception {
        Wallet wallet = new Wallet();

        assertThat(wallet.isEmpty())
                .isTrue();
    }

    @Test
    public void newWalletAddMoneyIsNotEmpty() throws Exception {
        Wallet wallet = new Wallet();

        wallet.addMoney(1);

        assertThat(wallet.isEmpty())
                .isFalse();
    }

    @Test
    public void newWalletHasZeroBalance() throws Exception {
        Wallet wallet = new Wallet();

        assertThat(wallet.balance())
                .isZero();
    }

    @Test
    public void newWalletAddMoneyOf10HasBalanceOf10() throws Exception {
        Wallet wallet = new Wallet();

        wallet.addMoney(10);

        assertThat(wallet.balance())
                .isEqualTo(10);
    }

    @Test
    public void newWalletAdd7AndAdd8ThenBalanceIs15() throws Exception {
        // GIVEN a new wallet
        Wallet wallet = new Wallet();

        // WHEN add 7
        wallet.addMoney(7);
        // and  add 8
        wallet.addMoney(8);

        // THEN balance is 15
        assertThat(wallet.balance())
                .isEqualTo(7 + 8); // EVIDENT DATA
    }
}
