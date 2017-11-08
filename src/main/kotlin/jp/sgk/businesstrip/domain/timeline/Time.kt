package jp.sgk.businesstrip.domain.timeline
import java.time.LocalDate

class Time(val _time: LocalDate) {

    fun getTime() : LocalDate{
        return _time
    }

}