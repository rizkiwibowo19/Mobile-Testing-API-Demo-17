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

Mobile.startApplication('C:\\Users\\User\\Documents\\api.apk', true)

Mobile.tap(findTestObject('Object Repository/API Demos 17/SMS Messaging/android.widget.Button - OK'), 
    0)

Mobile.tap(findTestObject('Object Repository/API Demos 17/SMS Messaging/android.widget.TextView - OS'), 
    0)

Mobile.tap(findTestObject('Object Repository/API Demos 17/SMS Messaging/android.widget.TextView - SMS Messaging'), 
    0)

Mobile.tap(findTestObject('Object Repository/API Demos 17/SMS Messaging/android.widget.CheckBox - Enable SMS broadcast receiver'), 
    0)

Mobile.verifyElementChecked(findTestObject('Object Repository/API Demos 17/SMS Messaging/android.widget.CheckBox - Enable SMS broadcast receiver (1)'), 
    0)

Mobile.setText(findTestObject('Object Repository/API Demos 17/SMS Messaging/android.widget.EditText'), 
    '082182973056', 0)

Mobile.setText(findTestObject('Object Repository/API Demos 17/SMS Messaging/android.widget.EditText (1)'), 
    'Halo ganteng', 0)

Mobile.tap(findTestObject('Object Repository/API Demos 17/SMS Messaging/android.widget.Button - Send'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/API Demos 17/SMS Messaging/android.widget.TextView - Message sent'), 
    'Message sent!')

Mobile.setText(findTestObject('Object Repository/API Demos 17/SMS Messaging/android.widget.EditText - 082182973056'), 
    'Rizki W', 0)

Mobile.setText(findTestObject('Object Repository/API Demos 17/SMS Messaging/android.widget.EditText (1)'), 
    'Halo ganteng', 0)

Mobile.tap(findTestObject('Object Repository/API Demos 17/SMS Messaging/android.widget.Button - Send'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/API Demos 17/SMS Messaging/android.widget.TextView - Error Null PDU'), 
    'Error: Null PDU.')

Mobile.closeApplication()

