import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('http://1106.logicommerce.net/?forceView=1')
/*
'Click en Sign in'
WebUI.click(findTestObject('ObjetosLogin/Page_Herman Miller/a_Sign In'))
*/
'Creamos un nuevo TestObject para el boton Create Account\r\n'
SignIn = new TestObject('SignIn')

'Decimos que este testobject contiene la propiedad Xpath que nos interesa'
SignIn.addProperty('xpath', ConditionType.EQUALS, "//a[contains(@href,'/user')][@title='Sign In']", true)

'clickamos en el test Obect\r\n'

WebUI.click(SignIn)





'Creamos un nuevo TestObject para el boton Create Account\r\n'
CreateAccount = new TestObject('CreateAccount')

'Decimos que este testobject contiene la propiedad Xpath que nos interesa'
CreateAccount.addProperty('xpath', ConditionType.EQUALS, "//a[contains(@href,'/createAccount')][@class='btn']", true)

'clickamos en el test Obect\r\n'

WebUI.click(CreateAccount)


// Queremos conseguir para cada vez que se lanze el text, colocar en mail una cadena del tipo tlg-ddMMYYYY-hash@tlg.com o similar
String s = 'tlg-'

s += new Date().format('yyyyMMdd')

s += '-'

Random randomGenerator = new Random()

int hash = randomGenerator.nextInt(100)

s += hash

'Hasta aqui generamos una cadena de formato tlg-fecha-hash@tlg.com\r\n'
s = (s + '@tlg.com')
GlobalVariable.mailGlobal = s;


'Creamos un nuevo TestObject para el campo Email\r\n'
mail = new TestObject('mail')

'Decimos que este testobject contiene la propiedad Xpath que nos interesa'
mail.addProperty('xpath', ConditionType.EQUALS, "//input[@id='userEmailField']", true)

'rellenamos  el test Obect\r\n'
WebUI.setText(mail, GlobalVariable.mailGlobal)

'Creamos un nuevo TestObject para el campo Adreca test 1\r\n'
Adreca1 = new TestObject('Adreca1')

'Decimos que este testobject contiene la propiedad Xpath que nos interesa'
Adreca1.addProperty('xpath', ConditionType.EQUALS, "//input[@id='userAddress1Field']", true)

'rellenamos  el test Obect\r\n'
WebUI.setText(Adreca1,'Adreca test 1')

'Creamos un nuevo TestObject para el campo Adreca test 2\r\n'
Adreca2 = new TestObject('Adreca2')

'Decimos que este testobject contiene la propiedad Xpath que nos interesa'
Adreca2.addProperty('xpath', ConditionType.EQUALS, "//input[@id='userAddress2Field']", true)

'rellenamos  el test Obect\r\n'
WebUI.setText(Adreca2,'Adreca test 2')


'Creamos un nuevo TestObject para el campo Compania\r\n'
Compania = new TestObject('Compania')

'Decimos que este testobject contiene la propiedad Xpath que nos interesa'
Compania.addProperty('xpath', ConditionType.EQUALS, "//input[@id='userCompanyField']", true)

'rellenamos  el test Obect\r\n'
WebUI.setText(Compania,' Compania Test')

'Creamos un nuevo TestObject para el campo Name\r\n'
Name = new TestObject('Name')

'Decimos que este testobject contiene la propiedad Xpath que nos interesa'
Name.addProperty('xpath', ConditionType.EQUALS, "//input[@id='userFirstNameField']", true)

'rellenamos  el test Obect\r\n'
WebUI.setText(Name,' Nombre Test')

'Creamos un nuevo TestObject para el campo Apellido\r\n'
Apellido = new TestObject('Apellido')

'Decimos que este testobject contiene la propiedad Xpath que nos interesa'
Apellido.addProperty('xpath', ConditionType.EQUALS, "//input[@id='userLastNameField']", true)

'rellenamos  el test Obect\r\n'
WebUI.setText(Apellido,' Apellido Test')

'Creamos un nuevo TestObject para el campo password\r\n'
Pass = new TestObject('Pass')

'Decimos que este testobject contiene la propiedad Xpath que nos interesa'
Pass.addProperty('xpath', ConditionType.EQUALS, "//input[@id='userPasswordField']", true)

'rellenamos  el test Obect\r\n'
WebUI.setText(Pass,'pass1')

'Creamos un nuevo TestObject para el campo Confirma Password\r\n'
CPass = new TestObject('CPass')

'Decimos que este testobject contiene la propiedad Xpath que nos interesa'
CPass.addProperty('xpath', ConditionType.EQUALS, "//input[@id='userRetypePasswordField']", true)

'rellenamos  el test Obect\r\n'
WebUI.setText(CPass,'pass1')

'Creamos un nuevo TestObject para el campo Phone\r\n'
Phone = new TestObject('Phone')

'Decimos que este testobject contiene la propiedad Xpath que nos interesa'
Phone.addProperty('xpath', ConditionType.EQUALS, "//input[@id='userPhoneField']", true)

'rellenamos  el test Obect\r\n'
WebUI.setText(Phone,'938050404')


