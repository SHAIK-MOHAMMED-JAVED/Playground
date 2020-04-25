#include<iostream>
using namespace std;
int main()
{
  //Type your code here
 int x,y,a,b;
  cin>>x>>y;
  if(x>3)
  {
    a=x-3;
    if(y>4)
      b=y-4;
    else
      b=4-y;
  }
  else
  {
    a=3-x;
  if(y>4)
      b=y-4;
    else
      b=4-y;
  }
  if(a>b)
    cout<<a;
  else
    cout<<b;
  
}