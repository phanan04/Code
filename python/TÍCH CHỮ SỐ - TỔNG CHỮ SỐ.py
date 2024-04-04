for t in range(int(input())):
    s = list(int(i) for i in input())
    tong,tich=0,0
    for i in range(len(s)):
        if  i % 2 != 0:
            tong += s[i]
        else:
            if s[i] != 0:
                if tich == 0:
                    tich = s[i]
                else:
                    tich  *= s[i]
    print(str(tich)+ " "+ str(tong))