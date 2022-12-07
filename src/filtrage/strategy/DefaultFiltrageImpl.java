package filtrage.strategy;

import filtrage.IFiltrage;

public class DefaultFiltrageImpl implements IFiltrage {

    @Override
    public int[] filtrer(int[] data) {

        int[] imageFiltre =data;
        for (int i = 0; i <data.length ; i++) {
            imageFiltre[i] = data[i]+6;
        }
        System.out.println("********************** Filtrage avec DefaultFiltrageImpl **********************");


        return  imageFiltre;
    }
}
