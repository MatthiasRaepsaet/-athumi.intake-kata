package be.athumi.service

import be.athumi.Wine

interface WineAssessmentStrategy {
    fun assessWine(wine: Wine)
}