/*
 * Copyright 2015 JBoss Inc
 *
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
 */
package io.apiman.plugins.rates_policy;

/**
 * Configuration for the transfer quota.
 *
 * @author eric.wittmann@redhat.com
 */
public class TransferQuotaConfig extends RateLimitingConfig {

    private TransferDirectionType direction;

    /**
     * Constructor.
     */
    public TransferQuotaConfig() {
    }

    /**
     * @return the direction
     */
    public TransferDirectionType getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(TransferDirectionType direction) {
        this.direction = direction;
    }

}
