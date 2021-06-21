// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


/**
 * Adds a random song to the page.
 */
function addRandomSong() {
  const songs = ['Papaoutai by Stromae', 'Good 4 u by Olivia Rodrigo', '3005 by Childish Gambino', 'Used to this by Camila Cabello', 'Rayando el sol by Mana', 'Besos en Guerra by Morat and Juanes', 'ANY Shawn Mendes song', 'Symphony by Clean Bandit', 'Blinding Lights by The Weeknd', ' Hawái by Maluma', 'I gotta feeling by Black Eyed Peas'];

  // Pick a random song.
  const song = songs[Math.floor(Math.random() * songs.length)];

  // Add it to the page.
  const songContainer = document.getElementById('song-container');
  songContainer.innerText = song;
}