https://codeforces.com/contest/1030/problem/D

#include<bits/stdc++.h>
using namespace std;
#define ll long long int
 
ll n,m,k,x1,y1,f=0;
void fac(ll n1){
    for(ll i=max(1ll,n1/n);i<=min(n,min(n1,m));i++){
        if(n1%i==0){
            ll mx=max(i,n1/i);
            ll mn=min(i,n1/i);
            if(mx<=n && mn<=m){
                x1=mx;
                y1=mn;
                cout<<"YES\n";
                if(f==1)swap(x1,y1);
                cout<<"0 0"<<endl<<x1<<" 0"<<endl<<"0 "<<y1;
                return ;
            }
        }
    }
    cout<<"NO";
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    cin>>n>>m>>k;
    if(n<m)swap(n,m),f=1;
    if((2*(n*m))%k==0)
        fac((2*(n*m))/k);
    else cout<<"NO";
}