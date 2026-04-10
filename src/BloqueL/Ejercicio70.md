# Análisis Orientado a Objetos: Sistema de Tienda de Cómics

## 1. La Clase (El Molde)
**¿Cuál fue?** La clase `Comic`.
**Explicación:** Funcionó como el "plano arquitectónico" o la plantilla general. La clase por sí sola no es un cómic físico, sino la definición teórica de la información y las acciones que cualquier cómic dentro de nuestra tienda debe tener.

## 2. Los Objetos (Las Instancias)
**¿Cuáles fueron?** Creamos 5 objetos en memoria:
1. `comicBatman`
2. `comicSpiderMan`
3. `comicSnoopy`
4. `comicGarfield`
5. `comicSpyFamily`
**Explicación:** Fueron las entidades reales creadas a partir del molde `Comic`. Cada objeto ocupó su propio espacio en la memoria de la computadora y operó de manera totalmente independiente de los demás. Cada uno representa un cómic diferente, pero todos pertenecen a la misma clase Comic.

## 3. Los Atributos (El Estado o Características)
**¿Cuáles fueron?** * `titulo` (String)
* `editorial` (String)
* `precio` (double)
* `stock` (int)
**Explicación:** Representan los "datos" o el estado actual de cada objeto. Aunque todos los objetos compartían los mismos cuatro atributos (porque venían del mismo molde), sus **valores** eran únicos. Por ejemplo, el `stock` de `comicSpiderMan` era `0`, mientras que el de `comicSpyFamily` era `10`.

## 4. Los Comportamientos (Los Métodos o Acciones)
**¿Cuáles fueron?**
* `venderComic()`
* `mostrarInfo()`
**Explicación:** Representan lo que el objeto "sabe hacer". 
* El comportamiento `mostrarInfo()` muestra en la consola la información completa del cómic: título, edutorial, precio y unidades disponibles.
* El comportamiento `venderComic()` nos permitía **modificar el estado** del objeto (disminuyendo su atributo `stock`), aplicando además lógica de negocio (el `if` que impedía vender si el stock era 0). Es decir, permite vender un cómic si hay stock disponible, reduce en 1 la cantidad y muestra un mensaje de venta o agotado.