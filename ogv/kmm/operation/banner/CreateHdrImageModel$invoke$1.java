package com.bilibili.ogv.kmm.operation.banner;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import com.bilibili.framework.exposure.core.ExposureLayoutInfo;
import com.bilibili.framework.exposure.core.ExposureLayoutInfoReceiver;
import com.bilibili.framework.exposure.core.transformer.ExposureAreaVisibilityTransformerKt;
import com.bilibili.lib.gripper.api.GripperKt;
import com.bilibili.ogv.kmm.operation.banner.C5437a;
import kntr.base.hilt.component.HiltSingletonComponent_androidKt;
import kntr.base.mod.GMod;
import kntr.base.mod.ModBundle;
import kntr.base.mod.ModRequirementPolicy;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/CreateHdrImageModel$invoke$1.class */
public final class CreateHdrImageModel$invoke$1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableState f68020a = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f68021b;

    /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.CreateHdrImageModel$invoke$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/CreateHdrImageModel$invoke$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C5437a.e $imageMod;
        int label;
        final CreateHdrImageModel$invoke$1 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C5437a.e eVar, CreateHdrImageModel$invoke$1 createHdrImageModel$invoke$1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$imageMod = eVar;
            this.this$0 = createHdrImageModel$invoke$1;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$imageMod, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                GMod gMod = (GMod) com.bilibili.bililive.room.component.room.b.a(GripperKt.getGripper(HiltSingletonComponent_androidKt.getHiltSingletonComponent()).getContainer(), GMod.class, (String) null, 2, (Object) null);
                C5437a.e eVar = this.$imageMod;
                String str = eVar.f68092a;
                ModRequirementPolicy modRequirementPolicy = ModRequirementPolicy.None;
                this.label = 1;
                Object obj2 = gMod.get(str, eVar.f68093b, modRequirementPolicy, this);
                obj = obj2;
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ModBundle modBundle = (ModBundle) obj;
            CreateHdrImageModel$invoke$1 createHdrImageModel$invoke$1 = this.this$0;
            String strA = null;
            if (modBundle != null) {
                strA = V.a(modBundle, this.$imageMod.f68094c);
            }
            createHdrImageModel$invoke$1.f68020a.setValue(strA);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/CreateHdrImageModel$invoke$1$a.class */
    public static final class a implements ExposureLayoutInfoReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final J f68022a;

        public a(J j7) {
            this.f68022a = j7;
        }

        public final void onNewLayoutInfoReceived(ExposureLayoutInfo exposureLayoutInfo) {
            this.f68022a.f68031a.invoke(Boolean.valueOf(ExposureAreaVisibilityTransformerKt.noticeableWhenAreaRatioIsAtLeast(exposureLayoutInfo, 1.0f) && exposureLayoutInfo != null));
        }
    }

    public CreateHdrImageModel$invoke$1(CoroutineScope coroutineScope, C5437a.e eVar, J j7) {
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(eVar, this, null), 3, (Object) null);
        this.f68021b = new a(j7);
    }
}
