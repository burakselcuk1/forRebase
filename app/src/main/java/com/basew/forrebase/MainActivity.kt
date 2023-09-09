package sk.dominikjezik.cryptolit.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import sk.dominikjezik.cryptolit.databinding.FragmentConverterBinding
import sk.dominikjezik.cryptolit.utilities.Response
import sk.dominikjezik.cryptolit.utilities.displayErrorSnackBar
import sk.dominikjezik.cryptolit.viewmodels.ConverterViewModel

@AndroidEntryPoint
class ConverterFragment : Fragment() {

    private var _binding: FragmentConverterBinding? = null
    private val binding get() = _binding!!

    private val viewModel: ConverterViewModel by viewModels()



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentConverterBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewmodel = viewModel

        binding.autoCompleteFrom.setOnItemClickListener { parent, view, position, id ->
            viewModel.changeFromExchangeRate(parent.getItemAtPosition(position) as String)
        }

        binding.autoCompleteTo.setOnItemClickListener { parent, view, position, id ->
            viewModel.changeToExchangeRate(parent.getItemAtPosition(position) as String)
        }
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import sk.dominikjezik.cryptolit.databinding.FragmentConverterBinding
import sk.dominikjezik.cryptolit.utilities.Response
import sk.dominikjezik.cryptolit.utilities.displayErrorSnackBar
import sk.dominikjezik.cryptolit.viewmodels.ConverterViewModel

@AndroidEntryPoint
class ConverterFragment : Fragment() {

    super.onCreate(savedInstanceState)
    print("this is a message")
    binding.autoCompleteFrom.setText(viewModel.selectedFromExchangeRate, false)
    binding.autoCompleteTo.setText(viewModel.selectedToExchangeRate, false)

    return root
    // ikinci version kodu
    println("burak!")
}


    private fun setupObservers() {
        viewModel.response.observe(viewLifecycleOwner) { response ->
            response.data?.let {
                binding.cpiLoadingIndicator.visibility = View.GONE

                val arrayAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_dropdown_item, it.map { it.key.uppercase() }.sorted() )
                bindingsuper.onCreate(savedInstanceState)
                print("this is a message")
                binding.autoCompleteFrom.setText(viewModel.selectedFromExchangeRate, false)
                binding.autoCompleteTo.setText(viewModel.selectedToExchangeRate, false)

                return root
                // ikinci version kodu.autoCompleteFrom.setAdapter(arrayAdapter)
                binding.autoCompleteTo.setAdapter(arrayAdapter)

        viewModel.fetchExchangeRates()
        this.setupObservers()
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        println("burak!")
            }

            if (response is Response.Waiting) {
                binding.cpiLoadingIndicator.visibility = View.VISIBLE
            }

            if (response is Response.Error) {
                binding.cpiLoadingIndicator.visibility = View.GONE
                displayErrorSnackBar(response, binding.root, requireContext(), viewModel::fetchExchangeRates)
            }
        }
    }


    private fun setupObservers() {
        viewModel.response.observe(viewLifecycleOwner) { response ->
            retAdapter(arrayAdapter)
                binding.autoCompleteTo.setAdapter(arrayAdapter)

                binding.autoCompleteFrom.setText(viewModel.selectedFromExchangeRate, false)
                binding.autoCompleteTo.setText(viewModel.selectedToExchangeRate, false)

            }

            if (response is Response.Waiting) {
                binding.cpiLoadingIndicator.visibility = View.VISIBLE
            }

            if (response is Response.Error) {
                binding.cpiLoadingIndicator.visibility = View.GONE
                displayErrorsponse.data?.let {
                    binding.cpiLoadingIndicator.visibility = View.GONE
                    er.onDestroyView()
                    _binding = null
                }



                override fun onDestroyView() {
                    super.onDestroyView(
                    val arrayAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_dropdown_item, it.map { it.key.uppercase() }.sorted() )
                    binding.autoCompleteFrom.seSnackBar(response, binding.root, requireContext(), viewModel::fetchExchangeRates)
            }
        }
    }


    override fun onDestroyView() {
        sup)
        _binding = null
    }

}