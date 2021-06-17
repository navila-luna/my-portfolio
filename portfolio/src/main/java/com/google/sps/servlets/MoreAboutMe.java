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

import java.io.IOException;
import java.util.Date;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Servlet that responds with the current date. */
@WebServlet("/more-about-me")
public class MoreAboutMe extends HttpServlet {
  
  final String [] funFacts = new String [] {"I love Ultimate Frisbee", "My favorite TV show is Nancy Drew", "I'm interested in Software Engineering"};
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    String json = convertToJsonUsingGson(funFacts);
    response.setContentType("application/json;");
    response.getWriter().println(json);
  }
  /**
   * Converts a ServerStats instance into a JSON string using manual String concatentation.
   */

  // private String convertToJson() {
  //   String json = "{";
  //   json += "\"Game\": ";
  //   json += "\"Ultimate Frisbee\"";
  //   json += ", ";
  //   json += "\"Sport\": ";
  //   json += "\"Cross Country\"";
  //   json += ", ";
  //   json += "\"TvShow \": ";
  //   json += "\"Nancy Drew\"";
  //   json += ", ";
  //   json += "\"Career\":";
  //   json += "\"Software Engineering, Product Management\"";
  //   json += "}";
  //   return json;
  // }

  /**
   *  Converts a ServerStats instance into a JSON string using the Gson library. Note: We first added
   * the Gson library dependency to pom.xml.
  */
  private String convertToJsonUsingGson(String [] funFacts) {
    Gson gson = new Gson();
    String json = gson.toJson(funFacts);
    return json;
  }
}
