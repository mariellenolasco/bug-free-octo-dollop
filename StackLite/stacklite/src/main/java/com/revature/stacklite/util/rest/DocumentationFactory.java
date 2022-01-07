package com.revature.stacklite.util.rest;

import com.revature.stacklite.models.Issue;
import com.revature.stacklite.models.Solution;

import io.javalin.plugin.openapi.dsl.OpenApiBuilder;
import io.javalin.plugin.openapi.dsl.OpenApiDocumentation;

class DocumentationFactory {
	public static OpenApiDocumentation getDoc(String handler) {
		switch (handler) {
		case "getIssues":
			return OpenApiBuilder.document().operation(op -> {
				op.addTagsItem("Issue");
			}).jsonArray("200", Issue.class);
		case "getIssue":
			return OpenApiBuilder.document().operation(op -> {
				op.addTagsItem("Issue");
			}).json("200", Issue.class);
		case "addIssue":
			return OpenApiBuilder.document().operation(op -> {
				op.addTagsItem("Issue");
			}).body(Issue.class).result("201");
		case "getSoln":
			return OpenApiBuilder.document().operation(op -> {
				op.addTagsItem("Solution");
			}).json("200", Solution.class);
		case "putSoln":
			return OpenApiBuilder.document().operation(op -> {
				op.addTagsItem("Solution");
			}).body(Solution.class).result("204");
		case "addSoln":
			return OpenApiBuilder.document().operation(op -> {
				op.addTagsItem("Solution");
			}).body(Solution.class).result("201");
		default:
			return null;
		}

	}
}
