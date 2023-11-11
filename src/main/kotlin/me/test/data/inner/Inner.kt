package me.test.data.inner

import at.kopyk.CopyExtensions
import me.test.data.Outer

@CopyExtensions
data class Inner(
    val outer: Outer
)
