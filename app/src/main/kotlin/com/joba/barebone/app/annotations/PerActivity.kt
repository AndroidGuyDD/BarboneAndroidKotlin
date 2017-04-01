package com.joba.barebone.app.annotations

import javax.inject.Scope

/**
 * Custom scope annotation for activity context in Dagger.
 */
@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class PerActivity