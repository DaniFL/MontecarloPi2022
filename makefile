compilar:limpiar
	mkdir bin
	find src -name *.java | xargs javac -cp bin -d bin
ejecutar:compilar
	java -cp bin aplicacion.Principal
javadoc2: ejecutar
	rm -rf html
	mkdir html
	find . -type f -name "*.java" | xargs javadoc -d html -encoding utf-8 -charset utf-8
limpiar:
	rm -rf bin
jar:compilar
	jar cvfm ap-Matematicas.jar Manifest.txt -C bin .
