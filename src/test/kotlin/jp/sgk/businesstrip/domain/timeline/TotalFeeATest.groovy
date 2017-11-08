package jp.sgk.businesstrip.domain.timeline

class TotalFeeATest extends spock.lang.Specification {
    def "日帰り"() {
        setup:
        def fee  = new TotalFeeA()

        expect:
        1000 == fee.sum()
    }

    def "宿泊"(){

    }

    def "継続出張"(){

    }
}
