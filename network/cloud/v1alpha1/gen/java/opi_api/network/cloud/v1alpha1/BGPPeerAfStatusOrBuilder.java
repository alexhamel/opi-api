// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bgp.proto

package opi_api.network.cloud.v1alpha1;

public interface BGPPeerAfStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.BGPPeerAfStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * BGP The index of the update group that the peer is a member of for this AFI/SAFI
   * </pre>
   *
   * <code>int32 update_group = 1;</code>
   * @return The updateGroup.
   */
  int getUpdateGroup();

  /**
   * <pre>
   * For a peer identified by a link-local IPv6 addresses, this is the scope ID
   * of bgpPeerLocalAddr and bgpPeerRemoteAddr.
   * </pre>
   *
   * <code>int32 local_addr_scope_id = 2;</code>
   * @return The localAddrScopeId.
   */
  int getLocalAddrScopeId();

  /**
   * <pre>
   * send a Route Refresh request to the peer for this AFI/SAFI.
   * </pre>
   *
   * <code>bool route_refresh = 3;</code>
   * @return The routeRefresh.
   */
  boolean getRouteRefresh();

  /**
   * <pre>
   *The BGP additional path capability negotiated with this peer for this AFI/SAFI.
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BgpAddPathCapNegCap add_path_cap_neg = 4;</code>
   * @return The enum numeric value on the wire for addPathCapNeg.
   */
  int getAddPathCapNegValue();
  /**
   * <pre>
   *The BGP additional path capability negotiated with this peer for this AFI/SAFI.
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BgpAddPathCapNegCap add_path_cap_neg = 4;</code>
   * @return The addPathCapNeg.
   */
  opi_api.network.cloud.v1alpha1.BgpAddPathCapNegCap getAddPathCapNeg();

  /**
   * <pre>
   * This value indicates whether the given peer is a reflector client of this
   * router for this AFI/SAFI, or not
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BGPPeerRRClient reflector_client = 5;</code>
   * @return The enum numeric value on the wire for reflectorClient.
   */
  int getReflectorClientValue();
  /**
   * <pre>
   * This value indicates whether the given peer is a reflector client of this
   * router for this AFI/SAFI, or not
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BGPPeerRRClient reflector_client = 5;</code>
   * @return The reflectorClient.
   */
  opi_api.network.cloud.v1alpha1.BGPPeerRRClient getReflectorClient();
}