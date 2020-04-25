#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c;
  std::cin>>a>>b>>c;
 b=b*75;
  c=c*30;
  if(a>(b+c))
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
}