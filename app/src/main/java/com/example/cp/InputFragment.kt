package com.example.cp.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.cp.SecondActivity
import com.example.cp.R

class InputFragment : Fragment() {

    private lateinit var nameInput: EditText
    private lateinit var emailInput: EditText
    private lateinit var ageInput: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_input, container, false)

        nameInput = view.findViewById(R.id.nameInput)
        emailInput = view.findViewById(R.id.emailInput)
        ageInput = view.findViewById(R.id.ageInput)

        val submitButton: Button = view.findViewById(R.id.submitButton)
        submitButton.setOnClickListener {
            val name = nameInput.text.toString()
            val email = emailInput.text.toString()
            val age = ageInput.text.toString()

            val intent = Intent(activity, SecondActivity::class.java).apply {
                putExtra("NAME", name)
                putExtra("EMAIL", email)
                putExtra("AGE", age)
            }
            startActivity(intent)
        }

        return view
    }
}
