#include <bits/stdc++.h>

using namespace std;

int main() {

    long long n, a, b, c;
    cin >> n >> a >> b >> c;

    long long ans1 = n/a;
    long long ans2 = 0;

    if (n >= b) {
        n -= b;
        ans2 = n/(b-c);
        n -= ans2*(b-c);
        n += b;
        if (n >= b) {
            n -= b-c;
            ans2++;
        }
        ans2 += n/a;
    }

    cout << max(ans1, ans2) << endl;

    return 0;
}
