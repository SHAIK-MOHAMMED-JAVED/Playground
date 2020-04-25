#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fas,sas,aas,fc,sc,ac;
    float a,b,c,df,ds,da;
  std::cin>>fas>>df>>fc>>sas>>ds>>sc>>aas>>da>>ac;
  a=(df/100)*fas;
  b=(ds/100)*sas;
  c=(da/100)*aas;
  a=fas-a;
  b=sas-b;
  c=aas-c;
  a=a+fc;
  b=b+sc;
  c=c+ac;
  std::cout<<"In Flipkart Rs."<<a<<"\n"<<"In Snapdeal Rs."<<b<<"\n"<<"In Amazon Rs."<<c<<"\n";
  if(a<=b)
    if(a<c)
      std::cout<<"He will prefer Flipkart";
  	else
      std::cout<<"He will prefer Amazon";
  else
    if(b<c)
      std::cout<<"He will prefer Snapdeal";
  	else
      std::cout<<"He will prefer Amazon";
}