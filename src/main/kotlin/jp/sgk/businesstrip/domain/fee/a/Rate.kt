package jp.sgk.businesstrip.domain.fee.a

import java.math.BigDecimal


class Rate(rate: Double) {
    val rate = BigDecimal.valueOf(rate)
}