package com.example.websocketsdemo.models

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

@Entity
data class WishListItem(
    @Id @GeneratedValue val id: Long,
    val url: String,
    @ManyToOne
    @JoinColumn(name = "wishlist_id", nullable = true)
    val wishList: WishList
)
