package jp.sgk.businesstrip.domain.fee.a.time

import jp.sgk.businesstrip.domain.common.Calender
import jp.sgk.businesstrip.domain.employee.Commute


class StartTimeOfPayment(val calender: Calender, val commute: Commute, val isHome: Boolean) : TimeOfPayment(){
    override fun getTimeOfPayment(): Calender {
        return if (isHome) {
            Calender(calender.dateTime.plusMinutes(commute.minute.toLong()))
        } else {
            Calender(calender.dateTime)
        }
    }
}
