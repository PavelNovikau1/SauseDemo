package tests;

public class TestListner {
}

    @Attachment(value = "screenshot", type = "image/png")
    public static byte[] takeScreenshot(ITestResult iTestResult) {
        ITestContext context = iTestResult.getTestContext();
        try{
            WebDriver driver = (WebDriver) context.getAttribute("driver");
            if (driver != null) {
                return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            } else {
                return new byte[] {};
            }
        } catch (NoSuchSessionException | IllegalStateException exception) {
            return new byte[] {};
        }
    }
