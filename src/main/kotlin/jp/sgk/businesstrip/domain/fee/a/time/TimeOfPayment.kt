package jp.sgk.businesstrip.domain.fee.a.time

import jp.sgk.businesstrip.domain.common.Calender
import java.time.Duration


abstract class TimeOfPayment {
    abstract fun getTimeOfPayment(): Calender

    public operator fun minus(other: TimeOfPayment): Int {
        val duration = Duration.between(this.getTimeOfPayment().dateTime, other.getTimeOfPayment().dateTime)
        return duration.toHours().toInt()
    }
}