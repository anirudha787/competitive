https://codeforces.com/contest/264/problem/B

#include <bits/stdc++.h>
using namespace std;
#define ll long long int
 
ll dp[100100];
 
int main() {
	ll n,i,j,ans=-1;
	cin>>n;
	ll arr[n];
	for(i=0;i<n;i++)
		cin>>arr[i];
	for(i=0;i<n;i++){
		vector<ll> v; ll mx=-1;
		map<ll,ll> mpp;
		ll x=arr[i];
		for(j=2;j*j<=arr[i];j++){
			while(x%j==0){
				if(mpp[j]==0){
					mx=max(mx,dp[j]+1);
					v.push_back(j);
					mpp[j]=1;
				}
				x/=j;
			}
		}
		if(x!=1){
			if(mpp[x]==0){
				mpp[x]=1;
				mx=max(mx,dp[x]+1);
				v.push_back(x);
			}
		
		}
		for(j=0;j<v.size();j++)
			dp[v[j]]=mx;
		ans=max(ans,mx);
	}
	if(n==1)cout<<1;
	else cout<<ans;
	return 0;
}
