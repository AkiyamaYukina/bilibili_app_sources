package com.bilibili.tgwt.im.ui;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.app.comm.supermenu.SuperMenu;
import com.bilibili.app.comm.supermenu.core.IMenuItem;
import com.bilibili.app.comm.supermenu.core.IMenuPanel;
import com.bilibili.app.comm.supermenu.core.MenuView;
import com.bilibili.app.comm.supermenu.core.listeners.OnMenuItemClickListenerV2;
import com.bilibili.app.comm.supermenu.core.listeners.OnMenuVisibilityChangeListenerV2;
import com.bilibili.bangumi.logic.page.detail.service.refactor.FetchShareMenuCallback;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewShareService;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/v.class */
@StabilityInferred(parameters = 0)
public final class v extends Wj0.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f111320k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final NewShareService f111321l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public MenuView f111322m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final a f111323n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final u f111324o;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/v$a.class */
    public static final class a implements FetchShareMenuCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v f111325a;

        public a(v vVar) {
            this.f111325a = vVar;
        }

        public final void onFetchFailed(int i7) {
            this.f111325a.superDismiss();
            com.bilibili.bangumi.logic.page.detail.service.e.a("[together-watch-PlayerChatSharePanelDialog$fetchShareMenuCallback$1-onFetchFailed] ", "PgcPlayerSharePopFunctionWidget share failed" + i7, "PlayerChatSharePanelDialog$fetchShareMenuCallback$1-onFetchFailed", (Throwable) null);
        }

        public final void onFetchSuccess(SuperMenu superMenu) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/v$b.class */
    public static final class b implements DialogInterface.OnKeyListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v f111326a;

        public b(v vVar) {
            this.f111326a = vVar;
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public final boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
            if (i7 != 4) {
                return false;
            }
            this.f111326a.superDismiss();
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.bilibili.tgwt.im.ui.u] */
    public v(@NotNull Context context, @NotNull String str, @NotNull NewShareService newShareService) {
        super(context);
        this.f111320k = str;
        this.f111321l = newShareService;
        this.f111323n = new a(this);
        this.f111324o = new OnMenuItemClickListenerV2(this) { // from class: com.bilibili.tgwt.im.ui.u

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final v f111319a;

            {
                this.f111319a = this;
            }

            public final boolean onItemClick(IMenuItem iMenuItem) {
                this.f111319a.superDismiss();
                return false;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final View onCreateView() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(2131500191, (ViewGroup) null);
        this.f111322m = viewInflate.findViewById(2131311215);
        setOnKeyListener(new b(this));
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Wj0.a, Wj0.d
    public final void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.color.transparent);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.alpha = 1.0f;
            attributes.dimAmount = 0.0f;
            window.setAttributes(attributes);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setUiBeforeShow() {
        Activity activityRequireActivity = ContextUtilKt.requireActivity(getContext());
        FragmentActivity fragmentActivity = activityRequireActivity instanceof FragmentActivity ? (FragmentActivity) activityRequireActivity : null;
        if (fragmentActivity == null) {
            return;
        }
        NewShareService newShareService = this.f111321l;
        String str = this.f111320k;
        a aVar = this.f111323n;
        u uVar = this.f111324o;
        IMenuPanel iMenuPanel = this.f111322m;
        if (iMenuPanel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMenuView");
            iMenuPanel = null;
        }
        NewShareService.showMenu$default(newShareService, fragmentActivity, str, aVar, uVar, iMenuPanel, (OnMenuVisibilityChangeListenerV2) null, 32, (Object) null);
    }
}
