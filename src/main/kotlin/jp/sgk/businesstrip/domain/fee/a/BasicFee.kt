package jp.sgk.businesstrip.domain.fee.a

import jp.sgk.businesstrip.domain.common.Fee
import jp.sgk.businesstrip.domain.employee.Capacity


class BasicFee(val capacity: Capacity) : Fee(when (capacity) {
    Capacity.J -> 1500.0
    Capacity.S -> 1600.0
    Capacity.M -> 1700.0
})
