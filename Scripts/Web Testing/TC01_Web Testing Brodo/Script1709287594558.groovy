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

def akp = findTestData('Data Files/Test Data')

def userName = akp.getObjectValue('Username', 1)

def password = akp.getObjectValue('Password', 1)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://bro.do/')

WebUI.click(findTestObject('Object Repository/Web Testing Brodo/Page_BRODO Store  Brodo/svg_BRO LABS_icon icon-user'))

WebUI.setText(findTestObject('Object Repository/Web Testing Brodo/Page_Account  Brodo/input_Email_customeremail'), userName)

WebUI.setText(findTestObject('Object Repository/Web Testing Brodo/Page_Account  Brodo/input_Forgot_customerpassword'), 
    password)

WebUI.click(findTestObject('Object Repository/Web Testing Brodo/Page_Account  Brodo/input_Show_customerLogin'))

WebUI.click(findTestObject('Object Repository/Web Testing Brodo/Page_Account  Brodo/a_NON-FOOTWEAR'))

WebUI.click(findTestObject('Object Repository/Web Testing Brodo/Page_All Essentials  Brodo/div_Bigger Trucker Hat All Black'))

WebUI.click(findTestObject('Object Repository/Web Testing Brodo/Page_Bigger Trucker Hat All Black/span_Add to cart'))

WebUI.click(findTestObject('Object Repository/Web Testing Brodo/Page_Bigger Trucker Hat All Black/span_Check out'))

WebUI.click(findTestObject('Object Repository/Web Testing Brodo/Page_Checkout - Brodo/svg_Checkout_a8x1wuo _1fragemk5 _1fragemm9 _def4dd'))

WebUI.closeBrowser()

