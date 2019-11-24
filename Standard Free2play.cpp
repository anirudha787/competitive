https://codeforces.com/contest/1238/problem/C

#include<bits/stdc++.h>
using namespace std;
#define ll long long int
#define pb push_back
ll t,x,h,n,i;
int main(){
    cin>>t;
    while(t--){
        cin>>h>>n;
        ll ans=0;
        vector<ll> v(n);
        for(i=0;i<n;i++){
            cin>>v[i];
        }
        x=h;i=0;
        while(x>2 && i<n-1){
            if(v[i+1]!=x-1)
                x=v[i+1]+1;
            else{
                if(i+2>n-1 || v[i+2]!=x-2)++ans,++i;
                else i+=2;
                x-=2;
            }
        }
        cout<<ans<<endl;
    }
}