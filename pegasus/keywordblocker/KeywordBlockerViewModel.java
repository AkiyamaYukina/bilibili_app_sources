package com.bilibili.pegasus.keywordblocker;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bapis.bilibili.app.distribution.StringValue;
import com.bapis.bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.device.settings.generated.api.DistributionSettings;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.pegasus.kmm.keywordblocker.b;
import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/keywordblocker/KeywordBlockerViewModel.class */
@StabilityInferred(parameters = 0)
public final class KeywordBlockerViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f78203a = "KeywordBlockerViewModel";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.pegasus.kmm.keywordblocker.e f78204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateFlow<com.bilibili.pegasus.kmm.keywordblocker.d> f78205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<com.bilibili.pegasus.kmm.keywordblocker.c> f78206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final DistributionSettings f78207e;

    /* JADX INFO: renamed from: com.bilibili.pegasus.keywordblocker.KeywordBlockerViewModel$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/keywordblocker/KeywordBlockerViewModel$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final KeywordBlockerViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(KeywordBlockerViewModel keywordBlockerViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = keywordBlockerViewModel;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.I0(b.c.f78254a);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/keywordblocker/KeywordBlockerViewModel$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KeywordBlockerViewModel f78208a;

        public a(KeywordBlockerViewModel keywordBlockerViewModel) {
            this.f78208a = keywordBlockerViewModel;
        }

        public final boolean a(n nVar, int i7) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("type", String.valueOf(i7));
            boolean z6 = true;
            Neurons.reportClick(true, "main.recommend-shield.add-shield.0.click", linkedHashMap);
            BLog.i("BlockerReporter", "reportKeywordBlockerAddClick " + i7);
            DistributionSettings distributionSettings = this.f78208a.f78207e;
            if (distributionSettings != null) {
                distributionSettings.setMidPrivacySettingsConfig((MidPrivacySettingsConfig) ((MidPrivacySettingsConfig.b) distributionSettings.getMidPrivacySettingsConfig().toBuilder()).addBlockedWords(0, (StringValue) StringValue.newBuilder().setValue(nVar.f78240a).build()).build());
            } else {
                z6 = false;
            }
            return z6;
        }

        public final boolean b(int i7, int i8) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("type", String.valueOf(i8));
            boolean z6 = true;
            Neurons.reportClick(true, "main.recommend-shield.delete-shield.0.click", linkedHashMap);
            BLog.i("BlockerReporter", "reportKeywordBlockerDeleteClick " + i8);
            DistributionSettings distributionSettings = this.f78208a.f78207e;
            if (distributionSettings != null) {
                distributionSettings.setMidPrivacySettingsConfig((MidPrivacySettingsConfig) ((MidPrivacySettingsConfig.b) distributionSettings.getMidPrivacySettingsConfig().toBuilder()).removeBlockedWords(i7).build());
            } else {
                z6 = false;
            }
            return z6;
        }
    }

    public KeywordBlockerViewModel() {
        com.bilibili.pegasus.kmm.keywordblocker.e eVar = new com.bilibili.pegasus.kmm.keywordblocker.e(new a(this));
        this.f78204b = eVar;
        this.f78205c = FlowKt.asStateFlow(eVar.f78267b);
        this.f78206d = eVar.f78268c;
        this.f78207e = (DistributionSettings) BLRouter.get$default(BLRouter.INSTANCE, DistributionSettings.class, (String) null, 2, (Object) null);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    public final void I0(@NotNull com.bilibili.pegasus.kmm.keywordblocker.b bVar) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new KeywordBlockerViewModel$handleAction$1(this, bVar, null), 3, (Object) null);
    }
}
