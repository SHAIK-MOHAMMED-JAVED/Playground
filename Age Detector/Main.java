#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int by,cy,tt;
  std::cin>>by>>cy;
  if(by<cy)
    std::cout<<cy-by;
  else
  {
    tt=100-by;
    tt=tt+cy;
    std::cout<<tt;
  }    
}