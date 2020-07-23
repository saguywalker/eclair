/*
 * Copyright 2020 ACINQ SAS
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package fr.acinq.eclair.db

import java.io.Closeable

import fr.acinq.eclair.blockchain.fee.FeeratesPerKB

/**
 * This database stores the fee rates retrieved by a [[fr.acinq.eclair.blockchain.fee.FeeProvider]].
 */
trait FeeratesDb extends Closeable {

  /** Insert or update the feerates into the feerates database. */
  def addOrUpdateFeerates(feeratesPerKB: FeeratesPerKB): Unit

  /** Return the (optional) feerates from the feerates database. */
  def getFeerates(): Option[FeeratesPerKB]

}