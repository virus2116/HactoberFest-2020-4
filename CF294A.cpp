//Shass and Oskols Codeforces
//CF294A

#include <bits/stdc++.h>
using namespace std;

int main()
{
int n,x=0,y=0,c=0;
cin>>n;
int arr[n];
for(int i=0;i<n;i++){
cin>>arr[i];
}
int m;
cin>>m;
vector<vector<int>>v(m,vector<int>(2));
for(int i=0;i<m;i++){
for(int j=0;j<2;j++){
cin>>v[i][j];
}
}
for(int i=0;i<m;i++){
c = v[i][0];
x=arr[c-1]-v[i][1];
y=arr[c-1]-(x+1);
arr[c]=arr[c]+ x;
arr[c-2]= arr[c-2]+y;
arr[c-1]=0;
}
for(int i=0;i<n;i++){
cout<<arr[i]<<endl;
}

   }
