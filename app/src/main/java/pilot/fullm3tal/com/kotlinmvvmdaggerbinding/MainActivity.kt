package pilot.fullm3tal.com.kotlinmvvmdaggerbinding

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import pilot.fullm3tal.com.kotlinmvvmdaggerbinding.databinding.ActivityMainBinding
import pilot.fullm3tal.com.kotlinmvvmdaggerbinding.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel

    val viewModelFactory: CustomProvider = CustomProvider()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)

        var binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main).apply {
            this.setLifecycleOwner(this@MainActivity)
        }

        binding.viewModel = viewModel



        viewModel.clickResults.observe(this, Observer {
            Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show()
            binding.viewModel=viewModel


        })

    }
}
