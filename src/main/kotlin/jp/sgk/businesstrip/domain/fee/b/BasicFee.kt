package jp.sgk.businesstrip.domain.fee.b

import jp.sgk.businesstrip.domain.common.Fee
import jp.sgk.businesstrip.domain.employee.Capacity
import java.math.BigDecimal

class BasicFee(val capacity: Capacity, val accommodation: Accommodation) : Fee(when {
    // Capacity J
    capacity == Capacity.J && accommodation == Accommodation.Hotel -> 1300.0
    capacity == Capacity.J && accommodation == Accommodation.Financed -> 600.0
    capacity == Capacity.J && accommodation == Accommodation.Acquaintances -> 700.0
    capacity == Capacity.J && accommodation == Accommodation.Home -> 600.0
    capacity == Capacity.J && accommodation == Accommodation.Vehicle -> 1200.0
    capacity == Capacity.J && accommodation == Accommodation.Etc -> 1000.0
    // Capacity S
    capacity == Capacity.S && accommodation == Accommodation.Hotel -> 1400.0
    capacity == Capacity.S && accommodation == Accommodation.Financed -> 600.0
    capacity == Capacity.S && accommodation == Accommodation.Acquaintances -> 700.0
    capacity == Capacity.S && accommodation == Accommodation.Home -> 600.0
    capacity == Capacity.S && accommodation == Accommodation.Vehicle -> 1200.0
    capacity == Capacity.S && accommodation == Accommodation.Etc -> 1000.0
    // Capacity M
    capacity == Capacity.M && accommodation == Accommodation.Hotel -> 1500.0
    capacity == Capacity.M && accommodation == Accommodation.Financed -> 700.0
    capacity == Capacity.M && accommodation == Accommodation.Acquaintances -> 840.0
    capacity == Capacity.M && accommodation == Accommodation.Home -> 720.0
    capacity == Capacity.M && accommodation == Accommodation.Vehicle -> 1400.0
    capacity == Capacity.M && accommodation == Accommodation.Etc -> 1200.0
    else -> 0.0
})