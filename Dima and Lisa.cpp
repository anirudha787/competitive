https://codeforces.com/contest/584/problem/D

#include<bits/stdc++.h>
using namespace std;
#define ll long long int
ll psum[10000005];
ll minp[10000005];
map<ll,ll> mp;
map<ll,pair<ll,ll> > mp1;
 
bool isp(ll n){
    if(n%2==0)return false;
    for(ll i=3;i*i<=n;i+=2){
        if(n%i==0){
            return false;
        }
    }
    return true;
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    ll i,j;
    ll arr[]={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499};
   vector<ll> v;
    for(i=2;i<501;i+=2)v.push_back(i);
    for(i=0;i<500;i++){
        ll x=arr[i];
        mp[x]=1;
        if(arr[i]==499)i=600;
        
        for(j=0;j<500;j++){
            ll y=arr[j];
            mp[y]=1;
            if(arr[j]==499)j=600;
            if(mp[x+y]==0){
                mp[x+y]=1;
                mp1[x+y]={x,y};
            }
        }
    }
    ll n;
    cin>>n;
    if(n==2){
        cout<<1<<endl<<2<<endl;
        return 0;
    }
    for(i=n;i>=max(2ll,n-500);i--){
        if(isp(i)){
            if(n-i==2){
                cout<<2<<endl<<i<<" "<<2<<endl;   
            }
            else if(i==n){
                cout<<1<<endl<<n<<endl;
            }
            else cout<<3<<endl<<i<<" "<<mp1[n-i].first<<" "<<mp1[n-i].second<<endl;
        
            break;
        }
    }
    
}