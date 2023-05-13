package factura;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class FacturaClass {
    private String descripcion;
    private int importe;

    public FacturaClass() {
    }

    public FacturaClass(String descripcion, int importe) {
        this.descripcion = descripcion;
        this.importe = importe;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "FacturaClass{" + "descripcion=" + descripcion + ", importe=" + importe + '}';
    }
    
    
}
