package com.joba.barebone.common.contract

/**
 * Basic general interface for a MVP presenter.
 */
interface BasePresenterContract {
    /**
     * View lifecycle. Should be called from onResume() in activity or fragment.
     */
    fun resume()

    /**
     * View lifecycle. Should be called from onPause() in activity or fragment.
     */
    fun pause()

    /**
     * View lifecycle. Should be called from onDestroy() in activity or fragment.
     */
    fun destroy()
}