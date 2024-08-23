/*
 * MIT License
 *
 * Copyright (c) 2022 Rahul Rana
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

package exception;

/**
 * Common Framework specific Error.
 *
 * @author Rahul Rana
 * @since 17-Feb-2022
 */
public class FrameworkError extends Error {
    /**
     * Framework Error with only message.
     *
     * @param message Error message
     */
    public FrameworkError (final String message) {
        super (message);
    }

    /**
     * Framework Error with message and cause.
     *
     * @param message Error message
     * @param cause Error cause
     */
    public FrameworkError (final String message, final Throwable cause) {
        super (message, cause);
    }
}