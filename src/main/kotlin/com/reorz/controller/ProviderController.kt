package com.reorz.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * Created by acris on 3/31/17.
 */
@RestController
class ProviderController {
    @GetMapping("/greeting")
    fun greeting(@RequestParam("name", defaultValue = "World") name: String): String {
        return "Hello $name !"
    }
}