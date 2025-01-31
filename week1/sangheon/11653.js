function primeFactorization(N) {
  let i = 2;

  while (i * i <= N) {
    while (N % i === 0) {
      console.log(i);
      N /= i;
    }
    i++;
  }

  if (N > 1) console.log(N);
}
