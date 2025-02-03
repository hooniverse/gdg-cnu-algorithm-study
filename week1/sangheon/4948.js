const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

function sieve(limit) {
  const isPrime = Array(limit + 1).fill(true);
  isPrime[0] = isPrime[1] = false;

  for (let i = 2; i * i <= limit; i++) {
    if (isPrime[i]) {
      for (let j = i * i; j <= limit; j += i) {
        isPrime[j] = false;
      }
    }
  }
  return isPrime;
}

const MAX_LIMIT = 123456 * 2;
const primeCheck = sieve(MAX_LIMIT);

rl.on("line", (line) => {
  let n = parseInt(line.trim());
  if (n === 0) {
    rl.close();
    return;
  }

  let count = 0;
  for (let i = n + 1; i <= 2 * n; i++) {
    if (primeCheck[i]) count++;
  }
  console.log(count);
});
