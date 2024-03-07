# Documentación del servicio


Servicio Realizado por Juan Manuel Rodriguez Irausquin

Prueba Sanitas


Los owners del servicio son:

| Tipo Owner    |     Nombre     | Contacto  |
| ------------- |:--------------:| ---------:|
| Técnico       | Juan Rodriguez | jmrodriguez@profile.es     |



Este servicio resume los puntos de entrada al servicio vía API Rest:

| Operación | Método | Path                 | Descripción                                                           
|-----------|--------|----------------------|-----------------------------------------------------------------------|
| Sumar     | POST   | /operations/add      | Obtiene el resultado de la suma de <br/>los parametros seleccionados  |
| Restar    | POST   | /operations/subtract | Obtiene el resultado de la resta de <br/>los parametros seleccionados |


Este proyecto se construye mediante la herramienta Maven. Si se quieren ejecutar todas las fases, basta con ejecutar
desde la ráiz del proyecto

````shell script
mvn clean install
````

El proyecto se ejecuta mediante la instrucción, utilizándose las propiedades del perfil local:

````shell script
mvn spring-boot:run -Dspring-boot.run.profiles=local
````

Una vez levantado, se ejecuta en local en el puerto 8080.
El api del servicio se puede consultar localmente en: http://localhost:8080/swagger-ui.html

