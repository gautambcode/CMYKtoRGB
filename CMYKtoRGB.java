import java.util.Arrays;

class CMYKtoRGB {
    public static void main(String[] args) {
        int[] rgb = CMYKtoRGB(
                Integer.parseInt(args[0]),
                Integer.parseInt(args[1]),
                Integer.parseInt(args[2]),
                Integer.parseInt(args[3])
        );

        System.out.println(Arrays.toString(rgb));
    }

    private static int[] CMYKtoRGB(int c, int m, int y, int k) {
        int r = 255 * (1 - c / 100) * (1 - k / 100);
        int g = 255 * (1 - m / 100) * (1 - k / 100);
        int b = 255 * (1 - y / 100) * (1 - k / 100);
        int[] rgb = new int[] { r, g, b };

        return rgb;
    }
}
