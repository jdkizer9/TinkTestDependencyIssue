package org.thecommonsproject.android.tinktest

import com.google.crypto.tink.KeysetHandle
import com.google.crypto.tink.config.TinkConfig
import com.google.crypto.tink.signature.SignatureKeyTemplates
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class TinkTest {

    @Before
    fun configureTink() {
        TinkConfig.register()
    }


    @Test
    fun addition_isCorrect() {
        Assert.assertEquals(4, 2 + 2)
    }

    @Test
    fun createKey() {
        val signingPrivateKeysetHandle = KeysetHandle.generateNew(
            SignatureKeyTemplates.ECDSA_P256
        )
    }
}