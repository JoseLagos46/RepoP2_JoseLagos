package repop2_joselagos;

public class Super {

    private int codigo;
    private int riesgo;
    private int fallidos = 0;

    public Super() {
    }

    public Super(int codigo, int riesgo) {
        this.codigo = codigo;
        setRiesgo(riesgo);
    }
    
    public Super(int codigo, int riesgo, int fallidos) {
        this.codigo = codigo;
        setRiesgo(riesgo);
        this.fallidos = fallidos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(int riesgo) {
        if (riesgo >= 6 && riesgo <= 10) {
            this.riesgo = riesgo;
        } else if (riesgo > 10) {
            this.riesgo = 10;
        } else if (riesgo < 6) {
            this.riesgo = 6;
        }
    }

    public int getFallidos() {
        return fallidos;
    }

    public void setFallidos(int fallidos) {
        this.fallidos = fallidos;
    }

    @Override
    public String toString() {
        return codigo + "";
    }

}
