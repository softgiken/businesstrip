package jp.sgk.businesstrip.domain.common

import java.time.LocalDateTime

class Calender(val dateTime: LocalDateTime) {
    fun isSameDay(another: Calender): Boolean {
        return dateTime.toLocalDate().isEqual(another.dateTime.toLocalDate())
    }

    fun isBusinessDay(): Boolean {
        // todo: 会社の営業日をどうやって管理するのか
        return true
    }
}
