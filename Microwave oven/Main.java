#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  float b,c;
  std::cin>>a>>b;
  if(a>3)
    std::cout<<"Number of items is more";
  else if(a==2)
      std::cout<<b+(0.5*b);
  else
     std::cout<<b*2;
}