package edu.escuelaing.arsw.CentralTendencyMeasures;

import edu.escuelaing.arsw.LinkedList.LinkedList;

public class CentralTendencyCalculator {
    private final LinkedList<Double> list;
    public CentralTendencyCalculator(LinkedList<Double> list){
        this.list = list;
    }

    public double calculateMean(){
        double acum = 0;
        for(Double i: list){
            acum+=i;
        }
        return acum/list.size();
    }

    public double standardDeviation(){
        double acum = 0;
        for (Double i : list){
            acum += Math.pow(i - calculateMean(),2);
        }
        double temp = acum/(list.size()-1);
        return Math.sqrt(temp);
    }
}
