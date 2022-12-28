package sevenhomework;


public class ArrayValueCalculator {
    public static void main(String[] args) throws ArraySizeException, ArrayDataException {

        int one = 4;
        int two = 4;
        String[][] a = new String[one][two];

        doCalc(a);
        for (int i = 0; i < one; i++) {
            for (int j = 0; j < two; j++) {
                a[i][j] = String.valueOf(j+1);
                a[j][i] = String.valueOf(i+1);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int result =0;
        for (int c = 0; c < one; c++) {
            for (int d = 0; d < two; d++) {
                try {
                    result += Integer.parseInt(a[c][d]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException(c, d, a[c][d]);
                }
            }

        }
        System.out.println("result = " + result);

    }
        public static void doCalc (String[][] a) throws ArraySizeException {
            if (a.length != 4) throw new ArraySizeException();

        }

    }


