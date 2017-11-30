/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracomida;

/**
 *
 * @author maguero
 */
public class InformacionComida {
    private final String nombre; 
    private final int cantidadPorcion;
    private final Medida unidadDeMedida;
    private final int porciones;
    private final int calorias;
    private final int grasa;
    private final int sodio;
    private final int carbohidratos;

    public InformacionComida(final String pNombre,final  int pCantidadPorcion,final Medida pMedida,final 
                              int pPorciones,final int pCalorias,final int pGrasa,final int pSodio,final int pCarbohidratos){
        this.nombre = pNombre;
        this.cantidadPorcion = pCantidadPorcion;
        this.unidadDeMedida = pMedida;
        this.porciones = pPorciones;
        this.calorias = pCalorias;
        this.grasa = pGrasa;
        this.sodio = pSodio;
        this.carbohidratos = pCarbohidratos;
    }

	@Override
	public String toString() {
		return "InformacionComida [nombre=" + nombre + ", cantidadPorcion=" + cantidadPorcion + ", unidadDeMedida="
				+ unidadDeMedida + ", porciones=" + porciones + ", calorias=" + calorias + ", grasa=" + grasa
				+ ", sodio=" + sodio + ", carbohidratos=" + carbohidratos + "]";
	}
	
	
	public static class InformacionComidaBuilder{
		private String nestedNombre; 
	    private int nestedCantidadPorcion;
	    private Medida nestedUnidadDeMedida;
	    private int nestedPorciones;
	    private int nestedCalorias;
	    private int nestedGrasa;
	    private int nestedSodio;
	    private int nestedCarbohidratos;
	    
	    
	    public InformacionComidaBuilder(final String pNestedNombre) {
	    	this.nestedNombre = pNestedNombre;    	
	    }
	    
	    public InformacionComidaBuilder cantidadPorcion(int pNestedCantidadPorcion) {
	    	this.nestedCantidadPorcion = pNestedCantidadPorcion;
	    	return this;	    	
	    }
	    
	    public InformacionComidaBuilder unidadDeMedida(Medida pNestedUnidadDeMedida) {
	    	this.nestedUnidadDeMedida = pNestedUnidadDeMedida;
	    	return this;
	    }
	    
	    public InformacionComidaBuilder porciones(int pNestedPorciones) {
	    	this.nestedPorciones = pNestedPorciones;
	    	return this;
	    }
	    
	    public InformacionComidaBuilder calorias(int pNestedCalorias) {
	    	this.nestedCalorias = pNestedCalorias;
	    	return this;
	    }
	    
	    public InformacionComidaBuilder grasa(int pNestedGrasa) {
	    	this.nestedGrasa = pNestedGrasa;
	    	return this;
	    }
	    
	    public InformacionComidaBuilder sodio(int pNestedSodio) {
	    	this.nestedSodio = pNestedSodio;
	    	return this;
	    }
	    
	    public InformacionComidaBuilder carbohidratos(int pNestedCarbohidratos) {
	    	this.nestedCarbohidratos = pNestedCarbohidratos;
	    	return this;
	    }
	    
	    public InformacionComida createInformacionComida() {
	    	return new InformacionComida(nestedNombre, nestedCantidadPorcion, nestedUnidadDeMedida, nestedPorciones, nestedCalorias, nestedGrasa, nestedSodio, nestedCarbohidratos);
	    }	    
	    
	}
    
    
}
