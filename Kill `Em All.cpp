https://codeforces.com/contest/1238/problem/B

#include<bits/stdc++.h>
using namespace std;
#define ll long long int
#define pb push_back
ll t,x,y,n;
int main(){
    cin>>t;
    while(t--){
        cin>>n>>x;
        vector<ll> v;
        ll cnt=0,ans=0;
        map<ll,ll> mpp;
        for(ll i=0;i<n;i++){
            cin>>y;
            if(mpp[y]!=1){
               v.pb(y);
               mpp[y]=1;
            }
        }
        sort(v.begin(),v.end(),greater<ll>());
        for(auto e: v){
            if(e-cnt<=0)break;
            cnt+=x;
            ++ans;
        }
        cout<<ans<<endl;
    }
}