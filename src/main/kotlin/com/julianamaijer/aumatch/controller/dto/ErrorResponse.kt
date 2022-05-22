package com.julianamaijer.aumatch.controller.dto

data class ErrorResponse (
    var httpCode: Int,
    var message: String,
    var internalCode: String,
    var errors: List<FieldErrorResponse>?
)