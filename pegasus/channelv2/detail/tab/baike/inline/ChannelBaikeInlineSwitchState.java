package com.bilibili.pegasus.channelv2.detail.tab.baike.inline;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bilibili.app.comm.list.common.inline.config.pegasus.PegasusInlineConfigKt;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.inline.utils.InlineExtensionKt;
import com.bilibili.lib.blkv.BLKV;
import com.bilibili.lib.blkv.SharedPrefX;
import com.bilibili.moduleservice.list.PegasusInlineSwitchState;
import com.bilibili.pegasus.channelv2.detail.tab.baike.ChannelBaikeSelectFragment;
import com.bilibili.pegasus.channelv2.detail.tab.baike.ChannelBaikeViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/inline/ChannelBaikeInlineSwitchState.class */
@StabilityInferred(parameters = 0)
public final class ChannelBaikeInlineSwitchState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ChannelBaikeSelectFragment f75144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f75145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final h f75146c;

    /* JADX WARN: Type inference failed for: r1v5, types: [com.bilibili.pegasus.channelv2.detail.tab.baike.inline.h] */
    public ChannelBaikeInlineSwitchState(@NotNull final ChannelBaikeSelectFragment channelBaikeSelectFragment) {
        this.f75144a = channelBaikeSelectFragment;
        final Function0<Fragment> function0 = new Function0<Fragment>(channelBaikeSelectFragment) { // from class: com.bilibili.pegasus.channelv2.detail.tab.baike.inline.ChannelBaikeInlineSwitchState$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = channelBaikeSelectFragment;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m7921invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.pegasus.channelv2.detail.tab.baike.inline.ChannelBaikeInlineSwitchState$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m7922invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f75145b = FragmentViewModelLazyKt.createViewModelLazy(channelBaikeSelectFragment, Reflection.getOrCreateKotlinClass(ChannelBaikeViewModel.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.pegasus.channelv2.detail.tab.baike.inline.ChannelBaikeInlineSwitchState$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m7923invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.pegasus.channelv2.detail.tab.baike.inline.ChannelBaikeInlineSwitchState$special$$inlined$viewModels$default$4
            final Function0 $extrasProducer;
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$extrasProducer = function02;
                this.$owner$delegate = lazy;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.viewmodel.CreationExtras m7924invoke() {
                /*
                    r2 = this;
                    r0 = r2
                    kotlin.jvm.functions.Function0 r0 = r0.$extrasProducer
                    r3 = r0
                    r0 = r3
                    if (r0 == 0) goto L19
                    r0 = r3
                    java.lang.Object r0 = r0.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r0 = (androidx.lifecycle.viewmodel.CreationExtras) r0
                    r4 = r0
                    r0 = r4
                    r3 = r0
                    r0 = r4
                    if (r0 != 0) goto L44
                L19:
                    r0 = r2
                    kotlin.Lazy r0 = r0.$owner$delegate
                    androidx.lifecycle.ViewModelStoreOwner r0 = androidx.fragment.app.FragmentViewModelLazyKt.m4417access$viewModels$lambda1(r0)
                    r3 = r0
                    r0 = r3
                    boolean r0 = r0 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
                    if (r0 == 0) goto L30
                    r0 = r3
                    androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
                    r3 = r0
                    goto L32
                L30:
                    r0 = 0
                    r3 = r0
                L32:
                    r0 = r3
                    if (r0 == 0) goto L40
                    r0 = r3
                    androidx.lifecycle.viewmodel.CreationExtras r0 = r0.getDefaultViewModelCreationExtras()
                    r3 = r0
                    goto L44
                L40:
                    androidx.lifecycle.viewmodel.CreationExtras$Empty r0 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE
                    r3 = r0
                L44:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv2.detail.tab.baike.inline.ChannelBaikeInlineSwitchState$special$$inlined$viewModels$default$4.m7924invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(channelBaikeSelectFragment, lazy) { // from class: com.bilibili.pegasus.channelv2.detail.tab.baike.inline.ChannelBaikeInlineSwitchState$special$$inlined$viewModels$default$5
            final Lazy $owner$delegate;
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = channelBaikeSelectFragment;
                this.$owner$delegate = lazy;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.ViewModelProvider.Factory m7925invoke() {
                /*
                    r2 = this;
                    r0 = r2
                    kotlin.Lazy r0 = r0.$owner$delegate
                    androidx.lifecycle.ViewModelStoreOwner r0 = androidx.fragment.app.FragmentViewModelLazyKt.m4417access$viewModels$lambda1(r0)
                    r3 = r0
                    r0 = r3
                    boolean r0 = r0 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
                    if (r0 == 0) goto L17
                    r0 = r3
                    androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
                    r3 = r0
                    goto L19
                L17:
                    r0 = 0
                    r3 = r0
                L19:
                    r0 = r3
                    if (r0 == 0) goto L2a
                    r0 = r3
                    androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
                    r4 = r0
                    r0 = r4
                    r3 = r0
                    r0 = r4
                    if (r0 != 0) goto L32
                L2a:
                    r0 = r2
                    androidx.fragment.app.Fragment r0 = r0.$this_viewModels
                    androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
                    r3 = r0
                L32:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv2.detail.tab.baike.inline.ChannelBaikeInlineSwitchState$special$$inlined$viewModels$default$5.m7925invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f75146c = new Observer(this) { // from class: com.bilibili.pegasus.channelv2.detail.tab.baike.inline.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChannelBaikeInlineSwitchState f75160a;

            {
                this.f75160a = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SharedPrefX bLSharedPreferences$default;
                SharedPreferences.Editor editorEdit;
                SharedPreferences.Editor editorPutLong;
                a aVar = (a) obj;
                PegasusInlineSwitchState pegasusInlineSwitchState = aVar.f75147a;
                ChannelBaikeInlineSwitchState channelBaikeInlineSwitchState = this.f75160a;
                if (pegasusInlineSwitchState != ((ChannelBaikeViewModel) channelBaikeInlineSwitchState.f75145b.getValue()).f75081f) {
                    ChannelBaikeViewModel channelBaikeViewModel = (ChannelBaikeViewModel) channelBaikeInlineSwitchState.f75145b.getValue();
                    ChannelBaikeSelectFragment channelBaikeSelectFragment2 = channelBaikeInlineSwitchState.f75144a;
                    Context context = channelBaikeSelectFragment2.getContext();
                    PegasusInlineSwitchState pegasusInlineSwitchState2 = aVar.f75147a;
                    if (context != null && (bLSharedPreferences$default = BLKV.getBLSharedPreferences$default(context, "baike_inline_switch_state_sp", false, 0, 6, (Object) null)) != null && (editorEdit = bLSharedPreferences$default.edit()) != null && (editorPutLong = editorEdit.putLong("baike_inline_switch_state_key", PegasusInlineConfigKt.toPegasusInlineDeviceConfigValue(pegasusInlineSwitchState2))) != null) {
                        editorPutLong.apply();
                    }
                    if (PegasusInlineConfigKt.isAutoPlayEnable(pegasusInlineSwitchState2)) {
                        channelBaikeSelectFragment2.sf();
                    } else {
                        IInlineControl iInlineControlFindInlineControl = InlineExtensionKt.findInlineControl(channelBaikeSelectFragment2);
                        if (iInlineControlFindInlineControl != null) {
                            iInlineControlFindInlineControl.stopPlay();
                        }
                    }
                    channelBaikeViewModel.f75081f = pegasusInlineSwitchState2;
                }
            }
        };
    }
}
