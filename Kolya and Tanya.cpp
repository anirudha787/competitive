https://codeforces.com/contest/584/problem/B

#include<bits/stdc++.h>
using namespace std;
#define ll long long int
ll mod=1e9+7;
ll n,m,k,x1,y1,f=0;
// void fac(ll n1){
//     for(ll i=max(1,n1/n);i<=min(n,min(n1,m));i++){
//         if(n1%i==0){
//             ll mx=max(i,n1/i);
//             ll mn=min(i,n1/i);
//             if(mx<=n && mn<=m){
//                 x1=mx;
//                 y1=mn;
//                 cout<<"YES\n";
//                 if(f==1)swap(x1,y1);
//                 cout<<"0 0"<<endl<<x1<<" 0"<<endl<<"0 "<<y1;
//                 return ;
//             }
//         }
//     }
//     cout<<"NO";
// }
 
ll mp(ll x,ll p){
    ll ret=1;
    while(p){
        if(p&1){
            ret = (ret%mod*x%mod)%mod;
        }
        x=(x%mod*x%mod)%mod;
        p/=2;
    }
    return ret;
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    // cin>>n>>m>>k;
    // if(n<m)swap(n,m),f=1;
    // if((2*(n*m))%k==0)
    //     fac((2*(n*m))/k);
    // else cout<<"NO";
    cin>>n;
    ll ans = (mp(27,n)%mod-mp(7,n)%mod+mod)%mod;
    cout<<ans<<endl;
}
