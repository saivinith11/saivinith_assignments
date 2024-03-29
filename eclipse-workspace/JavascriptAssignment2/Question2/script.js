const square = x => x*x;
const double = x => x*2;
const compose = (f, fs) => x => f(fs(x));

let f = compose(square, double)
console.log(f(5)); //100
let f2 = compose(double, square)
console.log(f2(5)); //50