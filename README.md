To start eclim server
  $ECLIPSE_HOME/eclimd
  This will start eclipse in headless mode for eclim

To start jetty server
  gradle jettyRunWar
  this will start web server on http://localhost:8080/java_example


To start auto test (uses ruby Guard until Gradle is ready)
bundle install


bundle exec guard -i
+
gradle jettyRun
