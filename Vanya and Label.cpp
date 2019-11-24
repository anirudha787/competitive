https://codeforces.com/contest/677/problem/C

#include<bits/stdc++.h>
using namespace std;
#define ll long long int
ll mod=1e9+7;
ll n,m,k,x1,y1,f=0;
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    string s;
    cin>>s;
    map<char,ll> mp;
    ll x=10;
    for(ll i=0;i<10;i++)mp[i+'0']=i;
    for(char i='A';i<='Z';i++)mp[i]=x++;
    for(char i='a';i<='z';i++)mp[i]=x++;
    mp['-']=x++,mp['_']=x++;
    
    ll zeros;
    ll ans=0;
    for(auto e : s){
        ans+=(6-(__builtin_popcount(mp[e])));
    }
    ll an=1;
    for(ll i=0;i<ans;i++){
        an=(an%mod*3)%mod;
    }
    cout<<an;
}