# current_temp
Get the current temperature according to coordinates or place name
To clone use these command

git clone https://github.com/benkalat/current_temp.git

cd current_temp

To compile use this command

javac -cp json-20200518.jar;json-simple-2.1.2.jar *.java

To get temperature use this command

java -cp json-20200518.jar;json-simple-2.1.2.jar;.Main <city name / coordinates>
 
exemple:

java -cp json-20200518.jar;json-simple-2.1.2.jar;. Main haifa


