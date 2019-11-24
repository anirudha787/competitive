https://codeforces.com/contest/1178/problem/B

#include<bits/stdc++.h>
using namespace std;
#define ll long long int
#define pb push_back
vector<ll> a;
string s;
int main(){
    cin>>s;
    ll count=0;
    ll sum=0;
    for(ll i=0;i<s.length();i++)
    {
        if(s[i]=='v')
        count++;
        else if(count>0)
        sum+=count-1,count=0,a.pb(sum);
        else
        a.pb(sum);
    }
    if(count!=0)
    {
        sum+=count-1,count=0,a.pb(sum);
    }
    ll ans=0;
    for(auto e:a)
    {
       //cout<<e<<" ";
        ll k=sum-e;
        ans=ans+k*e;
    }
    cout<<ans;
   
}