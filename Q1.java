/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.util.*;
public class Q1 {
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Num of coins:");
        int N=in.nextInt();
        int[]coins=new int[N];
        System.out.println("Coins:");
        for(int i=0;i<N;i++)
        {
            coins[i]=in.nextInt();
        }
        int sum=coins[0];
        int j=-1;
        int[]profit=new int[N];
        for(int i=0;i<N-1;i++)
        {
            int k=i+1;
            if(coins[i]<coins[k])
            {
                sum+=coins[k];
                //System.out.println("i="+i);
            }
            else
            {
                profit[++j]=sum;
                sum=coins[k];
            }
        }
        profit[++j]=sum;
        int highest_profit=0;
        for(int i=0;i<=j;i++)
        {
            if(profit[i]>highest_profit)
            {
                highest_profit=profit[i];
            }
        }
       System.out.println("Highest Profit:"+highest_profit);
    }
    
}
