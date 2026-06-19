package com.bilibili.biligame;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import androidx.activity.compose.ComponentActivityKt;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import bo.C5126e;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.biligame.GameInformationListActivity;
import com.bilibili.biligame.ui.information.InformationListViewModel;
import com.bilibili.biligame.utils.ABTestUtil;
import com.bilibili.biligame.utils.NumberExtensionsKt;
import com.bilibili.biligame.widget.BaseCloudGameActivity;
import com.bilibili.biligame.widget.BaseSimpleListLoadFragment;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.lib.tribe.core.internal.Hooks;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/GameInformationListActivity.class */
@StabilityInferred(parameters = 0)
public final class GameInformationListActivity extends BaseCloudGameActivity {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final int f62118S = 0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final boolean f62119Q = ABTestUtil.INSTANCE.isInformationListComposeEnable();

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f62120R = new ViewModelLazy(Reflection.getOrCreateKotlinClass(InformationListViewModel.class), new a(this), new C5126e(this, 0), new b(this));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/GameInformationListActivity$a.class */
    public static final class a implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GameInformationListActivity f62121a;

        public a(GameInformationListActivity gameInformationListActivity) {
            this.f62121a = gameInformationListActivity;
        }

        public final Object invoke() {
            return this.f62121a.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/GameInformationListActivity$b.class */
    public static final class b implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GameInformationListActivity f62122a;

        public b(GameInformationListActivity gameInformationListActivity) {
            this.f62122a = gameInformationListActivity;
        }

        public final Object invoke() {
            return this.f62122a.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/GameInformationListActivity$c.class */
    public static final class c implements ViewModelProvider.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GameInformationListActivity f62123a;

        public c(GameInformationListActivity gameInformationListActivity) {
            this.f62123a = gameInformationListActivity;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final <T extends ViewModel> T create(Class<T> cls) {
            String stringExtra = this.f62123a.getIntent().getStringExtra("id");
            String str = stringExtra;
            if (stringExtra == null) {
                str = "";
            }
            return new InformationListViewModel(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void attachBaseContext(Context context) {
        super/*androidx.appcompat.app.AppCompatActivity*/.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Nullable
    public final JSONObject getExtra() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_compose", (Object) NumberExtensionsKt.toIntString(Boolean.valueOf(this.f62119Q)));
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreateSafe(@Nullable Bundle bundle) {
        super.onCreateSafe(bundle);
        final String stringExtra = getIntent().getStringExtra("title");
        String stringExtra2 = getIntent().getStringExtra("id");
        if (this.f62119Q) {
            ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1765993267, true, new Function2(stringExtra, this) { // from class: bo.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f56796a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final GameInformationListActivity f56797b;

                {
                    this.f56796a = stringExtra;
                    this.f56797b = this;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i7 = GameInformationListActivity.f62118S;
                    if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1765993267, iIntValue, -1, "com.bilibili.biligame.GameInformationListActivity.onCreateSafe.<anonymous> (GameInformationListActivity.kt:53)");
                        }
                        final String str = this.f56796a;
                        final GameInformationListActivity gameInformationListActivity = this.f56797b;
                        BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-1997834731, true, new Function2(str, gameInformationListActivity) { // from class: bo.f

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final String f56800a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final GameInformationListActivity f56801b;

                            {
                                this.f56800a = str;
                                this.f56801b = gameInformationListActivity;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:29:0x0127  */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12) {
                                /*
                                    Method dump skipped, instruction units count: 383
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: bo.C5127f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                            }
                        }, composer, 54), composer, 384, 3);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }), 1, null);
            return;
        }
        setContentView(2131496028);
        setSupportActionBar((Toolbar) findViewById(2131304944));
        ((TextView) findViewById(2131297417)).setText((stringExtra == null || stringExtra.length() == 0) ? "热门游戏信息" : stringExtra);
        if (getSupportFragmentManager().findFragmentById(2131300570) == null) {
            BaseSimpleListLoadFragment gameInformationListFragment = new GameInformationListFragment();
            Bundle bundle2 = new Bundle(1);
            bundle2.putString("id", stringExtra2);
            bundle2.putString("title", stringExtra);
            gameInformationListFragment.setArguments(bundle2);
            if (isFinishing()) {
                return;
            }
            FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransactionBeginTransaction.replace(2131300570, gameInformationListFragment);
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        }
    }

    public final void onTitleChanged(@NotNull CharSequence charSequence, int i7) {
    }

    public final boolean pvReport() {
        return this.f62119Q;
    }

    @Nullable
    public final String reportClassName() {
        return "GameInformationListActivity";
    }
}
