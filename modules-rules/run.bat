
rmdir /s /q output\lib

mkdir output\lib

rmdir /s /q output\classes

mkdir output\classes

dir module-one\*.java /s /b > FilesList.txt && javac @FilesList.txt -d output\classes

jar --create -f output\lib\one.jar -C output\classes .

rmdir /s /q output\classes

mkdir output\classes

dir module-one-conf\*.java /s /b > FilesList.txt && javac -p output\lib @FilesList.txt -d output\classes

jar --create -f output\lib\two.jar -C output\classes .

rmdir /s /q output\classes

mkdir output\classes

dir module-main\*.java /s /b > FilesList.txt && javac -p output\lib @FilesList.txt -d output\classes

jar --create -f output\lib\main.jar --main-class com.example.mod.main.MainClazz -C output\classes .

java -p output\lib -m mod.main

