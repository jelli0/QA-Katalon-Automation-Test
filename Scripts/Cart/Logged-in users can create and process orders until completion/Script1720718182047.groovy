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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.demoblaze.com/')

WebUI.click(findTestObject('Object Repository/Cart/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Cart/input_Username_loginusername'), 'InternalQA')

WebUI.setEncryptedText(findTestObject('Object Repository/Cart/input_Password_loginpassword'), 'p4y+y39Ir5O++RH4jAhtiA==')

WebUI.click(findTestObject('Object Repository/Cart/button_Log in'))

WebUI.waitForElementVisible(findTestObject('Login/a_Welcome InternalQA'), 0)

WebUI.click(findTestObject('Object Repository/Cart/a_Phones'))

WebUI.click(findTestObject('Object Repository/Cart/a_Samsung galaxy s6'))

WebUI.click(findTestObject('Object Repository/Cart/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/Cart/a_Cart'))

WebUI.waitForElementVisible(findTestObject('Cart/button_Place Order'), 0)

WebUI.click(findTestObject('Object Repository/Cart/button_Place Order'))

WebUI.setText(findTestObject('Object Repository/Cart/input_Name_name'), 'Jelly')

WebUI.setText(findTestObject('Object Repository/Cart/input_Country_country'), 'Gunungkidul')

WebUI.setText(findTestObject('Object Repository/Cart/input_City_city'), 'Yogyakarta')

WebUI.setText(findTestObject('Object Repository/Cart/input_Credit card_card'), '122239908089')

WebUI.setText(findTestObject('Object Repository/Cart/input_Month_month'), '09')

WebUI.setText(findTestObject('Object Repository/Cart/input_Year_year'), '2028')

WebUI.click(findTestObject('Object Repository/Cart/button_Purchase'))

WebUI.click(findTestObject('Object Repository/Cart/button_OK'))

WebUI.waitForElementVisible(findTestObject('Login/a_Welcome InternalQA'), 0)

WebUI.closeBrowser()

