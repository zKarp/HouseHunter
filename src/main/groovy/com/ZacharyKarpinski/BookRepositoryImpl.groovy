package com.zacharykarpinski

import io.micronaut.core.annotation.NonNull
import jakarta.inject.Singleton

@Singleton
class BookRepositoryImpl implements BookRepository {
    @NonNull
    @Override
    List<Book> findAll() {
        [
                new Book("1491950358", "Building Microservices"),
                new Book("1680502395", "Release It!"),
                new Book("0321601912", "Continuous Delivery:")
        ]
    }
}