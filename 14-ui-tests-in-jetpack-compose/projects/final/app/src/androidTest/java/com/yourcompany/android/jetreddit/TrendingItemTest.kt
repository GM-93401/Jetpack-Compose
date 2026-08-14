package com.mc1000_263.android.jetreddit

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import com.mc1000_263.android.jetreddit.domain.model.PostModel
import com.mc1000_263.android.jetreddit.screens.TrendingTopic
import com.mc1000_263.android.jetreddit.screens.TrendingTopicModel
import com.mc1000_263.android.jetreddit.util.Tags
import org.junit.Rule
import org.junit.Test

class TrendingItemTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun trending_item_is_displayed() {
        val topic = TrendingTopicModel(
            "Compose Tutorial",
            R.drawable.jetpack_composer
        )

        composeTestRule.setContent {
            TrendingTopic(topic)
        }

        composeTestRule.onNodeWithTag(Tags.TRENDING_ITEM)
            .assertIsDisplayed()
    }

}