#include <bits/stdc++.h>
#define ll long long
#define MAXN 2002

using namespace std;
vector<int> adj[MAXN];
int dep = 0;

void depth(int v, int d) {
    if (!adj[v].size()) {
        dep = max(dep, d);
        return;
    }
    for (int next:adj[v]) depth(next, d+1);
}

int main() {

    int n; cin >> n;

    vector<int> roots;

    for (int i=1; i<=n; i++) {
        int a; cin >> a;
        if (a != -1) adj[a].push_back(i);
        else roots.push_back(i);
    }

    int ans = 0;

    for (int r:roots) {
        dep = 0;
        depth(r, 1);
        ans = max(ans, dep);
    }

    cout << ans << endl;

}
