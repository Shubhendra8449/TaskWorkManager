package com.infinityy.taskworkmanager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.infinityy.taskworkmanager.databinding.ActivityWorkDetailsBinding
import com.infinityy.taskworkmanager.work.NotifyWork.Companion.TASK_DESC
import com.infinityy.taskworkmanager.work.NotifyWork.Companion.TASK_TITLE

class WorkDetailsActivity : AppCompatActivity() {


    private lateinit var binding: ActivityWorkDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWorkDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.text=intent.getStringExtra(TASK_TITLE)
        binding.des.text=intent.getStringExtra(TASK_DESC)

    }


}