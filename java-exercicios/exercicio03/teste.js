const returnBigNumber = (numbers) => {

  const bigNumber = numbers.reduce((acc, number) => {
    if (number > acc) {
      return number;
    }
    return acc;
  }, 0);

  const media = numbers.reduce((acc, number) => {
    return (acc + number) / numbers.length
  }, 0)

  return `O maior número é: ${bigNumber}, a média de todos os números é: ${media.toFixed(2)}`;
}

console.log(returnBigNumber([12, 15, 65, 88, 101]))