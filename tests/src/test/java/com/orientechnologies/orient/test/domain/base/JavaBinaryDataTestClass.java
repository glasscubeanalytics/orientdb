/*
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
package com.orientechnologies.orient.test.domain.base;

import javax.persistence.Basic;
import javax.persistence.Id;
import javax.persistence.Version;

/** @author diegomtassis <a href="mailto:dta@compart.com">Diego Martin Tassis</a> */
public class JavaBinaryDataTestClass {
  @Id private Object id;
  @Version private Object version;

  @Basic private byte[] binaryData;

  public Object getId() {
    return id;
  }

  public void setId(Object id) {
    this.id = id;
  }

  public Object getVersion() {
    return version;
  }

  public void setVersion(Object version) {
    this.version = version;
  }

  public byte[] getBinaryData() {
    return binaryData;
  }

  public void setBinaryData(byte[] binaryData) {
    this.binaryData = binaryData;
  }
}
