
def Hanoi(n,a,b,c):
    if n == 1:
        print(a, "->" , b)
        return
    Hanoi(n-1,a,c,b)
    print(a, "->" , b)
    Hanoi(n-1,c,b,a)
n = int(input())
Hanoi(n,'A','C','B')