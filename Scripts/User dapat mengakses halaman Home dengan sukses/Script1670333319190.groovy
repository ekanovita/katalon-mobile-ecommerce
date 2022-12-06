import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
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

def appPath = System.getProperty('user.dir') + GlobalVariable.base_apk

//def appPath = PathUtil.equals(GlobalVariable.base_apk, RunConfiguration.getProjectDir())
//println('----TEST : ' + appPath)

Mobile.startApplication(appPath, true)

Mobile.waitForElementPresent(findTestObject('Homepage/android.widget.TextView - E-Commerce Android App'), 2)

Mobile.verifyElementExist(findTestObject('Homepage/android.widget.TextView - E-Commerce Android App'), 0)

Mobile.verifyElementExist(findTestObject('Homepage/android.widget.TextView - Recent'), 0)

Mobile.verifyElementExist(findTestObject('Homepage/android.widget.TextView - Category'), 0)

Mobile.verifyElementExist(findTestObject('Homepage/android.widget.TextView - Help'), 0)

Mobile.verifyElementExist(findTestObject('Homepage/android.widget.TextView - Profile'), 0)

Mobile.closeApplication()

