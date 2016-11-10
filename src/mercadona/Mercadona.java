/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadona;

import java.util.ArrayList;

public class Mercadona {

    static ArrayList<Producto> producto = new ArrayList<Producto>();

    static ArrayList<Empleado> empleado = new ArrayList<Empleado>();

    public static void rellenardatos() {

        for (int i = 0; i < 10; i++) {
            Empleado em = new Empleado();
            em.setNombre("juan" + i);
            em.setEdad(24 + i);
        }
        for (int i = 0; i < 10; i++) {
            Producto pr = new Producto();
            pr.setCodigo(2456 + i);
            pr.setNombre("carne"+1);
            pr.setPeso(2.5+i);
            producto.add(pr);

            ProductoCaduca prcad = new ProductoCaduca();
            prcad.setNombre("carne"+i);
            prcad.setPeso(2.5+i);
            prcad.setFecha("28/06/2016" + i);
            prcad.setCodigo(3000 + i);
            producto.add(prcad);

            ProductosFrescos prfres = new ProductosFrescos();
            prfres.setNombre("carne"+i);
            prfres.setPeso(2.5+i);
            prfres.setFecha("15/11/2016" + i);
            prfres.setCodigo(4000 + i);
            prfres.setTemperatura(13.5 + i);
            producto.add(prfres);

            Bebida beb = new Bebida();
            beb.setNombre("carne"+i);
            beb.setPeso(2.5+i);
            beb.setFecha("18/05/2016" + i);
            beb.setCodigo(300 + i);
            beb.setAzucar("si" + i);
            producto.add(beb);

            BebidaAlcohol bebal = new BebidaAlcohol();
            bebal.setNombre("carne"+i);
            bebal.setPeso(2.5+i);
            bebal.setCodigo(200 + i);
            bebal.setFecha("30/05/2016" + i);
            bebal.setAzucar("si" + i);
            bebal.setGraduacion(15.5 + i);
            producto.add(bebal);

        }

    }

    public static void mostrarbebidas() {
        for (int i = 0; i < producto.size(); i++) {
            if (producto.get(i) instanceof Bebida) {
                Bebida bebi = (Bebida) producto.get(i);
                System.out.println(bebi.getCodigo());
            }
        }

    }

    public static void mostrarbebidasnoalcoholicas() {
        for (int i = 0; i < producto.size(); i++) {
            if (producto.get(i) instanceof Bebida) {
                Bebida bebi = (Bebida) producto.get(i);
                if (!(bebi instanceof BebidaAlcohol)) {

                    System.out.println(bebi.getAzucar());
                }

            }
        }

    }

    public static void mediagraduacion() {

        double suma = 0;
        double media = 0;
        int contador = 0;
        for (int i = 0; i < producto.size(); i++) {
            if (producto.get(i) instanceof BebidaAlcohol) {
                BebidaAlcohol bebal = (BebidaAlcohol) producto.get(i);
                suma = suma + (double) (bebal.getGraduacion());

                contador = contador + 1;
            }
        }
        media = suma / contador;
        System.out.println("la media de la graduacion de las bebidas alcoholicas es: " + media);
    }

    public static void maximagraduacion() {

        int max = 0;

        for (int i = 0; i < producto.size(); i++) {
            if (producto.get(i) instanceof BebidaAlcohol) {
                BebidaAlcohol bebal = (BebidaAlcohol) producto.get(i);

                if (bebal.getGraduacion() > max) {
                    max = (int) bebal.getGraduacion();

                }

            }
        }
        System.out.println(max);
    }
    public static void minimagraduacion() {

        int min = 15;

        for (int i = 0; i < producto.size(); i++) {
            if (producto.get(i) instanceof BebidaAlcohol) {
                BebidaAlcohol bebal = (BebidaAlcohol) producto.get(i);

                if (bebal.getGraduacion() < min) {
                    min = (int) bebal.getGraduacion();

                }

            }
        }
        System.out.println(min);
    }
public static void mostrartodo(){

    for (Producto producto : producto) {
        producto.mostrar();
    }

}
    public static void main(String[] args) {
        rellenardatos();
        //mostrarbebidas();
        //mediagraduacion();
        //maximagraduacion();
        minimagraduacion();
        //mostrarbebidasnoalcoholicas();
        //mostrartodo();
    }

}
