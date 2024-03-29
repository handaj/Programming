package patterns.xor;

/**
 * Given a binary matrix representing an image, we want to flip the image horizontally, then invert it.
 *
 * To flip an image horizontally means that each row of the image is reversed. For example, flipping [0, 1, 1] horizontally results in [1, 1, 0].
 *
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [1, 1, 0] results in [0, 0, 1].
 *
 * Example 1:
 *
 * Input: [
 *   [1,0,1],
 *   [1,1,1],
 *   [0,1,1]
 * ]
 * Output: [
 *   [0,1,0],
 *   [0,0,0],
 *   [0,0,1]
 * ]
 */
public class FlipAndInvert {
    public static void main(String[] args) {

    }

    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0; i < image.length; i++) {
            int m = 0, n = image[0].length - 1;
            while(m < n) {
                int temp = image[i][m];
                image[i][m] = image[i][n];
                image[i][n] = temp;
                m++;
                n--;
            }

            for(int j=0; j < image[0].length; j++) {
                image[i][j] = image[i][j] ^ 1;
            }
        }

        return image;
    }
}
