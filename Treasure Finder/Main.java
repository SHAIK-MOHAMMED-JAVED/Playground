#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d,hcf;
  std::cin>>a>>b>>c;
  if((a>b && a<c)||(a<b && a>c))
    std::cout<<"The treasure is in box which has number "<<a;
  if((b>a && b<c)||(b<a && b>c))
    std::cout<<"The treasure is in box which has number "<<b;
  if((c>b && c<a)||(c<b && c>a))
    std::cout<<"The treasure is in box which has number "<<c;
  d = a<b?(a<c?a:c):(b<c?b:c);
  for(hcf=d;hcf>=1;hcf--)
    if(a%hcf==0 && b%hcf==0 && c%hcf==0)
      break;
  std::cout<<"\nThe code to open the box is "<<hcf;
}