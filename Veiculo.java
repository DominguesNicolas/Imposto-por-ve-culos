/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impostoveiculo;

/**
 *
 * @author claudia
 */
public class Veiculo {
    protected String marca;
    protected String modelo;
    protected double valor;
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public double getValor(){
        return valor;
    }
    
    
    /**
     * Método para calcular imposto
     * @return 
     */
    public double calcularImposto(){
        return 0;
    }
}
