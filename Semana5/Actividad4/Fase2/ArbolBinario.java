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

    // ===== FASE 3: BÚSQUEDA =====
    public boolean buscar(int d) {
        return buscarRec(raiz, d);
    }

    private boolean buscarRec(Nodo n, int d) {
        if (n == null) {
            return false;
        }
        if (d == n.getDato()) {
            return true;
        }
        if (d < n.getDato()) {
            return buscarRec(n.getIzq(), d);
        }
        return buscarRec(n.getDer(), d);
    }

    public String claseNodo(int d) {
        Nodo n = buscarNodo(raiz, d);
        if (n == null) {
            return "NO_EXISTE";
        }
        if (n == raiz) {
            return "RAIZ";
        }
        if (n.getIzq() == null && n.getDer() == null) {
            return "HOJA";
        }
        if (n.getIzq() == null || n.getDer() == null) {
            return "UN_HIJO";
        }
        return "DOS_HIJOS";
    }

    private Nodo buscarNodo(Nodo n, int d) {
        if (n == null) {
            return null;
        }
        if (d == n.getDato()) {
            return n;
        }
        if (d < n.getDato()) {
            return buscarNodo(n.getIzq(), d);
        }
        return buscarNodo(n.getDer(), d);
    }

    // ===== FASE 4: ELIMINACIÓN =====
    public boolean eliminar(int d) {
        boolean encontrado = buscar(d);
        if (encontrado) {
            raiz = eliminarRec(raiz, d);
        }
        return encontrado;
    }

    private Nodo eliminarRec(Nodo n, int d) {
        if (n == null) {
            return null;
        }
        if (d < n.getDato()) {
            n.setIzq(eliminarRec(n.getIzq(), d));
        } else if (d > n.getDato()) {
            n.setDer(eliminarRec(n.getDer(), d));
        } else {
            if (n.getIzq() == null && n.getDer() == null) {
                return null;
            }
            if (n.getIzq() == null) {
                return n.getDer();
            }
            if (n.getDer() == null) {
                return n.getIzq();
            }
            Nodo sucesor = minimo(n.getDer());
            n.setDato(sucesor.getDato());
            n.setDer(eliminarRec(n.getDer(), sucesor.getDato()));
        }
        return n;
    }

    private Nodo minimo(Nodo n) {
        while (n.getIzq() != null) {
            n = n.getIzq();
        }
        return n;
    }

}