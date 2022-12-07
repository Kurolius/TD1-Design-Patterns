package filtrage.adapter;

public class ImplNonStandard {
    public int[] appliquerFiltre(String filterName, int[] data){
        int[] imageFiltre =data;
        for (int i = 0; i <data.length ; i++) {
            imageFiltre[i] = data[i]+8;
        }
        System.out.println("********************** application du filtrage non standard **********************");

        return  imageFiltre;
    }
}
