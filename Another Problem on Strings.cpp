https://codeforces.com/contest/165/problem/C


#include<bits/stdc++.h>
using namespace std;
#define ll long long int
#define pb push_back
vector<ll> a;
string s;
ll k=0;
ll ans=0;
int main(){
    cin>>k;
    cin>>s;
    a.pb(0);
 
    for(ll i=0;i<s.length();i++)
    {
        if(s[i]=='1')
        a.pb(i+1);
        
    }
    
    a.pb(s.length()+1);
    if(k==0){
        ll prev=0;
        for(int i=1;i<a.size();i++){
            ans+=((a[i]-prev-1)*(a[i]-prev))/2;
            prev=a[i];
        }
        cout<<ans;
        return 0;
    }
    ll p=0;
    ll q=0;
    for(ll i=1;i<a.size()-k;i++)
    {
      
        p=a[i]-a[i-1]-1;
        //cout<<p;  
        q=a[i+k]-a[i+k-1]-1;
        //cout<<q;
        ans+=(p+1)*(q+1);
    }
   
   cout<<ans;
}