package com.joba.barebone.example.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.joba.barebone.R
import com.joba.barebone.example.contract.ExamplePresenterContract
import com.joba.barebone.example.di.MainActivityComponent
import com.joba.barebone.example.presenter.ExamplePresenter
import com.joba.barebone.example.ui.adapter.ResultsAdapter
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

/**
 * Example MainActivity
 */
class MainActivity : AppCompatActivity(), ExamplePresenterContract {

    @Inject
    lateinit var presenter: ExamplePresenter

    @Inject
    lateinit var listAdapter: ResultsAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MainActivityComponent
                .init(this)
                .inject(this)

        list.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = listAdapter
            addItemDecoration(ResultsAdapter.VerticalSpaceItemDecoration(resources.getDimensionPixelSize(R.dimen.list_vertical_spacing)))
        }

        sendButton.setOnClickListener {
            presenter.doSomeStuff(editText.text.toString())
        }
    }

    override fun onResume() {
        super.onResume()
        presenter.resume()
    }

    override fun onPause() {
        super.onPause()
        presenter.pause()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.destroy()
    }

    override fun showItem(item: String) {
        listAdapter.addItem(item)
    }
}
