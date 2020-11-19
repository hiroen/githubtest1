import java.util.*;


public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] line = new int[4];
        for(int i = 0;i < line.length;i++){
            line[i] = sc.nextInt();
        }
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
    
        
        for(int i = 0;i < line.length;i++){
            if(i ==0){
                num1 = line[i]*10 + line[1];
                num2 = line[2]*10 + line[3];
                num3 = line[3]*10 + line[3];
                sum1 = num1 + num2;
                sum2 = num1 + num3;
                if(sum1 < sum2){
                    sum = sum2;
                } else {
                    sum = sum1;
                }
            } else if(i == 1){
                num1 = line[i]*10 + line[0];
                num2 = line[2]*10 + line[3];
                num3 = line[3]*10 + line[2];
                sum1 = num1 + num2;
                sum2 = num1 + num3;
                if(sum1 < sum2){
                    sum = sum2;
                } else {
                    sum = sum1;
                }
            } else if(i == 2){
                num1 = line[i]*10 + line[0];
                num2 = line[1]*10 + line[3];
                num3 = line[3]*10 + line[1];
                sum1 = num1 + num2;
                sum2 = num1 + num3;
                if(sum1 < sum2){
                    sum = sum2;
                } else {
                    sum = sum1;
                }
            } else if(i == 3){
                num1 = line[i]*10 + line[0];
                num2 = line[1]*10 + line[2];
                num3 = line[2]*10 + line[1];
                sum1 = num1 + num2;
                sum2 = num1 + num3;
                if(sum1 < sum2){
                    sum = sum2;
                } else {
                    sum = sum1;
                }
            }
        }
        System.out.println(sum);
    }
}