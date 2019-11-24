https://codeforces.com/contest/1091/problem/D

#include<bits/stdc++.h>
using namespace std;
#define ll long long int
ll mod=1e9+7;
ll m1 =998244353;
ll n,m,k,x1,y1,f=0;
 
ll fact[1234567];
void pre(){
    ll ans=1;
    fact[0]=1;
    for(ll i=1;i<=1000001;i++){
        ans= (ans%m1 * (i)%m1)%m1;
        fact[i]=ans;
    }
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    pre();
    // cout<<fact[5];
    
    cin>>n;
    ll ans=fact[n];
    ll x=n-1;
    ll y=n;
    ll k = n;
    for(ll i=0;i<n-2;i++){
        ll t1=(fact[x--]-1+m1)%m1;
        // cout<<t1<<" "<<k<<endl;
        ans =  (ans%m1  + (t1%m1*k%m1)%m1)%m1;
        y = y-1;
        k = (k%m1*y%m1)%m1;
    }
    cout<<ans;
}