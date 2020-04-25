#include<iostream>
int main(){
  // Type your code here
  int n,i,sum=1;
  std::cin>>n;
  for(i=1;i<=n;i++)
    sum=sum*i;
  std::cout<<sum;
}