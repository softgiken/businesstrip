package route

import jp.sgk.businesstrip.domain.common.Calender
import jp.sgk.businesstrip.domain.route.EndTime
import jp.sgk.businesstrip.domain.route.EndAdress
import jp.sgk.businesstrip.domain.route.StartTime
import jp.sgk.businesstrip.domain.route.StartAdress
import jp.sgk.businesstrip.domain.route.TraficMeans
import jp.sgk.businesstrip.domain.route.TransportationExpenses
import jp.sgk.businesstrip.domain.route.ResultInfo



class RouteTest extends spock.lang.Specification {

    //最終的にResultに格納された情報を〇〇クラスを使って加工して表示させる
    def 終点 = new EndAdress("東京駅")

    def 始点 = new StartAdress("仙台駅")

    //テストがよくわかっていない
}

