package model;

import org.jfree.data.xy.XYSeries;

public class HiloGrafico implements Runnable{

    private XYSeries series;
    public HiloGrafico(XYSeries series){
        this.series=series;
    }
    @Override
    public void run() {
        int x=0;
        while(x<20000){
            series.add(x++,5);
        }
    }
}
