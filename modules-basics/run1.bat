rmdir /s /q output\lib

mkdir output\lib



rmdir /s /q output\classes

mkdir output\classes

dir module-three\*.java /s /b > FilesList.txt && javac @FilesList.txt -d output\classes

jar --create -f output\lib\three.jar -C output/classes .




rmdir /s /q output\classes

mkdir output\classes

dir module-two\*.java /s /b > FilesList.txt && javac -p output\lib @FilesList.txt -d output\classes

jar --create -f output\lib\two.jar -C output/classes .


rmdir /s /q output\classes

mkdir output\classes

dir module-one\*.java /s /b > FilesList.txt && javac -p output\lib @FilesList.txt -d output\classes

jar --create -f output\lib\one.jar --main-class com.example.mod.one.MOne -C output/classes .



java -p output\lib -m mod.one