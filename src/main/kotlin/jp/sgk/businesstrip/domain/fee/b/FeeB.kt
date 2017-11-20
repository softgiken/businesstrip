package jp.sgk.businesstrip.domain.fee.b

import jp.sgk.businesstrip.domain.common.Fee
import jp.sgk.businesstrip.domain.employee.Employee
import jp.sgk.businesstrip.domain.fee.b.BasicFee
import java.math.BigDecimal

class FeeB(val employee: Employee, val accommodationList: List<Accommodation>){

    fun calcFee() : Fee {
        var fee: BigDecimal = BigDecimal(0.0)
        for(acc:Accommodation in accommodationList){
            var b = BasicFee(employee.capacity, acc)
            fee = fee.add(b.amount)
        }
        return Fee(fee)
    }
}