/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracomida;

import calculadoracomida.InformacionComida.InformacionComidaBuilder;

/**
 *
 * @author melegatti
 */
public class CalculadoraComida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
        InformacionComida unaComida;
        InformacionComidaBuilder comidaBuilder = new InformacionComida.InformacionComidaBuilder("Chifrijo");
        comidaBuilder = comidaBuilder.calorias(1500).cantidadPorcion(1).carbohidratos(5).grasa(500).sodio(300).unidadDeMedida(Medida.G).porciones(2);
        unaComida = comidaBuilder.createInformacionComida();
        System.out.println(unaComida.toString());        
    }
    
}
