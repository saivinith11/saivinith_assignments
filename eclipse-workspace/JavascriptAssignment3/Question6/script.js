var str = '({"fname" : "sai", "lname" : "vinith"})';
var obj = eval(str);
obj.lname = "Dhoni";
alert(obj.fname + " , " + obj.lname);