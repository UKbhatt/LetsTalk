package pl.jakubtworek.notifications.controller.dto

import java.sql.Timestamp

data class NotificationResponse(
    val id: Int,
    val name: String,
    val message: String,
    val content: String?,
    val createAt: Timestamp
)
