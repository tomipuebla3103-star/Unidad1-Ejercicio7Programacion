public class TomoManga {
    private String tituloObra;
    private int numeroVolumen;
    private double precioCompra;
    private boolean leido;

    public TomoManga(String tituloObra, int numeroVolumen, double precioCompra) {
        this.tituloObra = tituloObra;

        if (numeroVolumen >= 0) {
            this.numeroVolumen = numeroVolumen;
        } else {
            this.numeroVolumen = 0;
        }

        if (precioCompra >= 0) {
            this.precioCompra = precioCompra;
        } else {
            this.precioCompra = 0;
        }

        this.leido = false;
    }

    public String getTituloObra() {
        return tituloObra;
    }

    public void setTituloObra(String tituloObra) {
        this.tituloObra = tituloObra;
    }

    public int getNumeroVolumen() {
        return numeroVolumen;
    }

    public void setNumeroVolumen(int numeroVolumen) {
        if (numeroVolumen >= 0) {
            this.numeroVolumen = numeroVolumen;
        }
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        if (precioCompra >= 0) {
            this.precioCompra = precioCompra;
        }
    }

    public boolean isLeido() {
        return leido;
    }

    public void marcarComoLeido() {
        leido = true;
    }

    public void estadoLectura() {
        if (leido) {
            System.out.println("Estado: Finalizado");
        } else {
            System.out.println("Estado: Pendiente");
        }
    }
}
