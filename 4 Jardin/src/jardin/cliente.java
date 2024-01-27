/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jardin;


public class cliente  {
    
    private String tipoJardin;
    private String extencion;
    private String contrato;
    
    public cliente(){}

    public cliente(String tipoJardin, String extencion, String contrato) {
        this.tipoJardin = tipoJardin;
        this.extencion = extencion;
        this.contrato = contrato;
    }

    public String getTipoJardin() {
        return tipoJardin;
    }

    public void setTipoJardin(String tipoJardin) {
        this.tipoJardin = tipoJardin;
    }

    public String getExtencion() {
        return extencion;
    }

    public void setExtencion(String extencion) {
        this.extencion = extencion;
    }

    

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    @Override
    public String toString() {
        return "cliente{" + "tipoJardin=" 
                + tipoJardin + ", extencion=" + extencion +  ", contrato=" + contrato + '}';
    }
    
    

      
    
}
