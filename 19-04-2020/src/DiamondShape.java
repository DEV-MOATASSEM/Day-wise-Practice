/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOATASSEM SINDHU
 */
public class DiamondShape {
    public static void main(String[] args)
{
int n=20;
char c = '*';
for(int i=1;i<=n;i++)
{
    for(int j=1;j<=n-i;j++)
{
        System.out.print(" ");
} 
    for(int j=1;j<=i*2-1;j++) 
{
        System.out.print(c);
}
    System.out.println(); 
} 
for(int i=n-1;i>0;i--)
{
    for(int j=1;j<=n-i;j++)
{
        System.out.print(" ");
}
    for(int j=1;j<=i*2-1;j++) 
{
        System.out.print(c);
}
    System.out.println();
}
}
}
