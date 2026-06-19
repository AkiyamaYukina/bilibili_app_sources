package com.bilibili.playset.widget.favorite;

import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.BiliCall;
import com.google.gson.JsonObject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/FavoriteApiHelper$favModifyCatching$2.class */
final class FavoriteApiHelper$favModifyCatching$2 extends SuspendLambda implements Function1<Continuation<? super JsonObject>, Object> {
    final String $actionId;
    final String $addIds;
    final String $delIds;
    final String $extraInfo;
    final String $fromSpmid;
    final String $jumpFrom;
    final String $resources;
    final String $spmid;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteApiHelper$favModifyCatching$2(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Continuation<? super FavoriteApiHelper$favModifyCatching$2> continuation) {
        super(1, continuation);
        this.$resources = str;
        this.$addIds = str2;
        this.$delIds = str3;
        this.$jumpFrom = str4;
        this.$extraInfo = str5;
        this.$fromSpmid = str6;
        this.$spmid = str7;
        this.$actionId = str8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BiliCall invokeSuspend$lambda$0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        return ((FavoriteService) ServiceGenerator.createService(FavoriteService.class)).favBatchVideo(com.bilibili.ad.adview.space.brand.ui.viewmodel.a.a(), str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new FavoriteApiHelper$favModifyCatching$2(this.$resources, this.$addIds, this.$delIds, this.$jumpFrom, this.$extraInfo, this.$fromSpmid, this.$spmid, this.$actionId, continuation);
    }

    public final Object invoke(Continuation<? super JsonObject> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final String str = this.$resources;
            final String str2 = this.$addIds;
            final String str3 = this.$delIds;
            final String str4 = this.$jumpFrom;
            final String str5 = this.$extraInfo;
            final String str6 = this.$fromSpmid;
            final String str7 = this.$spmid;
            final String str8 = this.$actionId;
            Function1 function1 = new Function1(str, str2, str3, str4, str5, str6, str7, str8) { // from class: com.bilibili.playset.widget.favorite.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f85742a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f85743b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f85744c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final String f85745d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final String f85746e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final String f85747f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final String f85748g;
                public final String h;

                {
                    this.f85742a = str;
                    this.f85743b = str2;
                    this.f85744c = str3;
                    this.f85745d = str4;
                    this.f85746e = str5;
                    this.f85747f = str6;
                    this.f85748g = str7;
                    this.h = str8;
                }

                public final Object invoke(Object obj2) {
                    String str9 = this.f85747f;
                    String str10 = this.f85748g;
                    return FavoriteApiHelper$favModifyCatching$2.invokeSuspend$lambda$0(this.f85742a, this.f85743b, this.f85744c, this.f85745d, this.f85746e, str9, str10, this.h, (String) obj2);
                }
            };
            this.label = 1;
            Object objB = com.bilibili.playset.api.t.b(function1, this);
            obj = objB;
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
