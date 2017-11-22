package jp.sgk.businesstrip.domain.fee.a

import jp.sgk.businesstrip.domain.common.Calender
import jp.sgk.businesstrip.domain.common.Location
import jp.sgk.businesstrip.domain.employee.Name
import jp.sgk.businesstrip.domain.employee.Capacity
import jp.sgk.businesstrip.domain.employee.Address
import jp.sgk.businesstrip.domain.employee.Commute
import jp.sgk.businesstrip.domain.employee.Employee
import jp.sgk.businesstrip.domain.fee.a.trip.OneDayTrip

import java.time.LocalDateTime

        class FeeATest extends spock.lang.Specification {
            def "日帰り"() {
                setup:
                def employee = new Employee(new Name("suzuki"), Capacity.J, new Address(new Location("私ん家", ""), new Commute(30)) )

                def departure = new Departure(
                        new Calender(LocalDateTime.parse("2017-12-03T07:15:30")),
                        new Location("仙台事業所", "仙台市青葉区本町"),
                        false
                )

        def arrival = new Arrival(
                new Calender(LocalDateTime.parse("2017-12-03T18:20:05")),
                new Location("自宅", "仙台市青葉区長町")
        )

        def distance = new MovingDistance(170)

        def trip = new OneDayTrip(employee, departure, arrival, distance)

        expect:
        10000 == trip.calcFee().amount
    }

    def "宿泊"(){

    }

    def "継続出張"(){

    }
}
