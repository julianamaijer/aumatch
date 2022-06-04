package com.julianamaijer.aumatch

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AumatchApplication

fun main(args: Array<String>) {
	System.out.println("te amoooo");
	runApplication<AumatchApplication>(*args)
}
