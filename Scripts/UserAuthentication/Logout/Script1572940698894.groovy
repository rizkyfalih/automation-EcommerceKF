import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://kimiafarma.gits.app/')

WebUI.click(findTestObject('Page_Homepage  Kimia Farma/a_Login'))

WebUI.setText(findTestObject('Page_Login  Kimia Farma/input_Login_email'), 'test123@gmail.com')

WebUI.setText(findTestObject('Page_Login  Kimia Farma/input_Login_password'), '123456')

WebUI.click(findTestObject('Page_Login  Kimia Farma/label_Tetap Masuk'))

WebUI.click(findTestObject('Page_Login  Kimia Farma/button_Login'))

WebUI.click(findTestObject('Page_Homepage  Kimia Farma/span_profile'))

WebUI.click(findTestObject('Page_Homepage  Kimia Farma/a_Logout'))

