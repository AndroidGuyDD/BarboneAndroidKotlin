package com.joba.barebone.app.annotations

/**
 * Annotation for making kotlin classes open, hence mockable, during test builds.
 */
@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.CLASS)
annotation class Testable
