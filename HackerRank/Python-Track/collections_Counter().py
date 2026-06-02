# Enter your code here. Read input from STDIN. Print output to STDOUT

from collections import Counter

#Number of shoes
X = int(input())

#Shoe sizes in stock
sizes = Counter(map(int, input().split()))

#Number of customers
N = int(input())

earnings = 0

for _ in range(N):
    size, price = map(int, input().split())
    if sizes[size] > 0:
        earnings += price
        sizes[size] -= 1
        
print(earnings) 