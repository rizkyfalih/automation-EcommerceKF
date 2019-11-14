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

WebUI.click(findTestObject('Page_Homepage  Kimia Farma/a_Daftar'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Register  Kimia Farma/input_Daftar_name'), 'test123')

WebUI.setText(findTestObject('Page_Register  Kimia Farma/input_Daftar_email'), 'test12@mailinator.com')

WebUI.setText(findTestObject('Page_Register  Kimia Farma/input_Daftar_phone'), '082213442121')

WebUI.click(findTestObject('Page_Register  Kimia Farma/label_Laki-laki'))

WebUI.selectOptionByValue(findTestObject('Page_Register  Kimia Farma/select_Day'), '12', true)

WebUI.selectOptionByValue(findTestObject('Page_Register  Kimia Farma/select_Month'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Register  Kimia Farma/select_Year'), '1997', true)

WebUI.setText(findTestObject('Page_Register  Kimia Farma/input_Perempuan_password'), '123456')

WebUI.setText(findTestObject('Page_Register  Kimia Farma/input_Perempuan_password_confirmation'), '123456')

WebUI.click(findTestObject('Page_Register  Kimia Farma/label_Saya telah membaca dan menyetujui Aturan Penggunaan dan                                Kebijakan Privasi Kimia Farma'))

WebUI.click(findTestObject('Page_Register  Kimia Farma/button_Daftar'))

