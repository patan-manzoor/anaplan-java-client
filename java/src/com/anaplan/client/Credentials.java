//   Copyright 2011 Anaplan Inc.
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.

package com.anaplan.client;

/**
 * Credentials for accessing the Anaplan API service.
 */
public final class Credentials {
    /**
      * Represents an authentication method.
      * @deprecated Ignored; will be removed in a future release
      */
    @Deprecated
    public static enum Scheme {
        BASIC
    };
    private final String userName;
    private final String passphrase;
    private final String domain;
    private final String workstation;
    /**
     * Create user/passphrase credentials for service authentication, or
     * simple/digest proxy authentication.
     * 
     * @param userName
     *            The user name (e-mail address) for the authenticating user
     * @param passphrase
     *            The passphrase for the authenticating user
     */
    public Credentials(String userName, String passphrase) {
        this.userName = userName;
        this.passphrase = passphrase;
        domain = workstation = null;
    }

    /**
     * Create user/passphrase credentials for NTLM proxy authentication.
     * This form is only used when accessing the service through a proxy using
     * the NTLM scheme.
     * @param userName
     *            The user name (e-mail address) for the authenticating user
     * @param passphrase
     *            The passphrase for the authenticating user
     * @param domain
     *            The domain to be authenticated against
     * @param workstation
     *            The name of the workstation
     * @since 1.3.1
     */
    public Credentials(String userName, String passphrase, String domain, String workstation) {
        this.userName = userName;
        this.passphrase = passphrase;
        this.domain = domain;
        this.workstation = workstation;
    }

    /**
      * Get the authentication method.
      * @deprecated Will be removed in a future release
      */
    @Deprecated
    public Scheme getScheme() {
        return Scheme.BASIC;
    }
    /**
      * Get the user name.
      */
    public String getUserName() {
        return userName;
    }
    /**
      * Get the passphrase.
      */
    public String getPassphrase() {
        return passphrase;
    }
    /**
      * Get the domain. This is only used when accessing the service through a
      * proxy using the NTLM scheme.
      * @since 1.3.1
      */
    public String getDomain() {
        return domain;
    }
    /**
      * Get the workstation name. This is only used when accessing the service
      * through a proxy using the NTLM scheme.
      * @since 1.3.1
      */
    public String getWorkstation() {
        return workstation;
    }
}
