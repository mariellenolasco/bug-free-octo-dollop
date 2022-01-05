package com.revature.restaurantreviews.util;

import com.revature.restaurantreviews.models.Restaurant;

import io.javalin.plugin.openapi.dsl.OpenApiBuilder;
import io.javalin.plugin.openapi.dsl.OpenApiDocumentation;

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
						.result("204");
			default: return null;
		}
	}
}
