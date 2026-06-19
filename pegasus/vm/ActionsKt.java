package com.bilibili.pegasus.vm;

import G3.C1954w;
import androidx.annotation.Keep;
import com.bilibili.app.comm.list.common.feed.FeedbackEventType;
import com.bilibili.app.comm.list.common.feed.PegasusProblemReporter;
import com.bilibili.app.comm.list.common.utils.ListDeviceInfoKt;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.neuron.util.SamplesKt;
import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.PegasusHolderData;
import com.bilibili.pegasus.PegasusWindowProfile;
import com.bilibili.pegasus.data.base.BasePegasusData;
import com.bilibili.pegasus.data.base.PegasusResponse;
import com.bilibili.pegasus.data.request.PegasusResponseWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/ActionsKt.class */
@Keep
public final class ActionsKt {

    @NotNull
    private static final String TAG = "PegasusActions";

    @NotNull
    private static final Lazy enableRawWindowSizeTypeReport$delegate = LazyKt.lazy(new C1954w(7));

    /* JADX INFO: renamed from: com.bilibili.pegasus.vm.ActionsKt$fetchPreloadedPullDownRefreshAction$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/ActionsKt$fetchPreloadedPullDownRefreshAction$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActionsKt.fetchPreloadedPullDownRefreshAction(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PegasusResponseWrapper avoidEmptyWindow(PegasusResponseWrapper pegasusResponseWrapper) {
        Object next;
        boolean z6;
        boolean z7;
        PegasusResponse response = pegasusResponseWrapper.getResponse();
        List<PegasusHolderData> items = response != null ? response.getItems() : null;
        PegasusWindowProfile.a aVar = PegasusWindowProfile.Companion;
        int i7 = pegasusResponseWrapper.getRequestPram().f123317j;
        aVar.getClass();
        Iterator it = PegasusWindowProfile.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((PegasusWindowProfile) next).getType() == i7) {
                break;
            }
        }
        PegasusWindowProfile pegasusWindowProfile = (PegasusWindowProfile) next;
        PegasusWindowProfile pegasusWindowProfile2 = pegasusWindowProfile;
        if (pegasusWindowProfile == null) {
            pegasusWindowProfile2 = PegasusWindowProfile.Normal;
        }
        int columns = pegasusWindowProfile2.getColumns();
        List<PegasusHolderData> list = items;
        PegasusResponseWrapper pegasusResponseWrapperCopy$default = pegasusResponseWrapper;
        if (list != null) {
            if (list.isEmpty() || ListDeviceInfoKt.isHdApp()) {
                pegasusResponseWrapperCopy$default = pegasusResponseWrapper;
            } else {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it2 = items.iterator();
                boolean z8 = false;
                boolean z9 = false;
                while (true) {
                    z6 = z9;
                    if (!it2.hasNext()) {
                        break;
                    }
                    PegasusHolderData pegasusHolderData = (PegasusHolderData) it2.next();
                    if (pegasusHolderData.getHolderStyle().isSmallCard()) {
                        arrayList2.add(pegasusHolderData);
                        z7 = z6;
                        if (arrayList2.size() == columns) {
                            arrayList.addAll(arrayList2);
                            arrayList2.clear();
                            z7 = z6;
                        }
                    } else {
                        arrayList.add(pegasusHolderData);
                        z7 = z6;
                        if (!arrayList2.isEmpty()) {
                            reportDiscard((PegasusHolderData) arrayList2.get(0));
                            arrayList2.clear();
                            z7 = true;
                        }
                    }
                    if (!z8) {
                        BasePegasusData basePegasusData = pegasusHolderData instanceof BasePegasusData ? (BasePegasusData) pegasusHolderData : null;
                        if (!Intrinsics.areEqual(basePegasusData != null ? basePegasusData.getThreePointV() : null, "v5")) {
                            z8 = false;
                            z9 = z7;
                        }
                    }
                    z8 = true;
                    z9 = z7;
                }
                PegasusProblemReporter.INSTANCE.reportFeedbackState(FeedbackEventType.PEGASUS_REQUEST, MapsKt.mapOf(TuplesKt.to("has_threrepoint_v", z8 ? "1" : "0")));
                if (!arrayList2.isEmpty()) {
                    reportDiscard((PegasusHolderData) arrayList2.get(0));
                    arrayList2.clear();
                    z6 = true;
                }
                if (!z6) {
                    return pegasusResponseWrapper;
                }
                PegasusResponse response2 = pegasusResponseWrapper.getResponse();
                PegasusResponse pegasusResponseCopy$default = null;
                if (response2 != null) {
                    pegasusResponseCopy$default = PegasusResponse.copy$default(response2, arrayList, null, null, 6, null);
                }
                pegasusResponseWrapperCopy$default = PegasusResponseWrapper.copy$default(pegasusResponseWrapper, pegasusResponseCopy$default, null, null, false, 14, null);
            }
        }
        return pegasusResponseWrapperCopy$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enableRawWindowSizeTypeReport_delegate$lambda$0() {
        Integer intOrNull;
        boolean z6 = true;
        int iRandInt = SamplesKt.randInt(1, 1000);
        String strDd = DeviceDecision.INSTANCE.dd("pegasus.raw_window_size_type_report_sample_rate", "100");
        if (iRandInt > ((strDd == null || (intOrNull = StringsKt.toIntOrNull(strDd)) == null) ? 100 : intOrNull.intValue())) {
            z6 = false;
        }
        return z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object fetchPreloadedPullDownRefreshAction(@org.jetbrains.annotations.NotNull lp0.c r9, @org.jetbrains.annotations.NotNull com.bilibili.pegasus.request.i r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.bilibili.pegasus.Action> r11) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.vm.ActionsKt.fetchPreloadedPullDownRefreshAction(lp0.c, com.bilibili.pegasus.request.i, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final boolean getEnableRawWindowSizeTypeReport() {
        return ((Boolean) enableRawWindowSizeTypeReport$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Action postPreloadedPullDownRefreshErrorAction(PegasusResponseWrapper pegasusResponseWrapper) {
        return ((Boolean) com.bilibili.pegasus.common.o.f75658b.getValue()).booleanValue() ? new C5766a(pegasusResponseWrapper) : new C5770e(pegasusResponseWrapper);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void reportDiscard(com.bilibili.pegasus.PegasusHolderData r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "discard card:"
            r1.<init>(r2)
            r9 = r0
            r0 = r9
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = "PegasusActions"
            r1 = r9
            java.lang.String r1 = r1.toString()
            tv.danmaku.android.log.BLog.w(r0, r1)
            com.bilibili.pegasus.components.customreporter.EventType r0 = com.bilibili.pegasus.components.customreporter.EventType.DISCARD_CARD
            r12 = r0
            java.lang.String r0 = "card_type"
            r1 = r8
            java.lang.String r1 = r1.getHolderType()
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r11 = r0
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.pegasus.data.base.BasePegasusData
            if (r0 == 0) goto L3b
            r0 = r8
            com.bilibili.pegasus.data.base.BasePegasusData r0 = (com.bilibili.pegasus.data.base.BasePegasusData) r0
            r9 = r0
            goto L3d
        L3b:
            r0 = 0
            r9 = r0
        L3d:
            r0 = r9
            if (r0 == 0) goto L4e
            r0 = r9
            java.lang.String r0 = r0.getTrackId()
            r10 = r0
            r0 = r10
            r9 = r0
            r0 = r10
            if (r0 != 0) goto L52
        L4e:
            java.lang.String r0 = ""
            r9 = r0
        L52:
            r0 = r12
            r1 = 4
            kotlin.Pair[] r1 = new kotlin.Pair[r1]
            r2 = r1
            r3 = 0
            r4 = r11
            r2[r3] = r4
            r2 = r1
            r3 = 1
            java.lang.String r4 = "track_id"
            r5 = r9
            kotlin.Pair r4 = kotlin.TuplesKt.to(r4, r5)
            r2[r3] = r4
            r2 = r1
            r3 = 2
            java.lang.String r4 = "index"
            r5 = r8
            com.bilibili.pegasus.HolderExtra r5 = r5.getExtra()
            int r5 = r5.getIndexInResponse()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            kotlin.Pair r4 = kotlin.TuplesKt.to(r4, r5)
            r2[r3] = r4
            r2 = r1
            r3 = 3
            java.lang.String r4 = "card_data"
            com.google.gson.Gson r5 = new com.google.gson.Gson
            r6 = r5
            r6.<init>()
            r6 = r8
            java.lang.String r5 = r5.toJson(r6)
            kotlin.Pair r4 = kotlin.TuplesKt.to(r4, r5)
            r2[r3] = r4
            java.util.Map r1 = kotlin.collections.MapsKt.mapOf(r1)
            com.bilibili.pegasus.components.customreporter.j.a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.vm.ActionsKt.reportDiscard(com.bilibili.pegasus.PegasusHolderData):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportPreApiRawWindowSizeType(int i7) {
        if (com.bilibili.pegasus.request.b.f78809f < 0) {
            return;
        }
        int i8 = com.bilibili.pegasus.request.b.f78809f;
        com.bilibili.pegasus.request.b.f78809f = -1;
        if (i8 != i7 && getEnableRawWindowSizeTypeReport()) {
            Neurons.reportTracker(false, "tm_raw_window_size_type_compare", MapsKt.mapOf(new Pair[]{TuplesKt.to("pre_api_value", String.valueOf(i8)), TuplesKt.to("seg_value", String.valueOf(i7))}));
        }
    }
}
