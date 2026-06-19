package com.bilibili.ship.theseus.ugc.endpage.relatedrecommand;

import com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs;
import com.bapis.bilibili.app.viewunite.v1.RelateID;
import com.bapis.bilibili.app.viewunite.v1.ViewEndPageReply;
import com.bapis.bilibili.app.viewunite.v1.ViewEndPageReq;
import com.bapis.bilibili.app.viewunite.v1.ViewMoss;
import com.bilibili.lib.moss.api.CallOptions;
import com.bilibili.lib.moss.api.MossException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/UGCEndPageRepository$getViewEndPage$2.class */
final class UGCEndPageRepository$getViewEndPage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ViewEndPageReply>, Object> {
    final String $adExtra;
    final long $aid;
    final String $bvid;
    final Map<String, String> $extraContent;
    final String $from;
    final String $fromSpmid;
    final PlayerArgs $playerArgs;
    final List<Long> $relateIds;
    final String $sessionId;
    final String $spmid;
    final String $trackId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCEndPageRepository$getViewEndPage$2(long j7, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, String str7, PlayerArgs playerArgs, List<Long> list, Continuation<? super UGCEndPageRepository$getViewEndPage$2> continuation) {
        super(2, continuation);
        this.$aid = j7;
        this.$bvid = str;
        this.$from = str2;
        this.$spmid = str3;
        this.$fromSpmid = str4;
        this.$sessionId = str5;
        this.$trackId = str6;
        this.$extraContent = map;
        this.$adExtra = str7;
        this.$playerArgs = playerArgs;
        this.$relateIds = list;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCEndPageRepository$getViewEndPage$2(this.$aid, this.$bvid, this.$from, this.$spmid, this.$fromSpmid, this.$sessionId, this.$trackId, this.$extraContent, this.$adExtra, this.$playerArgs, this.$relateIds, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ViewEndPageReply> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        List relatesList;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ViewEndPageReply viewEndPageReply = null;
        try {
            ViewEndPageReq.b bVarNewBuilder = ViewEndPageReq.newBuilder();
            long j7 = this.$aid;
            String str = this.$bvid;
            String str2 = this.$from;
            String str3 = this.$spmid;
            String str4 = this.$fromSpmid;
            String str5 = this.$sessionId;
            String str6 = this.$trackId;
            Map<String, String> map = this.$extraContent;
            String str7 = this.$adExtra;
            PlayerArgs playerArgs = this.$playerArgs;
            List<Long> list = this.$relateIds;
            bVarNewBuilder.setAid(j7);
            bVarNewBuilder.setBvid(str);
            bVarNewBuilder.setFrom(str2);
            bVarNewBuilder.setSpmid(str3);
            bVarNewBuilder.setFromSpmid(str4);
            bVarNewBuilder.setSessionId(str5);
            bVarNewBuilder.setTrackId(str6);
            bVarNewBuilder.putAllExtraContent(map);
            bVarNewBuilder.setAdExtra(str7);
            bVarNewBuilder.setPlayerArgs(playerArgs);
            List<Long> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                long jLongValue = ((Number) it.next()).longValue();
                RelateID.b bVarNewBuilder2 = RelateID.newBuilder();
                bVarNewBuilder2.setId(jLongValue);
                arrayList.add(bVarNewBuilder2.build());
            }
            bVarNewBuilder.addAllRelateIds(arrayList);
            ViewEndPageReq viewEndPageReqBuild = bVarNewBuilder.build();
            BLog.i("UGCEndPageRepository", "Requesting ViewEndPage for aid: " + this.$aid + ", bvid: " + this.$bvid);
            ViewEndPageReply viewEndPageReplyExecuteViewEndPage = new ViewMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).executeViewEndPage(viewEndPageReqBuild);
            BLog.i("UGCEndPageRepository", "ViewEndPage response received with " + ((viewEndPageReplyExecuteViewEndPage == null || (relatesList = viewEndPageReplyExecuteViewEndPage.getRelatesList()) == null) ? 0 : relatesList.size()) + " cards");
            viewEndPageReply = viewEndPageReplyExecuteViewEndPage;
        } catch (MossException e7) {
            BLog.w("UGCEndPageRepository", "ViewEndPage request failed with MossException: " + e7.getMessage());
            e7.printStackTrace();
        } catch (Exception e8) {
            BLog.w("UGCEndPageRepository", "ViewEndPage request failed: " + e8.getMessage());
            e8.printStackTrace();
        }
        return viewEndPageReply;
    }
}
