package de.digitalfrontiers.gherkin

import assertk.Assert
import assertk.assertThat

class given<S>(private val setup: () -> S) {

    fun <R> on(test: S.() -> R): Result<R> =
        Result { setup().test() }
}

class Result<R>(private val result: () -> R) {

    fun then(assert: Assert<R>.() -> Unit) {
        assertThat(result()).assert()
    }
}
