import math
def nto(n):
    for i in range(2,(int(math.sqrt(n))+1)):
        if n % i == 0:
            return 0
    return n > 1
for t in range(int(input())):
    a = list(int(i) for i in input())
    l,nt = len(a),0
    for i in a:
        nt += nto(i)
    print('YES' if (nto(l) and nt > l - nt) else 'NO')