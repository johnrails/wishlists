package com.example.websocketsdemo.repositories

import com.example.websocketsdemo.models.WishList
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface WishListRepository : CrudRepository<WishList, Long> {
}