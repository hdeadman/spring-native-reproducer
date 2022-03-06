#!/bin/bash
echo Buidling with maven
./mvnw clean package

echo ""
echo "###################################"
echo Build Finished
echo "###################################"
echo "###################################"
echo "###################################"

echo Running maven version
java -DspringAot=true -jar  target/demo-refresh-scope.jar $@ &

sleep 30
echo Shutting down via shutdown actuator
curl -X POST http://localhost:8080/actuator/shutdown

