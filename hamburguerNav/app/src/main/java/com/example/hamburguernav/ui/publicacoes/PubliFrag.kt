package com.example.hamburguernav.ui.publicacoes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.hamburguernav.databinding.FragmentCursosBinding
import com.example.hamburguernav.databinding.FragmentPubliBinding
import com.example.hamburguernav.databinding.FragmentSlideshowBinding
import com.example.hamburguernav.ui.gallery.PubliViewModel

class PubliFrag : Fragment() {

    private var _binding: FragmentPubliBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val publiViewModel =
            ViewModelProvider(this).get(PubliViewModel::class.java)

        _binding = FragmentPubliBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textPubli
        publiViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}