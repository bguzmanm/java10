# 10 - Ejercicio Java
POO, Herencia, Interfaces y Polimorfismo
## Enunciado
Supongamos que estás desarrollando un juego de batallas de criaturas. 
Debes implementar un sistema que maneje diferentes tipos de criaturas con habilidades especiales. 

Aquí tienes un esbozo del ejercicio:
1. Crea una clase abstracta llamada "Criatura" que tenga los siguientes atributos y métodos:
   - Atributos:
     - nombre: una cadena que representa el nombre de la criatura.
     - nivel: un entero que indica el nivel de la criatura.
   - Métodos:
     - constructor: para inicializar los atributos.
     - abstract void atacar(): un método abstracto que define el ataque de la criatura.
2. Crea dos clases derivadas de "Criatura": "Dragon" y "Grifo". Cada una debe tener sus propios atributos y métodos, así como implementar el método "atacar()" de acuerdo con sus características especiales.
3. Crea una interfaz llamada "Curable" que declare un método "curar()". Esta interfaz representará la capacidad de una criatura para ser curada.
4. Implementa la interfaz "Curable" en una clase llamada "Elfo" que también extienda la clase "Criatura". El método "curar()" debe imprimir un mensaje indicando que el elfo ha sido curado.
5. En la clase principal, crea una lista de criaturas que contenga instancias de "Dragon", "Grifo" y "Elfo". 
Luego, recorre la lista y llama al método "atacar()" para cada criatura. 
Además, para las criaturas que implementan la interfaz "Curable", llama al método "curar()".