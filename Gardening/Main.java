#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d,i,co=0;
  std::cin>>a>>b>>c;
  d=a*b;
  for(i=0;i<d;i++)
  {
    if((i/b==1 && (i%b==1 || i%b==2 || i%b==3 || i%b==4 || i%b==5 || i%b==6 || i%b==7 || i%b==8 || i%b==9)) ||(i/b==4 && (i%b==1 || i%b==2 || i%b==3 || i%b==4 || i%b==5 || i%b==6 || i%b==7 || i%b==8 || i%b==9))  )
      if(i==c)
      {
        	co=1;
  			break;
      }
     if((i/b==2 && i%b==0)||(i/b==(b-1) && i%b==0))
      {
      if(i==c)
      {
        	co=1;
  			break;
      }
      }
  } 	
  if(co==1)
    std::cout<<"It is a mango tree";
  else
    std::cout<<"It is not a mango tree";
}