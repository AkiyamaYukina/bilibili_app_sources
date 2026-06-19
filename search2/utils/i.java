package com.bilibili.search2.utils;

import android.content.Context;
import androidx.annotation.CallSuper;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.relation.utils.FollowFlowHelper;
import com.bilibili.relation.widget.FollowButton;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/i.class */
@StabilityInferred(parameters = 0)
public abstract class i extends FollowFlowHelper.AutoSyncFollowChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f88826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FollowButton f88827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f88828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function0<Boolean> f88829d;

    public i(@NotNull Context context, @NotNull FollowButton followButton, boolean z6, @NotNull Function0<Boolean> function0) {
        this.f88826a = context;
        this.f88827b = followButton;
        this.f88828c = z6;
        this.f88829d = function0;
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final boolean isLogin() {
        boolean zIsLogin = BiliAccounts.get(this.f88826a).isLogin();
        if (!zIsLogin) {
            Os0.e.f18030a.d(this.f88826a);
        }
        return zIsLogin;
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    @CallSuper
    public final boolean onFollowSuccess() {
        this.f88827b.updateUI(((Boolean) this.f88829d.invoke()).booleanValue(), this.f88828c);
        return super.onFollowSuccess();
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    @CallSuper
    public final boolean onUnFollowSuccess() {
        this.f88827b.updateUI(((Boolean) this.f88829d.invoke()).booleanValue(), this.f88828c);
        return super.onUnFollowSuccess();
    }
}
