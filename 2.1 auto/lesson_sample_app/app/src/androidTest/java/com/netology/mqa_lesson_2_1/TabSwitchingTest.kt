package com.netology.mqa_lesson_2_1

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.auto_mobile.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TabSwitchingTest {

    @get:Rule
    val composeRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun tabSwitchingTest() {
        // 1. Изначально активна вкладка TAB 1, виден текст «Страница: 1»
        composeRule.onNodeWithText("Страница: 1").assertIsDisplayed()

        // 2. Нажимаем на вкладку TAB 2
        composeRule.onNodeWithText("TAB 2").performClick()

        // 3. Открывается страница с текстом «Страница: 2»
        composeRule.onNodeWithText("Страница: 2").assertIsDisplayed()
    }
}
