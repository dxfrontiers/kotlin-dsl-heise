package de.digitalfrontiers.html

class html(body: html.() -> Unit) {

    fun table(table: Table.() -> Unit) = Table(table)

    class Table(table: Table.() -> Unit) {

        fun th(th: Tr.() -> Unit) = Tr(th)
        fun tr(tr: Tr.() -> Unit) = Tr(tr)

        class Tr(tr: Tr.() -> Unit) {

            fun td(td: Td.() -> Unit) = Td(td)

            class Td(td: Td.() -> Unit)
        }
    }
}