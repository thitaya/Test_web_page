import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Test_webpage')

suiteProperties.put('name', 'Test_webpage')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\thitaya\\Katalon Studio\\test3\\Reports\\Test_webpage\\20190802_173852\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Test_webpage', suiteProperties, [new TestCaseBinding('Test Cases/test1', 'Test Cases/test1',  null), new TestCaseBinding('Test Cases/test2', 'Test Cases/test2',  null), new TestCaseBinding('Test Cases/test3', 'Test Cases/test3',  null), new TestCaseBinding('Test Cases/test4', 'Test Cases/test4',  null), new TestCaseBinding('Test Cases/test5', 'Test Cases/test5',  null), new TestCaseBinding('Test Cases/test6', 'Test Cases/test6',  null), new TestCaseBinding('Test Cases/test7', 'Test Cases/test7',  null), new TestCaseBinding('Test Cases/test8', 'Test Cases/test8',  null), new TestCaseBinding('Test Cases/test9', 'Test Cases/test9',  null)])
