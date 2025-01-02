package org.jiachengteo;

import io.javalin.Javalin;

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static void main(String[] args) {
		var app = Javalin.create(/*config*/)
			.get("/", ctx -> ctx.result("Hello World"))
			.start(7070);
	}
}