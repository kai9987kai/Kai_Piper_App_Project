package com.example.kaipiper.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.kaipiper.Frag1
import com.example.kaipiper.Frag2
import com.example.kaipiper.Frag3
import com.example.kaipiper.R

private val TAB_TITLES = arrayOf(
        R.string.tab_text_1,
        R.string.tab_text_2,
        "News"
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
@Suppress("DEPRECATION")
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager)
    : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {

        return when (position) {
            0 -> Frag1()
            1 -> Frag2()
            2 -> Frag3()

            else -> PlaceholderFragment.newInstance(position + 1)
        }
    }



        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).

    override fun getCount(): Int {
        // Show 2 total pages.
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {

            return when (position) {
                0 -> "Home"
                1 -> "Website"
                2 ->  "About"
                else -> {
                    return "Error"
                }
            }
        }
    }




