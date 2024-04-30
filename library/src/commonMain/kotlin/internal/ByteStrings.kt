/*
 * Copyright 2024 Google LLC
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

package me.zhanghai.kotlin.filesystem.internal

import kotlinx.io.bytestring.ByteString
import kotlinx.io.bytestring.indexOf

internal inline operator fun ByteString.contains(byte: Byte): Boolean = indexOf(byte) != -1

internal inline fun ByteString.first(): Byte = this[0]

internal inline fun ByteString.last(): Byte = this[lastIndex]

internal val ByteString.lastIndex: Int
    inline get() = size - 1