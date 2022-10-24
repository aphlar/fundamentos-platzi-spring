package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanDependImple implements MyBeanDepend {

    private MyOperations myOperations;

    public MyBeanDependImple (MyOperations myOperations){
        this.myOperations = myOperations;
    }

    @Override
    public void printWhitDepe() {
        int numerin = 1;
        System.out.println(myOperations.sumita(numerin));
        System.out.println("holi desde imple bean");
    }
}
