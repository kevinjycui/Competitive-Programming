#include <bits/stdc++.h>
#define ll long long
#define MAXN 200002
#define MAXA 1000002

using namespace std;

int main() {

    int n, a[MAXN]; cin >> n;
    for (int i=1; i<=n; i++) cin >> a[i];
    a[0] = 0;
    sort(a+1, a+n+1);
    bool hasdiv[MAXA]; fill(hasdiv, hasdiv+MAXA, true);
    int cnt = 0;

    for (int i=1; i<=n; i++)
        if (hasdiv[a[i]]) {
            if (a[i] != a[i+1]) cnt++;
            for (int j=a[i]; j<MAXA; j+=a[i]) hasdiv[j] = false;
        }

    cout << cnt << endl;

}
