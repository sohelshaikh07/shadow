/*21-MatchBox Game in c*/

#include<stdio.h>
#include<stdlib.h>
void matchbox()
{
    int n,c=0,t=0;
    static int sum1=0,sum2=0;
    while(1)
    {
    printf("\n Enter Number between (1 to 4) : ");
    scanf("%d",&n);
    if(n>0 && n<5)
    {
        sum1+=n;
        c=5-n;
        sum2+=c;
        if((sum1+sum2)<21)
        {
            printf("\n\t%d",c);
        }
        else
        {
            printf("\n User Lost The Game : ");
            exit(0);
        }  
    }
    else
    {
        printf("\n Enter Correct Number ");
        return;
    }
    }
}
int main()
{
    matchbox();
    return 0;
}