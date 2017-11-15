package jp.sgk.businesstrip.domain.fee.a

import jp.sgk.businesstrip.domain.common.Calender
import jp.sgk.businesstrip.domain.common.Location


class Departure(val calender: Calender, val location: Location, val continuation: Boolean) {
    fun isOneDayTrip(arrival: Arrival) : Boolean {
        return calender.isSameDay(arrival.calender)
    }
}