a, b = map(int, input().split())

# 유클리드 호제법: x, y의 최대공약수는 y, x % y의 최대공약수와 같다.
def gcd(a, b):
    while b > 0:
        a, b = b, a % b
    return a

def lcm(a, b):
    return a * b // gcd(a, b)

print(gcd(a, b))
print(lcm(a, b))
