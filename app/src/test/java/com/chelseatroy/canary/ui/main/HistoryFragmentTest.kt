package com.chelseatroy.canary.ui.main

import org.junit.Assert.*
import android.widget.TextView
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.fragment.app.testing.launchFragment
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.chelseatroy.canary.R
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class HistoryFragmentTest {
    @get:Rule
    var instantExecutorRule = InstantTaskExecutorRule()

    @Test
    fun fragmentLaunches() {
        val scenario = launchFragment<HistoryFragment>()
        scenario.onFragment { fragment ->
            val sectionlabel = fragment.view!!.findViewById<TextView>(R.id.section_label)
            assertEquals("Hello world from section: 1", sectionlabel.text)
        }
    }
}
