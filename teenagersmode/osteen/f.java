package com.bilibili.teenagersmode.osteen;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Result;
import kotlin.Unit;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/osteen/f.class */
@StabilityInferred(parameters = 0)
public final class f extends ActivityResultContract<Unit, Result<? extends Boolean>> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Unit unit) {
        return new Intent("com.android.action.PARENTAL_CREDENTIAL_AUTHENTICATE");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    @Override // androidx.activity.result.contract.ActivityResultContract
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.Result<? extends java.lang.Boolean> parseResult(int r8, android.content.Intent r9) {
        /*
            r7 = this;
            r0 = r8
            r1 = -1
            if (r0 == r1) goto L46
            r0 = r8
            if (r0 == 0) goto L38
            r0 = r8
            r1 = 100
            if (r0 == r1) goto L46
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            r10 = r0
            r0 = r9
            if (r0 == 0) goto L21
            r0 = r9
            java.lang.String r1 = "key_authentication_message"
            java.lang.String r0 = r0.getStringExtra(r1)
            r9 = r0
            goto L23
        L21:
            r0 = 0
            r9 = r0
        L23:
            com.bilibili.teenagersmode.osteen.ParentalCredentialAuthenticateFailedException r0 = new com.bilibili.teenagersmode.osteen.ParentalCredentialAuthenticateFailedException
            r1 = r0
            r2 = 0
            r3 = r9
            r4 = 1
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.constructor-impl(r0)
            r9 = r0
            goto L51
        L38:
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            r9 = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.Object r0 = kotlin.Result.constructor-impl(r0)
            r9 = r0
            goto L51
        L46:
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            r9 = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.Object r0 = kotlin.Result.constructor-impl(r0)
            r9 = r0
        L51:
            r0 = r9
            kotlin.Result r0 = kotlin.Result.box-impl(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.teenagersmode.osteen.f.parseResult(int, android.content.Intent):java.lang.Object");
    }
}
