#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  float b,c=10.15,d=18.00,e=22.00;
  std::cin>>a>>b;
  if(b==c||b==d||b==e)
    if(a>13)
      std::cout<<"$8.00";
  	else
    	std::cout<<"$4.00";
  else
    if(a>13)
      std::cout<<"$5.00";
  	else
    	std::cout<<"$2.00";
}