https://codeforces.com/contest/322/problem/B

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
    ll r,g,b,r1,g1,b1;
    cin>>r>>g>>b;
    r1=r,g1=g,b1=b;
    if(r==0 or b==0 or g==0)return cout<<(r/3+b/3+g/3),0;
    ll one  = min(r,min(b,g));
    r-=one,b-=one,g-=one;
    ll oo = r/3 + b/3  +  g/3 + one;
    r=r%3,b=b%3,g=g%3;
    // ll two = r1/3+b1/3+g1/3+min(r1%3,min(b1%3,g1%3));
    //cout<<oo<<" "<<two;
    // ll r1=r-one,g2=g-one,b1=b-one;
    ll ans=0;
    if(r%3+b%3+g%3==4)ans++;
    cout<<ans+oo;
    // cout<<(r+b+g)/3;
}