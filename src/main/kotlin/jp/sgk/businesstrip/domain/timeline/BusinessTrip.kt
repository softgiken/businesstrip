package jp.sgk.businesstrip.domain.timeline

class BusinessTrip {

    private var feeA :FeeA = FeeA()

    private fun calcFeeA(): Int{
        return 0
    }
    private fun calcFeeB(): Int{
        return 0
    }

    fun inputFeeA(){
        feeA = FeeA()
    }

    fun checkout(): Int{
        return calcFeeA() + calcFeeB()
    }

}