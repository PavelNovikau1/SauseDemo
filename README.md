****************************************** HOME_WORK_14 ****************************************************

**1.a. Обновить версии всех библиотек в проекте и ее вывод, например**
[INFO] The following dependencies in Dependencies have newer versions:

Pavel@Pavel-PC MINGW64 ~/IdeaProjects/QA_08onl/SauseDemo (feature_home_work_14)
$ mvn versions:display-dependency-updates

[INFO] No dependencies in Dependencies have newer versions.
[INFO] Finished at: 2021-11-10T17:58:26+02:00

b.
[INFO] The following dependencies in Dependencies have newer versions:
[INFO]   org.seleniumhq.selenium:selenium-java .............. 3.141.59 -> 4.0.0

**2. Запустить тесты используя mvn clean test команду и ее вывод:**

[INFO] Tests run: 21, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 113.366 s - in TestSuite
[INFO] Finished at: 2021-11-10T18:42:46+02:00

**3. Использовать параметры для запуска конкретных тестов и методов** 

   mvn clean test D-test=LoginTests test

[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 27.36 s - in tests.LoginTests
[INFO] Finished at: 2021-11-10T18:20:40+02:00

**4. * Пробросить параметр из mvn command line внутрь теста**

mvn clean -Dtest=CheckOutCompleteTests#verificationOfSuccessfulPurchaseTest -Dusername="standard_user" -Dpassword="secret_sause" test

[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 6.26 s - in tests.LoginTests
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] Finished at: 2021-11-10T19:22:31+02:00




############################################################################################
**Checklist for:    https://www.saucedemo.com**
**id                   summary**
1. login_1. Checking the login to the account with a valid username and password: PASSED
2. login_2. Account login check with empty username and password fields: PASSED
3. login_3. Account login check with empty username and valid password: PASSED
4. headerPage_1. Checking if PopUpMenu is open: PASSED
5. headerPage_2. Checking of sign out from account: PASSED
6. cart_1. Checking the possibility of adding an item to the cart: PASSED
7. cart_2. Checking the possibility of removing an item from the cart:
8. checkOutComplete_1. Checking the possibility of purchasing a product: PASSED
9. checkOutComplete_2. Checking the possibility of returning to the product page after purchasing the product: PASSED
10. prodPage_1. Checking the sorting of goods price high to low:
11. prodPage_2. Checking the sorting of goods name 


    






