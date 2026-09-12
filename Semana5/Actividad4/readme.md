# BST Challenge — Árbol Binario de Búsqueda

## Matrícula
AL07181847

## Código/identificador del reto generado
Seed: **Q43GDUR** (plataforma `bts.pattoxd.dev`, Actividad 4 — BST Challenge)

## Descripción breve del procedimiento realizado
Se construyó un Árbol Binario de Búsqueda (ABB) a partir de la secuencia de
inserción generada por la plataforma:

```
13, 26, 87, 21, 3, 46, 39, 65, 38, 91, 2, 52, 70, 56, 83, 94, 80, 19, 72, 25, 7, 86, 53
```

A partir de ahí se completaron, fase por fase, los métodos de `ArbolBinario.java`:

1. **Insertar nodos** — inserción recursiva estándar de ABB (`insertar` / `insertarRec`).
2. **Recorridos** — `inorden()`, `preorden()` y `postorden()`, cada uno devolviendo un `String` de valores separados por coma.
3. **Búsqueda** — `buscar()` (booleano), `buscarNodo()` (devuelve el nodo) y `claseNodo()` (clasifica el nodo encontrado como `RAIZ`, `HOJA`, `UN_HIJO`, `DOS_HIJOS` o `NO_EXISTE`).
4. **Eliminación**, en cuatro sub-fases según el caso a resolver:
   - Eliminar una **hoja** (valor `2`).
   - Eliminar un nodo con **un hijo** (valor `3`, que quedó con un solo hijo tras borrar `2`).
   - Eliminar un nodo con **dos hijos** (valor `26`), reemplazándolo por su sucesor inorden (mínimo del subárbol derecho).
   - Eliminar la **raíz** (valor `13`), también con dos hijos, usando la misma lógica de sucesor.

Cada fase se validó en la plataforma con el botón **EJECUTAR** antes de avanzar a la siguiente, y se dibujó a mano el árbol resultante de cada operación relevante antes de correr el código (según lo pedido en cada fase).

## Resultados obtenidos

**Árbol inicial** (tras insertar toda la secuencia) — PREORDEN:
```
13,3,2,7,26,21,19,25,87,46,39,38,65,52,56,53,70,80,72,86,83,91,94
```

**Tras eliminar 2** (caso HOJA):
```
13,3,7,26,21,19,25,87,46,39,38,65,52,56,53,70,80,72,86,83,91,94
```

**Tras eliminar 3** (caso UN HIJO — el 7 ocupa su lugar):
```
13,7,26,21,19,25,87,46,39,38,65,52,56,53,70,80,72,86,83,91,94
```

**Tras eliminar 26** (caso DOS HIJOS — sucesor inorden: 38):
```
13,7,38,21,19,25,87,46,39,65,52,56,53,70,80,72,86,83,91,94
```

**Tras eliminar 13 / raíz** (caso DOS HIJOS — sucesor inorden: 19):
```
19,7,38,21,25,87,46,39,65,52,56,53,70,80,72,86,83,91,94
```

Todas las fases fueron validadas por la plataforma con el mensaje **"PASASTE — ¡Correcto!"**, completando las 8 fases del reto (27/27).

## Evidencias correspondientes
- `f1-arbol-inicial.jpg` — dibujo en papel del árbol tras insertar la secuencia.
- `f1-reto.png` — captura de fase "Insertar nodos" aprobada.
- `f2-reto.png` — captura de fase "Recorridos" aprobada.
- `codigo/fase2/` — código de la fase de recorridos.
- `f3-reto.png` — captura de fase "Búsqueda" aprobada.
- `codigo/fase3/` — código de la fase de búsqueda.
- `f2-arbol-eliminar-hoja.jpg` — dibujo del árbol tras eliminar la hoja (2).
- `f4-reto.png` — captura de fase "Eliminar hoja" aprobada.
- `f3-arbol-eliminar-1hijo.jpg` — dibujo del árbol tras eliminar el nodo con un hijo (3).
- `f5-reto.png` — captura de fase "Eliminar nodo con un hijo" aprobada.
- `codigo/fase5/` — código de esa fase.
- `f4-arbol-eliminar-2hijos.jpg` — dibujo del árbol tras eliminar el nodo con dos hijos (26).
- `f6-reto.png` — captura de fase "Eliminar nodo con dos hijos" aprobada.
- `f5-arbol-eliminar-raiz.jpg` — dibujo del árbol tras eliminar la raíz (13).
- `f7-reto.png` — captura de fase "Eliminar la raíz" aprobada.
- `f8-fin.png` — captura final del reto completado.
- `ArbolBinario.java`, `Nodo.java`, `Main.java` — código fuente final.