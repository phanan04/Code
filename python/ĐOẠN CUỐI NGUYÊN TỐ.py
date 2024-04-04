import math

def isPrime(n):
    for i in range(2,int(math.sqrt(n)) + 1):
        if n % i == 0:
            return 0
    return n>1

def check(s):
    n = int(s[-4:])
    return 'YES' if isPrime(n) else 'NO'

for t in range(int(input())):
    print(check(input()))
    