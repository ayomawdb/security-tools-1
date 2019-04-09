/*
 *  Copyright (c) 2019, WSO2 Inc., WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 *
 */

package org.wso2.security.tools.scanmanager.scanners.common.exception;

/**
 * Wrapper for scanner related exceptions.
 */
public class ScannerException extends Exception {

    /**
     * Constructor to create a new ScannerException with the specified detail message.
     *
     * @param string The detail message of the exception.
     */
    public ScannerException(String string) {
        super(string);
    }

    /**
     * Constructor to create a new exception with the specified detail message and cause.
     *
     * @param message The detail message of the exception.
     * @param e       The cause of the exceptionl.
     */
    public ScannerException(String message, Throwable e) {
        super(message, e);
    }
}
