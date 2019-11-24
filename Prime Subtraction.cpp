https://codeforces.com/contest/1238/problem/A

#include<bits/stdc++.h>
using namespace std;
#define ll long long int
#define pb push_back
ll t,x,y;
int main(){
    cin>>t;
    while(t--){
        cin>>x>>y;
        if(x-y > 1)cout<<"YES\n";
        else cout<<"NO\n";
    }
}