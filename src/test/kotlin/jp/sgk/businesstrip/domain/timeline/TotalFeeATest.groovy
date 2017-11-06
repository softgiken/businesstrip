package jp.sgk.businesstrip.domain.timeline

class TotalFeeATest extends spock.lang.Specification {
    def "GetSum"() {
        setup:
        def fee  = new TotalFeeA()

        expect:
        1000 == fee.sum()
    }
}
