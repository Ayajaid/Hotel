// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hotel.proto

package stubs;

public interface GetAllReservationsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GetAllReservationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Reservation reservations = 1;</code>
   */
  java.util.List<stubs.Reservation> 
      getReservationsList();
  /**
   * <code>repeated .Reservation reservations = 1;</code>
   */
  stubs.Reservation getReservations(int index);
  /**
   * <code>repeated .Reservation reservations = 1;</code>
   */
  int getReservationsCount();
  /**
   * <code>repeated .Reservation reservations = 1;</code>
   */
  java.util.List<? extends stubs.ReservationOrBuilder> 
      getReservationsOrBuilderList();
  /**
   * <code>repeated .Reservation reservations = 1;</code>
   */
  stubs.ReservationOrBuilder getReservationsOrBuilder(
      int index);
}
