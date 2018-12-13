package pilot.fullm3tal.com.kotlinmvvmdaggerbinding

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import pilot.fullm3tal.com.kotlinmvvmdaggerbinding.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel=ViewModelProviders.of(this).get(MainViewModel::class.java)


//        val binding=DataBindingUtil.setContentView<>()

    }
}
