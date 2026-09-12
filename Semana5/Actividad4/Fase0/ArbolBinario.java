public class ArbolBinario {
    private Nodo raiz;
    
    public ArbolBinario() {
        raiz = null;
    }
  
    public boolean estaVacio() {
        return raiz == null;
    }
  
    public Nodo getRaiz() {
        return raiz;
    }
  
    // ===== FASE 1: INSERCIÓN =====
    public void insertar(int d) {
        // TODO: implementa la inserción en un ABB.
        // Sugerencia:
        //   raiz = insertarRec(raiz, d);
        raiz = insertarRec(raiz, d);
    }
  
    private Nodo insertarRec(Nodo n, int d) {
        // TODO: si n es null crea un Nodo(d) y devuélvelo.
        // Si d < n.getDato() enlaza por la izquierda, si es mayor por la derecha.
        if (n == null) {
            return new Nodo(d);
        }
        if (d < n.getDato()) {
            n.setIzq(insertarRec(n.getIzq(), d));
        } else if (d > n.getDato()) {
            n.setDer(insertarRec(n.getDer(), d));
        }
        return n;
    }
  }