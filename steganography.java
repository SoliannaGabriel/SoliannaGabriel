
import java.awt.Color;

public class steganography {

    public static void main(String[] args) {

        Picture sunrise = new Picture("sunrise.jpg");
        Picture sunrise2 = new Picture("sunrise2.jpg");

        Picture flower = new Picture("flower.jpg");
        Picture arcade = new Picture("arcade.jpg");

        if (canHide(sunrise, sunrise2)) {
            Picture hiddenSunrise = hidePicture(sunrise, sunrise2);
            System.out.println("Hidden picture dimensions: " + hiddenSunrise.getWidth() + " x " + hiddenSunrise.getHeight());
            hiddenSunrise.explore();
            Picture revealedSunrise = revealPicture(hiddenSunrise);
            revealedSunrise.explore();
        } else {
            //System.out.println("First picture dimensions");
            //this code basically prints the dimensions of the first picture
            System.out.println("Can't hide because the dimensions aren't compatible. Please try again");
        }

        if (canHide(flower, arcade)) {
            Picture hiddenFlower = hidePicture(flower, arcade);
            System.out.println("Hidden Picture Dimensions: " + hiddenFlower.getWidth() + " x " + hiddenFlower.getHeight());
            hiddenFlower.explore();
            Picture revealedFlower = revealPicture(hiddenFlower);
            revealedFlower.explore();
        } else {
            System.out.println("Can't hide because the dimensions aren't compatible. Please try again");
        }
    }

    public static Picture revealPicture(Picture p) {
        //Picture copy = new(p.getHeight(), p.getWidth());
        Picture copy = new Picture(p);
        Pixel[][] pix_old = p.getPixels2D();
        Pixel[][] pix_new = copy.getPixels2D();

        //Here, nested loops are written to visit every pixel in "pix_new"

        for (int r = 0; r < pix_new.length; r++) {
            for (int c = 0; c < pix_new[r].length; c++) {
                Pixel x_old = pix_old[r][c];
                Color c_old = x_old.getColor();
                 //make the new color
                int oldR = c_old.getRed();
                int oldG = c_old.getGreen();
                int oldB = c_old.getBlue();

                //System.out.println(x);

                int newG = (oldG % 4 % 64);
                int newR = (oldR % 4 % 64);
                int newB = (oldB % 4 % 64);

                //update the Pixels (Pixel X)
                pix_new[r][c].setGreen(newG);
                //x.setGreen(newG);
                pix_new[r][c].setRed(newR);
                //x.setRed(newR);
                pix_new[r][c].setBlue(newB);
                //x.setBlue(nwB);

                //System.out.println(x);
            }
        }
        return copy;
    }

    public static boolean canHide(Picture source, Picture secret) {
        return source.getWidth() == secret.getWidth() && source.getHeight() == secret.getHeight();
    }

    public static Picture hidePicture(Picture source, Picture secret) {
        Picture hiddenImage = new Picture(source);
        Pixel[][] sourcePixels = source.getPixels2D();
        Pixel[][] secretPixels = secret.getPixels2D();
        Pixel[][] hiddenPixels = hiddenImage.getPixels2D();

        if (!canHide(source, secret)) {
            System.out.println("Can't hide because the dimensions aren't compatible. Please try again");
            return null;
        }
        //write nested loops
        //to visir every pixel in pix_new
        for (int r = 0; r < secretPixels.length; r++) {
            for (int c = 0; c < secretPixels[r].length; c++) {
                Pixel sourcePixel = sourcePixels[r][c];
                Pixel secretPixel = secretPixels[r][c];

                int newG = ((sourcePixel.getGreen() >> 2) << 2) | (secretPixel.getGreen() >> 6);
                int newR = ((sourcePixel.getRed() >> 2) << 2) | (secretPixel.getRed() >> 6);
                int newB = ((sourcePixel.getBlue() >> 2) << 2) | (secretPixel.getBlue() >> 6);

                 //update hiddenPixel
                hiddenPixels[r][c].setColor(new Color(newR, newG, newB));
            }
        }
        return hiddenImage;
    }
}
