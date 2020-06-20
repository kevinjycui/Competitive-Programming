#include <bits/stdc++.h>
#define MAXN 200002

using namespace std;

int main() {

    int n, a[MAXN]; cin >> n;
    for (int i=2; i<=n; i++) cin >> a[i];

    stack<int> q;

    int node = n;

    while (node != 1) {
        q.push(node);
        node = a[node];
    }

    cout << 1 << " ";
    while (q.size()) {
        cout << q.top() << " "; q.pop();
    }
    cout << endl;

}
