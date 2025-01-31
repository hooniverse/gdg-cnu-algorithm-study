function findPrimes(M, N) {
  let arr = Array(N + 1).fill(true);
  arr[0] = arr[1] = false;

  for (let i = 2; i * i <= N; i++) {
    if (arr[i]) {
      for (let j = i * i; j <= N; j += i) {
        arr[j] = false;
      }
    }
  }

  let result = [];
  for (let i = M; i <= N; i++) {
    if (arr[i]) result.push(i);
  }

  console.log(result.join("\n"));
}

// 예제 실행
const [M, N] = "3 16".split(" ").map(Number);
findPrimes(M.N);
