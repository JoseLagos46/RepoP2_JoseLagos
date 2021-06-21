package repop2_joselagos;

import javax.swing.JProgressBar;

public class AdminProgressS extends Thread{
    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    private int tiempo;

    public AdminProgressS(JProgressBar barra, int tiempo) {
        this.barra = barra;
        this.avanzar = true;
        this.vive = true;
        this.tiempo = tiempo;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    
    @Override
    public void run(){
        while(vive){
            if(avanzar){
                barra.setValue(barra.getValue()+1);
                if(barra.getValue()==tiempo){
                    vive=false;
                }                
            } //FIN IF
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }
}
