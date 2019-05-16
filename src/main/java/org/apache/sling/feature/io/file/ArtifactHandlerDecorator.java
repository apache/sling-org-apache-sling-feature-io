/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.apache.sling.feature.io.file;

import java.io.File;
import java.net.URL;

class ArtifactHandlerDecorator extends ArtifactHandler
{
    private final ArtifactHandler file;

    /**
     * Create a new handler.
     *
     * @param url  The url of the artifact
     * @param file The file for the artifact
     */
    public ArtifactHandlerDecorator(String url, ArtifactHandler file)
    {
        super(url, null);
        this.file = file;
    }

    @Override
    public File getFile()
    {
        return this.file.getFile();
    }

    @Override
    public URL getLocalURL()
    {
        return this.file.getLocalURL();
    }
}
