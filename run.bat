set projectLocation=C:\Users\LENOVO\Desktop\Agile Eclipse\PracticeClass
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause