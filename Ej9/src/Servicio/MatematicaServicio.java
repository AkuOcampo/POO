package Servicio;

import Entidad.Matematica;

public class MatematicaServicio{
    float mayor;
    float menor;
    public Matematica crearNum(){
        Matematica m1 = new Matematica();
        m1.setNum1((float) Math.random()*10);
        m1.setNum2((float) Math.random()*10);
        return m1;
    }
    public void devolverMayor(Matematica p1){
        mayor= Math.max(p1.getNum1(),p1.getNum2());
        menor=Math.min(p1.getNum1(),p1.getNum2());
        if (menor!=mayor){
            System.out.println("El mayor es "+mayor+" y el menor es "+menor);
        }else{
            System.out.println("Los números son iguales");
        }
        /*
        if (mayor==p1.getNum1()){
            mayor = p1.getNum1();
            menor = p1.getNum2();
            System.out.println("El número 1 ("+p1.getNum1()+") es mayor a número 2 ("+p1.getNum2()+")");
        }else if (mayor==menor){
            System.out.println("El número 1 ("+p1.getNum1()+") es igual a número 2 ("+p1.getNum2()+")");
            mayor = p1.getNum1();
            mayor=menor;
        }else{
            System.out.println("El número 1 ("+p1.getNum1()+") es menor a número 2 ("+p1.getNum2()+")");
            mayor = p1.getNum2();
            menor = p1.getNum1();
        }
        */
    }
    
    public void calcularPotencia(){
        mayor = Math.round(mayor);
        menor = Math.round(menor);
        System.out.println("La potencia es igual a: "+mayor+"^"+menor+" = "+Math.pow(mayor,menor));
    }
    public void calcularRaiz(){
        Math.abs(menor);
        System.out.println("La raiz cuadrada con base " + menor+ " es igual a: "+Math.sqrt(menor));
    }
    
}
