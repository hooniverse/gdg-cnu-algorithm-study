m, n = map(int, input().split())

for i in range(m, n+1):
  if i == 1:
    continue
  for j in range(2, int(i**0.5)+1): # 어떤 수의 제곱근까지의 약수를 구하면 소수인지 아닌지 판단이 가능.
    if i % j == 0:
      break
  else:
    print(i)
