package task1_1_model;

public class Task1_1Model {
    private int v;
    private char[] res;

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public char[] getRes() {
        return res;
    }

    public void decIntTransform(int val, int base){
        byte[] tempArr;

        if(base == 2){
            tempArr = new byte[32];
        }else if (base == 8){
            tempArr = new byte[11];
        }else if (base ==16){
            tempArr = new byte[8];
        }else{
            throw new IllegalArgumentException();
        }

        int v = val;

        int i = tempArr.length;
        do {
            int prevV = v;
            v /= base;
            //v1 >>>= (int)(Math.log(base)/Math.log(2));

            tempArr[--i] = (byte) (prevV - base*v);

            if(v < base){
                tempArr[--i] = (byte)v;

            }

        }while (v > (base-1));

        res = resultFormation(tempArr);
    }

    private char[] resultFormation(byte[] arr){
        char[] symbols = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        int N = arr.length;
        char[] result = new char[N];

        for (int i = 0; i < N; i++) {
            result[i] = symbols[arr[i]];
        }

        return result;
    }
}
