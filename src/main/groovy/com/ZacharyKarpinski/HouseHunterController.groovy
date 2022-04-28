package com.ZacharyKarpinski

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/houseHunter")
class HouseHunterController {

    @Get(uri="/", produces="text/plain")
    String index() {
        "Example Response"
    }
}