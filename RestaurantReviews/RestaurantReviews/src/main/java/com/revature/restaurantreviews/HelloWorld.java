
package com.revature.restaurantreviews;

import com.revature.restaurantreviews.util.Router;

import io.javalin.Javalin;

public class HelloWorld {
  public static void main(String[] args) {
    Javalin app = Javalin.start(7000);
    app.get("/", ctx -> ctx.result("Hello World"));
    Router.getInstance(app).setUpEndpoints();
  }
}
