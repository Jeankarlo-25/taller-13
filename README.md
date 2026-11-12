# Observer · La panadería del barrio (ejercicio de entrada)

Programación I · Patrones de comportamiento · Universidad Libre

Primer contacto con Observer, antes del repositorio `observer-alertas-transmilenio`.

## Carpetas

| Carpeta | Qué contiene |
|---|---|
| `00-inicio` | Cada hora, cada vecino va a preguntar si ya hay pan. |
| `01-observer` | Los vecinos se suscriben una vez y la panadería les avisa cuando sale el pan. |

Los cambios están marcados con comentarios `// Paso N`.

## Compilar y ejecutar

```
cd 00-inicio
javac *.java
java Main
```

## Síntoma que se observa en `00-inicio`

Tres vecinos preguntan a las 5, 6 y 7: son **9 preguntas** y 6 de ellas reciben "todavia no". El que tiene la novedad es la panadería, pero el trabajo lo hacen los vecinos.

## Reto (`02-reto`)

Copie `01-observer` como `02-reto`:

1. Cree la clase `Tienda`, que también implementa `Suscriptor`. Al recibir el aviso imprime: `Tienda Don Ramiro: encarga 30 panes`.
2. Suscríbala en `Main` junto a los vecinos.
3. Guarde a Luis en una variable y desuscríbalo antes de las 7: ese día no quiere pan.
4. No modifique `Panaderia`.
5. Pregunta: la panadería avisa a un vecino y a una tienda, que son clases distintas. ¿Cómo lo logra sin conocer ninguna de las dos?
