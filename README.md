# Codigo para la solucion del problema de Taquilleria de un Cine
------------------------------------------------------------------

Se implementan 2 Principales Package, los cuales son Cine y ParteHumana.

El Cine contiene todo referente a el, contando con la parte fisica que es:
```    
Cine    --> Es la entidad de manera general que contiene el todo
Sala    --> Donde se sientan los Clientes, se presentan Las funciones y contiene las Zonas
Zona    --> Donde se encuentran contenidos los Asientos, ya depende de la Zona su cantidad
Asiento --> Es la comprovacion y para saber si un usuario puede obtener un puesto para la funcion
```
Tambien este contiene otras partes muy importantes que son:
```
Funcion  --> Contiene la hora de presentacion de una Pelicula e informacion sobre una Sala
Pelicula --> Es una obra que contiene Titulo y Duracion
Boleto   --> Contiene todos los datos, del Cliente, Funcion y Vendedor
```
Ahora el Package de la ParteHumana contiene:
```
Persona               --> Individuo identificable que implementa DatosPersonales
Cliente               --> Es una Persona la cual puede elegir un Asiento y una Funcion
Trabajador            --> Personas las cuales tiene un puesto dentro de la Organizaion (Cine)
Vendedor              --> Aquel Trabajador que puede gestionar la venta de un Boleto
PersonalMantenimiento --> Aquel Trabajador que limpia la Sala despues de cada Funcion
```
Teniendo encuenta el planteamiento de los Package anteriores tambien se tiene uno extra llamado Utilidades
que me ayudan a la obtencion de datos con la clase Utilidad.

Autores:
```
Gasser Abdeslam Abdelgelil Serna
Santiago Marin Dussan
```