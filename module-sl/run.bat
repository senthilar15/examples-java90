rmdir /s /q output\lib

mkdir output\lib


rmdir /s /q output\classes

mkdir output\classes

dir module-service\*.java /s /b > FilesList.txt && javac @FilesList.txt -d output\classes

jar --create -f output\lib\service.jar -C output/classes .


rmdir /s /q output\classes

mkdir output\classes

dir module-consumer\*.java /s /b > FilesList.txt && javac -p output\lib @FilesList.txt -d output\classes

jar --create -f output\lib\consumer.jar --main-class com.example.mod.consumer.Consumer -C output/classes .



java -p output\lib -m mod.consumer