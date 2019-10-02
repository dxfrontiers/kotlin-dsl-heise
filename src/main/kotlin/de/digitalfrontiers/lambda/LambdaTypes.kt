package de.digitalfrontiers.lambda

class Context {
    fun doSomething() { /* .. */ }
}

fun <T> doWithContext(action: (Context) -> T): T {
    val ctx = Context()
    return action(ctx)
}

fun <T> doWithContextAsReceiver(action: Context.() -> T): T {
    val ctx = Context()
    return ctx.action()
}

fun main() {
    doWithContext {
        it.doSomething()
    }

    doWithContextAsReceiver {
        doSomething()
    }
}