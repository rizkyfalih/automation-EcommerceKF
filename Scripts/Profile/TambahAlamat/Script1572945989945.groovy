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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('UserAuthentication/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Homepage  Kimia Farma/span_profile'))

WebUI.click(findTestObject('Page_Homepage  Kimia Farma/a_Daftar Alamat'))

WebUI.click(findTestObject('Page_My Address  Kimia Farma/button_Tambah Alamat Baru'))

WebUI.setText(findTestObject('Page_My Address  Kimia Farma/nama_alamat'), 'Kantor')

WebUI.setText(findTestObject('Page_My Address  Kimia Farma/nama_penerima'), 'QA Gits')

WebUI.setText(findTestObject('Page_My Address  Kimia Farma/nomor_hp'), '082213994858')

WebUI.waitForElementVisible(findTestObject('Page_My Address  Kimia Farma/select_Provinsi'), 60)

WebUI.selectOptionByValue(findTestObject('Page_My Address  Kimia Farma/select_Provinsi'), 'JAWA BARAT', true)

WebUI.waitForElementVisible(findTestObject('Page_My Address  Kimia Farma/select_City'), 60)

WebUI.selectOptionByValue(findTestObject('Page_My Address  Kimia Farma/select_City'), 'KOTA BANDUNG', true)

WebUI.waitForElementVisible(findTestObject('Page_My Address  Kimia Farma/select_Subdistrict'), 60)

WebUI.selectOptionByValue(findTestObject('Page_My Address  Kimia Farma/select_Subdistrict'), 'ANDIR', true)

WebUI.waitForElementVisible(findTestObject('Page_My Address  Kimia Farma/select_Subdistrict2'), 60)

WebUI.selectOptionByValue(findTestObject('Page_My Address  Kimia Farma/select_Subdistrict2'), 'CIROYOM', true)

WebUI.waitForElementVisible(findTestObject('Page_My Address  Kimia Farma/alamat'), 30)

WebUI.click(findTestObject('Page_My Address  Kimia Farma/alamat'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_My Address  Kimia Farma/alamat'), 'Testing')

WebUI.waitForElementVisible(findTestObject('Page_My Address  Kimia Farma/kode_pos'), 30)

WebUI.setText(findTestObject('Page_My Address  Kimia Farma/kode_pos'), '40123')

WebUI.waitForElementVisible(findTestObject('Page_My Address  Kimia Farma/catatan'), 30)

WebUI.setText(findTestObject('Page_My Address  Kimia Farma/catatan'), 'Disebelah kantor KITS')

WebUI.waitForElementVisible(findTestObject('Page_My Address  Kimia Farma/button_Simpan'), 30)

WebUI.click(findTestObject('Page_My Address  Kimia Farma/button_Simpan'))

