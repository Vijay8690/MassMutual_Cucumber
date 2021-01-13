$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/scenerio.feature");
formatter.feature({
  "name": "Exercise values calculation check",
  "description": "Description: Exercise calculation check",
  "keyword": "Feature"
});
formatter.background({
  "name": "User logged in Exercise application",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user naviagte to Exercise app",
  "keyword": "Given "
});
formatter.match({
  "location": "com.massmutual.stepdefs.Background_StepDef.user_naviagte_to_exercise_app()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: net::ERR_NAME_NOT_RESOLVED\n  (Session info: chrome\u003d87.0.4280.141)\nBuild info: version: \u00274.0.0-alpha-4\u0027, revision: \u0027c2d955b49e\u0027\nSystem info: host: \u0027VIJAYSUMANA\u0027, ip: \u0027192.168.0.190\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.141, chrome: {chromedriverVersion: 87.0.4280.88 (89e2380a3e36c..., userDataDir: C:\\Users\\VIJAY~1.VIJ\\AppDat...}, goog:chromeOptions: {debuggerAddress: localhost:51094}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 909600e90a7e19a71a77bd865d49e3ed\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:196)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:129)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:161)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:582)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:282)\r\n\tat com.massmutual.PageObjects.LoginPage.navigateTo(LoginPage.java:24)\r\n\tat com.massmutual.stepdefs.Background_StepDef.user_naviagte_to_exercise_app(Background_StepDef.java:34)\r\n\tat ✽.user naviagte to Exercise app(file:///C:/Users/Vijay.VIJAYSUMANA/Pictures/MassMutual_Round2%20-%20Copy/src/test/resources/Features/scenerio.feature:12)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user enters userid and password",
  "keyword": "When "
});
formatter.match({
  "location": "com.massmutual.stepdefs.Background_StepDef.user_enters_userid_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.massmutual.stepdefs.Background_StepDef.user_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user navigated to dashboard screen",
  "keyword": "Then "
});
formatter.match({
  "location": "com.massmutual.stepdefs.Background_StepDef.user_navigated_to_dashboard_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Exercise1 screen validation",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user navigated to values screen",
  "keyword": "When "
});
formatter.match({
  "location": "com.massmutual.stepdefs.Validation_StepDef.user_navigated_to_values_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify count of 6 fields values appears on screen",
  "keyword": "Then "
});
formatter.match({
  "location": "com.massmutual.stepdefs.Validation_StepDef.verify_count_of_fields_values_appears_on_screen(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify values on screen greater than 0",
  "keyword": "And "
});
formatter.match({
  "location": "com.massmutual.stepdefs.Validation_StepDef.verify_values_on_screen_greater_than(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify total balance is correct based on values listed on screen",
  "keyword": "And "
});
formatter.match({
  "location": "com.massmutual.stepdefs.Validation_StepDef.verify_total_balance_is_correct_based_on_values_listed_on_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify values currency format",
  "keyword": "And "
});
formatter.match({
  "location": "com.massmutual.stepdefs.Validation_StepDef.verify_values_currency_format()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});