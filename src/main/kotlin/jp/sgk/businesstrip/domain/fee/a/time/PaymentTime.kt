package jp.sgk.businesstrip.domain.fee.a.time

import jp.sgk.businesstrip.domain.fee.a.Rate


class PaymentTime(val start: StartTimeOfPayment, val end: EndTimeOfPayment) {
    fun getRate() : Rate {
        val hours = start - end
        return when {
            hours >= 15 -> Rate(1.5)
            hours >= 9 -> Rate(1.0)
            hours >= 5 -> Rate(0.5)
            else -> Rate(0.0)
        }
    }
}