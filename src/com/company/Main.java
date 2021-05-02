package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        final double NUMBER_OF_SIDES=2;

        double PanelLenght,PanelWidth,
        NumberPanels,TotalArea;

        Scanner input = new Scanner(System.in);

        System.out.println("Эта программа подсчитать, сколько всего сульфида необходимо на обработку всех панелей Энии.");

        System.out.print("Введите ширину панели ");
        PanelWidth=input.nextDouble();

        System.out.println("Введите длину панели ");
        PanelLenght=input.nextDouble();

        System.out.print("Введите количество панелей ");
        NumberPanels=input.nextDouble();

        System.out.print("Общая площадь ");
        TotalArea =PanelLenght*PanelWidth*NumberPanels*NUMBER_OF_SIDES;

        System.out.println("Столько сульфида необходимо на обработку всех панелей Энии:"+TotalArea);











    }
}
