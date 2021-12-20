var fib = [1, 1];
for(var i=fib.length; i<50; i++) {
    fib[i] = fib[i-2] + fib[i-1];
}
console.log(fib); 