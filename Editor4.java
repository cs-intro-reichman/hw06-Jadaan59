import java.awt.Color;
/*
This client program performs another striking visual effect:
 it morphs an image into its grescaled version.
 */
public class Editor4 {

        public static void main (String[] args) {
            String source = args[0];
            int n = Integer.parseInt(args[1]);
            Color[][] sourceImage = Runigram.read(source);
            Color [][] GreyImage = Runigram.grayScaled(sourceImage);
            Runigram.setCanvas(sourceImage);
            Runigram.morph(sourceImage,GreyImage, n);
        }
    }

