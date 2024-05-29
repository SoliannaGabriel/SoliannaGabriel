import java.awt.Color;

public class imageFilter {

    public static void main(String[] args) {
        Picture sunrise = new Picture("sunrise.jpg");
        Picture sunrise2 = new Picture("sunrise2.jpg");

        Picture filteredSunrise = imageFilter(sunrise);
        Picture filteredSunrise2 = imageFilter(sunrise2);

        // Displays the filtered image
        filteredSunrise.explore();
        filteredSunrise2.explore();
    }

    public static Picture filterApply(Picture p) {
        Picture copy = new Picture(p);
        Pixel[][] pix_old = p.getPixels2D();
        Pixel[][] pix_new = copy.getPixels2D();

        for (int r = 0; r < pix_new.length; r++) {
            for (int c = 0; c < pix_new[r].length; c++) {
                Pixel x_old = pix_old[r][c];
                Color c_old = x_old.getColor();
                 // Make the new color

                int oldR = c_old.getRed();
                //System.out.println(x);

                int newR = oldR + 175;
                int newG = oldG - 50;
                if (newR > 255) {
                    newR = 255; 
                }
                //update the pixels (Pixel x)

                pix_new[r][c].setRed(newR);
                pix_new[r][c].setGreen(newG);

                //System.out.println(x);
            }
        }
        return copy;
    }
}

