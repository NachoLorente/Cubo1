/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author Alumno Mañana
 */
public class Cubito {
    private int alto, ancho, profundo;

    public Cubito() {
    }

    public Cubito(int alto, int ancho, int profundo) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getProfundo() {
        return profundo;
    }

    public void setProfundo(int profundo) {
        this.profundo = profundo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + this.alto;
        hash = 19 * hash + this.ancho;
        hash = 19 * hash + this.profundo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cubito other = (Cubito) obj;
        if (this.alto != other.alto) {
            return false;
        }
        if (this.ancho != other.ancho) {
            return false;
        }
        if (this.profundo != other.profundo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cubito{alto=").append(alto);
        sb.append(", ancho=").append(ancho);
        sb.append(", profundo=").append(profundo);
        sb.append('}');
        return sb.toString();
    }
    
    public int volumen (){
        return alto * ancho * profundo;
    }
}
