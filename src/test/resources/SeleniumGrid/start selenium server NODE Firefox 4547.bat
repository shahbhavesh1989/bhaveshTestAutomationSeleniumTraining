Echo off
Title Selenium Grid Server NODE Firefox on port 4547

Echo Setting project loation for HUB
set projectLocation = C:\selenium server standalone
pushd %projectLocation%

Echo Loading Selenium Grid Server NODE Firefox on port 4547
java -Dwebdriver.gecko.driver=geckodriver.exe -jar selenium-server-standalone-3.141.59.jar -role node -hub http://localhost:4444/grid/register/ -port 4547 -browser browserName=firefox
pause