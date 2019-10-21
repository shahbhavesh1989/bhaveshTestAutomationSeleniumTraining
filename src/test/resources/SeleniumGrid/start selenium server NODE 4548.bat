Echo off
Title selenium node server on port 4548

Echo setting folder path
set projectLocation=C:\selenium server standalone
pushd %projectLocation%

Echo starting the selenium node server on port 4548
java -jar selenium-server-standalone-3.141.59.jar -role node -hub http://localhost:4444/grid/register -port 4548
pause