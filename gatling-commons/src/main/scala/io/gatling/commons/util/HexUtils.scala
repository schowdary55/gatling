/**
 * Copyright 2011-2016 GatlingCorp (http://gatling.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gatling.commons.util

import java.nio.ByteBuffer

object HexUtils {

  def fromHexString(hexString: String): Array[Byte] =
    hexString.grouped(2).map(Integer.parseInt(_, 16).toByte).toArray

  def toHexString(bytes: ByteBuffer): String = {
    val sb = new StringBuilder
    while (bytes.remaining > 0) {
      sb.append(f"${bytes.get()}%02X")
    }
    sb.toString
  }
}
