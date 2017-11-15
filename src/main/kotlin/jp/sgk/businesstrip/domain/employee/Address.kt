package jp.sgk.businesstrip.domain.employee

import jp.sgk.businesstrip.domain.common.Location


class Address(val location: Location, val commute: Commute) {
    fun samePlace(another: Location): Boolean {
        return location.id == another.id
    }
}