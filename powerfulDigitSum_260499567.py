##
#A googol (10100) is a massive number: one followed by one-hundred zeros;
#100100 is almost unimaginably large: one followed by two-hundred zeros.
#Despite their size, the sum of the digits in each number is only 1.
#Considering natural numbers of the form, ab, where a, b < 100,
#what is the maximum digit sum?
def sum_digits(n):
    s = 0;
    while n:
        s += n % 10;
        n //= 10;
    return s;

max=0;
for x in range(1,100):
    for y in range(1,100):
        sod=sum_digits(pow(x,y));
        if sod>max:
            max=sod;
    
print(max);




    
    
