package compression.templateMethod;

public class CompressChild2 extends Compresser {
    @Override
    public int[] compresser(int[] data) {

        int[] imageCompresse = new int [(data.length/2)+(data.length/3)];
        for (int i = 0; i < imageCompresse.length; i++) {
            imageCompresse[i] = data[i];
        }

        System.out.println("********************** Child2 compression **********************");

        return imageCompresse;
    }
}
