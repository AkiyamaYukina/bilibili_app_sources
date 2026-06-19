package com.bilibili.pegasus.components;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bilibili.api.PhoneDeviceId;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.accountinfo.model.AccountInfo;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.pegasus.PegasusHeaderManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/MemberNoticeHeader$showSecurity$1.class */
final class MemberNoticeHeader$showSecurity$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Context $context;
    final Security $security;
    private Object L$0;
    int label;
    final MemberNoticeHeader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemberNoticeHeader$showSecurity$1(MemberNoticeHeader memberNoticeHeader, Security security, Context context, Continuation<? super MemberNoticeHeader$showSecurity$1> continuation) {
        super(2, continuation);
        this.this$0 = memberNoticeHeader;
        this.$security = security;
        this.$context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(MemberNoticeHeader memberNoticeHeader, String str, View view) {
        MemberNoticeHeader.c(memberNoticeHeader.getFragment(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(MemberNoticeHeader memberNoticeHeader, View view) {
        memberNoticeHeader.b().getClass();
        ((AlertService) ServiceGenerator.createService(AlertService.class)).closeAlert(BiliAccounts.get(BiliContext.application()).getAccessKey(), PhoneDeviceId.get()).enqueue();
        PegasusHeaderManager headerManager = memberNoticeHeader.getHeaderManager();
        if (headerManager != null) {
            headerManager.removeHeader("PegasusMemberNoticeHeader");
        }
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MemberNoticeHeader$showSecurity$1 memberNoticeHeader$showSecurity$1 = new MemberNoticeHeader$showSecurity$1(this.this$0, this.$security, this.$context, continuation);
        memberNoticeHeader$showSecurity$1.L$0 = obj;
        return memberNoticeHeader$showSecurity$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object objWithContext;
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            MemberNoticeHeader memberNoticeHeader = this.this$0;
            this.L$0 = coroutineScope2;
            this.label = 1;
            memberNoticeHeader.getClass();
            objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new MemberNoticeHeader$getAccountInfo$2(null), this);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope = coroutineScope2;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            objWithContext = obj;
        }
        AccountInfo accountInfo = (AccountInfo) objWithContext;
        boolean z6 = accountInfo != null && accountInfo.isMobileVerified();
        if (!CoroutineScopeKt.isActive(coroutineScope)) {
            return Unit.INSTANCE;
        }
        String location = this.$security.getLocation();
        String string = this.$context.getString(2131845171, TextUtils.isEmpty(location) ? this.$context.getString(2131845148) : this.$context.getString(2131845119, location), !z6 ? this.$context.getString(2131845093) : "");
        SpannableString spannableStringValueOf = SpannableString.valueOf(string);
        if (location != null && !StringsKt.isBlank(location)) {
            int iA = StringsKt.A(string, location, 0, false, 6);
            spannableStringValueOf.setSpan(new ForegroundColorSpan(Color.parseColor("#fe3824")), iA, location.length() + iA, 17);
        }
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.$context).inflate(2131498409, (ViewGroup) null, false);
        final MemberNoticeHeader memberNoticeHeader2 = this.this$0;
        linearLayout.setOnClickListener(new View.OnClickListener(memberNoticeHeader2) { // from class: com.bilibili.pegasus.components.W

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MemberNoticeHeader f75887a;

            {
                this.f75887a = memberNoticeHeader2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MemberNoticeHeader$showSecurity$1.invokeSuspend$lambda$0(this.f75887a, "https://passport.bilibili.com/mobile/index.html", view);
            }
        });
        View viewFindViewById = linearLayout.findViewById(2131298371);
        final MemberNoticeHeader memberNoticeHeader3 = this.this$0;
        viewFindViewById.setOnClickListener(new View.OnClickListener(memberNoticeHeader3) { // from class: com.bilibili.pegasus.components.X

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MemberNoticeHeader f75888a;

            {
                this.f75888a = memberNoticeHeader3;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MemberNoticeHeader$showSecurity$1.invokeSuspend$lambda$1(this.f75888a, view);
            }
        });
        ((TextView) linearLayout.findViewById(2131308733)).setText(spannableStringValueOf);
        PegasusHeaderManager headerManager = this.this$0.getHeaderManager();
        if (headerManager != null) {
            headerManager.removeHeader("PegasusMemberNoticeHeader");
        }
        PegasusHeaderManager headerManager2 = this.this$0.getHeaderManager();
        if (headerManager2 != null) {
            headerManager2.addHeader(linearLayout, "PegasusMemberNoticeHeader");
        }
        this.this$0.f75822k = true;
        return Unit.INSTANCE;
    }
}
