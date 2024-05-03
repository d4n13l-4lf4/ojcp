pwd=$$PWD

setup:
	export JAVA_HOME=`/usr/libexec/java_home -v 17`

single-file-execution:
	java $(pwd)/TwoTypes.java test

compiling-packages:
	javac src/main/java/org/d4n13l_4lf4/Main.java src/main/java/org/d4n13l_4lf4/ch01/Animal.java

run-cp:
	java -cp build/classes org.d4n13l_4lf4.Main

run-cp-jars:
	java -cp ".:/tmp/location:/tmp/myJar.jar" org.d4n13l_4lf4.Main

package-jar:
	jar -cvf myNewFileJar.jar -C . .
