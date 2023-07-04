package com.example.finalproyect2023_2.ENTITIES

import java.security.Timestamp

data class JobOffer(
    val title: String = "",
    val description: String = "",
    val timestamp: com.google.firebase.Timestamp? = null
)
