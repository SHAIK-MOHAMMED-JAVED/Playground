#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int pa,ri,ny;
  double ti,ta,d,fs;
  cin>>pa>>ri>>ny;
  ti=(ri*pa*ny)/100;
  ta=pa+ti;
  d=ti*0.02;
  fs=ta-d;
  cout<<ti<<"\n"<<ta<<"\n"<<d<<"\n"<<fs;
}