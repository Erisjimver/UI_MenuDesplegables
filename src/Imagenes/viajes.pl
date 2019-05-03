%ECHOS

destino(peru).
destino(colombia).
destino(mexico).
destino(galapagos).

hoteles(oroVerde).
hoteles(hiltonColon).
hoteles(kalabi).
hoteles(mirarAlCielo).


restaurant(comedorOlgita).
restaurant(comedorMariana).
restaurant(deliciasDelMar).
restaurant(kfc).
restaurant(menestrasNegro).

%%RELACIONES
destino_precio(peru,20).
destino_precio(colombia,35).
destino_precio(mexico,435).
destino_precio(galapagos,120).

holel_destino(oroVerde,peru).
holel_destino(hiltonColon,peru).
holel_destino(kalabi,peru).
holel_destino(oroVerde,colombia).
holel_destino(hiltonColon,mexico).
holel_destino(kalabi,galapagos).

restaurant_destino(comedorOlgita,mexico).
restaurant_destino(comedorMariana,peru).
restaurant_destino(deliciasDelMar,galapagos).
restaurant_destino(deliciasDelMar,mexico).
restaurant_destino(kfc,mexico).
restaurant_destino(menestrasNegro,colombia).

precio_bus_destino(mexico,0.25).
precio_bus_destino(colombia,20.000).
precio_bus_destino(galapagos,0.75).
precio_bus_destino(peru,0.25).

precio_hospedaje(hiltonColon,75).
precio_hospedaje(oroVerde,65).
precio_hospedaje(kalabi,25).
precio_hospedaje(mirarAlCielo,50).

precio_desayuno(comedorOlgita,3.00).
precio_desayuno(comedorMariana,3.25).
precio_desayuno(deliciasDelMar,3.50).
precio_desayuno(kfc,4.99).
precio_desayuno(menestrasNegro,4.50).

precio_almuerzo(comedorOlgita,2.50).
precio_almuerzo(comedorMariana,4.00).
precio_almuerzo(deliciasDelMar,4.00).
precio_almuerzo(kfc,4.99).
precio_almuerzo(menestrasNegro,3.00).

precio_merienda(comedorOlgita,2.50).
precio_merienda(comedorMariana,3.00).
precio_merienda(deliciasDelMar,4.50).
precio_merienda(kfc,4.99).
precio_merienda(menestrasNegro,3.75).

piqueos(comedorOlgita,2).
piqueos(comedorMariana,6).
piqueos(deliciasDelMar,7).
piqueos(kfc,2).
piqueos(menestrasNegro,4).


total_alimentos(X,Y,Z):-restaurant_destino(X,Y),precio_desayuno(X,A),precio_almuerzo(X,B),precio_merienda(X,C),(Z is A+B+C).

hotel_destino_hotel(X,Y,Z):-holel_destino(X,Y),precio_hospedaje(X,Z).

