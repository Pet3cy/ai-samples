/*
 * Copyright 2025 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.ai.samples.geminivideometadatacreation.ui

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import com.android.ai.samples.geminivideometadatacreation.R

/**
 * Composable function that displays text.
 *
 * This function renders the generated text, providing a styled display within a scrollable container.
 */
@Composable
fun OutputTextDisplay(outputText: String, modifier: Modifier = Modifier) {
    Text(
        text = stringResource(
            R.string.output_text_combined,
            stringResource(R.string.output_text_generated_placeholder),
            outputText,
        ),
        fontStyle = FontStyle.Italic,
        modifier = modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState()),
        style = MaterialTheme.typography.labelLarge,
    )
}
