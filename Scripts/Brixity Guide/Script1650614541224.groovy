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

WebUI.navigateToUrl('https://www.playbrixity.com/ko/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_/button_'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_/button__1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_/button__1_2'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_/button__1_2_3'))

WebUI.delay(2)

WebUI.switchToWindowTitle('브릭시티 세계관 가이드북 목록')

WebUI.click(findTestObject('Object Repository/Page_/a_1 -'))

WebUI.click(findTestObject('Object Repository/Page_1/a_1'))

WebUI.click(findTestObject('Object Repository/Page_/a_2 -'))

WebUI.click(findTestObject('Object Repository/Page_2/a_2'))

WebUI.click(findTestObject('Object Repository/Page_/a_3 -'))

WebUI.click(findTestObject('Object Repository/Page_3/a_3'))

WebUI.click(findTestObject('Object Repository/Page_/a_4 -'))

WebUI.closeBrowser()

