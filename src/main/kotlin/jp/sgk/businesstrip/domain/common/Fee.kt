package jp.sgk.businesstrip.domain.common

import jp.sgk.businesstrip.domain.fee.a.Rate
import java.math.BigDecimal


open class Fee(val amount: BigDecimal){
    constructor(amount: Double) : this(BigDecimal.valueOf(amount)) {
    }

    public operator fun times(rate: Rate): Fee {
        return Fee(amount.times(rate.rate))
    }
}