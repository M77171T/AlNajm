package com.alnajm.wallet

import com.google.ai.client.generativeai.GenerativeModel

class AlNajmAI {
    // استخدام مفتاحك الشخصي لتفعيل الذكاء
    private val apiKey = "AIzaSyDXSw9tkQktyT8UUsZPSp4MYuu_NBTiP1Q"
    private val model = GenerativeModel(
        modelName = "gemini-1.5-flash",
        apiKey = apiKey
    )

    suspend fun getAssistantReply(userQuery: String): String? {
        val response = model.generateContent(userQuery)
        return response.text
    }
}
