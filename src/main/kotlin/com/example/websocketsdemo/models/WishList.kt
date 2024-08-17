package com.example.websocketsdemo.models

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.OneToMany

@Entity
data class WishList(@Id @GeneratedValue val id: Long,
                    val name: String,
                    val description: String,
                    @OneToMany val items: List<WishListItem>?
)
