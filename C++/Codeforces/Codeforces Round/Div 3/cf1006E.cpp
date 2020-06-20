#include <bits/stdc++.h>
#define MAXN 200001

using namespace std;

vector<int> adj[MAXN];
vector<int> order;
int children[MAXN];

int dfs(int node) {
    order.push_back(node);
    children[node] = 1;
    for (int next:adj[node])
        children[node] += dfs(next);
    return children[node];
}

int main() {

    int n, q; cin >> n >> q;

    for (int i=2; i<=n; i++) {
        int a; cin >> a;
        adj[a].push_back(i);
    }

    dfs(1);

    for (int i=0; i<q; i++) {
        int u, k; cin >> u >> k;
        if (k == 1)
            cout << u << endl;
        else if (k <= children[u]) {
            int index = find(order.begin(), order.end(), u) - order.begin();
            cout << order[index+k-1] << endl;
        }
        else cout << -1 << endl;
    }

}
