package com.example.websocketsdemo.services

import com.example.websocketsdemo.models.WishList
import com.example.websocketsdemo.repositories.WishListRepository
import org.springframework.stereotype.Service

@Service
class WishListService(val wishListRepository: WishListRepository) {
    fun getAll() = emptyList<WishList>()

    fun create(wishList: WishList) = wishListRepository.save(wishList)

    fun getById(id: Long) = wishListRepository.findById(id)
}