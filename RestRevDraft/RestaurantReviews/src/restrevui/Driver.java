package restrevui;
import io.javalin.Javalin;
import controllers.RestaurantController;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		Javalin app = Javalin.create()
				.port(7000)
				.start();
		app.get("/hello", ctx -> ctx.html("Hello Javalin"));
		app.get("/restaurants", RestaurantController.getRestaurants);
		app.get("/restaurants/:id", RestaurantController.getRestaurant);
	}
}
