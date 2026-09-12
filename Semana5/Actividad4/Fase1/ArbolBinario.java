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
        raiz = insertarRec(raiz, d);
    }
  
    private Nodo insertarRec(Nodo n, int d) {
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
  
    // ===== FASE 2: RECORRIDOS =====
    public String inorden() {
        StringBuilder sb = new StringBuilder();
        inordenRec(raiz, sb);
        return sb.toString();
    }

    private void inordenRec(Nodo n, StringBuilder sb) {
        if (n == null) {
            return;
        }
        inordenRec(n.getIzq(), sb);
        if (sb.length() > 0) {
            sb.append(",");
        }
        sb.append(n.getDato());
        inordenRec(n.getDer(), sb);
    }

    public String preorden() {
        StringBuilder sb = new StringBuilder();
        preordenRec(raiz, sb);
        return sb.toString();
    }

    private void preordenRec(Nodo n, StringBuilder sb) {
        if (n == null) {
            return;
        }
        if (sb.length() > 0) {
            sb.append(",");
        }
        sb.append(n.getDato());
        preordenRec(n.getIzq(), sb);
        preordenRec(n.getDer(), sb);
    }

    public String postorden() {
        StringBuilder sb = new StringBuilder();
        postordenRec(raiz, sb);
        return sb.toString();
    }

    private void postordenRec(Nodo n, StringBuilder sb) {
        if (n == null) {
            return;
        }
        postordenRec(n.getIzq(), sb);
        postordenRec(n.getDer(), sb);
        if (sb.length() > 0) {
            sb.append(",");
        }
        sb.append(n.getDato());
    }
}