def most_frequent(List): 
    return max(set(List), key = List.count) 
def remove(val,List):
    for val in List:
        List.remove(val)

cities_list = ["malaysia","australia","germany","dubai","france"]
ranked_list = []

for i in range(1,6):
    temp = []
    for j in range(1,6):
        in_put = int(input())
        if(in_put <=5 and in_put>=1):
            temp.append(in_put)
        else:
            print("INVALID INPUT")
    for j in range(0,len(temp)):
        if temp[j] == 1:
            ranked_list.append(cities_list[j])
        elif temp[j] == 2:
            ranked_list.append(cities_list[j])

first = most_frequent(ranked_list)
remove(first,ranked_list)
second = most_frequent(ranked_list)

print(first + "\n" + second)


