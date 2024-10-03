package com.example.cp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.cp.R

class OutputFragment : Fragment() {

    companion object {
        fun newInstance(name: String?, email: String?, age: String?): OutputFragment {
            val fragment = OutputFragment()
            val args = Bundle()
            args.putString("NAME", name)
            args.putString("EMAIL", email)
            args.putString("AGE", age)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_output, container, false)

        val nameText: TextView = view.findViewById(R.id.nameText)
        val emailText: TextView = view.findViewById(R.id.emailText)
        val ageText: TextView = view.findViewById(R.id.ageText)

        arguments?.let {
            nameText.text = it.getString("NAME")
            emailText.text = it.getString("EMAIL")
            ageText.text = it.getString("AGE")
        }

        // Adicionando o OnClickListener ao botão "Back"
        val backButton: Button = view.findViewById(R.id.backButton)
        backButton.setOnClickListener {
            // Volta para a MainActivity
            activity?.finish()  // Finaliza a SecondActivity
        }

        return view
    }
}