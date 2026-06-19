package com.bilibili.studio.editor.asr.zip2ai;

import com.bilibili.okretro.GeneralResponse;
import kotlin.TuplesKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/zip2ai/a.class */
public final class a implements Callback<GeneralResponse<String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f105680a;

    public a(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f105680a = cancellableContinuationImpl;
    }

    public final void onFailure(Call<GeneralResponse<String>> call, Throwable th) {
        yC0.a.a(this.f105680a, TuplesKt.to(Boolean.FALSE, th.getMessage()));
    }

    public final void onResponse(Call<GeneralResponse<String>> call, Response<GeneralResponse<String>> response) {
        boolean zIsSuccessful = response.isSuccessful();
        CancellableContinuationImpl cancellableContinuationImpl = this.f105680a;
        if (zIsSuccessful) {
            yC0.a.a(cancellableContinuationImpl, TuplesKt.to(Boolean.TRUE, (Object) null));
        } else {
            yC0.a.a(cancellableContinuationImpl, TuplesKt.to(Boolean.FALSE, String.valueOf(response.message())));
        }
    }
}
