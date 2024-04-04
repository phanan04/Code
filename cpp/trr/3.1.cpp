#include <bits/stdc++.h>
using namespace std;

int n;
vector<vector<int>> e;
vector<bool> vs;

void dfs_dequy(int u) {
    cout << u << " ";
    vs[u] = true;

    for (int i = 0; i < e[u].size(); ++i) {
        int v = e[u][i];
        if (!vs[v]) {
            dfs_dequy(v);
        }
    }
}
void dfs_stack(int start) {
    stack<int> st;
    st.push(start);
    cout << start << " ";
    vs[start] = true;

    while (!st.empty()) {
        int u = st.top();
        st.pop();

        for (int i = 0; i < e[u].size(); ++i) {
            int v = e[u][i];
            if (!vs[v]) {
                cout << v << " ";
                vs[v] = true;
                st.push(u);
                st.push(v);
                break;
            }
        }
    }
}

void solve() {
    cin >> n;
    e.resize(n + 1);
    vs.resize(n + 1, false);
    for (int i = 1; i <= n; ++i) {
        for (int j = 1; j <= n; ++j) {
            int x; cin >> x;
            if (x == 1) e[i].push_back(j);
        }
    }
    dfs_dequy(1);
    dfs_stack(1);
}

int main() {
    solve();
    return 0;
}

