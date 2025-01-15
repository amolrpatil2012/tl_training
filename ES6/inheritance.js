class Person {
  constructor(name) {
    this.name = name;
  }
}

class Emp extends Person {
  constructor(name, dept) {
    super(name);
    this.dept = dept;
  }
  show() {
    console.log(this.name);
    console.log(this.dept);
  }
}

const e = new Emp("Suresh", "IT");
e.show();
