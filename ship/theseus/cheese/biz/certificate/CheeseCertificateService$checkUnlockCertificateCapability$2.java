package com.bilibili.ship.theseus.cheese.biz.certificate;

import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.ship.theseus.cheese.biz.certificate.CheeseCertificateService;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import eu0.C6985d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/certificate/CheeseCertificateService$checkUnlockCertificateCapability$2.class */
final class CheeseCertificateService$checkUnlockCertificateCapability$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final CheeseCertificateService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseCertificateService$checkUnlockCertificateCapability$2(CheeseCertificateService cheeseCertificateService, Continuation<? super CheeseCertificateService$checkUnlockCertificateCapability$2> continuation) {
        super(2, continuation);
        this.this$0 = cheeseCertificateService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseCertificateService$checkUnlockCertificateCapability$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CheeseCertificateService.CredentialAPi credentialAPi = (CheeseCertificateService.CredentialAPi) ServiceGenerator.createService(CheeseCertificateService.CredentialAPi.class);
            C6985d c6985dA = this.this$0.f89234f.a();
            long j7 = c6985dA != null ? c6985dA.f117526v : 0L;
            this.label = 1;
            Object objCanUnlockOrNot = credentialAPi.canUnlockOrNot(j7, this);
            obj = objCanUnlockOrNot;
            if (objCanUnlockOrNot == coroutine_suspended) {
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
        boolean asBoolean = false;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BLog.e("CheeseCertificateService$checkUnlockCertificateCapability$2-invokeSuspend", "[theseus-cheese-CheeseCertificateService$checkUnlockCertificateCapability$2-invokeSuspend] onBusinessFailure, canUnlock is false", (Throwable) null);
            cheeseCertificateService.f89241n = false;
            cheeseCertificateService.f89242o = null;
            cheeseCertificateService.f89243p = null;
            cheeseCertificateService.f89244q = null;
            cheeseCertificateService.f89246s = null;
        } else if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
            ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException();
            BLog.e("CheeseCertificateService$checkUnlockCertificateCapability$2-invokeSuspend", "[theseus-cheese-CheeseCertificateService$checkUnlockCertificateCapability$2-invokeSuspend] onServiceUnavailable, canUnlock is false", (Throwable) null);
            cheeseCertificateService.f89241n = false;
            cheeseCertificateService.f89242o = null;
            cheeseCertificateService.f89243p = null;
            cheeseCertificateService.f89244q = null;
            cheeseCertificateService.f89246s = null;
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            JsonObject jsonObject = (JsonObject) ((BiliApiResponse.Success) biliApiResponse).getData();
            JsonElement jsonElement = jsonObject.get("can_unlock");
            if (jsonElement != null) {
                asBoolean = jsonElement.getAsBoolean();
            }
            cheeseCertificateService.f89241n = asBoolean;
            cheeseCertificateService.f89242o = jsonObject.get("credential_model").getAsJsonObject();
            cheeseCertificateService.f89243p = jsonObject.get("unlock_model").getAsJsonObject();
            cheeseCertificateService.f89244q = jsonObject.get("user_info").getAsJsonObject();
            cheeseCertificateService.f89246s = jsonObject.get("season_subtitle").getAsJsonObject();
            defpackage.a.b("[theseus-cheese-CheeseCertificateService$checkUnlockCertificateCapability$2-invokeSuspend] ", com.bilibili.app.comm.bh.x5.b.a("onSuccess, canUnlock is ", cheeseCertificateService.f89241n), "CheeseCertificateService$checkUnlockCertificateCapability$2-invokeSuspend");
        }
        return Unit.INSTANCE;
    }
}
