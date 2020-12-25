rlis = []

def isSym(lis):
    #(without using palindrome)
    # while(i<m): 
    #     if(rlis[i] == rlis[m]) and (clis[i] == clis[m]):
    #         i+=1
    #         m-=1
    #     else:
    #         break
    # if(i > m) or (i==m):
    #     print("YES")
    # else:
    #     print("NO")

    #(with using palindromes)
    i=0
    m=len(lis) - 1
    rlis = lis
    clis = []
    trans(rlis,0,clis)
    if((("").join(rlis)[::-1] == ("").join(rlis)) and (("").join(clis)[::-1] == ("").join(clis))):
        print("SYMMETRIC")
    else:
        print("NOT SYMMETRIC")


def trans(lis,j,clis):
    temp = ''
    for i in lis:
        temp = temp + list(i)[j]
    clis.append(temp)

    if(j<(len(lis)-1)):
        temp = ''
        j += 1
        trans(lis,j,clis)


T = int(input())

for i in range(T):
    N = int(input())
    lis = []
    for N in range(N):
        lis.append(input())
    isSym(lis)


