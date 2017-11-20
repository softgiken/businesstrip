package jp.sgk.businesstrip.domain.fee.b

import jp.sgk.businesstrip.domain.common.Calender
import jp.sgk.businesstrip.domain.common.Location
import jp.sgk.businesstrip.domain.employee.*

class FeeBTest extends spock.lang.Specification {
    def "3泊4日の宿泊出張ですべてホテルに泊まった場合の日当Bは？"() {
        setup:
        def employee = new Employee(new Name("suzuki"), Capacity.J, new Address(new Location("私ん家", ""), new Commute(30)) )

        def list = [Accommodation.Hotel,Accommodation.Hotel,Accommodation.Hotel]

        def feeB = new FeeB(employee, list)

        expect:
        3900 == feeB.calcFee()
    }

    def "2泊3日の宿泊出張でホテルに1泊、友人宅に1泊した場合の日当Bは？"(){
        setup:
        def employee = new Employee(new Name("suzuki"), Capacity.J, new Address(new Location("私ん家", ""), new Commute(30)) )

        def list = [Accommodation.Hotel,Accommodation.Acquaintances]

        def feeB = new FeeB(employee, list)

        expect:
        2000 == feeB.calcFee()
    }
}
