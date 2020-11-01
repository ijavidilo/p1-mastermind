# P1: Mastermind - Javier Diaz Lopez (parte 1: master)

  * ## Anotaciones alumno: 
  > Se ha creado y adjuntado el modelo del dominio con el nombre domain-model.jpg asi como el fichero StartUML de dicho modelo.

## Modelo del Dominio
![This is a alt text.](Mastermind.jpg "Mastermind.")
>Mas info: https://www.youtube.com/watch?v=oAMTGSovbHo

### Diagrama
![This is a alt text.](domain-model.jpg "Mastermind domain model")

### Instrucciones de entrega

Entrega de un proyecto público en git varias ramas:

>* **master**, modelo del dominio
* **domainModel**, con:
    * el diseño de clases, con plantuml en readme o con StarUML con el documento  
    * solución en Java o similar (fuertemente tipado) basada en el capitulo de Diseño y el proyecto ticTacToe
        * Modelo del Dominio: https://github.com/ijavidilo/p1-mastermind/tree/domainModel#modelo-del-dominio
        * Requisitos: https://github.com/ijavidilo/p1-mastermind/tree/master/Requisitos
        * Diseño: https://github.com/ijavidilo/p1-mastermind/tree/domainModel#diagrama-de-clases
        * Implementación:  https://github.com/ijavidilo/p1-mastermind/tree/domainModel/domainModel.project
* **documentView**, con:
   * el diseño de clases, con plantuml en readme o con StarUML con el documento  
   * solución en Java o similar (fuertemente tipado) basada en el capitulo de Diseño Modular y el proyecto ticTacToe
       * Modelo del Dominio: https://github.com/ijavidilo/p1-mastermind/tree/documentView#modelo-del-dominio
       * Requisitos:  https://github.com/ijavidilo/p1-mastermind/tree/master/Requisitos
       * Diseño: https://github.com/ijavidilo/p1-mastermind/tree/documentView#diagrama-documentview
       * Implementación: He copiado y entendido directamente el codigo del profesor
* **modelViewPresenter**, con:
   * el diseño de clases, con plantuml en readme o con StarUML con el documento  
   * solución en Java o similar (fuertemente tipado) basada en el capitulo de Diseño Orientado a Objetos y el proyecto ticTacToe desde la rama dv.withoutFactoryMethod hasta mvp.pm.withDoubleDispatching
       * Modelo del Dominio: https://github.com/ijavidilo/p1-mastermind/tree/modelViewPresenter#modelo-del-dominio
       * Requisitos:  https://github.com/ijavidilo/p1-mastermind/tree/master/Requisitos
       * Diseño: https://github.com/ijavidilo/p1-mastermind/tree/modelViewPresenter#diagrama-documentview
       * Implementación:
         * **Versión 3.2: dv.withoutFactoryMethod** -> Clase Vistas de Interfaz Gráfica de Usuario pero con DRY en Vistas de tecnologías diferentes y con Modelos de grano grueso con el advenimiento de nueva funcionalidad
             *  https://github.com/ijavidilo/p1-mastermind/releases/tag/dv.withoutFactoryMethod
         * **Versión 4.2. dv.withFactoryMethod** -> Clase Vista abstracta para Open/Close de sus tecnologías pero con Modelos de grano grueso con el advenimiento de nueva funcionalidad
             *  https://github.com/ijavidilo/p1-mastermind/releases/tag/dv.withFactoryMethod
         * **Versión 5.2. modelViewPresenter.presentationModel** -> Clases Controladoras entre Vistas y Modelos por cada Caso de Uso pero con la clase Principal y las Vistas acopladas a cada controlador actual y futuro
             *  https://github.com/ijavidilo/p1-mastermind/releases/tag/modelViewPresenter.presentationModel
         * **Versión 6.2. mvp.pm.withFacade** -> Clase Lógica que encapsula Controladores y Modelos pero con Vistas con DRY en la Lógica de Control
             *  https://github.com/ijavidilo/p1-mastermind/releases/tag/mvp.pm.withFacade
         * **Versión 7.2. mvp.pm.withoutDoubleDispatching** -> Clase Estado para la Inversión de Control de Vistas a la Lógica pero violando el Principio de Sustitución de Liskov
             *  https://github.com/ijavidilo/p1-mastermind/releases/tag/mvp.pm.withoutDoubleDispatching
         * **Versión 8.2. mvp.pm.withDoubleDispatching** -> Clase Vistador de Controladores para Técnica de Doble Despacho
             *  https://github.com/ijavidilo/p1-mastermind/releases/tag/mvp.pm.withDoubleDispatching
* **mvp.pm.withComposite**, con:
   * el diseño de clases, con plantuml en readme o con StarUML con el documento  
   * solución en Java o similar (fuertemente tipado) basada en el capitulo de Patrones de Diseño y Arquitectura y el proyecto ticTacToe
       * Modelo del Dominio: https://github.com/ijavidilo/p1-mastermind/tree/master#diagrama
       * Requisitos:  https://github.com/USantaTecla-ticTacToe/tictactoe.requirements/tree/3.UndoRedo
       * Diseño: https://github.com/USantaTecla-ticTacToe/tictactoe/tree/mvp.pm.withComposite/docs
       * Implementación:  https://github.com/ijavidilo/p1-mastermind/tree/mvp.pm.withComposite/objectOrientedDesign.project
* **mvp.pm.withProxy**, con:
    * el diseño de clases, con plantuml en readme o con StarUML con el documento  
    * solución en Java o similar (fuertemente tipado) basada en el capitulo de Patrones de Diseño y Arquitectura y el proyecto ticTacToe
        * Modelo del Dominio: https://github.com/USantaTecla-ticTacToe/tictactoe.requirements
        * Requisitos: https://github.com/USantaTecla-ticTacToe/tictactoe.requirements/tree/4.ClienteServidor
        * Diseño: https://github.com/USantaTecla-ticTacToe/tictactoe/tree/mvp.pm.withProxy/docs
        * Implementación: https://github.com/ijavidilo/p1-mastermind/tree/mvp.pm.withProxy/objectOrientedDesign.project
* **mvp.pv**, con:
    * el diseño de clases, con plantuml en readme o con StarUML con el documento  
    * solución en Java o similar (fuertemente tipado) basada en el capitulo de Patrones de Diseño y Arquitectura y el proyecto ticTacToe
        * Modelo del Dominio: https://github.com/USantaTecla-ticTacToe/tictactoe.requirements
        * Requisitos: https://github.com/ijavidilo/p1-mastermind/tree/master/Requisitos
        * Diseño: https://github.com/USantaTecla-ticTacToe/tictactoe/tree/mvp.pv/docs
        * Implementación:  https://github.com/ijavidilo/p1-mastermind/tree/mvp.pv/objectOrientedDesign.project

Master Cloud Apps curso 2020/21 [MasterCloudApps](https://www.codeurjc.es/mastercloudapps/).