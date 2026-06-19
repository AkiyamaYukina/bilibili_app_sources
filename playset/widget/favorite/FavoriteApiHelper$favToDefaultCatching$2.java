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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/FavoriteApiHelper$favToDefaultCatching$2.class */
final class FavoriteApiHelper$favToDefaultCatching$2 extends SuspendLambda implements Function1<Continuation<? super JsonObject>, Object> {
    final String $actionId;
    final String $extraInfo;
    final String $fromSpmid;
    final String $resources;
    final String $spmid;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteApiHelper$favToDefaultCatching$2(String str, String str2, String str3, String str4, String str5, Continuation<? super FavoriteApiHelper$favToDefaultCatching$2> continuation) {
        super(1, continuation);
        this.$resources = str;
        this.$extraInfo = str2;
        this.$fromSpmid = str3;
        this.$spmid = str4;
        this.$actionId = str5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BiliCall invokeSuspend$lambda$0(String str, String str2, String str3, String str4, String str5, String str6) {
        return ((FavoriteService) ServiceGenerator.createService(FavoriteService.class)).favBatchVideo(com.bilibili.ad.adview.space.brand.ui.viewmodel.a.a(), str, "0", "", "", str2, str3, str4, str5, str6);
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new FavoriteApiHelper$favToDefaultCatching$2(this.$resources, this.$extraInfo, this.$fromSpmid, this.$spmid, this.$actionId, continuation);
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
            final String str2 = this.$extraInfo;
            final String str3 = this.$fromSpmid;
            final String str4 = this.$spmid;
            final String str5 = this.$actionId;
            Function1 function1 = new Function1(str, str2, str3, str4, str5) { // from class: com.bilibili.playset.widget.favorite.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f85749a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f85750b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f85751c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final String f85752d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final String f85753e;

                {
                    this.f85749a = str;
                    this.f85750b = str2;
                    this.f85751c = str3;
                    this.f85752d = str4;
                    this.f85753e = str5;
                }

                public final Object invoke(Object obj2) {
                    String str6 = this.f85751c;
                    String str7 = this.f85752d;
                    return FavoriteApiHelper$favToDefaultCatching$2.invokeSuspend$lambda$0(this.f85749a, this.f85750b, str6, str7, this.f85753e, (String) obj2);
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
