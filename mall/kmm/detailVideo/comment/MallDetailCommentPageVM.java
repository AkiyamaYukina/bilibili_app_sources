package com.bilibili.mall.kmm.detailVideo.comment;

import F3.W;
import F3.X;
import Yg0.C3127a;
import Zg0.C3174a;
import java.util.LinkedHashMap;
import java.util.Map;
import kntr.kotlin.native.ObjCExportAll;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/detailVideo/comment/MallDetailCommentPageVM.class */
@ObjCExportAll(kind = ObjCExportAll.Kind.CALLABLE)
public final class MallDetailCommentPageVM {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f65604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<String, Object> f65605b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f65608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f65609f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f65611i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f65606c = LazyKt.lazy(new W(13));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f65607d = LazyKt.lazy(new X(12));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f65610g = 1;
    public final int h = 10;

    public MallDetailCommentPageVM(@NotNull Map map, @NotNull CoroutineScope coroutineScope) {
        this.f65604a = coroutineScope;
        this.f65605b = map;
        this.f65609f = 3;
        boolean z6 = true;
        Object obj = map.get("commentCount");
        Number number = obj instanceof Number ? (Number) obj : null;
        int iIntValue = number != null ? number.intValue() : 0;
        this.f65608e = iIntValue;
        this.f65611i = iIntValue <= 0 ? false : z6;
        Object obj2 = map.get("orderType");
        Number number2 = obj2 instanceof Number ? (Number) obj2 : null;
        if (number2 != null) {
            int iIntValue2 = number2.intValue();
            if (iIntValue2 == 2 || iIntValue2 == 3) {
                this.f65609f = iIntValue2;
            }
        }
    }

    public final Map<String, Object> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.f65605b);
        linkedHashMap.put("orderType", Integer.valueOf(this.f65609f));
        linkedHashMap.put("pageNum", Integer.valueOf(this.f65610g));
        linkedHashMap.put("pageSize", Integer.valueOf(this.h));
        return linkedHashMap;
    }

    public final void b(Map<String, ? extends Object> map, Function1<? super C3174a, Unit> function1) {
        BuildersKt.launch$default(this.f65604a, (CoroutineContext) null, (CoroutineStart) null, new MallDetailCommentPageVM$loadComment$1(this, map, function1, null), 3, (Object) null);
    }

    public final void c(@NotNull C3127a c3127a, boolean z6) {
        BuildersKt.launch$default(this.f65604a, (CoroutineContext) null, (CoroutineStart) null, new MallDetailCommentPageVM$thumbAction$1(z6, this, c3127a, null), 3, (Object) null);
    }
}
