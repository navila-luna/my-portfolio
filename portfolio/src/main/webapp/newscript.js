async function showServerTime() {
  const responseFromServer = await fetch('/date');
  const textFromResponse = await responseFromServer.text();
  const dateContainer = document.getElementById('date-container');
  dateContainer.innerText = textFromResponse;
}