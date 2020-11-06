testList = []

def designSequence():
    j = len(testList) - 1
    count = j - 1
    for i in range(0,int(len(testList)/2)):
        print()
        while j>= 0:
            if testList[i] == testList[j]:
                for i1 in range(0,i+1):
                    print(testList[i1],end = "")
                for k in range(0,count):
                    print(" ",end = "")
                for i2 in range((len(testList)-(i+1)),len(testList)):
                    print(testList[i2],end="")
                break
            else:
                count = count - 2
            j = j-1


def takeInput():
    try:
        print("enter integer values,type a char to stop entering")
        for i in range(0,20):
            number = int(input("enter the value"))
            testList.append(number)
    except ValueError as e:
        return testList

def completeList(list1 = []):
    j = len(list1)-1
    for i in range(len(list1),(len(list1))*2):
        while j>=0:
            testList.append(list1[j])
            j = j - 1

takeInput()
completeList(testList)
designSequence()
