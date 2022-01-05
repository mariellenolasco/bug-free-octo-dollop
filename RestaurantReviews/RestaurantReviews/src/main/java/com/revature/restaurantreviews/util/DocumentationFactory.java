package com.revature.restaurantreviews.util;

import com.revature.restaurantreviews.models.Restaurant;

import io.javalin.plugin.openapi.dsl.OpenApiBuilder;
import io.javalin.plugin.openapi.dsl.OpenApiDocumentation;

/**
 * Factory used for generating documentation for API in swagger
 * @author MarielleNolasco
 *
 */
class DocumentationFactory {
	static OpenApiDocumentation getDoc(String handler)
	{
		switch(handler)
		{
			case "get restaurant":
				return OpenApiBuilder.document()
						.operation(op -> {op.addTagsItem("Restaurant");})
						.json("200", Restaurant.class);
			case "get restaurants":
				return OpenApiBuilder.document()
						.operation(op -> {op.addTagsItem("Restaurant");})
						.jsonArray("200", Restaurant.class);
			case "add restaurant":
				return OpenApiBuilder.document()
						.operation(op -> {op.addTagsItem("Restaurant");})
						.body(Restaurant.class)
						.result("201");
			case "delete restaurant":
				return OpenApiBuilder.document()
						.operation(op -> {op.addTagsItem("Restaurant");})
						.result("204");
			case "update restaurant":
				return OpenApiBuilder.document()
						.operation(op -> {op.addTagsItem("Restaurant");})
						.body(Restaurant.class)
						.result("204");
			default: return null;
		}
	}
}
