package be.athumi.service

import be.athumi.Wine

fun interface WineAssessmentStrategy {

    /**
     * Manipulates wine object price and expiresInYears
     * @param wine the wine object that will be manipulated
     */
    fun assessWine(wine: Wine)
}