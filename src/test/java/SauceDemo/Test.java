package SauceDemo;

public class Test {
    public static void main(String args[])
    {
        TestFunctions obj = new TestFunctions();
        obj.browserOpen();
        obj.login();
        obj.verification("//span[@class='title']","PRODUCTS");
        obj.addToCart();
        obj.cartLinkClick();
        obj.verification("//span[@class='title']", "YOUR CART");
        obj.checkoutButtonClick();
        obj.verification("//span[@class='title']", "CHECKOUT: YOUR INFORMATION");
        obj.checkoutInformation();
        obj.verification("//span[@class='title']", "CHECKOUT: OVERVIEW");
        obj.finishButton();
        obj.verification("//span[@class='title']", "CHECKOUT: COMPLETE!");
        obj.closeBrowser();
    }
}
