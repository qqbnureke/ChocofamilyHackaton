package com.example.chocofamilyhackaton.pojo

data class TransactionHistoryModel(
        val branchName: String,
        val transactionDate: String,
        val transactionTime: String,
        val checkCode: String,
        val price: String,
        val address: String,
        var isExpanded: Boolean
)