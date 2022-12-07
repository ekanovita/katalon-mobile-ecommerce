import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('User dapat mengakses halaman Home dengan sukses'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Homepage/android.widget.TextView - Category'), 0)

Mobile.waitForElementPresent(findTestObject('Category/android.widget.TextView - Category'), 2)

Mobile.tap(findTestObject('Category/android.widget.TextView'), 0)

Mobile.waitForElementPresent(findTestObject('Category/android.widget.AutoCompleteTextView - Search'), 2)

Mobile.verifyElementExist(findTestObject('Category/android.widget.TextView - Fashions'), 0)

Mobile.tap(findTestObject('Category/android.widget.TextView - Fashions'), 0)

Mobile.waitForElementPresent(findTestObject('Category/android.widget.TextView - Gold Titanium Diamond Womens Bracelet'), 
    2)

Mobile.tap(findTestObject('Category/android.widget.TextView - Gold Titanium Diamond Womens Bracelet'), 0)

Mobile.waitForElementPresent(findTestObject('Category/android.widget.TextView - Gold Titanium Diamond Womens Bracelet (1)'), 
    2)

Mobile.verifyElementExist(findTestObject('Category/android.widget.TextView - Gold Titanium Diamond Womens Bracelet (1)'), 
    0)

Mobile.verifyElementExist(findTestObject('Category/android.widget.TextView - 199 USD'), 0)

Mobile.verifyElementExist(findTestObject('Category/android.widget.TextView - 10 item(s)'), 0)

Mobile.verifyElementExist(findTestObject('Category/android.widget.Button - ADD TO CART'), 0)

Mobile.closeApplication()

