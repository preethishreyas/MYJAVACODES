#include<stdio.h>
#include<conio.h>
void main()
{
    int s1,s2,s3,s4,s5,total,avg;
    printf("Enter the Subject marks\n");
    scanf("%d%d%d%d%d%d%d",&s1,&s2,&s3,&s4,&s5);
    total=(s1+s2+s3+s4+s5);
    Average=(Total/5);
    printf("%d" Average marks",Average);
    if(Avg>=90){
        printf("O grade");
    }
    else if(Avg>=80 && Avg<=89){
        printf("A grade");
    }
    else if(Avg>=70 && Avg<=79){
        printf("B grade");
    }
    else if(Avg>=60 && Avg<=69){
        printf("C grade");
    }
    else if(Avg>=50 && Avg<=59){
        printf("D grade");
    }
    else if(Avg>=40 && Avg<=49){
        printf("E grade");
    }
    else { 
        printf("Fail");
}
getch();
}