/*
'Ponemos en el control de email\r\n la cadena generada'
WebUI.setText(findTestObject('ObjetosLogin/Page_Herman Miller (2)/input_Email'), GlobalVariable.mailGlobal)

'POnemos una adreca\r\n'
WebUI.setText(findTestObject('ObjetosLogin/Page_Herman Miller (2)/input_Address1'), 'Adreca test 1')

'POnemos la segunda adreca en el control input de adreca2'
WebUI.setText(findTestObject('ObjetosLogin/Page_Herman Miller (2)/input_Address2'), 'Adreca test 2')

'En el control de compania pongo un texto a mi eleccion\r\n'
WebUI.setText(findTestObject('ObjetosLogin/Page_Herman Miller (2)/input_Company'), ' Compania Test')

'Igual, pero en FirstName\r\n'
WebUI.setText(findTestObject('ObjetosLogin/Page_Herman Miller (2)/input_FirstName'), 'Nombre test')

'Igual, pero en SecondName'
WebUI.setText(findTestObject('ObjetosLogin/Page_Herman Miller (2)/input_LastName'), 'Apellido Test 1')

'insertamos la contrasena en el control input_Password\r\n'
WebUI.setText(findTestObject('ObjetosLogin/Page_Herman Miller (2)/input_Password'), 'pass1')

'Lo mismo, pero con el telefono\r\n'
WebUI.setText(findTestObject('ObjetosLogin/Page_Herman Miller (2)/input_Phone'), '938050404')

'Rellenamos el campo para confirmar la contrasena\r\n'
WebUI.setText(findTestObject('ObjetosLogin/Page_Herman Miller (2)/input_RetypePassword'), 'pass1')

'Chekeamos el checkbox para los terminos y licencia\r\n'
WebUI.check(findTestObject('ObjetosLogin/Page_Herman Miller (2)/input_agreement'))
*/

'Creamos un nuevo TestObject para el checkbox de Politicas y terminos de Uso\r\n'
TermsOfUse = new TestObject('TermsOfUse')

'Decimos que este testobject contiene la propiedad Xpath que nos interesa'
TermsOfUse.addProperty('xpath', ConditionType.EQUALS, "//input[@type='checkbox'][@class='validate-required-check'][ancestor::form[@id='userForm']]", true)

'checkeamos  el test Obect\r\n'
WebUI.check(TermsOfUse)

'Creamos un nuevo TestObject para el input 1 de Country\r\n'
Country1 = new TestObject('Country1')

'Decimos que este testobject contiene la propiedad Xpath que nos interesa'
Country1.addProperty('xpath', ConditionType.EQUALS, "//select[@id='userCountryField']", true)

'Seleccionamos la opcion por valor  el test Obect\r\n'
WebUI.selectOptionByLabel(Country1, 'hong kong', false)

'Creamos un nuevo TestObject para el input 2 de Country\r\n'
Country2 = new TestObject('Country2')

'Decimos que este testobject contiene la propiedad Xpath que nos interesa'
Country2.addProperty('xpath', ConditionType.EQUALS, "//div[contains(@class, \'countriesSelector\')]/select", true)

'Seleccionamos la opcion por valor  el test Obect\r\n'
WebUI.selectOptionByLabel(Country2, 'hong kong island', false)


/*

'Seleccionamos campo, region,etc..'
WebUI.selectOptionByLabel(findTestObject('ObjetosLogin/Page_Herman Miller (2)/select_country_1'), 'hong kong', false)

WebUI.selectOptionByLabel(findTestObject('ObjetosLogin/Page_Herman Miller (2)/select_country_2'), 'hong kong island', false)
*/
'Creamos un nuevo TestObject\r\n'
TercerArea = new TestObject('TercerArea')

'Decimos que este tebobject contiene la propiedad Xpath que nos interesa'
TercerArea.addProperty('xpath', ConditionType.EQUALS, '//div[contains(@class, \'countriesSelector\')]/div/select', true)

'Seleccionamos el valor deseado\r\n'
WebUI.selectOptionByLabel(TercerArea, 'central and western', false)

'Se repite Hasta...'
CuartaArea = new TestObject('CuartaArea')

CuartaArea.addProperty('xpath', ConditionType.EQUALS, '//div[contains(@class, \'countriesSelector\')]/div/div/select', true)

WebUI.selectOptionByLabel(CuartaArea, 'central', false)

QuintaArea = new TestObject('QuintaArea')

QuintaArea.addProperty('xpath', ConditionType.EQUALS, '//div[contains(@class, \'countriesSelector\')]/div/div/div/select', 
    true)

'Aqui!'
WebUI.selectOptionByLabel(QuintaArea, 'admiralty', false)
/*
'Clicamos para acabar'

WebUI.click(findTestObject('ObjetosLogin/Page_Herman Miller (2)/input_continue'))
*/

'Creamos un nuevo TestObject para el boton de acabado\r\n'
Acabar = new TestObject('Acabar')

'Decimos que este testobject contiene la propiedad Xpath que nos interesa'
Acabar.addProperty('xpath', ConditionType.EQUALS, "//input[@id='saveUserButton']", true)

'clickamos en el test Obect\r\n'

WebUI.click(Acabar)

WebUI.closeBrowser()