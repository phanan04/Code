import math

def reverse_number(n):
    return int(str(n)[::-1])

def are_coprime(a, b):
    return math.gcd(a, b) == 1

def check_coprime_and_reverse():
    rev_n = reverse_number(n)
    if are_coprime(n, rev_n):
        return "YES"
    else:
        return "NO"
for t in range(int(input())):
    n = int(input())
    print(check_coprime_and_reverse())
