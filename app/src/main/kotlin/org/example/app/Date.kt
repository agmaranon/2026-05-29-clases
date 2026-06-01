package org.example.app

class Date (private var day: Int, private var month: Int, private var year: Int) {
    override fun toString():String{
        return "Date(${day}/${month}/${year})"
    }
}
