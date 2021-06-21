package repop2_joselagos;

public class Regulares {

    private int codigo;
    private int riesgo;
    private int exito = 0;

    public Regulares() {
    }

    public Regulares(int codigo, int riesgo) {
        this.codigo = codigo;
        setRiesgo(riesgo);
    }
    
    public Regulares(int codigo, int riesgo, int exito) {
        this.codigo = codigo;
        setRiesgo(riesgo);
        this.exito = exito;
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
        if (riesgo >= 1 && riesgo <= 5) {
            this.riesgo = riesgo;
        } else if (riesgo > 5) {
            this.riesgo = 5;
        } else if (riesgo < 1) {
            this.riesgo = 1;
        }
    }

    public int getExito() {
        return exito;
    }

    public void setExito(int exito) {
        this.exito = exito;
    }

    @Override
    public String toString() {
        return codigo + "";
    }

}
