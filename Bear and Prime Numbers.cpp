https://codeforces.com/contest/385/problem/C

#include<bits/stdc++.h>
using namespace std;
#define ll long long int
ll psum[10000005];
ll minp[10000005];
ll mpp[10000005];
bool vis[10000005];
void pre(ll n){
    minp[1]=minp[0]=1;
    for(ll i=2;i*i<=n;i++){
        if(minp[i]==0){
            for(ll j=i*i;j<=n;j+=i){
                if(minp[j]==0)
                    minp[j]=i;
            }
        }
    }
    for(ll i=2;i<=n;i++){
        if(minp[i]==0)
            minp[i]=i;
    }
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    ll n;    
    cin>>n;
    ll mx=-1;
    vector<ll> v(n);
    
    for(ll i=0;i<n;i++){
        cin>>v[i];
        mx=max(mx,v[i]);
        mpp[v[i]]++;
    }
 
    pre(mx);
    for(ll i=0;i<n;i++){
        if(vis[v[i]])continue;
        vis[v[i]]=1;
        ll k,j;
        ll x=v[i];
        map<ll,ll> mp;
        while(x!=1){
            if(mp[minp[x]]==0)
                psum[minp[x]]+=mpp[v[i]],mp[minp[x]]=1;
            x/=minp[x];
        }
    }
    for(ll i=3;i<=mx;i++){
        psum[i]+=psum[i-1];
    }
    ll q;
    cin>>q;
    while(q--){
        ll l,r;
        cin>>l>>r;
        cout<<psum[min(mx,r)]-psum[min(mx,l-1)]<<endl;
    }
}