package com.infinityy.taskworkmanager.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel

import kotlinx.coroutines.launch
import com.infinityy.taskworkmanager.db.WorkListEntity
import com.infinityy.taskworkmanager.repository.WorkRepoImpl
import javax.inject.Inject


@HiltViewModel
class WorkViewModel @Inject constructor(val workRepo: WorkRepoImpl):ViewModel(){



     lateinit var userList: LiveData< List<WorkListEntity>>


    fun addWork(work: WorkListEntity){

        viewModelScope.launch {
           workRepo.addToList(work)
        }
    }
 fun updateData(work: WorkListEntity){

        viewModelScope.launch {
            workRepo.updateList(work)
        }
    }
    fun deleteData(work: WorkListEntity){

        viewModelScope.launch {
            workRepo.deleteData(work)
        }
    }
    fun deleteAllData(){

        viewModelScope.launch {
            workRepo.deleteAllData()
        }
    }
    val getData: LiveData<List<WorkListEntity>>
        get()=workRepo.userData

    fun getUserList(){
        viewModelScope.launch {
            userList=workRepo.getUserList()
        }
    }
}