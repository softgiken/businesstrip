package jp.sgk.businesstrip.domain.route

import jp.sgk.businesstrip.domain.common.Calender

data class ResultInfo(val calender: Calender, val startA:StartAdress, val startT: StartTime, val EndA: EndAdress, val EndT: EndTime, val Means: TraficMeans, val Money:TransportationExpenses )
    //明細書・請求書作成に必要な情報を保持したクラス
