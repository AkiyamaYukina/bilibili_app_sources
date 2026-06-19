package com.bilibili.okretro.call;

import androidx.annotation.NonNull;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/call/ExternalCallAdapterFactory.class */
public class ExternalCallAdapterFactory extends CallAdapter.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List<CallAdapter.Factory> f73427a;

    public static void addExternalCallAdapterFactory(@NonNull CallAdapter.Factory factory) {
        synchronized (ExternalCallAdapterFactory.class) {
            try {
                if (f73427a == null) {
                    f73427a = new CopyOnWriteArrayList();
                }
                f73427a.add(factory);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public CallAdapter<?, ?> get(@NonNull Type type, @NonNull Annotation[] annotationArr, @NonNull Retrofit retrofit) {
        List<CallAdapter.Factory> list = f73427a;
        if (list == null) {
            return null;
        }
        Iterator it = ((CopyOnWriteArrayList) list).iterator();
        while (it.hasNext()) {
            CallAdapter<?, ?> callAdapter = ((CallAdapter.Factory) it.next()).get(type, annotationArr, retrofit);
            if (callAdapter != null) {
                return callAdapter;
            }
        }
        return null;
    }
}
