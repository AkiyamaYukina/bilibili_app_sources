package com.bilibili.ogv.kmm.operation.reservation;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/reservation/h.class */
public final class h implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableState<Boolean> f68669a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/reservation/h$a.class */
    public static final class a implements Function1<Offset, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MutableState<Boolean> f68670a;

        public a(MutableState<Boolean> mutableState) {
            this.f68670a = mutableState;
        }

        public final Object invoke(Object obj) {
            ((Offset) obj).m2465unboximpl();
            this.f68670a.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public h(MutableState<Boolean> mutableState) {
        this.f68669a = mutableState;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        Object objDetectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, new a(this.f68669a), continuation, 7, null);
        return objDetectTapGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapGestures$default : Unit.INSTANCE;
    }
}
