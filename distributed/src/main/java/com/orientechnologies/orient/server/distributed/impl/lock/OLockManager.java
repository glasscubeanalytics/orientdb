package com.orientechnologies.orient.server.distributed.impl.lock;

import com.orientechnologies.common.util.OPair;
import com.orientechnologies.orient.core.id.ORID;
import com.orientechnologies.orient.core.tx.OTransactionId;
import java.util.List;
import java.util.SortedSet;

public interface OLockManager {

  void lock(
      SortedSet<ORID> rids,
      SortedSet<OPair<String, Object>> indexKeys,
      OTransactionId txId,
      OnLocksAcquired acquired);

  void unlock(List<OLockGuard> guards);

  void lockResource(String name, OnLocksAcquired acquired);
}
