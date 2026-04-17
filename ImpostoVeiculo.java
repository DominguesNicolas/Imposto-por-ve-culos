/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package impostoveiculo;

/**
 *
 * @author claudia
 */
public class ImpostoVeiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Veiculo carro = new Carro();
        carro.setMarca("Toyota");
        carro.setModelo("Corolla");
        carro.setValor(80000);
        
        Veiculo moto = new Moto();
        moto.setMarca("Honda");
        moto.setModelo("CG 160");
        moto.setValor(15000);
        
        Veiculo caminhao = new Caminhao();
        caminhao.setMarca("Volvo");
        caminhao.setModelo("FH");
        caminhao.setValor(300000);
        
        Veiculo[] veiculos = {moto, carro, caminhao};
                for (Veiculo v : veiculos){
                    System.out.println("Veiculo....:" + v.getMarca() +" " + v.getModelo());
                    System.out.println("Valor.....:" + v.getValor());
                    System.out.println("Imposto.....:" + v.calcularImposto());
                    System.out.println("\n----------------\n");
                }
    }
    
}
