package repop2_joselagos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class AdminHackeo {
    private ArrayList<Regulares> hacks_R = new ArrayList();
    private ArrayList<Super> hacks_S = new ArrayList();
    private File archivo = null;

    public AdminHackeo(String path) {
        archivo = new File(path);
    }

    public ArrayList<Regulares> getHacks_R() {
        return hacks_R;
    }

    public void setHacks_R(ArrayList<Regulares> hacks_R) {
        this.hacks_R = hacks_R;
    }

    public ArrayList<Super> getHacks_S() {
        return hacks_S;
    }

    public void setHacks_S(ArrayList<Super> hacks_S) {
        this.hacks_S = hacks_S;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setHack_R(Regulares hack){
        this.hacks_R.add(hack);
    }
    
    public void setHack_S(Super hack){
        this.hacks_S.add(hack);
    }
   
    
//////////////////////Crear Archivo/////////////////////////////////////////////    
    public void crearArchivoRegular() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Regulares h : hacks_R) {
                bw.write(h.getCodigo() + ";");
                bw.write(h.getRiesgo() + ";");
                bw.write(h.getExito() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
    
    public void crearArchivoSuper() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Super h : hacks_S) {
                bw.write(h.getCodigo() + ";");
                bw.write(h.getRiesgo() + ";");
                bw.write(h.getFallidos() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
    
//////////////////Leer Archivo/////////////////////////////////////////////////
    public void leerArchivoRegular() {
        Scanner leer = null;
        hacks_R = new ArrayList();
        if (archivo.exists()) {
            try {
                leer = new Scanner(archivo);
                leer.useDelimiter(";");
                while (leer.hasNext()) {
                    hacks_R.add(new Regulares(leer.nextInt(), leer.nextInt(), leer.nextInt()));
                }
            } catch (Exception ex) {
                
            }
            leer.close();
        }
    }
    
    public void leerArchivoSuper() {
        Scanner leer = null;
        hacks_S = new ArrayList();
        if (archivo.exists()) {
            try {
                leer = new Scanner(archivo);
                leer.useDelimiter(";");
                while (leer.hasNext()) {
                    hacks_S.add(new Super(leer.nextInt(), leer.nextInt(),leer.nextInt()));
                }
            } catch (Exception ex) {

            }
            leer.close();
        }
    }
}
