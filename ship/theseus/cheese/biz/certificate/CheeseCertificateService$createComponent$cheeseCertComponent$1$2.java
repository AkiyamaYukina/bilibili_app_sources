package com.bilibili.ship.theseus.cheese.biz.certificate;

import android.net.Uri;
import com.bilibili.bangumi.logic.page.detail.service.e;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogService;
import com.bilibili.ship.theseus.cheese.biz.certificate.CheeseCertificateService;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import d3.C6781b;
import eu0.C6985d;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/certificate/CheeseCertificateService$createComponent$cheeseCertComponent$1$2.class */
final class CheeseCertificateService$createComponent$cheeseCertComponent$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final CheeseCertificateService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.certificate.CheeseCertificateService$createComponent$cheeseCertComponent$1$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/certificate/CheeseCertificateService$createComponent$cheeseCertComponent$1$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseCertificateService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheeseCertificateService cheeseCertificateService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseCertificateService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CheeseCertificateService.CredentialAPi credentialAPi = (CheeseCertificateService.CredentialAPi) ServiceGenerator.createService(CheeseCertificateService.CredentialAPi.class);
                    C6985d c6985dA = this.this$0.f89234f.a();
                    long j7 = c6985dA != null ? c6985dA.f117526v : 0L;
                    this.label = 1;
                    Object objUnlock = credentialAPi.unlock(j7, this);
                    obj = objUnlock;
                    if (objUnlock == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
                CheeseCertificateService cheeseCertificateService = this.this$0;
                if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
                    cheeseCertificateService.f89243p = null;
                } else if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
                    ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException();
                    cheeseCertificateService.f89243p = null;
                } else {
                    if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cheeseCertificateService.f89243p = (JsonObject) ((BiliApiResponse.Success) biliApiResponse).getData();
                }
            } catch (Exception e7) {
                e.a("[theseus-cheese-CheeseCertificateService$createComponent$cheeseCertComponent$1$2$1-invokeSuspend] ", N4.a.a("onServiceUnavailable, ", e7), "CheeseCertificateService$createComponent$cheeseCertComponent$1$2$1-invokeSuspend", (Throwable) null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseCertificateService$createComponent$cheeseCertComponent$1$2(CheeseCertificateService cheeseCertificateService, Continuation<? super CheeseCertificateService$createComponent$cheeseCertComponent$1$2> continuation) {
        super(2, continuation);
        this.this$0 = cheeseCertificateService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseCertificateService$createComponent$cheeseCertComponent$1$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (BuildersKt.withContext(io2, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.f89245r = "";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        CheeseCertificateService cheeseCertificateService = this.this$0;
        List<JsonObject> listListOfNotNull = CollectionsKt.listOfNotNull(new JsonObject[]{cheeseCertificateService.f89244q, cheeseCertificateService.f89243p, cheeseCertificateService.f89242o, cheeseCertificateService.f89246s});
        CheeseCertificateService cheeseCertificateService2 = this.this$0;
        for (JsonObject jsonObject : listListOfNotNull) {
            cheeseCertificateService2.getClass();
            for (Map.Entry entry : jsonObject.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (JsonElement) entry.getValue());
            }
        }
        CheeseCertificateService cheeseCertificateService3 = this.this$0;
        cheeseCertificateService3.f89245r = C6781b.a(cheeseCertificateService3.f89235g.f117552d, "?poster=", Uri.encode(JsonUtilKt.toJson(linkedHashMap)), "&init=true");
        if (!StringsKt.isBlank(this.this$0.f89245r)) {
            CheeseCertificateService cheeseCertificateService4 = this.this$0;
            CheeseCatalogService cheeseCatalogService = cheeseCertificateService4.f89236i;
            String str = cheeseCertificateService4.f89245r;
            this.label = 2;
            if (cheeseCatalogService.e(str, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
