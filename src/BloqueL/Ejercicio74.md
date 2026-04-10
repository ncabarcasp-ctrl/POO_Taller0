# Comparación de las tres formas de construir objetos

En estos ejercicios pude notar que existen varias formas de construir objetos en Java, y cada una tiene su utilidad dependiendo de lo que se necesite.

## 1. Constructor con parámetros
Es la forma más directa y la que me pareció más fácil de entender.  
Se crea el objeto y al mismo tiempo se le asignan sus datos iniciales, por ejemplo:

`new Producto("Laptop", 999.99, 10);`

Lo bueno es que el código queda más limpio y se evitan muchas líneas de asignación manual.  
Lo único es que si la clase tiene demasiados atributos, puede volverse un poco difícil de leer.

## 2. Método fábrica
Esta forma me pareció interesante porque hace que la creación del objeto se lea más natural según la lógica del problema.

Por ejemplo:

`CuentaBancaria.abrirCuenta("123", "Natalia", 1500);`

En este caso no solo se crea el objeto, sino que parece una acción real del sistema.  
También me gustó porque permite agregar validaciones antes de devolver el objeto, aunque sí siento que requiere entender mejor conceptos como `static`.

## 3. Constructor copia
Este me pareció útil cuando ya existe un objeto y queremos crear otro muy parecido.

Por ejemplo:

`new Vehiculo(carroOriginal);`

Lo bueno es que ahorra tiempo porque no toca volver a escribir todos los atributos.  
Además fue útil para entender que dos objetos pueden tener los mismos datos, pero seguir siendo independientes.

---

## ¿Cuál me pareció más clara para principiantes?
La forma que me pareció más clara fue el **constructor con parámetros**.

Siento que para alguien que está empezando es la mejor porque se entiende rápido la relación entre crear el objeto y darle sus valores iniciales.  Además, hace que el código quede más ordenado y es más fácil notar si falta algún dato importante.

En comparación, el método fábrica y el constructor copia me parecieron muy útiles, pero un poco más avanzados para alguien que apenas está empezando con clases y objetos.
