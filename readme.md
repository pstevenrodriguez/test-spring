# Readme
**_Favor leer completo._**


La presente prueba tiene como fin validar los conceptos de inyección de dependencias y mapeo de objetos.
Para ello se presentan los siguientes problemas:
### 1 - Error de Inyección de Dependencias.

En la actualidad el código dado arroja un error al generar un 'Bean' de la clase:
```bash
RestControllerHandler.class
```
#### Entregable:
Se desea realizar la corrección, lo que implica que el componente sea inyectado de manera correcta.

#### Consejos:
- Revisar la clase de applicacion.class y validar el correcto funcionamiento del 'basePackage'.
- Revisar detalladamente los componentes invocados en cada paso Sintaxis y funcionamiento.

### 2 - Error de mapeo de objetos.
El servicio expuesto en este momento entrega una respuesta plana no serializada. 
#### Entregable:
Se desea tener un objeto JSON de respuesta y que el código de respuesta del servicio sea 201. Se adjunta ejemplo de la respuesta:
```bash
{
 "data":"hola mundo",
 "fecha":"2022-09-21T00:00:00"
}
```
La fecha entregada en la respuesta debe estar en el formato ISO 8601 y debe de indicar la fecha actual en cada consumo. 

### 3 - Informacion adicional: 
Se adjunta la peticion curl para el consumo del servicio expuesto por el componente.

```bash
curl --location --request GET 'http://localhost:8080/test/add'
```

# Animo y Mucha Suerte! 
