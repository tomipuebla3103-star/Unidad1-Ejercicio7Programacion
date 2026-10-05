<img width="836" height="108" alt="image" src="https://github.com/user-attachments/assets/344a350f-2781-49cf-a62c-833f3588fa89" />
 Colección de Mangas y Cómics

 Descripción

El programa utiliza una clase llamada `TomoManga` para guardar la información de un manga o cómic de una colección personal.

También permite saber si el tomo ya fue leído o si todavía está pendiente.

 Objetivo

El objetivo del ejercicio es practicar algunos conceptos de Programación Orientada a Objetos (POO), como:

 Clases y objetos.
 Atributos.
Constructores.
 Métodos.
 Valores booleanos.
 Validación de datos.
 Cambio de estado de un objeto.

 Clase TomoManga

La clase `TomoManga` tiene los siguientes atributos:

 `tituloObra`: título del manga o cómic.
 `numeroVolumen`: número del tomo.
 `precioCompra`: precio que se pagó por el tomo.
 `leido`: indica si el tomo fue leído o no.

 Constructor

El constructor recibe los datos necesarios para crear un tomo.

El atributo `leido` comienza en `false`, por lo que el tomo aparece como pendiente de leer.

También se controla que el número de volumen y el precio no sean negativos.

Métodos

`marcarComoLeido()`

Cambia el estado del tomo a leído.

Al utilizar este método, el valor de `leido` pasa a ser `true`.
`estadoLectura()`

Muestra por consola el estado actual del tomo.

Si todavía no fue leído, muestra que está **pendiente**.

Si ya fue leído, muestra que está **finalizado**.

Ejemplo

En el `main` se crea un objeto `TomoManga`, por ejemplo el volumen 3.

Después se utiliza el método `marcarComoLeido()` y se muestra el estado actualizado del tomo por consola.
