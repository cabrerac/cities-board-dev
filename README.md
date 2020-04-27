# Cities-Board Project

Cities-Board project aims to automate the development of graphic dashboards for smart cities. This project is developed in the Systems Engineering program at the University of Nariño, Pasto, Nariño, Colombia. 

This repository contains the development environment of Cities-Board. If you are interested on using Cities-Board to model and implement your city's dashboard, you should visit our [cities-board-plugin](https://github.com/cabrerac/cities-board-plugin) repository.

## Requirements

Cities-Board was developed on top of the Eclipse Modelling Framework (EMF). Please install Eclipse following the next steps:

1. Download the latest version of the [Eclipse Installer](https://www.eclipse.org/downloads/packages/installer)
2. Open the installer and select the Eclipse Modelling Tools package
3. Click on Install
4. Install ATL EMFVM Core UI Extension in your Eclipse from [the marketplace] (https://marketplace.eclipse.org/content/atlemftvm)

## Projects Contents

1. The Cities-Board metamodel is in the project [co.edu.udenar.citiesboard.cdb](https://github.com/cabrerac/cities-board-dev/tree/master/co.edu.udenar.citiesboard.cdb)
  * If you change the cdb metamodel, you must generate the edit and editor source code using the metamodel genmodel file to see the changes and the new version should replace the one in the project co.edu.udenar.citiesboard.design to be used in the Cities-Board transformation process.
2. The MVC metamodel is in the project [co.edu.udenar.citiesboard.mvc](https://github.com/cabrerac/cities-board-dev/tree/master/co.edu.udenar.citiesboard.mvc)
  * If you change the mvc metamodel, you must generate the edit and editor source code using the metamodel genmodel file to see the changes and the new metamodel should replace the one in the project co.edu.udenar.citiesboard.design to be used in the Cities-Board transformation process.
3. The visual layout of Cities-Board, the M2M transformations and the transformation chain are in the project [co.edu.udenar.citiesboard.design](https://github.com/cabrerac/cities-board-dev/tree/master/co.edu.udenar.citiesboard.design)
4. The M2T transformations are in the project [co.edu.udenar.citiesboard.acceleo](https://github.com/cabrerac/cities-board-dev/tree/master/co.edu.udenar.citiesboard.acceleo)
  * If you change these transformations, the changes will be automaticall reflected in the project co.edu.udenar.citiesboard.design as the project co.edu.udenar.citiesboard.acceleo is a dependency.
5. The plugin is created using the [co.edu.udenar.citiesboard.feature](https://github.com/cabrerac/cities-board-dev/tree/master/co.edu.udenar.citiesboard.feature) and [co.edu.udenar.citiesboard.update](https://github.com/cabrerac/cities-board-dev/tree/master/co.edu.udenar.citiesboard.update) following [this tutorial](https://wiki.eclipse.org/Sirius/Tutorials/UpdateSiteTutorial) 

