#permutations is n C 5, then 5! ways to order the 5 card

ans = 0
def factorial(x):
    if(x < 0):
        return -1 
    elif (x == 0):
        return 1
    elif(x == 1):
        return 1
    else:
        return x*factorial(x-1)
#n!/(n-k)! = prod(n+1-i) from i=1 to k 
def nPk(n, k):
    i = 1
    product = 1
    while (i<=k):
        product = product*(n+1 - i)
        i = i+1
    return product   
    
def permutations(n):
    if (n<5):
        return 0
    else:
        nP5 = nPk(n,k) 
        return nP5

def readFile(fileName):
    ans = 0
    lines = open(fileName, 'r')
    firstLine = lines.readline()
    size = len(firstLine)
    spots = {}
    for i in range(0, size):
        spots[i] = 0  
    for string in lines:
        print string
        if (len(string) <= size+1):
            empty = 0
            for x in range(0, size):
                char = string[x]
                if (char == '*'):                  
                    empty = empty + 1
                    spots[x] = spots[x] + 1
            ans = ans + permutations(empty)
    print spots
    for x in spots:
        ans = ans + permutations(spots[x]) 
    return ans
  
#print readFile("simpleTest.txt")

                
                
            
           
            


        
    
