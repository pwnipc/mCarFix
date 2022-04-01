package com.chalie.sharedmodule

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}