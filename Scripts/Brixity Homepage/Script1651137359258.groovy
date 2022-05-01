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

WebUI.click(findTestObject('Object Repository/Page_/button_picturesource typeimagewebp srcsetst_e52943'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_/svg__css-uwwqev'))

WebUI.delay(2)

WebUI.switchToWindowTitle('Brixity (@playbrixity) / 트위터')

WebUI.verifyElementVisible(findTestObject('Page_Brixity (playbrixity)/div_playbrixity'), FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowTitle('브릭시티')

WebUI.click(findTestObject('Object Repository/Page_/svg__css-uwwqev_1'))

WebUI.delay(2)

WebUI.switchToWindowTitle('Brixity - YouTube')

WebUI.verifyElementVisible(findTestObject('Page_Brixity - YouTube/yt-formatted-string_Brixity'), FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowTitle('브릭시티')

WebUI.click(findTestObject('Object Repository/Page_/svg__css-uwwqev_1_2'))

WebUI.delay(2)

WebUI.switchToWindowTitle('Brixity - 홈 | Facebook')

WebUI.verifyElementVisible(findTestObject('Page_Brixity -   Facebook/h1_Brixity'), FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowTitle('브릭시티')

WebUI.click(findTestObject('Object Repository/Page_/button_'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_/button__1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_/button__1_2'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_/button__1_2_3'))

WebUI.delay(2)

WebUI.switchToWindowTitle('브릭시티')

WebUI.click(findTestObject('Object Repository/Page_/a_'))

WebUI.delay(2)

WebUI.switchToWindowTitle('브릭시티')

WebUI.click(findTestObject('Object Repository/Page_/a__1'))

WebUI.delay(2)

WebUI.switchToWindowTitle('브릭시티')

WebUI.click(findTestObject('Object Repository/Page_/a__1_2'))

WebUI.delay(2)

WebUI.switchToWindowTitle('브릭시티')

WebUI.click(findTestObject('Object Repository/Page_/svg__css-1jm98op'))

WebUI.delay(2)

WebUI.switchToWindowTitle('브릭시티')

WebUI.setText(findTestObject('Object Repository/Page_/input__css-1mby5p4'), 'yib950@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_/span__css-12pj4y1'))

WebUI.click(findTestObject('Object Repository/Page_/button__1_2_3_4'))

