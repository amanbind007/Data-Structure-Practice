# Read the variable from STDIN
a = int(input("Enter T: "))

s = input("Enter S: ")

arr = s.split(" ")
for i in range(0, len(arr)):
    arr[i] = int(float(arr[i]))

b = int(input( "Enter N: "))
count = 0

for i in arr:
    if i > b:
        count+=1

probab = count/a



# Output the variable to STDOUT
print(round(probab, 2))

