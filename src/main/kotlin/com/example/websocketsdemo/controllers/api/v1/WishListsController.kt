package com.example.websocketsdemo.controllers.api.v1

import com.example.websocketsdemo.models.WishList
import com.example.websocketsdemo.services.WishListService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class WishListsController(val wishListService: WishListService) {
    @GetMapping("/wishlists")
    fun index() = wishListService.getAll()

    @PostMapping("/wishlists")
    fun create(@RequestBody wishList: WishList) = wishListService.create(wishList)

    @GetMapping("/wishlists/{id}")
    fun show(id: Long) = wishListService.getById(id)
}