Echo off
Title Selenium Grid Server HUB on port 4444

Echo Setting project loation for HUB
set projectLocation = C:\selenium server standalone
pushd %projectLocation%

Echo Loading Selenium Grid Server HUB on port 4444
Java -jar selenium-server-standalone-3.141.59.jar -role hub
pause