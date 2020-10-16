// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.cloud.spanner.pgadapter.metadata;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ConnectionMetadata {

  private final DataInputStream inputStream;
  private final DataOutputStream outputStream;

  public ConnectionMetadata(DataInputStream input, DataOutputStream output) {
    this.inputStream = input;
    this.outputStream = output;
  }

  public DataInputStream getInputStream() {
    return inputStream;
  }

  public DataOutputStream getOutputStream() {
    return outputStream;
  }
}
