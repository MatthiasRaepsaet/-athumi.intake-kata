package be.athumi

import be.athumi.service.CellarWineStrategy
import be.athumi.service.WineAssessmentStrategy

class WineShop(var items: List<Wine>) {
    fun next() {
        // Wine Shop logic
        for (i in items.indices) {
            CellarWineStrategy().assessWine(items[i])
        }
    }
}