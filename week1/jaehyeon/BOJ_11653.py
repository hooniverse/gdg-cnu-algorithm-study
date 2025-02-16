n = int(input())
i = 2

while n > 1:
    if n % i == 0:
        n = n // i
        print(i)
    else:
        i += 1
        if i > int(n**0.5): # 약수는 쌍으로 존재 > √N 이상에 대해 확인할 이유가 없다.
          i = n
