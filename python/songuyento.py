import math

def prime(n):
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return n > 1

t = int(input())
while t!=0:
    n = int(input())
    k = 0
    for i in range(1,n):
        if math.gcd(n,i) == 1:
            k = k + 1
    if prime(k):
        print('YES\n')
    else:
        print('NO\n')
    t-=1