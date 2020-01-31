# Proyecto de configuración LOMBOK
El proyecto es desarrollado con el propósito de aprender la configuración y la utilización de la herramienta LOMBOK,
con el fin de poder desarrollar proyectos de una manera más rápida y ahorrar tiempo durante del desarrollo del proyecto.

## Requisitos Iniciales 🛠️
* JAVA >= 1.8
* MAVEN
* Spring Framework 5
* STS
* JPA
* H2 -> Base de datos en memoria
* Lombok

## Descripción de la práctica ⚙️

* Primeramente se procedió con la configuración del IDE habilitando las Annotation Processing y consiste en hacer clic dereche en el proyecto
y luego dirigirse a `Properties -> Java Compiler -> Enabled Project Specific Settings`.

* Después de dicha configuración, se procedió a crear las clase POJO que representará las entidad en la app, utilizando las anotaciones que nos provee la herramienta LOMBOK:
`@Getter, @Setter` éste caso para las propiedades de la clase que requieres los métodos Getter y Setter.

* La clase también fue decorada con la anotación `@NoArgsContructor` la cual le dice nos permite crear el constructor pero sin ningún parámetro ahora bien, si deseas que crear
el contructor con todos sus argumentos también, debes decorar la clase con la anotación `@AllArgsContructor`.

* En el controlador, también presenta la anotación `@Slf4j` permitiendonos hacer log en la consola del IDE, ahorrandonos así la declaración como lo haciamos anteriormente.
```
curl -X POST \
  'http://localhost:8080/persona'
  
curl -X PUT \
  'http://localhost:8080/persona/{id}'
```

📌 **NOTA**: *Cabe aclarar que antes de someterte a utilizar esta herramienta, es necesario que tengas claros los conocimientos de lo que son los métodos Getter y Setter, con el fin de que sepas qué es lo que realidad estás haciendo y no utilices la herramienta solo por utilizarla.*