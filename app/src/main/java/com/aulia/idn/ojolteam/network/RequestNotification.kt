package com.aulia.idn.ojolteam.network

import com.aulia.idn.ojolteam.model.Booking
import com.google.gson.annotations.SerializedName

class RequestNotification {
    @SerializedName("to")
    var token: String? = null

    @SerializedName("data")
    var sendNotificationModel: Booking? = null
}