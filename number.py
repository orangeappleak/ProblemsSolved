def result(list):
    number_low = ''
    number_high = ''
    list.sort(reverse = False)
    number_low = number_low.join(list)
    print("lowest number is:",number_low)
    list.sort(reverse = True)
    number_high = number_high.join(list)
    print("highest number is:",number_high)
    answer = int(number_high) - int(number_low)
    print("The answer is:",answer)

list = []
number = str(input("Enter the number:"))
for char in number:
    list.append((char))
result(list)