#include<stdio.h>
main()
{
	float a,u,v,t;
	printf(" Enter Any Initial Velocity,Accelation,Time : ");
	scanf("%f%f%f",&u,&a,&t);
	v=u+a*t;
	printf("The Final Velocity In KM/HR is %6.3f",v);
char *string="\nWhich Is Converted Into M/S :  %f";
char *str="M/S";
printf(string,v*5/18);
printf(str);
}
