const n1 = [1, 2, 3];
const n2 = [4, 5, 6];
const n3 = [...n1, ...n2];

console.log(n3);

const myVehicle = {
  brand: "Ford",
  model: "Mustag",
  color: "red",
};
const updateVehicle = {
  type: "car",
  year: 2024,
  color: "yellow",
};
const myUpdateVehicle = { ...myVehicle, ...updateVehicle };
console.log(myUpdateVehicle);
