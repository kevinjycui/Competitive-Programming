#include <bits/stdc++.h>
#define ll long long

using namespace std;

int main() {

    int x, n, a[101]; cin >> x >> n;
    for (int i=0; i<n; i++) cin >> a[i];
    sort(a, a+n);
    int j = find(a, a+n, x)-a;
    if (j == n) cout << x << endl;
    else {
        int k = 1;
        while (j-k >= 0 && j+k < n) {
            if (j-k >= 0 && a[j-k] != x-k) {
                cout << x-k << endl;
                return 0;
            }
            else if (j+k < n && a[j+k] != x+k) {
                cout << x+k << endl;
                return 0;
            }
            k++;
        }
        if (j-k < 0 || (j-k >= 0 && a[j-k] != x-k)) cout << x-k << endl;
        else cout << x+k << endl;
    }

}

