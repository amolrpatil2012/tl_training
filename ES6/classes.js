class Student {
  constructor(roll, name) {
    this.roll = roll;
    this.name = name;
  }
  display() {
    console.log("Roll : " + this.roll);
    console.log("Name : " + this.name);
  }
}
const s = new Student(1, "Suresh");
s.display();
