/*
 * (C) Copyright IBM Corp. 2020.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.assistant.v1.model;

/** An object that describes a response with response type `pause`. */
public class DialogNodeOutputGenericDialogNodeOutputResponseTypePause
    extends DialogNodeOutputGeneric {

  /**
   * The type of response returned by the dialog node. The specified response type must be supported
   * by the client application or channel.
   */
  public interface ResponseType {
    /** pause. */
    String PAUSE = "pause";
  }

  /** Builder. */
  public static class Builder {
    private String responseType;
    private Long time;
    private Boolean typing;

    public Builder(
        DialogNodeOutputGeneric dialogNodeOutputGenericDialogNodeOutputResponseTypePause) {
      this.responseType = dialogNodeOutputGenericDialogNodeOutputResponseTypePause.responseType;
      this.time = dialogNodeOutputGenericDialogNodeOutputResponseTypePause.time;
      this.typing = dialogNodeOutputGenericDialogNodeOutputResponseTypePause.typing;
    }

    /** Instantiates a new builder. */
    public Builder() {}

    /**
     * Instantiates a new builder with required properties.
     *
     * @param responseType the responseType
     * @param time the time
     */
    public Builder(String responseType, Long time) {
      this.responseType = responseType;
      this.time = time;
    }

    /**
     * Builds a DialogNodeOutputGenericDialogNodeOutputResponseTypePause.
     *
     * @return the new DialogNodeOutputGenericDialogNodeOutputResponseTypePause instance
     */
    public DialogNodeOutputGenericDialogNodeOutputResponseTypePause build() {
      return new DialogNodeOutputGenericDialogNodeOutputResponseTypePause(this);
    }

    /**
     * Set the responseType.
     *
     * @param responseType the responseType
     * @return the DialogNodeOutputGenericDialogNodeOutputResponseTypePause builder
     */
    public Builder responseType(String responseType) {
      this.responseType = responseType;
      return this;
    }

    /**
     * Set the time.
     *
     * @param time the time
     * @return the DialogNodeOutputGenericDialogNodeOutputResponseTypePause builder
     */
    public Builder time(long time) {
      this.time = time;
      return this;
    }

    /**
     * Set the typing.
     *
     * @param typing the typing
     * @return the DialogNodeOutputGenericDialogNodeOutputResponseTypePause builder
     */
    public Builder typing(Boolean typing) {
      this.typing = typing;
      return this;
    }
  }

  protected DialogNodeOutputGenericDialogNodeOutputResponseTypePause(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(
        builder.responseType, "responseType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.time, "time cannot be null");
    responseType = builder.responseType;
    time = builder.time;
    typing = builder.typing;
  }

  /**
   * New builder.
   *
   * @return a DialogNodeOutputGenericDialogNodeOutputResponseTypePause builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}
