var array =[1,2,3,4,5];
var sum = 0;

function newArray(){
    for(i=0;i<array.length;i++){
        sum=sum+parseInt(array[i])
    }
    document.write(sum);
}
newArray();

var array=[1,2,3,4,5,6];
var sum=0;
var count=0;

while(count<array.length){
    sum=sum+parseInt(array[count])
    count=count+1;
}
document.write(sum);

var array=[1,2,3,4,5,6];
var sum=0;
var count=0;
do{
    sum=sum+parseInt(array[count])
    count=count+1;
}while(count<array.length)
document.write(sum);