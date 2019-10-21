Echo off
Title Selenium Grid Server NODE IE on port 4545

Echo Setting project loation for HUB
set projectLocation = C:\selenium server standalone
pushd %projectLocation%

Echo Loading Selenium Grid Server NODE IE on port 4545
java -Dwebdriver.ie.driver=IEDriverServerWin32.exe -jar selenium-server-standalone-3.141.59.jar -role node -hub http://localhost:4444/grid/register/ -port 4545 -browser browserName=iexplorer
pause