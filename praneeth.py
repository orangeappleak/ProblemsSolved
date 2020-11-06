def most_frequent(List): 
    return max(set(List), key = List.count)

N = int(input())
lis = []
for i in range(0,N):
    lis.append(int(input()))

for i in range(0,N):
    lis.sort()
    repeat = most_frequent(lis)
    if repeat in lis:
        print("original",lis)
        lis.remove(repeat)
        print("after removal",lis)
        lis.append(repeat+1)
        lis.sort()
        print("original after append",lis)
final_sum = sum(lis)
print(final_sum)