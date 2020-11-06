def subList(i,j,size,list):
    count = 0
    print(list[i],end = " ")
    while(count<size and j<len(list)):
        print("{}".format(list[j]), end = " ")
        if(j>count):
            print("true")
        count+=1
        j+=1

def fact(n):
    f = 1
    for i in range(1,n+1):
        f = f * i
    return f
list = []
mainList = []
size = int(input("Enter the size of the array:"))
for i in range(size):
    list.append(int(input("Enter value {} = ".format(i))))

i = 0
j = 1
count = 1
while(i<len(list)):
    if(count<len(list)):
        for k in range(j,len(list)):
            print("count value",count)
            subList(i,k,count,list)
            print(" ")
        count+=1
    else:
        print("i value:",i)
        i += 1
        j = i+1
        count = 1

print(fact(3))