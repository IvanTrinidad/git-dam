# 🖥️ Módulo de Programación

### *Apuntes, conceptos clave y recursos del módulo*

> "Todo programador fue primero un principiante que no se rindió cuando el código no compilaba."

Bienvenido a este repositorio de apuntes del **módulo de Programación**. Aquí encontrarás un resumen de los temas más importantes tratados a lo largo del curso, desde los fundamentos del lenguaje hasta el uso de herramientas profesionales de desarrollo.

---

## 📚 Índice de contenidos

1. [Introducción a Java](#introducción-a-java)
2. [Variables y tipos de datos](#variables-y-tipos-de-datos)
3. [Estructuras de control](#estructuras-de-control)
4. [Arrays](#arrays)
5. [Métodos](#métodos)
6. [Control de versiones con Git](#control-de-versiones-con-git)
7. [Recursos adicionales](#recursos-adicionales)

---

## ☕ Introducción a Java

**Java** es uno de los lenguajes de programación más utilizados en el mundo. Fue creado por *James Gosling* en 1995 y su filosofía principal es **"Write Once, Run Anywhere"** (*escríbelo una vez, ejecútalo en cualquier lugar*), gracias a la **JVM** (*Java Virtual Machine*).

![Java y el terminal](https://img.freepik.com/free-photo/programming-background-with-person-working-with-codes-computer_23-2150010125.jpg)

Entre sus características más destacadas se encuentran:

- **Orientado a objetos:** todo en Java gira en torno a clases y objetos.
- **Fuertemente tipado:** cada variable debe declararse con un tipo específico.
- **Multiplataforma:** el bytecode se ejecuta en cualquier sistema con JVM instalada.
- *Amplia comunidad:* miles de librerías y frameworks disponibles.
- *Muy demandado* en el mercado laboral, especialmente en desarrollo backend y Android.

Para empezar a programar en Java puedes consultar la documentación oficial en [Oracle Java Documentation](https://docs.oracle.com/en/java/).

---

## 🔢 Variables y tipos de datos

Una **variable** es un espacio en memoria con nombre que almacena un valor. En Java, *toda variable debe declararse indicando su tipo* antes de poder usarla.

> "Las variables son los bloques básicos de construcción de cualquier programa. Sin ellas, no habría forma de almacenar ni manipular información."

### Tipos primitivos principales

| Tipo | Tamaño | Ejemplo |
|------|--------|---------|
| `int` | 32 bits | `int edad = 25;` |
| `double` | 64 bits | `double precio = 9.99;` |
| `boolean` | 1 bit | `boolean activo = true;` |
| `char` | 16 bits | `char letra = 'A';` |
| `String` | Variable | `String nombre = "Ana";` |

### Reglas para nombrar variables

Las variables deben seguir estas convenciones en Java:

1. Deben comenzar con una letra minúscula o guión bajo.
2. No pueden contener espacios ni caracteres especiales.
3. Se recomienda usar **camelCase** para nombres compuestos.
4. No pueden coincidir con palabras reservadas del lenguaje.
5. Deben ser descriptivas para mejorar la legibilidad del código.

---

## 🔀 Estructuras de control

Las estructuras de control permiten dirigir el *flujo de ejecución* de un programa. Sin ellas, el código se ejecutaría siempre de forma lineal, línea a línea, sin posibilidad de tomar decisiones ni repetir acciones.

> "Controlar el flujo del programa es controlar la lógica del problema. Aquí reside la inteligencia de tu código."

### Estructuras condicionales

- **`if / else if / else`** — para tomar decisiones según condiciones.
- **`switch`** — para comparar un valor contra múltiples casos posibles.
  - Cada caso termina con `break` para evitar la ejecución en cascada.
  - Existe `switch expression` desde Java 14, más conciso y seguro.

### Estructuras de repetición (bucles)

- **`for`** — cuando se conoce el número exacto de iteraciones.
  - *Variante `for-each`:* ideal para recorrer arrays y colecciones.
- **`while`** — cuando la condición se evalúa *antes* de cada iteración.
- **`do-while`** — cuando el bloque debe ejecutarse *al menos una vez*.

Para profundizar en las estructuras de control puedes visitar [W3Schools Java Conditions](https://www.w3schools.com/java/java_conditions.asp).

---

## 📦 Arrays

Un **array** es una estructura de datos que almacena *una colección de elementos del mismo tipo* en posiciones de memoria contiguas. Cada elemento se accede mediante su **índice**, que siempre comienza en `0`.

![Arrays y estructuras de datos](https://media.geeksforgeeks.org/wp-content/uploads/20240410101419/Getting-Started-with-Array-Data-Structure.webp)

### Declaración y uso básico
```java
// Declarar e inicializar un array de 5 enteros
int[] numeros = new int[5];

// Asignar valores
numeros[0] = 10;
numeros[1] = 25;

// Array con valores iniciales
String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
```

### Operaciones comunes con arrays

1. **Recorrer el array** con un bucle `for` o `for-each`.
2. **Calcular la suma** acumulando valores en una variable contador.
3. **Encontrar el mayor y el menor** comparando en cada iteración.
4. **Ordenar** usando `Arrays.sort()` de la librería estándar.
5. **Buscar un elemento** recorriendo el array y comparando valores.

### Buenas prácticas

- Usar `array.length` en lugar de números fijos para evitar errores.
- Inicializar siempre el array antes de usarlo.
- *Validar que el índice no supere los límites* para evitar `ArrayIndexOutOfBoundsException`.

---

## ⚙️ Métodos

Los **métodos** son bloques de código *reutilizables* que realizan una tarea concreta. Permiten dividir un programa grande en partes más pequeñas, facilitando la lectura, el mantenimiento y las pruebas del código.

> "Un buen método hace una cosa y la hace bien. Si necesitas una 'y' para describir lo que hace, seguramente debería ser dos métodos."

### Tipos de métodos según su retorno

- **`void`** — no devuelven ningún valor, solo ejecutan acciones.
- **Con tipo de retorno** (`int`, `String`, `boolean`, etc.) — calculan y devuelven un resultado.

### Pasos para crear un método

1. Definir la **visibilidad** (`public`, `private`, `protected`).
2. Indicar si es **estático** (`static`) o de instancia.
3. Especificar el **tipo de retorno**.
4. Elegir un **nombre descriptivo** en camelCase.
5. Definir los **parámetros** entre paréntesis (pueden ser ninguno).
6. Escribir el **cuerpo** del método entre llaves `{}`.

### Ventajas del uso de métodos

- *Reutilización de código:* escríbelo una vez, llámalo donde necesites.
- **Modularidad:** cada método tiene una responsabilidad clara.
- *Legibilidad:* el código principal queda limpio y comprensible.
- **Facilidad para depurar:** los errores se aíslan en un bloque concreto.
  - Esto reduce enormemente el tiempo de diagnóstico.
  - Los tests unitarios se aplican método a método.

Consulta más sobre métodos en Java en [Codecademy Learn Java](https://www.codecademy.com/learn/learn-java).

---

## 🌿 Control de versiones con Git

**Git** es el sistema de control de versiones más utilizado en el mundo del desarrollo de software. Permite *registrar el historial completo de cambios* de un proyecto, trabajar en equipo sin conflictos y revertir cualquier error a un estado anterior.

![Git y ramas de versiones](https://miro.medium.com/v2/resize:fit:1400/1*tnvRls9Tl_lxoEPBM80IeA.png)

> "El código sin control de versiones es como escribir en arena: cualquier ola puede borrarlo todo."

### Comandos Git esenciales

- **`git init`** — inicializa un nuevo repositorio local.
- **`git clone URL`** — clona un repositorio remoto en tu máquina.
- **`git add .`** — añade todos los cambios al área de preparación (*staging*).
- **`git commit -m "mensaje"`** — guarda los cambios con una descripción.
- **`git push`** — sube los commits al repositorio remoto.
- **`git pull`** — descarga y fusiona los cambios del repositorio remoto.

### Flujo de trabajo con ramas

Un flujo profesional típico con Git implica las siguientes ramas:

1. **`main` / `master`** — rama principal con el código estable y en producción.
2. **`develop`** — rama de integración donde se prueban los cambios.
3. **`feature/nombre`** — ramas individuales para cada nueva funcionalidad.
   - Se crean a partir de `develop`.
   - Se fusionan de vuelta mediante un *Pull Request*.
   - Se eliminan tras ser integradas.
4. **`hotfix/nombre`** — para correcciones urgentes en producción.

### Plataformas de alojamiento

Existen varias plataformas para alojar repositorios Git de forma remota:

- [GitHub](https://github.com) — la más popular, con millones de proyectos públicos.
- [GitLab](https://gitlab.com) — con CI/CD integrado y opción de autoalojamiento.
- [Bitbucket](https://bitbucket.org) — orientada a equipos empresariales, integrada con Jira.

---

## 📎 Recursos adicionales

A continuación se recogen algunos recursos recomendados para ampliar los conocimientos del módulo:

### Documentación oficial

- [Documentación de Java — Oracle](https://docs.oracle.com/en/java/)
- [Referencia de Git — git-scm.com](https://git-scm.com/doc)

### Plataformas de práctica

- [Exercism — ejercicios de Java por niveles](https://exercism.org/tracks/java)
- [LeetCode — problemas de algorítmica](https://leetcode.com)
- [Codewars — retos de programación con kata](https://www.codewars.com)

### Lecturas recomendadas

- *Clean Code* de **Robert C. Martin** — principios para escribir código legible y mantenible.
- *The Pragmatic Programmer* de **David Thomas y Andrew Hunt** — consejos prácticos para programadores profesionales.

---

> *"El mejor momento para aprender a programar fue hace diez años. El segundo mejor momento es ahora."*

---

*Documento elaborado como parte del módulo de Programación · Actualizado en 2025*
