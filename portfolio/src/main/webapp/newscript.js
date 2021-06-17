async function showServerTime() {
  // Send request to /date
  const responseFromServer = await fetch('/date');
  const textFromResponse = await responseFromServer.text();
  const dateContainer = document.getElementById('date-container');
  dateContainer.innerText = textFromResponse;
} 
async function moreFacts(){
  // Send request to /date
  const responseFromServer = await fetch('/more-about-me');
  const facts = await responseFromServer.json();
  const factsContainer = document.getElementById('facts-container');
  factsContainer.innerHTML = '';
  const facts = facts[Math.floor(Math.random() * facts.length)];
  factsContainer.innerText = textFromResponse;
}