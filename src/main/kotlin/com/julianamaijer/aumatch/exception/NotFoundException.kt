package com.julianamaijer.aumatch.exception

class NotFoundException(override val message: String, val errorCode: String): Exception() {

}