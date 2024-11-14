package be.athumi

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WineTest {
    @Test
    fun `tasting or testing wine`() {
        assertThat(Wine("name", 0, 0)).isNotNull
    }

    @Test
    fun `a shop without wine is no shop, is it`() {
        val shop = WineShop(listOf(Wine("name", 0, 0)))

        assertThat(shop).isNotNull

        shop.next()

        assertThat(shop).isNotNull
    }

    @Test
    fun `simulate given scenario over 3 years`() {
        val wineList = listOf(
                Wine("Standard Wine", 20, 10),
                Wine("Bourdeaux Conservato", 0, 2),
                Wine("Another Standard Wine", 7, 5),
                Wine("Wine brewed by Alexander the Great", 150, 0),
                Wine("Wine brewed by Alexander the Great", 80, 10),
                Wine("Event Wine", 20, 15),
                Wine("Event Wine", 49, 10),
                Wine("Event Wine", 49, 5),
                Wine("Eco Brilliant Wine", 6, 3)
        )
        val shop = WineShop(wineList)

        shop.next()
        shop.next()
        shop.next()

        shop.items.forEach { println("$it") }

        assertThat(shop.items[0].price == 17 && shop.items[0].expiresInYears == 7).isTrue()
        assertThat(shop.items[1].price == 4 && shop.items[1].expiresInYears == -1).isTrue()
        assertThat(shop.items[2].price == 4 && shop.items[2].expiresInYears == 2).isTrue()
        assertThat(shop.items[3].price == 150 && shop.items[3].expiresInYears == 0).isTrue()
        assertThat(shop.items[4].price == 80 && shop.items[4].expiresInYears == 10).isTrue()
        assertThat(shop.items[5].price == 23 && shop.items[5].expiresInYears == 12).isTrue()
        assertThat(shop.items[6].price == 52 && shop.items[6].expiresInYears == 7).isTrue()
        assertThat(shop.items[7].price == 55 && shop.items[7].expiresInYears == 2).isTrue()
        assertThat(shop.items[8].price == 3 && shop.items[8].expiresInYears == 0).isTrue()
    }
}