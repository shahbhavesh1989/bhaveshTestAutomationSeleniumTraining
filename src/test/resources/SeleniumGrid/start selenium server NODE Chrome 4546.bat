Echo off
Title Selenium Grid Server NODE Chrome on port 4546

Echo Setting project loation for HUB
set projectLocation = C:\selenium server standalone
pushd %projectLocation%

Echo Loading Selenium Grid Server NODE Chrome on port 4546
java -Dwebdriver.chrome.driver=chromedriverWin32.exe -jar selenium-server-standalone-3.141.59.jar -role node -hub http://localhost:4444/grid/register/ -port 4546 -browser browserName=chrome,maxInstances=5
pause