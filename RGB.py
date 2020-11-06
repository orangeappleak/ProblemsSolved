def sort(list):
    i = 0
    j = 1
    while i < len(list):
        if j<len(list):
            if(list[i] > list[j]):
                temp = list[i]
                list[i] = list[j]
                list[j] = temp
                i = i+1
                j = i+1
            else:
                j += 1
        else:
            i = i+1
            j = i+1
        print(list)
list = []
size = int(input("Enter the list size"))
for i in range(size):
    list.append(int(input("enter the value:")))
sort(list)
sort(list)

        