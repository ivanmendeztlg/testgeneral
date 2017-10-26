import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.util.concurrent.locks.Condition

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('http://1106.logicommerce.net/?forceView=1')

'Creamos un nuevo TestObject para el boton Sign IN Account\r\n'
SignIn = new TestObject('SignIn')

'Decimos que este testobject contiene la propiedad Xpath que nos interesa'
SignIn.addProperty('xpath', ConditionType.EQUALS, "//a[contains(@href,'/user')][@title='Sign In']", true)

'clickamos en el test Obect\r\n'

WebUI.click(SignIn)

'Creamos un nuevo TestObject para el input Email en la pagina de login\r\n'
mail = new TestObject('mail')

'Decimos que este testobject contiene la propiedad Xpath que nos interesa'
mail.addProperty('xpath', ConditionType.EQUALS, "//input[@id='smallLoginEmailField']", true)

'rellenamos en el test Obect email con la variable global mailGlobal\r\n'

WebUI.setText(mail, GlobalVariable.mailGlobal)



'Creamos un nuevo TestObject para el input Password en la pagina de login\r\n'
Pass = new TestObject('Pass')

'Decimos que este testobject contiene la propiedad Xpath que nos interesa'
Pass.addProperty('xpath', ConditionType.EQUALS, "//input[@id='smallLoginPasswordField']", true)

'rellenamos en el test Obect pass con el pass que solemos usar: pass1\r\n'

WebUI.setText(Pass, 'pass1')



'Creamos un nuevo TestObject para el boton de Enter login\r\n'
Enter = new TestObject('Enter')

'Decimos que este testobject contiene la propiedad Xpath que nos interesa'
Enter.addProperty('xpath', ConditionType.EQUALS, "//input[@id='smallLoginSubmit']", true)

'clickamos en el testObject \r\n'
WebUI.click(Enter)




'Creamos un nuevo TestObject para el link de MyOrders login\r\n'
MyOrders = new TestObject('MyOrders')

'Decimos que este testobject contiene la propiedad Xpath que nos interesa'
MyOrders.addProperty('xpath', ConditionType.EQUALS, "//a[@class='userPanelLink userPanelOrdersLink'][@href='/user/orders']", true)

'clickamos en el testObject \r\n'

WebUI.click(MyOrders)



'Guardamos la url donde se encunetra el navegador en la variable miUrl'
String miUrl = WebUI.getUrl()

'Comprovamos que el valor de miUrl es el esperado'
WebUI.verifyMatch('http://1106.logicommerce.net/user/orders', miUrl, false)

//input[@class='form-control moduleField smallLoginField validate-email required']
/*
'Click en Sign in'
WebUI.click(findTestObject('ObjetosLogin/LoginVerdadero/Page_Herman Miller/a_Sign In'))

WebUI.setText(findTestObject('ObjetosLogin/LoginVerdadero/Page_Herman Miller (1)/input_email'), GlobalVariable.mailGlobal)

WebUI.setText(findTestObject('ObjetosLogin/LoginVerdadero/Page_Herman Miller (1)/input_password'), 'pass1')

WebUI.click(findTestObject('ObjetosLogin/LoginVerdadero/Page_Herman Miller (1)/input_smallLoginSubmit'))

WebUI.click(findTestObject('ObjetosLogin/LoginVerdadero/Page_Herman Miller (1)/a_My orders'))

WebUI.verifyElementText(findTestObject('ObjetosLogin/LoginVerdadero/Page_Herman Miller (2)/h1_My orders'), 'My orders')
*/

WebUI.closeBrowser()