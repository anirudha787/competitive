https://codeforces.com/contest/628/problem/B

#include<bits/stdc++.h>
using namespace std;
#define ll long long int
#define pb push_back
string s;
ll ans=0;
int main(){
     ios::sync_with_stdio(false);
    cin.tie(0);
    cin>>s;
    for(int i=0;i<s.length();i++)
    {
        if((int(s[i])-int('0'))%4==0)ans++;
        
    }
 
     for(int i=0;i<s.length()-1;i++)
    {
       // cout<<int(s[i]*10+s[i+1])-int('0')-480<<endl;
        if((int(s[i]*10+s[i+1])-int('0')-480)%4==0)ans++,ans+=i;
    }
       cout<<ans;
    return 0;
    
}