# current_temperature

Git:

    git clone https://github.com/benkalat/current_temp.git
    cd current_temp


To compile use this command:

    javac -cp json-20200518.jar;json-simple-2.1.2.jar *.java

To get temperature use this command:

    java -cp json-20200518.jar;json-simple-2.1.2.jar;.Main <city name / latitude,longitude>
 
exemple:

    java -cp json-20200518.jar;json-simple-2.1.2.jar;. Main haifa
    java -cp json-20200518.jar;json-simple-2.1.2.jar;. Main 32.81841,34.9885


