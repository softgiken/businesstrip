package jp.sgk.businesstrip.domain.fee.a.trip

import jp.sgk.businesstrip.domain.common.Fee
import jp.sgk.businesstrip.domain.fee.a.days.IDay

class StayOverTrip: Trip {
    val days = mutableListOf<IDay>();

    override fun calcFee() : Fee {
        return Fee(0.0)
    }
}