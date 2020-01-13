package cn.boqi.dp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *使用动态规划计算斐波那契数列
 * @author QIN SIJIA
 */

public class Feibonaqie {
    public static void main(String[] args) {
        System.out.println("请问您想要斐波那契数列的第几位：");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] dp = new int[a];
        int q = 0;
        for (int j = 0; j < a;j++){
            if(j==0) { //第一位
                dp[j] = 1;
            }else if(j == 1){
                dp[j] = 1;
            }else {
            dp[j] = dp[j-1]+dp[j-2];
            }
        }
        System.out.println(dp[a-1]);

    }
}

