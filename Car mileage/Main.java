#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int l,d;
  float m,s;
  std::cin>>m>>l>>d;
  s=m*l-d;
  if(s<0)
    std::cout<<"Cannot reach";
  else
    std::cout<<"Can reach";
    
}