package de.digitalfrontiers.html

fun main() {
    val myHtml = html {
        table {
            // table header
            th {
                td { /* .. */ }
                td { /* .. */ }
            }

            // dynamic table content
            for (i in 1..10) {
                tr {
                    td { /* .. */ }
                    td { /* .. */ }
                }
            }
        }
    }
}