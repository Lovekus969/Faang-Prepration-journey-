const numbers = [1, 2, 3, 4, 5];
const evenNumbers = numbers.filter(num => num % 2 === 0);

console.log(evenNumbers); // [2, 4]
// find those user who are active on their system .............
const users = [
  { id: 1, name: 'Alice', active: true },
  { id: 2, name: 'Bob', active: false },
  { id: 3, name: 'Charlie', active: true }
];

const activeUsers = users.filter(user => user.active);

console.log(activeUsers);
// Output:
// [
//   { id: 1, name: 'Alice', active: true },
//   { id: 3, name: 'Charlie', active: true }
// ]

