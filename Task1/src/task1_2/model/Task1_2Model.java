package task1_2.model;

public class Task1_2Model {
    private int[] result;
    private int endOfCalc;

    public void setEndOfCalc(int endOfCalc) {
        this.endOfCalc = endOfCalc;
    }

    public int getEndOfCalc() {
        return endOfCalc;
    }

    public int[] getResult() {
        return result;
    }

    public void perfectNumbers(){

        int k = 0;
        result = new int[5]; // 5 - max possible amount of perfect numbers for int

        for (int i = 2; i <= endOfCalc;) {
            if(isPerfectNumber(i)){
                result[k++] = i;
            }

            if(i < 10){
                i++;
            }else{
                i += 9;
            }
        }
    }

    private boolean isPerfectNumber(int number){
        int sum = 1;
        for (int i = 2; i <= number/2; i++) {
            if(number % i == 0){
                sum += i;
            }
        }

        return (sum == number);
    }
}
