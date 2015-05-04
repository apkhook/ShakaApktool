/**
 *  Copyright 2015 Rover12421 <rover12421@163.com>
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.rover12421.shaka.apktool.util;

/**
 * Created by rover12421 on 12/29/13.
 */
public class ShakaRuntimeException extends RuntimeException {
    public ShakaRuntimeException(Throwable cause) {
        super(cause);
    }

    public ShakaRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ShakaRuntimeException(String message) {
        super(message);
    }

    public ShakaRuntimeException() {
    }
}