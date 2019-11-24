https://codeforces.com/contest/1105/problem/C

#include<bits/stdc++.h>
using namespace std;
#define ll long long int
ll mod=1e9+7;
ll n,m,k,x1,y1,f=0;
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    vector<ll> prev(3);
    vector<ll> curr(3);
    ll l,r,n;
    cin>>n>>l>>r;
    
    ll tot=r-l+1;
    if(tot<=6){
        for(ll i=l;i<=r;i++){
            prev[i%3]++;
        }
        // goto abc;
    }
    else{// prev[0]=(r-l)/3;
        ll out=0;
        for(ll i=l;i<=r;i++){
            out++;
            if(i%3==1)prev[1]++;
            if(i%3==2)prev[2]++;
            if(i%3==0){
                prev[0]++;
                break;
            }
        }
        for(ll i=r;i>=l;i--){
            if(i%3==0)break;
            out++;
            if(i%3==1)prev[1]++;
            if(i%3==2)prev[2]++;
        }
        ll bet=tot-out;
        prev[0]+=bet/3;
        prev[1]+=bet/3;
        prev[2]+=bet/3;
        
    }
    vector<ll> prev1;
    prev1=prev;
    // abc:
    for(ll sz=2;sz<=n;sz++){
        // cout<<prev[0]<<" "<<prev[1]<<" "<<prev[2]<<" "<<endl;
        curr[0]=(((prev[0]%mod*prev1[0]%mod)%mod+(prev[1]%mod*prev1[2]%mod)%mod)%mod+(prev1[1]%mod*prev[2]%mod)%mod)%mod;
        curr[1]=(((prev[0]%mod*prev1[1]%mod)%mod+(prev[2]%mod*prev1[2]%mod)%mod)%mod+(prev1[0]%mod*prev[1]%mod)%mod)%mod;
        curr[2]=(((prev1[0]%mod*prev[2]%mod)%mod+(prev1[1]%mod*prev[1]%mod)%mod)%mod+(prev[0]%mod*prev1[2]%mod)%mod)%mod;
        prev[0]=curr[0],prev[2]=curr[2],prev[1]=curr[1];
    }
    // cout<<prev[0]<<" "<<prev[1]<<" "<<prev[2]<<" "<<endl;
    cout<<prev[0]%mod;
    
}