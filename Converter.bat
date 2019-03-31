mkdir bin
javac -d  bin src/koly/summator/Summator.java

jar cf bin/summator.jar bin/koly/summator/summator.class

javac -d bin -cp bin src/Main.java