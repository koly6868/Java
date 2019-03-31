mkdir .\bin\lib

javac -d  bin src/koly/summator/Summator.java

jar cvf bin/lib/summator.jar -C bin ./koly

javac -d bin -cp bin/lib/*jar src/Main.java