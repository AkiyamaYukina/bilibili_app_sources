package com.bilibili.studio.centerplus.model;

import java.util.HashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.SafeContinuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/model/d.class */
public final class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f105154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f105155b;

    public /* synthetic */ d(Object obj, int i7) {
        this.f105154a = i7;
        this.f105155b = obj;
    }

    public final Object invoke(Object obj) {
        switch (this.f105154a) {
            case 0:
                ((SafeContinuation) this.f105155b).resumeWith(Result.constructor-impl((HashMap) obj));
                break;
            default:
                s20.a aVar = (s20.a) obj;
                v20.a.f(aVar, 64);
                Object[] objArr = (Object[]) this.f105155b;
                v20.a.f(aVar, objArr.length);
                for (Object obj2 : objArr) {
                    v20.a.e(aVar, obj2);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
