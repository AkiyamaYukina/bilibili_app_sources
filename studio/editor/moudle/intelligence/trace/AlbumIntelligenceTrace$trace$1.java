package com.bilibili.studio.editor.moudle.intelligence.trace;

import com.bilibili.lib.gson.GsonKt;
import com.bilibili.studio.material.util.UtilsKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import r2.C8509b;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/trace/AlbumIntelligenceTrace$trace$1.class */
public final class AlbumIntelligenceTrace$trace$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function0<Unit> $ioTask;
    final d $node;
    final long $time;
    int label;
    final AlbumIntelligenceTrace this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlbumIntelligenceTrace$trace$1(AlbumIntelligenceTrace albumIntelligenceTrace, d dVar, Function0<Unit> function0, long j7, Continuation<? super AlbumIntelligenceTrace$trace$1> continuation) {
        super(2, continuation);
        this.this$0 = albumIntelligenceTrace;
        this.$node = dVar;
        this.$ioTask = function0;
        this.$time = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AlbumIntelligenceTrace$trace$1(this.this$0, this.$node, this.$ioTask, this.$time, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object objPrevious;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List<d> list = this.this$0.f107544c;
        d dVar = this.$node;
        ArrayList arrayList = (ArrayList) list;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (dVar.a((d) objPrevious)) {
                break;
            }
        }
        d dVar2 = (d) objPrevious;
        if (((ArrayList) this.this$0.f107544c).isEmpty() || dVar2 != null) {
            Function0<Unit> function0 = this.$ioTask;
            if (function0 != null) {
                function0.invoke();
            }
            d dVar3 = this.$node;
            AlbumIntelligenceTrace albumIntelligenceTrace = this.this$0;
            dVar3.f107559d = C8509b.a(((ArrayList) albumIntelligenceTrace.f107544c).size(), albumIntelligenceTrace.f107543b, "_");
            AlbumIntelligenceTrace albumIntelligenceTrace2 = this.this$0;
            List<c> list2 = albumIntelligenceTrace2.f107545d;
            long j7 = this.$time;
            d dVar4 = this.$node;
            for (c cVar : list2) {
                int size = ((ArrayList) albumIntelligenceTrace2.f107544c).size();
                cVar.getClass();
                Map<String, Object> map = dVar4.f107560e;
                Map<String, Object> linkedHashMap = map;
                if (map == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put("time", c.f107555b.format(Long.valueOf(j7)));
                String str = "";
                if (dVar2 != null) {
                    str = dVar2.f107559d;
                    if (str == null) {
                        str = "";
                    }
                }
                defpackage.a.b("uper_m_css_", GsonKt.toJsonString(MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("pid", str), TuplesKt.to("cid", dVar4.f107559d), TuplesKt.to("type", dVar4.f107558c.getCode()), TuplesKt.to("data", MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("label", size + UtilsKt.DOT + dVar4.f107556a), TuplesKt.to("tips", linkedHashMap)}))})), "AlbumIntelligenceTrace");
            }
            d dVar5 = this.$node;
            dVar5.f107556a = "";
            dVar5.f107560e = null;
            Boxing.boxBoolean(((ArrayList) this.this$0.f107544c).add(dVar5));
        } else {
            AlbumIntelligenceTrace albumIntelligenceTrace3 = this.this$0;
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("未找到父节点, " + this.$node);
            albumIntelligenceTrace3.getClass();
            BLog.e("AlbumIntelligenceTrace", illegalArgumentException);
        }
        return Unit.INSTANCE;
    }
}
