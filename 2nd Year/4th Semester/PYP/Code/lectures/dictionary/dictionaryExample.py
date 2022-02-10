# WAPP to create Employee details and return value upon calling keys.

employee = {}
myList = list()
print("Enter Employee details: ")
flag = True
while flag:
    name = input("Enter Name: ")
    mail = input("Enter Mail: ")
    age = input("Enter Age: ")
    employee = {
        'name': name,
        'email': mail,
        'age': age
    }
    myList.append(employee)
    choice = input("Do you want to add more details? Type 'n' to stop.")
    if choice == 'n':
        flag = False


for i in myList:
    for key, value in i.items():
        print("Employee ", key, " is ", value)
    print("---------------------------------------")
