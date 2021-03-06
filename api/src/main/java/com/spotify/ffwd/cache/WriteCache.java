/*-
 * -\-\-
 * FastForward Pubsub Module
 * --
 * Copyright (C) 2016 - 2019 Spotify AB
 * --
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * -/-/-
 */

package com.spotify.ffwd.cache;

import com.spotify.ffwd.model.Metric;

public interface WriteCache {

  // Check to see if a metric is cached locally. If not present, set it.
  boolean checkCacheOrSet(final Metric metric);

  /**
   * This method doesn't have a default behavior it was added to maintain compatibility,
   * please provide an implementation that fit your use case.
   *
   * @param metric
   * @return
   */
  default boolean checkCacheOrSet(final com.spotify.ffwd.model.v2.Metric metric) {
    throw new UnsupportedOperationException("Please provide an implementation that" +
            " fit your use case");
  }
}
