# Ejercicio Adicional TDA

Una concesionaria de autos se dedica a hacer test drive de diferentes modelos. Necesita
recopilar información de las personas que hacen los test y de los autos.
Posee en este momento 5 autos. Los mismos se caracterizan por:

Color, marca, modelo, año de fabricación, si es caja manual o automática, la capacidad
del tanque de combustible, la cantidad de combustible actual y los kilómetrosrecorridos.

Cada vez que una persona toma un test drive en un auto, realiza el recorrido que desea,
indicando la cantidad de kilómetrosrecorridos. Esto hace que se actualicen los datos de
cada automóvil teniendo en cuenta los siguientes datos:

* Al iniciar el testdrive se debe verificar si la cantidad de combustible actual es por
lo menos la mitad de la capacidad del auto. Si no es así se debe primero
cargarcombustible. Esta acción llena el tanque.

* Si el automóvil es caja manual

    * Si tiene fabricación anterior al año 2015 el gasto de combustible es de 13
    lt cada 100km.

    * Si tiene fabricación igual o superior al año 2015 el gasto de combustible
    es de 10 lt cada 100km.

* Si el automóvil es caja automática el gasto de combustible es de 8 lt cada
100 km

* Cada vez que el automóvil hace un recorrido (X cantidad de kilómetros) se debe
reflejar el gasto de combustible del mismo, la persona que lo realizó, y la cantidad
de kms que recorrió, asimismo actualizar en el automóvil los datos de kilometraje
total y combustible actual.

* Un auto puede ser testeado por varias personas, por lo cual se debe guardar
registro de cada uno de los conductores.
Al finalizar el día, la concesionaria desea obtener la siguiente información:

* Para cada uno de los automóviles se debe poder ver los datos del mismo, los
choferes que lo testearo, los kilómetros recorridos totales y cuánto combustible
tiene el tanque.

* Cuál fue el automóvil que más conductores tuvo.
* Cuál fue el automóvil que recorrió más kilómetros.
* Si hubo algún automóvil que no tuvo testdrives, mostrando los datos del mismo.
* Si hubo algún conductor que testeo más de un auto, mostrando los datos del
mismo.

1) Leer atentamente todo el enunciado.

2) Armar la estructura del/los TDA y arreglos correspondientes como crea
necesario.

3) Implemente un programa que permita crear los autos, realizar distintos testdrives
para varias personas y luego permita emitir la información que necesita la
agencia.

4) Agregar alguna funcionalidad que se represente con un método estático y un
método privado en el tda.
