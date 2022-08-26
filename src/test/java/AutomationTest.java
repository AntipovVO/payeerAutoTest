import org.testng.annotations.Test;

public class AutomationTest extends Driver {
    @Test
    public void transferToUSDPayeerAccount() throws InterruptedException {
        BalancePage balancePage = new BalancePage();
        balancePage.clickUSDType();
        balancePage.clickTransferMoney();
        balancePage.clickPayeerPaymentSystem();
        balancePage.clickAndInputTransferAmount("0.02");
        balancePage.clickAndInputPayeerAccount("P64693020");
        balancePage.clickTransferButton();
        balancePage.clickConfirmButton();
        balancePage.clickCloseButton();
        balancePage.clickBalanceButton();
    }

    @Test
    public void exchangeUSD() throws InterruptedException {
        BalancePage balancePage = new BalancePage();
        ExchangePage exchangePage = new ExchangePage();
        balancePage.clickUSDType();
        exchangePage.clickExchangeMoney();
        exchangePage.clickAndInputExchangeAmount("0.01");
        exchangePage.clickPerformExchange();
        balancePage.clickBalanceButton();
    }

    @Test
    public void goToSettingPage() {
        SettingsPage settingsPage = new SettingsPage();
        settingsPage.clickGoToSettingPage();
//        settingsPage.checkingGoToSetting();
    }

    @Test
    public void goToAccountSetting() throws InterruptedException {
        SettingsPage settingsPage = new SettingsPage();
        settingsPage.clickGoToSettingPage();
        settingsPage.clickEditProfile();
        settingsPage.checkingGoToAccountSetting();
    }

    @Test
    public void goToHistoryPage() throws InterruptedException {
        HistoryPage historyPage = new HistoryPage();
        historyPage.clickGoToHistoryPage();
        historyPage.checkingGoToHistoryPage();
    }

    @Test
    public void switchLanguage() throws InterruptedException {
        SettingsPage settingsPage = new SettingsPage();
        settingsPage.clickGoToSettingPage();
        settingsPage.switchLanguage();
    }

    @Test
    public void switchVisualTheme() throws InterruptedException {
        SettingsPage settingsPage = new SettingsPage();
        settingsPage.clickGoToSettingPage();
        settingsPage.switchVisualTheme();
    }

    @Test
    public void goToBalancePage() throws InterruptedException {
        BalancePage balancePage = new BalancePage();
        balancePage.clickUSDType();
        balancePage.clickBalanceButton();
        balancePage.balancePageisSelected();
    }

    @Test
    public void currencyCarouselTest() throws InterruptedException {
        BalancePage balancePage = new BalancePage();
        balancePage.clickUSDType();
        balancePage.currencyCarousel();
    }

    @Test
    public void goToStockExchangePage() throws InterruptedException {
        StockExchange stockExchange = new StockExchange();
        stockExchange.clickGoToStockExchange();
    }

    @Test
    public void transferCrypto() throws InterruptedException {
        BalancePage balancePage = new BalancePage();
        balancePage.clickBitcoinType();
        balancePage.clickTransferMoney();
        balancePage.clickPayeerPaymentSystem();
        balancePage.clickBackButton();
        balancePage.thisIsChoosePaymentSystemPage();
    }

    @Test
    public void exchangeCrypto() throws InterruptedException {
        BalancePage balancePage = new BalancePage();
        balancePage.clickBitcoinType();
        balancePage.clickExchangeMoney();
        balancePage.thisIsBTCCurrency();
    }
}
