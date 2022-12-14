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

Mobile.startExistingApplication('com.android.contacts')

Mobile.tap(findTestObject('Object Repository/Contacts/android.widget.ImageButton'), 0)

Mobile.setText(findTestObject('Object Repository/Contacts/android.widget.EditText - Name'), 'TestLagi', 0)

Mobile.setText(findTestObject('Object Repository/Contacts/android.widget.EditText - Phone'), '0891234', 0)

Mobile.setText(findTestObject('Object Repository/Contacts/android.widget.EditText - Email'), 'test@email.com', 0)

Mobile.scrollToText('More fields', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Contacts/android.widget.EditText - Email (1)'), 'test1@email.com', 0)

Mobile.tap(findTestObject('Object Repository/Contacts/android.widget.TextView'), 0)

txtLargeTitle = Mobile.getText(findTestObject('Object Repository/Contacts/android.widget.TextView - Koswara'), 0)

println(txtLargeTitle.toString())

Mobile.verifyElementText(findTestObject('Contacts/android.widget.TextView - Koswara'), txtLargeTitle)

Mobile.verifyElementAttributeValue(findTestObject('Contacts/android.widget.TextView - Koswara'), 'resource-id', 'com.android.contacts:id/large_title', 
    0)

Mobile.closeApplication()

