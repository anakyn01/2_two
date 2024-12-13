let student = '{"st":[' +
'{"firstName":"John","lastName":"Doe" },' +
'{"firstName":"Anna","lastName":"Smith" },' +
'{"firstName":"Peter","lastName":"Jones" }]}';

const obj = JSON.parse(student);
document.getElementById("json").innerHTML =
obj.st[1].firstName + " " + obj.st[1].lastName;