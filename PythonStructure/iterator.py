#Iterating over built-in iterables using iter() method
 
# Iterating over a list
print("List Iteration")
l = ["A", "Quick", "Brown"]
for i in l:
    print(i)
     
# Iterating over a tuple (immutable)
print("\nTuple Iteration")
t = ("Fox", "Jumps", "Over")
for i in t:
    print(i)
     
# Iterating over a String
print("\nString Iteration")   
s = "Dog"
for i in s :
    print(i)
     
# Iterating over dictionary
print("\nDictionary Iteration")  
d = dict()
d['Class'] = 'B.Tech CSE - MA'
d['Section'] = 'K'
for i in d :
    print("%s  %s" %(i, d[i]))