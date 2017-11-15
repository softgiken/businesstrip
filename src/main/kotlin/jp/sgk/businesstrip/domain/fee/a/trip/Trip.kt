package jp.sgk.businesstrip.domain.fee.a.trip

import jp.sgk.businesstrip.domain.common.Fee


interface Trip {
    fun calcFee() : Fee
}