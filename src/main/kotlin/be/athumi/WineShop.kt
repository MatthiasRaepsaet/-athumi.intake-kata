package be.athumi

import be.athumi.service.*

class WineShop(var items: List<Wine>) {
    fun next() {
        // Wine Shop logic
        for (i in items.indices) {
            when {
                isNonConsumable(items[i]) -> NonConsumableWineStrategy().assessWine(items[i])
                isEventWine(items[i]) -> EventWineStrategy().assessWine(items[i])
                isConservatoWine(items[i]) -> ConservatoWineStrategy().assessWine(items[i])
                isEcoWine(items[i]) -> EcoWineStrategy().assessWine(items[i])
                else -> CellarWineStrategy().assessWine(items[i])
            }
        }
    }

    fun isNonConsumable(wine: Wine) : Boolean{
        return wine.name.equals("Wine brewed by Alexander the Great")
    }

    fun isEventWine(wine: Wine) : Boolean{
        return wine.name.startsWith("Event")
    }

    fun isConservatoWine(wine: Wine) : Boolean{
        return wine.name.contains("Conservato");
    }

    fun isEcoWine(wine: Wine) : Boolean{
        return wine.name.startsWith("Eco")
    }

}