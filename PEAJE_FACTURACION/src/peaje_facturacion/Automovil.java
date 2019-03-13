/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peaje_facturacion;

/**
 *
 * @author s204e5
 */
public class Automovil {
    
   String placa;
   String marca;
   String tipovehiculo;
   int valorpeaje=10000;

    public Automovil(String placa, String marca, String tipovehiculo) {
        this.placa = placa;
        this.marca = marca;
        this.tipovehiculo = tipovehiculo;
    }

    Automovil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipovehiculo() {
        return tipovehiculo;
    }

    public void setTipovehiculo(String tipovehiculo) {
        this.tipovehiculo = tipovehiculo;
    }

    public int getValorpeaje() {
        return valorpeaje;
    }

    public void setValorpeaje(int valorpeaje) {
        this.valorpeaje = valorpeaje;
    }

    @Override
    public String toString() {
        return "Automovil{" + "placa=" + placa + ", marca=" + marca + ", tipovehiculo=" + tipovehiculo + ", valorpeaje=" + valorpeaje + '}';
    }

}
