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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Keranjang/AddCart_ByIcon'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Homepage  Kimia Farma/cart_icon'))

WebUI.click(findTestObject('Page_My Cart  Kimia Farma/tambahBarang_icon'))

WebUI.click(findTestObject('Page_My Cart  Kimia Farma/BayarButton_ToShipping'))

WebUI.click(findTestObject('Page_Shipping Address  Kimia Farma/BayarButton_ToPayment'))

WebUI.click(findTestObject('Page_Payment Method  Kimia Farma/label_Virtual Account'))

WebUI.click(findTestObject('Page_Payment Method  Kimia Farma/a_Bayar'))

WebUI.selectOptionByLabel(findTestObject('Page_Checkout Payment  Kimia Farma/select_PilihBank'), 'Mandiri', false)

WebUI.click(findTestObject('Page_Checkout Payment  Kimia Farma/button_Proses'))

