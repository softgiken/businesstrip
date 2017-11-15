package jp.sgk.businesstrip.domain.fee.a

class MovingDistance(val kilometer: Int) {
    fun getRate() : Rate {
        return if (kilometer > 150) Rate(1.0) else Rate(0.0)
    }
}