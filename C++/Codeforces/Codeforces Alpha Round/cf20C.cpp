#include <bits/stdc++.h>
#define ll long long
#define MAXN 100001

using namespace std;

int main() {

    ll n, m; cin >> n >> m;
    vector<pair<ll, ll>> adj[MAXN];

    ll dist[MAXN]; fill(dist+2, dist+n+1, LLONG_MAX);
    dist[1] = 0;

    for (ll i=0; i<m; i++) {
        ll a, b, w; cin >> a >> b >> w;
        adj[a].push_back(make_pair(w, b));
        adj[b].push_back(make_pair(w, a));
    }

    priority_queue<pair<ll, ll>, vector<pair<ll, ll>>, greater<pair<ll, ll>>> q;
    q.push(make_pair(0, 1));

    while (q.size()) {

        pair<ll, ll> p = q.top(); q.pop();
        ll node = p.second;

        for (pair<ll, ll> next:adj[node])
            if (dist[next.second] > dist[node] + next.first) {
                dist[next.second] = dist[node] + next.first;
                q.push(make_pair(dist[next.second], next.second));
            }

    }

    if (dist[n] == LLONG_MAX) {
        cout << -1 << endl;
        return 0;
    }

    stack<ll> path; path.push(n);
    ll current = n;

    while (current != 1) {
        for (pair<ll, ll> next:adj[current])
            if (dist[next.second] == dist[current] - next.first) {
                current = next.second;
                break;
            }
        path.push(current);
    }

    while (path.size()) {
        cout << path.top() << " "; path.pop();
    }
    cout << endl;

}
