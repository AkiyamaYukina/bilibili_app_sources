package com.bilibili.pegasus.components;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.accounts.subscribe.PassportObserver;
import com.bilibili.lib.accounts.subscribe.Topic;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.vm.PegasusViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/S.class */
@StabilityInferred(parameters = 0)
public final class S extends BasePegasusComponent {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f75866k = "LoginStatus";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f75867l = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PegasusViewModel.class), new a(this), new b(this), new c(this));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Q f75868m = new PassportObserver(this) { // from class: com.bilibili.pegasus.components.Q

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final S f75858a;

        {
            this.f75858a = this;
        }

        public final void onChange(Topic topic) {
            S s7 = this.f75858a;
            if (s7.getActivity() == null) {
                return;
            }
            Topic topic2 = Topic.SIGN_IN;
            if (topic == topic2 || topic == Topic.ACCOUNT_SWITCH) {
                l0.f77079b = 2;
            } else if (topic == Topic.SIGN_OUT) {
                l0.f77079b = 1;
            }
            PegasusViewModel pegasusViewModel = (PegasusViewModel) s7.f75867l.getValue();
            boolean z6 = true;
            if (topic != topic2) {
                z6 = topic == Topic.ACCOUNT_SWITCH;
            }
            pegasusViewModel.getClass();
            pegasusViewModel.z(pegasusViewModel, new com.bilibili.pegasus.vm.m(z6));
        }
    };

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/S$a.class */
    public static final class a implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final S f75869a;

        public a(S s7) {
            this.f75869a = s7;
        }

        public final Object invoke() {
            return this.f75869a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/S$b.class */
    public static final class b implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final S f75870a;

        public b(S s7) {
            this.f75870a = s7;
        }

        public final Object invoke() {
            return this.f75870a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/S$c.class */
    public static final class c implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final S f75871a;

        public c(S s7) {
            this.f75871a = s7;
        }

        public final Object invoke() {
            return this.f75871a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    @NotNull
    public final String getComponentName() {
        return this.f75866k;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        BiliAccounts.get(getContext()).subscribe(this.f75868m, new Topic[]{Topic.SIGN_IN, Topic.SIGN_OUT, Topic.ACCOUNT_SWITCH});
    }

    public final void onDestroy() {
        super.onDestroy();
        BiliAccounts.get(getContext()).unsubscribe(this.f75868m, new Topic[]{Topic.SIGN_IN, Topic.SIGN_OUT, Topic.ACCOUNT_SWITCH});
    }
}
