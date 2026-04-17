/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impostoveiculo;

/**
 *
 * @author claudia
 */
public class Moto extends Veiculo{
    
    
    /**
     * Calcular imposto da moto
     * @return
     */
    
    @Override
    public double calcularImposto(){
        return valor / 100 * 4;
    }
}
