package com.bilibili.topix.compose.create;

import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/CreateTopicComposeFragment$CreatePage$1$1$1.class */
public final /* synthetic */ class CreateTopicComposeFragment$CreatePage$1$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    public CreateTopicComposeFragment$CreatePage$1$1$1(Object obj) {
        super(0, obj, CreateTopicComposeFragment.class, "onBackPressed", "onBackPressed()V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m10623invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m10623invoke() {
        FragmentActivity fragmentActivityP3 = ((CreateTopicComposeFragment) ((CallableReference) this).receiver).p3();
        if (fragmentActivityP3 != null) {
            fragmentActivityP3.onBackPressed();
        }
    }
}
