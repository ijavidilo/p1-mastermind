# P1: Mastermind - Javier Diaz Lopez (parte 4: objectOrientedDesign)

  * ## Anotaciones alumno: 
  > Para realizar esta parte de la práctica se ha empezado la implementación partiendo de la base proporcionada del profesor de la rama "documentView". Se va a realizar varios commits (ver https://github.com/ijavidilo/p1-mastermind/tree/documentView#instrucciones-de-entrega-parte-4-objectOrientedDesign) en esta rama para asegurar que se entiende el temario impartido por el profesor.

## Modelo del Dominio
![This is a alt text.](Mastermind.jpg "Mastermind.")
>Mas info: https://www.youtube.com/watch?v=oAMTGSovbHo

### Diagramas objectOrientedDesign
#### - Paquete mastermind.views
![This is a alt text.](documentView_view.jpg "Mastermind document view - Paquete mastermind.views")

### Instrucciones de entrega (parte 4: objectOrientedDesign)

Entrega de un proyecto público en git varias ramas:

* master, modelo del dominio
* domainModel, con:
    * el diseño de clases, con plantuml en readme o con StarUML con el documento  
    * solución en Java o similar (fuertemente tipado) basada en el capitulo de Diseño y el proyecto ticTacToe
        * Modelo del Dominio: https://github.com/ijavidilo/p1-mastermind/tree/domainModel#modelo-del-dominio
        * Requisitos: https://github.com/ijavidilo/p1-mastermind/tree/master/Requisitos
        * Diseño: https://github.com/ijavidilo/p1-mastermind/tree/domainModel#diagrama-de-clases
        * Implementación:  https://github.com/ijavidilo/p1-mastermind/tree/domainModel/domainModel.project
 * documentView, con:
    * el diseño de clases, con plantuml en readme o con StarUML con el documento  
    * solución en Java o similar (fuertemente tipado) basada en el capitulo de Diseño Modular y el proyecto ticTacToe
        * Modelo del Dominio: https://github.com/ijavidilo/p1-mastermind/tree/documentView#modelo-del-dominio
        * Requisitos:  https://github.com/ijavidilo/p1-mastermind/tree/master/Requisitos
        * Diseño: https://github.com/ijavidilo/p1-mastermind/tree/documentView#diagrama-documentview
        * Implementación: He copiado y entendido directamente el codigo del profesor
> * **objectOrientedDesign**, con:
>    * el diseño de clases, con plantuml en readme o con StarUML con el documento  
>    * solución en Java o similar (fuertemente tipado) basada en el capitulo de Diseño Modular y el proyecto ticTacToe
>        * Modelo del Dominio: https://github.com/ijavidilo/p1-mastermind/tree/objectOrientedDesign#modelo-del-dominio
>        * Requisitos:  https://github.com/ijavidilo/p1-mastermind/tree/master/Requisitos
>        * Commits:
>          * **Versión 3.2: dv.withoutFactoryMethod** -> Clase Vistas de Interfaz Gráfica de Usuario pero con DRY en Vistas de tecnologías diferentes y con Modelos de grano grueso con el advenimiento de nueva funcionalidad
>          * **Versión 4.2. dv.withFactoryMethod** -> Clase Vista abstracta para Open/Close de sus tecnologías pero con Modelos de grano grueso con el advenimiento de nueva funcionalidad
>          * **Versión 5.2. modelViewPresenter.presentationModel** -> Clases Controladoras entre Vistas y Modelos por cada Caso de Uso pero con la clase Principal y las Vistas acopladas a cada controlador actual y futuro
>          * **Versión 6.2. mvp.pm.withFacade** -> Clase Lógica que encapsula Controladores y Modelos pero con Vistas con DRY en la Lógica de Control
>          * **Versión 7.2. mvp.pm.withoutDoubleDispatching** -> Clase Estado para la Inversión de Control de Vistas a la Lógica pero violando el Principio de Sustitución de Liskov
>          * **Versión 8.2. mvp.pm.withDoubleDispatching** -> Clase Vistador de Controladores para Técnica de Doble Despacho
>        * Diseño: https://github.com/ijavidilo/p1-mastermind/tree/objectOrientedDesign#diagrama-documentview
>        * Implementación:

Cursando el Master Cloud Apps curso 2020/21 [MasterCloudApps](https://www.codeurjc.es/mastercloudapps/).