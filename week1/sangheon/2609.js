function gcd(a, b) {
  while (b !== 0) {
    let temp = b;
    b = a % b;
    a = temp;
  }
  return a;
}

function lcm(a, b) {
  return (a * b) / gcd(a, b);
}

// 예제 실행
const [A, B] = "24 18".split(" ").map(Number);

console.log(gcd(A, B));
console.log(lcm(A, B));
