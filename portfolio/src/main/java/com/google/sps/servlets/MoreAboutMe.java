// Copyright 2019 Google LLC
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

package com.google.sps.servlets;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.Date;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Servlet that gives fun facts about Nicole. */
@WebServlet("/more-about-me")
public class MoreAboutMe extends HttpServlet {
  
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    final String [] funFacts = new String [] {"I love Ultimate Frisbee", "My favorite TV show is Nancy Drew", "I'm interested in Software Engineering"};
    String json = convertToJsonUsingGson(funFacts);
    response.setContentType("application/json;");
    response.getWriter().println(json);
  }
  /*
   *  Converts a ServerStats instance into a JSON string using the Gson library.
  */
  private String convertToJsonUsingGson(String [] funFacts) {
    Gson gson = new Gson();
    return gson.toJson(funFacts);
  }
}
