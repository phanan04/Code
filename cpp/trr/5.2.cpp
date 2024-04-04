#include <bits/stdc++.h>
using namespace std;

int N, S;
int mt[100][100];
vector<vector<int>> G;

void BfsTree(int s) {
    vector<pair<int, int>> tree;
    vector<bool> vs(N + 1, false);

    queue<int> q;
    q.push(s);
    vs[s] = true;

    while (!q.empty()) {
        int u = q.front();
        q.pop();
        for (int v : G[u]) {
            if (!vs[v]) {
                tree.push_back({min(u, v), max(u, v)});
                q.push(v);
                vs[v] = true;
            }
        }
    }

    cout << "BFS tree\n";
    for (auto i : tree) {
        cout << i.first << " " << i.second << "\n";
    }
}

int main() {
    cin >> N >> S;
    G.resize(N + 1);
    for (int i = 1; i <= N; ++i) {
        for (int j = 1; j <= N; ++j) {
            cin >> mt[i][j];
            if (mt[i][j] == 1) {
                G[i].push_back(j);
                G[j].push_back(i);
            }
        }
    }
    BfsTree(S);
    return 0;
}