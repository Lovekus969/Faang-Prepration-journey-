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
const index = [5, 12, 8, 130].findIndex(x => x > 10);
// Output: 1
// . .some()
// Purpose: Checks if any element passes the condition.

// javascript
[1, 2, 3].some(n => n > 2); // true
// Purpose: Checks if all elements pass the condition.
[1, 2, 3].every(n => n > 0); // true

