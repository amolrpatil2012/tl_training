/*
    var                         let
    
    global scope                local scope
    can redeclare               can declare only once

*/

function vardemo() {
  var x = 100;
  if (x > 50) {
    var x = 300;
    console.log(x);
  }
  console.log(x); //  only single x
}

vardemo();

function letdemo() {
  let x = 100; // this is x
  if (x > 50) {
    let x = 300; // this is different x
    console.log(x);
  }
  console.log(x);
}
letdemo();

var t = 100;
var t = 200;

//let p = 300;
//let p = 400;
