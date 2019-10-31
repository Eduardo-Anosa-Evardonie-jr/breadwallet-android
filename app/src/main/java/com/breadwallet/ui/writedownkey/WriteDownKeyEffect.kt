/**
 * BreadWallet
 *
 * Created by Pablo Budelli on <pablo.budelli@breadwallet.com> 10/10/19.
 * Copyright (c) 2019 breadwallet LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.breadwallet.ui.writedownkey

import com.breadwallet.ui.navigation.OnCompleteAction

sealed class WriteDownKeyEffect {
    object GoToFaq : WriteDownKeyEffect()
    object GoToHome : WriteDownKeyEffect()
    object GoBack : WriteDownKeyEffect()
    object GoToBuy : WriteDownKeyEffect()
    object ShowAuthPrompt : WriteDownKeyEffect()
    object GetPhrase : WriteDownKeyEffect()

    data class GoToPaperKey(
        val phrase: List<String>,
        val onComplete: OnCompleteAction
    ) : WriteDownKeyEffect() {
        override fun toString() = "GoToPaperKey()"
    }
}