/*
 *
 *  *  Copyright 2014 OrientDB LTD (info(at)orientdb.com)
 *  *
 *  *  Licensed under the Apache License, Version 2.0 (the "License");
 *  *  you may not use this file except in compliance with the License.
 *  *  You may obtain a copy of the License at
 *  *
 *  *       http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *  Unless required by applicable law or agreed to in writing, software
 *  *  distributed under the License is distributed on an "AS IS" BASIS,
 *  *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *  See the License for the specific language governing permissions and
 *  *  limitations under the License.
 *  *
 *  * For more information: http://orientdb.com
 *
 */
package com.orientechnologies.common.concur.lock;

import java.util.Collection;
import java.util.concurrent.locks.Lock;

/**
 * Lock Manager interface.
 * 
 * @author Luca Garulli
 * @since 2.2.0
 */
public interface OLockManager<T> {
  Lock acquireSharedLock(T key);

  void releaseSharedLock(T key);

  Lock acquireExclusiveLock(T key);

  void releaseExclusiveLock(T key);

  Lock[] acquireExclusiveLocksInBatch(T... values);

  void acquireExclusiveLocksInBatch(Collection<T> values);

  void lockAllExclusive();

  void unlockAllExclusive();
}
