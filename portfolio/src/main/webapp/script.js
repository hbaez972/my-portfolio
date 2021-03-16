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
 * Adds a random greeting to the page.
 */
function addRandomGreeting() {
  const greetings =
      ['My first language is spanish', 'I immigrated to the United States in 2011!', 'My name is the combination of my mom (Heydi) and dads (Silfrido) name', 'My favorite color is yellow!'];

  // Pick a random greeting.
  const greeting = greetings[Math.floor(Math.random() * greetings.length)];

  // Add it to the page.
  const greetingContainer = document.getElementById('greeting-container');
  greetingContainer.innerText = greeting;
}
async function showHelloWorld(){
    const responseFromServer = await fetch('/hello');
  const textFromResponse = await responseFromServer.text();

  const helloContainer = document.getElementById('hello-world');
  helloContainer.innerText = textFromResponse;
}