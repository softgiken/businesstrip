package jp.sgk.businesstrip.domain.fee.a.trip

import jp.sgk.businesstrip.domain.fee.a.BasicFee
import jp.sgk.businesstrip.domain.common.Fee
import jp.sgk.businesstrip.domain.employee.Employee
import jp.sgk.businesstrip.domain.fee.a.Arrival
import jp.sgk.businesstrip.domain.fee.a.Departure
import jp.sgk.businesstrip.domain.fee.a.MovingDistance
import jp.sgk.businesstrip.domain.fee.a.time.EndTimeOfPayment
import jp.sgk.businesstrip.domain.fee.a.time.PaymentTime
import jp.sgk.businesstrip.domain.fee.a.time.StartTimeOfPayment


class OneDayTrip(val employee: Employee, val departure: Departure, val arrival: Arrival, val distance: MovingDistance): Trip {
    val start = StartTimeOfPayment(departure.calender, employee.address.commute, employee.address.samePlace(departure.location))
    val end = EndTimeOfPayment(departure.calender, employee.address.commute, employee.address.samePlace(departure.location))
    val time = PaymentTime(start, end)

    override fun calcFee() : Fee {
        return BasicFee(employee.capacity) * distance.getRate() * time.getRate()
    }
}