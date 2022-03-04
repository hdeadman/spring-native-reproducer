#!/bin/bash
echo Building with gradle
./gradlew clean build

echo Running gradle version
java -DspringAot=true -jar  build/libs/demo-refresh-scope.jar $@ &

sleep 30
echo Shutting down via shutdown actuator
curl -X POST http://localhost:8080/actuator/shutdown
