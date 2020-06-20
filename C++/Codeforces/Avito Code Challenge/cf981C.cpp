#include <bits/stdc++.h>
#define ll long long
#define MAXN 200002

using namespace std;

vector<int> adj[MAXN];
int v = 0;
vector<int> paths;

void vertex(int node, int prev) {

    if (v == -1) return;

    if (adj[node].size() > 2) {
        if (v == 0) v = node;
        else {
            v = -1;
            return;
        }
    }
    for (int next:adj[node])
        if (next != prev)
            vertex(next, node);
}

void get_paths(int node, int prev) {
    if (node != v && adj[node].size() == 1)
        paths.push_back(node);
    for (int next:adj[node])
        if (next != prev)
            get_paths(next, node);
}

int main() {

    int n; cin >> n;

    for (int i=0; i<n-1; i++) {
        int a, b; cin >> a >> b;
        adj[a].push_back(b);
        adj[b].push_back(a);
    }

    vertex(1, 0);

    if (v == -1) {
        cout << "No" << endl;
        return 0;
    }
    else if (v == 0)
        v = 1;

    cout << "Yes" << endl;

    get_paths(v, 0);

    cout << paths.size() << endl;

    for (int path:paths)
        cout << v << " " << path << endl;

}
