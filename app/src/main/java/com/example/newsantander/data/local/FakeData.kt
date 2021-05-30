package com.example.newsantander.data.local

import com.example.newsantander.data.Cartao
import com.example.newsantander.data.Cliente
import com.example.newsantander.data.Conta

class FakeData {

    fun getLocalData(): Conta {
        val cliente = Cliente("João")
        val cartao = Cartao("9999")
        return Conta(
            "121558-5",
            "1233-5",
            "R$ 12.456,36",
            "R$ 5.000,00",
            cliente,
            cartao
        )
    }
}