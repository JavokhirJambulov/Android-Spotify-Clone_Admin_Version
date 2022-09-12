package uz.javokhirjambulov.spotifycloneadminversion.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import uz.javokhirjambulov.spotifycloneadminversion.R
import uz.javokhirjambulov.spotifycloneadminversion.databinding.FragmentHomeBinding

class HomeFragment: Fragment() {
    private lateinit var homeFragmentBinding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        homeFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home,container,false)


        return homeFragmentBinding.root
    }
}