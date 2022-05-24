package com.zacharykarpinski

import io.micronaut.core.annotation.NonNull
import io.micronaut.context.annotation.DefaultImplementation

@DefaultImplementation(BookRepositoryImpl)
interface BookRepository {

    @NonNull
    List<Book> findAll()
}