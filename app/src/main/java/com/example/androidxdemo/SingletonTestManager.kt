package com.example.androidxdemo

/**
 * Create by 姚冰
 * on 2020/7/9
 */
class SingletonTestManager {
    interface OnDataArrivedListener {
        fun onDataArrived(data:Any)
    }

    private var listeners = mutableListOf<Any>()

    companion object {
        class SingleHolder {
            companion object{
                final val manager :SingletonTestManager = SingletonTestManager()
            }
        }

        fun getInstance() :  SingletonTestManager{
            return SingleHolder.manager
        }
    }

    fun registerListener (listener : OnDataArrivedListener) {
        listeners.add(listener)
    }

    fun unregisterListener(listener : OnDataArrivedListener)  {
        listeners.remove(listener)
    }
}