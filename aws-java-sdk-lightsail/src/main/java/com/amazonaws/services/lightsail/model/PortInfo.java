/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes ports to open on an instance, the IP addresses allowed to connect to the instance through the ports, and
 * the protocol.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/PortInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PortInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The first port in a range of open ports on an instance.
     * </p>
     * <p>
     * Allowed ports:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TCP and UDP - <code>0</code> to <code>65535</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ICMP - <code>8</code> (to configure Ping)
     * </p>
     * <note>
     * <p>
     * Ping is the only communication supported through the ICMP protocol in Lightsail. To configure ping, specify the
     * <code>fromPort</code> parameter as <code>8</code>, and the <code>toPort</code> parameter as <code>-1</code>.
     * </p>
     * </note></li>
     * </ul>
     */
    private Integer fromPort;
    /**
     * <p>
     * The last port in a range of open ports on an instance.
     * </p>
     * <p>
     * Allowed ports:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TCP and UDP - <code>0</code> to <code>65535</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ICMP - <code>-1</code> (to configure Ping)
     * </p>
     * <note>
     * <p>
     * Ping is the only communication supported through the ICMP protocol in Lightsail. To configure ping, specify the
     * <code>fromPort</code> parameter as <code>8</code>, and the <code>toPort</code> parameter as <code>-1</code>.
     * </p>
     * </note></li>
     * </ul>
     */
    private Integer toPort;
    /**
     * <p>
     * The IP protocol name.
     * </p>
     * <p>
     * The name can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tcp</code> - Transmission Control Protocol (TCP) provides reliable, ordered, and error-checked delivery of
     * streamed data between applications running on hosts communicating by an IP network. If you have an application
     * that doesn't require reliable data stream service, use UDP instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>all</code> - All transport layer protocol types. For more general information, see <a
     * href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a> on <i>Wikipedia</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>udp</code> - With User Datagram Protocol (UDP), computer applications can send messages (or datagrams) to
     * other hosts on an Internet Protocol (IP) network. Prior communications are not required to set up transmission
     * channels or data paths. Applications that don't require reliable data stream service can use UDP, which provides
     * a connectionless datagram service that emphasizes reduced latency over reliability. If you do require reliable
     * data stream service, use TCP instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>icmp</code> - Internet Control Message Protocol (ICMP) is used to send error messages and operational
     * information indicating success or failure when communicating with an instance. For example, an error is indicated
     * when an instance could not be reached.
     * </p>
     * <note>
     * <p>
     * Ping is the only communication supported through the ICMP protocol in Lightsail. To configure ping, specify the
     * <code>fromPort</code> parameter as <code>8</code>, and the <code>toPort</code> parameter as <code>-1</code>.
     * </p>
     * </note></li>
     * </ul>
     */
    private String protocol;
    /**
     * <p>
     * The IP address, or range of IP addresses in CIDR notation, that are allowed to connect to an instance through the
     * ports, and the protocol. Lightsail supports IPv4 addresses.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To allow the IP address <code>192.0.2.44</code>, specify <code>192.0.2.44</code> or <code>192.0.2.44/32</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To allow the IP addresses <code>192.0.2.0</code> to <code>192.0.2.255</code>, specify <code>192.0.2.0/24</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CIDR block notation, see <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation">Classless Inter-Domain
     * Routing</a> on <i>Wikipedia</i>.
     * </p>
     */
    private java.util.List<String> cidrs;
    /**
     * <p>
     * An alias that defines access for a preconfigured range of IP addresses.
     * </p>
     * <p>
     * The only alias currently supported is <code>lightsail-connect</code>, which allows IP addresses of the
     * browser-based RDP/SSH client in the Lightsail console to connect to your instance.
     * </p>
     */
    private java.util.List<String> cidrListAliases;

    /**
     * <p>
     * The first port in a range of open ports on an instance.
     * </p>
     * <p>
     * Allowed ports:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TCP and UDP - <code>0</code> to <code>65535</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ICMP - <code>8</code> (to configure Ping)
     * </p>
     * <note>
     * <p>
     * Ping is the only communication supported through the ICMP protocol in Lightsail. To configure ping, specify the
     * <code>fromPort</code> parameter as <code>8</code>, and the <code>toPort</code> parameter as <code>-1</code>.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param fromPort
     *        The first port in a range of open ports on an instance.</p>
     *        <p>
     *        Allowed ports:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        TCP and UDP - <code>0</code> to <code>65535</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ICMP - <code>8</code> (to configure Ping)
     *        </p>
     *        <note>
     *        <p>
     *        Ping is the only communication supported through the ICMP protocol in Lightsail. To configure ping,
     *        specify the <code>fromPort</code> parameter as <code>8</code>, and the <code>toPort</code> parameter as
     *        <code>-1</code>.
     *        </p>
     *        </note></li>
     */

    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    /**
     * <p>
     * The first port in a range of open ports on an instance.
     * </p>
     * <p>
     * Allowed ports:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TCP and UDP - <code>0</code> to <code>65535</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ICMP - <code>8</code> (to configure Ping)
     * </p>
     * <note>
     * <p>
     * Ping is the only communication supported through the ICMP protocol in Lightsail. To configure ping, specify the
     * <code>fromPort</code> parameter as <code>8</code>, and the <code>toPort</code> parameter as <code>-1</code>.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @return The first port in a range of open ports on an instance.</p>
     *         <p>
     *         Allowed ports:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         TCP and UDP - <code>0</code> to <code>65535</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ICMP - <code>8</code> (to configure Ping)
     *         </p>
     *         <note>
     *         <p>
     *         Ping is the only communication supported through the ICMP protocol in Lightsail. To configure ping,
     *         specify the <code>fromPort</code> parameter as <code>8</code>, and the <code>toPort</code> parameter as
     *         <code>-1</code>.
     *         </p>
     *         </note></li>
     */

    public Integer getFromPort() {
        return this.fromPort;
    }

    /**
     * <p>
     * The first port in a range of open ports on an instance.
     * </p>
     * <p>
     * Allowed ports:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TCP and UDP - <code>0</code> to <code>65535</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ICMP - <code>8</code> (to configure Ping)
     * </p>
     * <note>
     * <p>
     * Ping is the only communication supported through the ICMP protocol in Lightsail. To configure ping, specify the
     * <code>fromPort</code> parameter as <code>8</code>, and the <code>toPort</code> parameter as <code>-1</code>.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param fromPort
     *        The first port in a range of open ports on an instance.</p>
     *        <p>
     *        Allowed ports:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        TCP and UDP - <code>0</code> to <code>65535</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ICMP - <code>8</code> (to configure Ping)
     *        </p>
     *        <note>
     *        <p>
     *        Ping is the only communication supported through the ICMP protocol in Lightsail. To configure ping,
     *        specify the <code>fromPort</code> parameter as <code>8</code>, and the <code>toPort</code> parameter as
     *        <code>-1</code>.
     *        </p>
     *        </note></li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortInfo withFromPort(Integer fromPort) {
        setFromPort(fromPort);
        return this;
    }

    /**
     * <p>
     * The last port in a range of open ports on an instance.
     * </p>
     * <p>
     * Allowed ports:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TCP and UDP - <code>0</code> to <code>65535</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ICMP - <code>-1</code> (to configure Ping)
     * </p>
     * <note>
     * <p>
     * Ping is the only communication supported through the ICMP protocol in Lightsail. To configure ping, specify the
     * <code>fromPort</code> parameter as <code>8</code>, and the <code>toPort</code> parameter as <code>-1</code>.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param toPort
     *        The last port in a range of open ports on an instance.</p>
     *        <p>
     *        Allowed ports:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        TCP and UDP - <code>0</code> to <code>65535</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ICMP - <code>-1</code> (to configure Ping)
     *        </p>
     *        <note>
     *        <p>
     *        Ping is the only communication supported through the ICMP protocol in Lightsail. To configure ping,
     *        specify the <code>fromPort</code> parameter as <code>8</code>, and the <code>toPort</code> parameter as
     *        <code>-1</code>.
     *        </p>
     *        </note></li>
     */

    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    /**
     * <p>
     * The last port in a range of open ports on an instance.
     * </p>
     * <p>
     * Allowed ports:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TCP and UDP - <code>0</code> to <code>65535</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ICMP - <code>-1</code> (to configure Ping)
     * </p>
     * <note>
     * <p>
     * Ping is the only communication supported through the ICMP protocol in Lightsail. To configure ping, specify the
     * <code>fromPort</code> parameter as <code>8</code>, and the <code>toPort</code> parameter as <code>-1</code>.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @return The last port in a range of open ports on an instance.</p>
     *         <p>
     *         Allowed ports:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         TCP and UDP - <code>0</code> to <code>65535</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ICMP - <code>-1</code> (to configure Ping)
     *         </p>
     *         <note>
     *         <p>
     *         Ping is the only communication supported through the ICMP protocol in Lightsail. To configure ping,
     *         specify the <code>fromPort</code> parameter as <code>8</code>, and the <code>toPort</code> parameter as
     *         <code>-1</code>.
     *         </p>
     *         </note></li>
     */

    public Integer getToPort() {
        return this.toPort;
    }

    /**
     * <p>
     * The last port in a range of open ports on an instance.
     * </p>
     * <p>
     * Allowed ports:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TCP and UDP - <code>0</code> to <code>65535</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ICMP - <code>-1</code> (to configure Ping)
     * </p>
     * <note>
     * <p>
     * Ping is the only communication supported through the ICMP protocol in Lightsail. To configure ping, specify the
     * <code>fromPort</code> parameter as <code>8</code>, and the <code>toPort</code> parameter as <code>-1</code>.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param toPort
     *        The last port in a range of open ports on an instance.</p>
     *        <p>
     *        Allowed ports:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        TCP and UDP - <code>0</code> to <code>65535</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ICMP - <code>-1</code> (to configure Ping)
     *        </p>
     *        <note>
     *        <p>
     *        Ping is the only communication supported through the ICMP protocol in Lightsail. To configure ping,
     *        specify the <code>fromPort</code> parameter as <code>8</code>, and the <code>toPort</code> parameter as
     *        <code>-1</code>.
     *        </p>
     *        </note></li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortInfo withToPort(Integer toPort) {
        setToPort(toPort);
        return this;
    }

    /**
     * <p>
     * The IP protocol name.
     * </p>
     * <p>
     * The name can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tcp</code> - Transmission Control Protocol (TCP) provides reliable, ordered, and error-checked delivery of
     * streamed data between applications running on hosts communicating by an IP network. If you have an application
     * that doesn't require reliable data stream service, use UDP instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>all</code> - All transport layer protocol types. For more general information, see <a
     * href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a> on <i>Wikipedia</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>udp</code> - With User Datagram Protocol (UDP), computer applications can send messages (or datagrams) to
     * other hosts on an Internet Protocol (IP) network. Prior communications are not required to set up transmission
     * channels or data paths. Applications that don't require reliable data stream service can use UDP, which provides
     * a connectionless datagram service that emphasizes reduced latency over reliability. If you do require reliable
     * data stream service, use TCP instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>icmp</code> - Internet Control Message Protocol (ICMP) is used to send error messages and operational
     * information indicating success or failure when communicating with an instance. For example, an error is indicated
     * when an instance could not be reached.
     * </p>
     * <note>
     * <p>
     * Ping is the only communication supported through the ICMP protocol in Lightsail. To configure ping, specify the
     * <code>fromPort</code> parameter as <code>8</code>, and the <code>toPort</code> parameter as <code>-1</code>.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param protocol
     *        The IP protocol name.</p>
     *        <p>
     *        The name can be one of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>tcp</code> - Transmission Control Protocol (TCP) provides reliable, ordered, and error-checked
     *        delivery of streamed data between applications running on hosts communicating by an IP network. If you
     *        have an application that doesn't require reliable data stream service, use UDP instead.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>all</code> - All transport layer protocol types. For more general information, see <a
     *        href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a> on <i>Wikipedia</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>udp</code> - With User Datagram Protocol (UDP), computer applications can send messages (or
     *        datagrams) to other hosts on an Internet Protocol (IP) network. Prior communications are not required to
     *        set up transmission channels or data paths. Applications that don't require reliable data stream service
     *        can use UDP, which provides a connectionless datagram service that emphasizes reduced latency over
     *        reliability. If you do require reliable data stream service, use TCP instead.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>icmp</code> - Internet Control Message Protocol (ICMP) is used to send error messages and
     *        operational information indicating success or failure when communicating with an instance. For example, an
     *        error is indicated when an instance could not be reached.
     *        </p>
     *        <note>
     *        <p>
     *        Ping is the only communication supported through the ICMP protocol in Lightsail. To configure ping,
     *        specify the <code>fromPort</code> parameter as <code>8</code>, and the <code>toPort</code> parameter as
     *        <code>-1</code>.
     *        </p>
     *        </note></li>
     * @see NetworkProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The IP protocol name.
     * </p>
     * <p>
     * The name can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tcp</code> - Transmission Control Protocol (TCP) provides reliable, ordered, and error-checked delivery of
     * streamed data between applications running on hosts communicating by an IP network. If you have an application
     * that doesn't require reliable data stream service, use UDP instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>all</code> - All transport layer protocol types. For more general information, see <a
     * href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a> on <i>Wikipedia</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>udp</code> - With User Datagram Protocol (UDP), computer applications can send messages (or datagrams) to
     * other hosts on an Internet Protocol (IP) network. Prior communications are not required to set up transmission
     * channels or data paths. Applications that don't require reliable data stream service can use UDP, which provides
     * a connectionless datagram service that emphasizes reduced latency over reliability. If you do require reliable
     * data stream service, use TCP instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>icmp</code> - Internet Control Message Protocol (ICMP) is used to send error messages and operational
     * information indicating success or failure when communicating with an instance. For example, an error is indicated
     * when an instance could not be reached.
     * </p>
     * <note>
     * <p>
     * Ping is the only communication supported through the ICMP protocol in Lightsail. To configure ping, specify the
     * <code>fromPort</code> parameter as <code>8</code>, and the <code>toPort</code> parameter as <code>-1</code>.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @return The IP protocol name.</p>
     *         <p>
     *         The name can be one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>tcp</code> - Transmission Control Protocol (TCP) provides reliable, ordered, and error-checked
     *         delivery of streamed data between applications running on hosts communicating by an IP network. If you
     *         have an application that doesn't require reliable data stream service, use UDP instead.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>all</code> - All transport layer protocol types. For more general information, see <a
     *         href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a> on <i>Wikipedia</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>udp</code> - With User Datagram Protocol (UDP), computer applications can send messages (or
     *         datagrams) to other hosts on an Internet Protocol (IP) network. Prior communications are not required to
     *         set up transmission channels or data paths. Applications that don't require reliable data stream service
     *         can use UDP, which provides a connectionless datagram service that emphasizes reduced latency over
     *         reliability. If you do require reliable data stream service, use TCP instead.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>icmp</code> - Internet Control Message Protocol (ICMP) is used to send error messages and
     *         operational information indicating success or failure when communicating with an instance. For example,
     *         an error is indicated when an instance could not be reached.
     *         </p>
     *         <note>
     *         <p>
     *         Ping is the only communication supported through the ICMP protocol in Lightsail. To configure ping,
     *         specify the <code>fromPort</code> parameter as <code>8</code>, and the <code>toPort</code> parameter as
     *         <code>-1</code>.
     *         </p>
     *         </note></li>
     * @see NetworkProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The IP protocol name.
     * </p>
     * <p>
     * The name can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tcp</code> - Transmission Control Protocol (TCP) provides reliable, ordered, and error-checked delivery of
     * streamed data between applications running on hosts communicating by an IP network. If you have an application
     * that doesn't require reliable data stream service, use UDP instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>all</code> - All transport layer protocol types. For more general information, see <a
     * href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a> on <i>Wikipedia</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>udp</code> - With User Datagram Protocol (UDP), computer applications can send messages (or datagrams) to
     * other hosts on an Internet Protocol (IP) network. Prior communications are not required to set up transmission
     * channels or data paths. Applications that don't require reliable data stream service can use UDP, which provides
     * a connectionless datagram service that emphasizes reduced latency over reliability. If you do require reliable
     * data stream service, use TCP instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>icmp</code> - Internet Control Message Protocol (ICMP) is used to send error messages and operational
     * information indicating success or failure when communicating with an instance. For example, an error is indicated
     * when an instance could not be reached.
     * </p>
     * <note>
     * <p>
     * Ping is the only communication supported through the ICMP protocol in Lightsail. To configure ping, specify the
     * <code>fromPort</code> parameter as <code>8</code>, and the <code>toPort</code> parameter as <code>-1</code>.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param protocol
     *        The IP protocol name.</p>
     *        <p>
     *        The name can be one of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>tcp</code> - Transmission Control Protocol (TCP) provides reliable, ordered, and error-checked
     *        delivery of streamed data between applications running on hosts communicating by an IP network. If you
     *        have an application that doesn't require reliable data stream service, use UDP instead.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>all</code> - All transport layer protocol types. For more general information, see <a
     *        href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a> on <i>Wikipedia</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>udp</code> - With User Datagram Protocol (UDP), computer applications can send messages (or
     *        datagrams) to other hosts on an Internet Protocol (IP) network. Prior communications are not required to
     *        set up transmission channels or data paths. Applications that don't require reliable data stream service
     *        can use UDP, which provides a connectionless datagram service that emphasizes reduced latency over
     *        reliability. If you do require reliable data stream service, use TCP instead.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>icmp</code> - Internet Control Message Protocol (ICMP) is used to send error messages and
     *        operational information indicating success or failure when communicating with an instance. For example, an
     *        error is indicated when an instance could not be reached.
     *        </p>
     *        <note>
     *        <p>
     *        Ping is the only communication supported through the ICMP protocol in Lightsail. To configure ping,
     *        specify the <code>fromPort</code> parameter as <code>8</code>, and the <code>toPort</code> parameter as
     *        <code>-1</code>.
     *        </p>
     *        </note></li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkProtocol
     */

    public PortInfo withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The IP protocol name.
     * </p>
     * <p>
     * The name can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tcp</code> - Transmission Control Protocol (TCP) provides reliable, ordered, and error-checked delivery of
     * streamed data between applications running on hosts communicating by an IP network. If you have an application
     * that doesn't require reliable data stream service, use UDP instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>all</code> - All transport layer protocol types. For more general information, see <a
     * href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a> on <i>Wikipedia</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>udp</code> - With User Datagram Protocol (UDP), computer applications can send messages (or datagrams) to
     * other hosts on an Internet Protocol (IP) network. Prior communications are not required to set up transmission
     * channels or data paths. Applications that don't require reliable data stream service can use UDP, which provides
     * a connectionless datagram service that emphasizes reduced latency over reliability. If you do require reliable
     * data stream service, use TCP instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>icmp</code> - Internet Control Message Protocol (ICMP) is used to send error messages and operational
     * information indicating success or failure when communicating with an instance. For example, an error is indicated
     * when an instance could not be reached.
     * </p>
     * <note>
     * <p>
     * Ping is the only communication supported through the ICMP protocol in Lightsail. To configure ping, specify the
     * <code>fromPort</code> parameter as <code>8</code>, and the <code>toPort</code> parameter as <code>-1</code>.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param protocol
     *        The IP protocol name.</p>
     *        <p>
     *        The name can be one of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>tcp</code> - Transmission Control Protocol (TCP) provides reliable, ordered, and error-checked
     *        delivery of streamed data between applications running on hosts communicating by an IP network. If you
     *        have an application that doesn't require reliable data stream service, use UDP instead.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>all</code> - All transport layer protocol types. For more general information, see <a
     *        href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a> on <i>Wikipedia</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>udp</code> - With User Datagram Protocol (UDP), computer applications can send messages (or
     *        datagrams) to other hosts on an Internet Protocol (IP) network. Prior communications are not required to
     *        set up transmission channels or data paths. Applications that don't require reliable data stream service
     *        can use UDP, which provides a connectionless datagram service that emphasizes reduced latency over
     *        reliability. If you do require reliable data stream service, use TCP instead.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>icmp</code> - Internet Control Message Protocol (ICMP) is used to send error messages and
     *        operational information indicating success or failure when communicating with an instance. For example, an
     *        error is indicated when an instance could not be reached.
     *        </p>
     *        <note>
     *        <p>
     *        Ping is the only communication supported through the ICMP protocol in Lightsail. To configure ping,
     *        specify the <code>fromPort</code> parameter as <code>8</code>, and the <code>toPort</code> parameter as
     *        <code>-1</code>.
     *        </p>
     *        </note></li>
     * @see NetworkProtocol
     */

    public void setProtocol(NetworkProtocol protocol) {
        withProtocol(protocol);
    }

    /**
     * <p>
     * The IP protocol name.
     * </p>
     * <p>
     * The name can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tcp</code> - Transmission Control Protocol (TCP) provides reliable, ordered, and error-checked delivery of
     * streamed data between applications running on hosts communicating by an IP network. If you have an application
     * that doesn't require reliable data stream service, use UDP instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>all</code> - All transport layer protocol types. For more general information, see <a
     * href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a> on <i>Wikipedia</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>udp</code> - With User Datagram Protocol (UDP), computer applications can send messages (or datagrams) to
     * other hosts on an Internet Protocol (IP) network. Prior communications are not required to set up transmission
     * channels or data paths. Applications that don't require reliable data stream service can use UDP, which provides
     * a connectionless datagram service that emphasizes reduced latency over reliability. If you do require reliable
     * data stream service, use TCP instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>icmp</code> - Internet Control Message Protocol (ICMP) is used to send error messages and operational
     * information indicating success or failure when communicating with an instance. For example, an error is indicated
     * when an instance could not be reached.
     * </p>
     * <note>
     * <p>
     * Ping is the only communication supported through the ICMP protocol in Lightsail. To configure ping, specify the
     * <code>fromPort</code> parameter as <code>8</code>, and the <code>toPort</code> parameter as <code>-1</code>.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param protocol
     *        The IP protocol name.</p>
     *        <p>
     *        The name can be one of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>tcp</code> - Transmission Control Protocol (TCP) provides reliable, ordered, and error-checked
     *        delivery of streamed data between applications running on hosts communicating by an IP network. If you
     *        have an application that doesn't require reliable data stream service, use UDP instead.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>all</code> - All transport layer protocol types. For more general information, see <a
     *        href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a> on <i>Wikipedia</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>udp</code> - With User Datagram Protocol (UDP), computer applications can send messages (or
     *        datagrams) to other hosts on an Internet Protocol (IP) network. Prior communications are not required to
     *        set up transmission channels or data paths. Applications that don't require reliable data stream service
     *        can use UDP, which provides a connectionless datagram service that emphasizes reduced latency over
     *        reliability. If you do require reliable data stream service, use TCP instead.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>icmp</code> - Internet Control Message Protocol (ICMP) is used to send error messages and
     *        operational information indicating success or failure when communicating with an instance. For example, an
     *        error is indicated when an instance could not be reached.
     *        </p>
     *        <note>
     *        <p>
     *        Ping is the only communication supported through the ICMP protocol in Lightsail. To configure ping,
     *        specify the <code>fromPort</code> parameter as <code>8</code>, and the <code>toPort</code> parameter as
     *        <code>-1</code>.
     *        </p>
     *        </note></li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkProtocol
     */

    public PortInfo withProtocol(NetworkProtocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The IP address, or range of IP addresses in CIDR notation, that are allowed to connect to an instance through the
     * ports, and the protocol. Lightsail supports IPv4 addresses.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To allow the IP address <code>192.0.2.44</code>, specify <code>192.0.2.44</code> or <code>192.0.2.44/32</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To allow the IP addresses <code>192.0.2.0</code> to <code>192.0.2.255</code>, specify <code>192.0.2.0/24</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CIDR block notation, see <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation">Classless Inter-Domain
     * Routing</a> on <i>Wikipedia</i>.
     * </p>
     * 
     * @return The IP address, or range of IP addresses in CIDR notation, that are allowed to connect to an instance
     *         through the ports, and the protocol. Lightsail supports IPv4 addresses.</p>
     *         <p>
     *         Examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         To allow the IP address <code>192.0.2.44</code>, specify <code>192.0.2.44</code> or
     *         <code>192.0.2.44/32</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To allow the IP addresses <code>192.0.2.0</code> to <code>192.0.2.255</code>, specify
     *         <code>192.0.2.0/24</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about CIDR block notation, see <a
     *         href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation">Classless Inter-Domain
     *         Routing</a> on <i>Wikipedia</i>.
     */

    public java.util.List<String> getCidrs() {
        return cidrs;
    }

    /**
     * <p>
     * The IP address, or range of IP addresses in CIDR notation, that are allowed to connect to an instance through the
     * ports, and the protocol. Lightsail supports IPv4 addresses.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To allow the IP address <code>192.0.2.44</code>, specify <code>192.0.2.44</code> or <code>192.0.2.44/32</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To allow the IP addresses <code>192.0.2.0</code> to <code>192.0.2.255</code>, specify <code>192.0.2.0/24</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CIDR block notation, see <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation">Classless Inter-Domain
     * Routing</a> on <i>Wikipedia</i>.
     * </p>
     * 
     * @param cidrs
     *        The IP address, or range of IP addresses in CIDR notation, that are allowed to connect to an instance
     *        through the ports, and the protocol. Lightsail supports IPv4 addresses.</p>
     *        <p>
     *        Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        To allow the IP address <code>192.0.2.44</code>, specify <code>192.0.2.44</code> or
     *        <code>192.0.2.44/32</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To allow the IP addresses <code>192.0.2.0</code> to <code>192.0.2.255</code>, specify
     *        <code>192.0.2.0/24</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about CIDR block notation, see <a
     *        href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation">Classless Inter-Domain
     *        Routing</a> on <i>Wikipedia</i>.
     */

    public void setCidrs(java.util.Collection<String> cidrs) {
        if (cidrs == null) {
            this.cidrs = null;
            return;
        }

        this.cidrs = new java.util.ArrayList<String>(cidrs);
    }

    /**
     * <p>
     * The IP address, or range of IP addresses in CIDR notation, that are allowed to connect to an instance through the
     * ports, and the protocol. Lightsail supports IPv4 addresses.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To allow the IP address <code>192.0.2.44</code>, specify <code>192.0.2.44</code> or <code>192.0.2.44/32</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To allow the IP addresses <code>192.0.2.0</code> to <code>192.0.2.255</code>, specify <code>192.0.2.0/24</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CIDR block notation, see <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation">Classless Inter-Domain
     * Routing</a> on <i>Wikipedia</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCidrs(java.util.Collection)} or {@link #withCidrs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param cidrs
     *        The IP address, or range of IP addresses in CIDR notation, that are allowed to connect to an instance
     *        through the ports, and the protocol. Lightsail supports IPv4 addresses.</p>
     *        <p>
     *        Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        To allow the IP address <code>192.0.2.44</code>, specify <code>192.0.2.44</code> or
     *        <code>192.0.2.44/32</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To allow the IP addresses <code>192.0.2.0</code> to <code>192.0.2.255</code>, specify
     *        <code>192.0.2.0/24</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about CIDR block notation, see <a
     *        href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation">Classless Inter-Domain
     *        Routing</a> on <i>Wikipedia</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortInfo withCidrs(String... cidrs) {
        if (this.cidrs == null) {
            setCidrs(new java.util.ArrayList<String>(cidrs.length));
        }
        for (String ele : cidrs) {
            this.cidrs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IP address, or range of IP addresses in CIDR notation, that are allowed to connect to an instance through the
     * ports, and the protocol. Lightsail supports IPv4 addresses.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To allow the IP address <code>192.0.2.44</code>, specify <code>192.0.2.44</code> or <code>192.0.2.44/32</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To allow the IP addresses <code>192.0.2.0</code> to <code>192.0.2.255</code>, specify <code>192.0.2.0/24</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CIDR block notation, see <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation">Classless Inter-Domain
     * Routing</a> on <i>Wikipedia</i>.
     * </p>
     * 
     * @param cidrs
     *        The IP address, or range of IP addresses in CIDR notation, that are allowed to connect to an instance
     *        through the ports, and the protocol. Lightsail supports IPv4 addresses.</p>
     *        <p>
     *        Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        To allow the IP address <code>192.0.2.44</code>, specify <code>192.0.2.44</code> or
     *        <code>192.0.2.44/32</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To allow the IP addresses <code>192.0.2.0</code> to <code>192.0.2.255</code>, specify
     *        <code>192.0.2.0/24</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about CIDR block notation, see <a
     *        href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation">Classless Inter-Domain
     *        Routing</a> on <i>Wikipedia</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortInfo withCidrs(java.util.Collection<String> cidrs) {
        setCidrs(cidrs);
        return this;
    }

    /**
     * <p>
     * An alias that defines access for a preconfigured range of IP addresses.
     * </p>
     * <p>
     * The only alias currently supported is <code>lightsail-connect</code>, which allows IP addresses of the
     * browser-based RDP/SSH client in the Lightsail console to connect to your instance.
     * </p>
     * 
     * @return An alias that defines access for a preconfigured range of IP addresses.</p>
     *         <p>
     *         The only alias currently supported is <code>lightsail-connect</code>, which allows IP addresses of the
     *         browser-based RDP/SSH client in the Lightsail console to connect to your instance.
     */

    public java.util.List<String> getCidrListAliases() {
        return cidrListAliases;
    }

    /**
     * <p>
     * An alias that defines access for a preconfigured range of IP addresses.
     * </p>
     * <p>
     * The only alias currently supported is <code>lightsail-connect</code>, which allows IP addresses of the
     * browser-based RDP/SSH client in the Lightsail console to connect to your instance.
     * </p>
     * 
     * @param cidrListAliases
     *        An alias that defines access for a preconfigured range of IP addresses.</p>
     *        <p>
     *        The only alias currently supported is <code>lightsail-connect</code>, which allows IP addresses of the
     *        browser-based RDP/SSH client in the Lightsail console to connect to your instance.
     */

    public void setCidrListAliases(java.util.Collection<String> cidrListAliases) {
        if (cidrListAliases == null) {
            this.cidrListAliases = null;
            return;
        }

        this.cidrListAliases = new java.util.ArrayList<String>(cidrListAliases);
    }

    /**
     * <p>
     * An alias that defines access for a preconfigured range of IP addresses.
     * </p>
     * <p>
     * The only alias currently supported is <code>lightsail-connect</code>, which allows IP addresses of the
     * browser-based RDP/SSH client in the Lightsail console to connect to your instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCidrListAliases(java.util.Collection)} or {@link #withCidrListAliases(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param cidrListAliases
     *        An alias that defines access for a preconfigured range of IP addresses.</p>
     *        <p>
     *        The only alias currently supported is <code>lightsail-connect</code>, which allows IP addresses of the
     *        browser-based RDP/SSH client in the Lightsail console to connect to your instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortInfo withCidrListAliases(String... cidrListAliases) {
        if (this.cidrListAliases == null) {
            setCidrListAliases(new java.util.ArrayList<String>(cidrListAliases.length));
        }
        for (String ele : cidrListAliases) {
            this.cidrListAliases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An alias that defines access for a preconfigured range of IP addresses.
     * </p>
     * <p>
     * The only alias currently supported is <code>lightsail-connect</code>, which allows IP addresses of the
     * browser-based RDP/SSH client in the Lightsail console to connect to your instance.
     * </p>
     * 
     * @param cidrListAliases
     *        An alias that defines access for a preconfigured range of IP addresses.</p>
     *        <p>
     *        The only alias currently supported is <code>lightsail-connect</code>, which allows IP addresses of the
     *        browser-based RDP/SSH client in the Lightsail console to connect to your instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortInfo withCidrListAliases(java.util.Collection<String> cidrListAliases) {
        setCidrListAliases(cidrListAliases);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFromPort() != null)
            sb.append("FromPort: ").append(getFromPort()).append(",");
        if (getToPort() != null)
            sb.append("ToPort: ").append(getToPort()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getCidrs() != null)
            sb.append("Cidrs: ").append(getCidrs()).append(",");
        if (getCidrListAliases() != null)
            sb.append("CidrListAliases: ").append(getCidrListAliases());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PortInfo == false)
            return false;
        PortInfo other = (PortInfo) obj;
        if (other.getFromPort() == null ^ this.getFromPort() == null)
            return false;
        if (other.getFromPort() != null && other.getFromPort().equals(this.getFromPort()) == false)
            return false;
        if (other.getToPort() == null ^ this.getToPort() == null)
            return false;
        if (other.getToPort() != null && other.getToPort().equals(this.getToPort()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getCidrs() == null ^ this.getCidrs() == null)
            return false;
        if (other.getCidrs() != null && other.getCidrs().equals(this.getCidrs()) == false)
            return false;
        if (other.getCidrListAliases() == null ^ this.getCidrListAliases() == null)
            return false;
        if (other.getCidrListAliases() != null && other.getCidrListAliases().equals(this.getCidrListAliases()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFromPort() == null) ? 0 : getFromPort().hashCode());
        hashCode = prime * hashCode + ((getToPort() == null) ? 0 : getToPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getCidrs() == null) ? 0 : getCidrs().hashCode());
        hashCode = prime * hashCode + ((getCidrListAliases() == null) ? 0 : getCidrListAliases().hashCode());
        return hashCode;
    }

    @Override
    public PortInfo clone() {
        try {
            return (PortInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.PortInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
