# WebAppDelivery
Versión Web App mejorada

Esta es la idea de mi primer programa (si no viste mi primer programa te recomiendo verlo)
</br>
Realizado en Spring Boot utilizando una base de datos MySQL
</br>

Prueba esta App<a href="https://webappdelivery-production.up.railway.app/" target="_blank"> AQUI </a>


ADJUNTO README:

Problematica:
Jeremias es un delivery que trabaja para una pizzeria local junto con otros deliverys.
La pizzeria le otorga un pedido y cuando el lo entrega tiene que cobrar un costo adicional por su trabajo
Ejemplo: si jeremias entrega una pizza de $900 el la cobra $1000.
Al final de la noche jeremias tiene que abonar el monto de todos los pedidos que entrego esa noche, quedandose con el dinero que cobro de mas x su trabajo.
Ejemplo: si en toda la noche jeremias entrego 3 pizzas de $900 debera pagarle al local $2700 quedandose asi con $300 (recordemos los $100 que cobro de mas x cada pizza)

La pizzeria tiene una planilla en la que anota los pedidos y cuando es enviado colocan el nombre del delivery que llevo el pedido. Al finalizar la noche se hace un recuento y una suma de todos los pedidos

El problema reside en que al haber varios mensajers hay margen de equivocacion, el planillero puede equivocarse y anotar el nombre del delivery equivocado, sumandole un precio que no le corresponde, haciendo que el mensajero tenga que pagar un pedido el cual nunca entrego.

Se diseñara una app para que el pueda llevar un control de los pedidos que entrega.
Esta app sumara automaticamente el monto final que debe pagar y las ganancias que le quedan de ese dia.
Si el monto final de la app coincide con el monto final de la planilla del local, no hubo errores.
Si hay diferencia entre los dos montos finales eso indica un error, lo que hara que se revise y repase la planilla entre el mensajero y el planillero para ubicarlo y asi corregirlo.


//TODO

<ul>
  <li>Normalizar base datos</li>
<li>Hacer la plataforma multiusuario</li>
<li>Mejoras en el Front End</li>
</ul>

# Inicio

<a href="https://postimg.cc/zVwq1mrQ" target="_blank"><img src="https://i.postimg.cc/SN3RCqtm/Inicio.png" alt="Inicio"/></a><br/><br/>

# Añadiendo un viaje

<a href="https://postimg.cc/qzHpYJ9n" target="_blank"><img src="https://i.postimg.cc/hPfhXhsC/a-adiendo-un-viaje.png" alt="a-adiendo-un-viaje"/></a><br/><br/>

# Planilla diaria

<a href="https://postimg.cc/rD8MVhyw" target="_blank"><img src="https://i.postimg.cc/pLjTB7gz/planilla-diaria.png" alt="planilla-diaria"/></a><br/><br/>


# Planilla Mensual (ganancias diarias y monto a pagar a la pizzeria)

<a href="https://postimg.cc/yJxK9kZq" target="_blank"><img src="https://i.postimg.cc/zfSGshDf/planilla-mensual.png" alt="planilla-mensual"/></a><br/><br/>

# Planilla Anual (dias trabajados y ganancias mensuales)

<a href="https://postimg.cc/5Xn16wjq" target="_blank"><img src="https://i.postimg.cc/DzKzp6TD/planilla-anual.png" alt="planilla-anual"/></a><br/><br/>








