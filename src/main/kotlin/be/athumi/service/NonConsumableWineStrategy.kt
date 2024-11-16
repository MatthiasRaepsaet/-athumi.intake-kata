package be.athumi.service

import be.athumi.Wine

class NonConsumableWineStrategy : WineAssessmentStrategy{
    override fun assessWine(wine: Wine) {
        if(wine.price < 0) {
            wine.price = 0
        }
    }
}